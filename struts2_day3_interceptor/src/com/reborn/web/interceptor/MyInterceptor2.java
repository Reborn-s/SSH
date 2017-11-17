package com.reborn.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by Reborn。 on 2017/6/3.
 */
public class MyInterceptor2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截器2拦截了：执行action之前");
        String rtValue = actionInvocation.invoke();
        System.out.println("拦截器2放行了：执行action之后");
        return rtValue;
    }
}
