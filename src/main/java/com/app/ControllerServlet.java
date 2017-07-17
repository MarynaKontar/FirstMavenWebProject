package com.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 17.07.2017.
 */
//@WebServlet(name = "ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.set_name("Maryna");
        user.set_email("marina.acoustic@gmail.com");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        request.setAttribute("user", user);
        dispatcher.forward(request, response);
//    dispatcher.include(request,response);
    }

}



/**
  <%@page buffer="8kb"%>
  <%@page autoFlush="true" %>
  <%@page contentType="text/html" %>
  <%@page isErrorPage="true" %>
 <%@page errorPage="/WEB-INF/errorpage.jsp" %>
 */