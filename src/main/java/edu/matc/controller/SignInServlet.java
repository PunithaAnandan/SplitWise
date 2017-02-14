package edu.matc.controller;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by Punitha Anandan on 2/6/2017.
 */
@WebServlet(
        name = "signInServlet",
        urlPatterns = { "/signInServlet" }
)

public class SignInServlet extends javax.servlet.http.HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        log.info("SignIn Servlet doGet method start");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/signIn.jsp");
        dispatcher.forward(request, response);
    }
}
