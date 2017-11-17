package com.reborn.dao;

import com.reborn.domain.Reply;
import com.reborn.domain.Topic;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public interface ReplyDao {
    List<Reply> getAllReply(Topic topic);
    void addReply(Reply reply);
}
