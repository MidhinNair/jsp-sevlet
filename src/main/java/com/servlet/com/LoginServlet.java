package com.servlet.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Login  servlet Works");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1> frm servlet</h1>");
        writer.println("<html>");
        writer.println("<head><title>Login Servlet</title></head>");
        writer.println("<body>");
        writer.println("<h1>Welcome to the Login Servlet!</h1>");
        writer.println("<p>Current Date and Time: " + new Date().toString() + "</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
