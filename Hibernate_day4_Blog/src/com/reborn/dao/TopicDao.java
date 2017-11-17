package com.reborn.dao;

import com.reborn.domain.Topic;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public interface TopicDao {
    void add(Topic topic);

    List<Topic> getAll(String key);

}
