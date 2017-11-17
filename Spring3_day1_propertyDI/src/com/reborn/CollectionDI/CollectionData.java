package com.reborn.CollectionDI;

import java.util.*;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class CollectionData {
    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map map;
    private Properties props;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "CollectionData{" + "\n" +
                "array=" + Arrays.toString(array) +"\n" +
                ", list=" + list +"\n" +
                ", set=" + set +"\n" +
                ", map=" + map +"\n" +
                ", props=" + props +"\n" +
                '}';
    }
}
