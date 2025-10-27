package com.example.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<!DOCTYPE html>");
        resp.getWriter().println("<html><head><title>Hello</title></head><body>");
        resp.getWriter().println("<h1>Hello Servlet</h1>");
        resp.getWriter().println("<p><a href='/'>&larr; Back</a></p>");
        resp.getWriter().println("</body></html>");
    }
}
