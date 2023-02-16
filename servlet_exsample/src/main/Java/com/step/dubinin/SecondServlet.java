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
                "</head>\n" +
                "<body>\n" +

                "<h1>\n" +
                "\n" +
                "<h1 >Dear</h1>\n"+  req.getSession().getAttribute("name")+

                "\n" +
                "</h1>\n" +
                "<form action=\"/shop2\" method=\"get\">\n" +
                      "  <select name=\"list\" size=\"4\" multiple>\n" +
                        "        <option> lazgan 100$</option>\n" +
                        "        <option> bolter 500$</option>\n" +
                        "        <option> chainsword 500$</option>\n" +
                        "        <option> power axe 700$</option>\n" +
                        "    </select>\n" +
                "        \n" +
                "    <input type=\"submit\" value=\" go\">\n" +
                "</body>\n" +
                "</html>");


    }


}
