package edu.matc.controller;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Punitha Anandan on 2/20/2017.
 */
@WebServlet(name = "showEditExpenseServlet",
        urlPatterns = {"/showEditExpenseServlet"})
public class ShowEditExpenseServlet extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("showEditExpense Servlet doGet method start");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/editExpense.jsp");
        dispatcher.forward(request, response);
    }
}