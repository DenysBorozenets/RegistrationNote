package com.denis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBNoteBook {
    private List<Map<String, String>> list = new ArrayList<Map<String, String>>();

     DBNoteBook() {
        Map<String, String> sampleFields = new HashMap<String, String>();

        sampleFields.put("firstName", "Денис");
        sampleFields.put("login", "taras123");

        list.add(sampleFields);
    }

    public boolean checkLogin(String loginD){
        for (Map<String, String> m : list) {
            if (m.get("login").equals(loginD)) {
                return true;
            }
        }
        return false;
    }
}
