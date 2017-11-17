package com.reborn.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reborn.dao.Impl.ReplyDaoImpl;
import com.reborn.dao.ReplyDao;
import com.reborn.domain.Reply;
import com.reborn.domain.Topic;
import org.apache.struts2.ServletActionContext;

import java.util.Date;
import java.util.List;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class ReplyAction extends ActionSupport {
    private Reply reply;
    private Topic topic;
    private ReplyDao replyDao = new ReplyDaoImpl();

    public String add()
    {
        reply.setIpAddr(ServletActionContext.getRequest().getRemoteAddr());
        reply.setCreateDate(new Date());
        reply.setTopic(topic);
        return "toReplyList";
    }

    public String list()
    {
        List<Reply> replyList = replyDao.getAllReply(topic);
        ActionContext.getContext().put("topic",topic);
        ActionContext.getContext().put("replyList",replyList);
        return "showTopic";
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
