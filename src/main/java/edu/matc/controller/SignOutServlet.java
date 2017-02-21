package edu.matc.controller;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Punitha Anandan on 2/20/2017.
 */
@WebServlet(name = "signOutServlet",
urlPatterns = {"/signOutServlet"})
public class SignOutServlet extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("showViewExpenses Servlet doGet method start");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("index.jsp").include(request, response);
        HttpSession session=request.getSession();
        session.invalidate();
        out.print("You are successfully logged out!");
        out.close();
    }
}

