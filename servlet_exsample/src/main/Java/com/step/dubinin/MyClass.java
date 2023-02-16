package com.step.dubinin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = ("/"))
public class MyClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Java</title>\n" +
                "</head>\n" +
                "<body align=\"centr\">\n" +
                "<h1 >Welcome to online shop!!!</h1>\n" +
                "<form action=\"/shop\" method=\"get\">\n" +
                "    <input type=\"text\" name=\"userName\">\n" +
                "    <h1></h1>\n" + "<p align=\"centr\"> <input type=\"checkbox\"name=\"check\"> Please?, push this</p>"+
                "    <input type=\"submit\" value=\"submit\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }

}
