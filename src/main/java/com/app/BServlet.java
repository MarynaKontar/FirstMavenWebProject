package com.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by denys on 7/4/2017.
 *///без аннотации @WebServlet тоже работает если прописать маппинг в web.xml
//@WebServlet(urlPatterns = "/B")
public class BServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String varTextA = "Hello World!";
//        req.setAttribute("textA", varTextA);
//        String varTextB = "It JSP.";
//        req.setAttribute("textB", varTextB);
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.html");
//        dispatcher.forward(req, resp);


        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
       resp.getWriter().println("Hihihihih");

    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("ServletB");
//
//
//    }
}