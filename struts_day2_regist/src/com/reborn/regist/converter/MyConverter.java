package com.reborn.regist.converter;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class MyConverter extends StrutsTypeConverter {
    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        if(strings==null||strings.length==0)
            return null;
        if(aClass == Date.class)
        {
            String s = strings[0];
            try {
                return (Date)dateFormat.parse(s);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    @Override
    public String convertToString(Map map, Object o) {
        if(o instanceof Date)
        {
            o = (Date)o;
            return dateFormat.format(o);
        }
        return null;
    }
}
