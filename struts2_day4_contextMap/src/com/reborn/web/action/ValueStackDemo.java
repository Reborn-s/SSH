package com.reborn.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.reborn.domain.Student;

/**
 * Created by Reborn。 on 2017/6/4.
 */
public class ValueStackDemo extends ActionSupport {
    private String name = "action中的name";

    public String execute()
    {
        ActionContext actionContext = ActionContext.getContext();
        ValueStack valueStack = actionContext.getValueStack();

        valueStack.push(new Student("002","张三",29));

        valueStack.setValue("#name","zhaoliu");

        /**
         * 如果没有这个name对应的set方法会报错，因为是通过反射来设置值的
         * 下面是首先找到了的Student里面的name属性
         * 如果Student类没有setName()，那么会找到下一个name属性，调用下一个name属性所在类的setName()
         * 如果下一个name属性所在类依然没有setName(),依然如此往下找
         * 如果所有的name属性都没有对应的setName()就会报错
         */
        valueStack.setValue("name","李四");

        valueStack.set("map1",new Student("003","赵六",25));

        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
