package com.reborn.tx_aop_xml;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public interface AccountDao {
    void in(String inner, Integer money);
    void out(String outer, Integer money);
}
