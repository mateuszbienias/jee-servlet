package com.example.jeeservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet312")
public class Servlet312 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String language = req.getParameter("language");
        String lang = "Cześć";

        Map<String, String> langMap = new HashMap<>();
        langMap.put("en", "Hello");
        langMap.put("pl", "Cześć");
        langMap.put("de", "Hallo");
        langMap.put("es", "Hola");
        langMap.put("fr", "Salut");

        if (!language.isEmpty()) {
            for (Map.Entry<String, String> entry : langMap.entrySet()) {
                if (language.equals(entry.getKey())) {
                    lang = entry.getValue();
                }
            }
            req.setAttribute("lang", lang);
            getServletContext().getRequestDispatcher("/chosenwelcome.jsp").forward(req, resp);
        }

    }
}
