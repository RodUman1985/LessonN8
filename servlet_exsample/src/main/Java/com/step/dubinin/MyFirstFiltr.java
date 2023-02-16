package com.step.dubinin;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = ("/"))
public class MyFirstFiltr implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        if (request.getSession().getAttribute("UserName") == null) {
            ParametersForShop.setUserName(request, request.getParameter("UserName"));
        } else if (request.getParameter("UserName") != null && !request.getSession().getAttribute("UserName")
                .equals(request.getParameter("UserName"))) {
            request.getSession().invalidate();
            ParametersForShop.setUserName(request, request.getParameter("UserName"));
        }
        if (request.getSession().getAttribute("check") == null) {
            if (request.getParameter("check") == null) {
                String path = "/error";
                ServletContext servletContext = request.getServletContext();
                RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("path");
                requestDispatcher.forward(request, resp);
            } else {
                ParametersForShop.setCheckStatus(request, request.getParameter("check"));
            }
        }
    }
}
