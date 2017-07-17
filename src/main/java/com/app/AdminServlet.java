package com.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by User on 04.07.2017.
 */
@WebServlet(name = "com.app.AdminServlet", urlPatterns = {"/adminmm"})//, "*.do"})
public class AdminServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Admin page");

        String username = req.getRemoteUser(); // выдает, кто зашел на страницу

        System.out.println("");
        resp.getOutputStream().write(("Hello yyy, " + username).getBytes());
        HttpSession session = req.getSession();

        session.invalidate();//logout

//        session.setMaxInactiveInterval(); //установить время, через которое без действий на страницы, делает сессию не активной
    }
}
