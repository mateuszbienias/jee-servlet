package com.example.jeeservlet;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {

        String language = "";
        String lang = "Cześć";
        Map<String, String> langMap = new HashMap<>();
        langMap.put("en", "Hello");
        langMap.put("pl", "Cześć");
        langMap.put("de", "Hallo");
        langMap.put("es", "Hola");
        langMap.put("fr", "Salut");

        for (Map.Entry<String, String> entry : langMap.entrySet()) {
            if (language.equals(entry.getKey())) {
                lang = entry.getValue();
            }
        }
        System.out.println(lang);
    }
}
