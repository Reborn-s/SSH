package com.reborn.tx_aop_annotation;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public interface AccountService {
    void transfer(String outer, String inner, Integer money);
}
