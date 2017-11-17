package com.reborn.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reborn.dao.Impl.TopicDaoImpl;
import com.reborn.dao.TopicDao;
import com.reborn.domain.Topic;
import org.apache.struts2.ServletActionContext;

import java.util.Date;
import java.util.List;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class TopicAction extends ActionSupport {

    private Topic topic;
    private String key;
    private TopicDao topicDao = new TopicDaoImpl();

    public String list() {
        List<Topic> list = topicDao.getAll(key);
        ActionContext.getContext().put("list",list);
        return "list";
    }

    public String add()
    {
        topic.setIpAddr(ServletActionContext.getRequest().getRemoteAddr());
        topic.setCreateDate(new Date());
        topic.setLastReplyDate(new Date());

        topicDao.add(topic);
        return "toList";
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


}
