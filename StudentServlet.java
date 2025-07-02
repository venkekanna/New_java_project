package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
        response.setContentType("text/html");
        response.getWriter().println("<h2>Student '" + studentName + "' saved successfully!</h2>");
    }
}
