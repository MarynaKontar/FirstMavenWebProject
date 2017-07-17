package com.app;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 06.07.2017.
 */
@WebServlet(name = "Servletlala", urlPatterns = {"/pluralsight", "/dd"},
        initParams = {@WebInitParam(name = "ProductName", value = "Wellcome Application")})
public class Servlet extends HttpServlet {
    String appName ;
    String connstr;

    @Override
    public void init() throws ServletException {
        appName = getInitParameter("ProductName");//это мы вызываем InitParameter для данного сервлета
        appName = getServletContext().getInitParameter("ProductName");//вызываем InitParameter для всех сервлетов в приложении, т.к. <context-param> в web.xml пишется для всех

// можно initParam задавать не только в аннотации, но и web.xml
// (имя параметра ProductName), а здесь вызывать их. Причем если имя у initParam в аннотации и в web.xml одинаковые,
// а value разные, то выберется то, что в web.xml!!!!!!!
        //Если Мы хотим и в web.xml и в аннотации описывать один и тот же urlPatterns, который будет ссылаться на этот сервлет,
        // то ему надо дать в аннотации и в web.xml одинаковое <servlet-name>. Иначе получится как бы один urlPattern
        // ссылается к двум разным сервлетам (хоть и <servlet-class> у них одинаковый, но <servlet-name> разный).
        //  НА ОДИН  SERVLET МОЖЕТ ССЫЛАТЬСЯ МНОГО urlPattern, НО ОДИН urlPattern НЕ МОЖЕТ ССЫЛАТЬСЯ НА ДВА РАЗНЫХ SERVLET
        //Если я сервлет описіваю и в аннотациях и в web.xml, то будет работать только то, что в web.xml. И если в web.xml
        // я написала только один urlPatterns, то только на него и можно будет зайти, а все urlPatterns,
        // которые записаны в аннотации перезатираются и на них нельзя зайти (т.е. /dd не будет работать
        // в данном случае, потому что я его не записала в web.xml)
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name"); //!!!CASE SENSETIVE
        if (name != null) {
//            response.getWriter().printf("/pluralsight %s", name);
            response.setContentType("text/xml");
            response.getWriter().printf("<application>" +
                    "<name> Hello %s </name>" +
                    "<product>%s</product>" +
                    "</application>", name, appName);
        } else {
//            response.getWriter().write("Please enter a name at the end of browser row: like this ?name=   ");
        throw new ServletException("A name should be entered");
        }
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name"); //!!!CASE SENSETIVE
        if (name != null && name != "") {
            response.getWriter().printf("Hello %s", name);

            //можно выводить данные не в HTML, а в xml:
//            response.setContentType("text/xml");
//            response.getWriter().printf("<name> Hello %s </name>", name);
        } else {
//            response.getWriter().write("Please enter a name at the end of browser row: like this ?name=   ");
        //можно при name == null || name = "" перенаправить браузер обратно на форму для ввода имени (на index.jsp):
            response.sendRedirect("index.jsp");
//            throw new ServletException("A name should be entered");
        }
    }
}




//для метода doPost внесла форму в index.jsp
/*
<form action="/pluralsight" method="post">
<p>Name:
<input type="text" name="name"/>
</p>
<p>
<input type="submit" value="Enter name" />
</p>
</form>

надо в action указывать urlPatterns данного сервлета (в данном случае /pluralsight)

*/