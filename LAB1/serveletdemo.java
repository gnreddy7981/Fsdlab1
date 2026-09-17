package org.example.servlet1;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
@WebServlet("/login")
public class servletdemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) {
        try {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Welcome </h1>" + username);
            out.println("<p>Password</p>" + password);
            out.println("/body");
            out.println("/html");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}