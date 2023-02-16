package com.step.dubinin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = ("/shop"))
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("name", req.getParameter("userName"));
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Shop</title>\n" +
                "</head>" +
                "<body>\n" +
                "<h1 align=\"centr\">\n" +
                "    <h1 >Welcome to online shop!!!</h1>\n" +
                "    <form action=\"/shop2\" method=\"get\">\n" +
                "    <select name=\"list\" size=\"2\" >\n" +
                "        <option> lazgan 100$</option>\n" +
                "        <option> bolter 500$</option>\n" +
                "        <option> chainsword 500$</option>\n" +
                "        <option> power axe 700$</option>\n" +
                "    </select>\n" +
                "        <input type=\"submit\" value=\"submit\">\n" +
                "     </form>\n" +
                "</h1>\n" +
                "</body>\n" +
                "    \n");


    }


}
