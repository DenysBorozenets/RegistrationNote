package com.denis.model;

import com.denis.view.View;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Model {
    private Map<String, String> someField = new HashMap<String, String>();
    private Group group;

    public String getField(String name) {
        return someField.get(name);
    }
    public Group getGroup() {
        return this.group;
    }
    public void setField(String name, String value) {
        someField.put(name, value);
    }
    public void setGroup(Group group) {
        this.group = group;
    }

}
