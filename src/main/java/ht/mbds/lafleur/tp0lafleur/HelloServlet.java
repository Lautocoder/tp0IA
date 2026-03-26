package ht.mbds.lafleur.tp0lafleur;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String welcomeMessage;

    public void init() {
        message = "Hello World!";
        welcomeMessage = "Welcome to Java Web Development with Servlets!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>" + welcomeMessage + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}