package edu.matc.controller;

import edu.matc.entity.Expenses;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  This is part of a project4 and EmployeeAddServlet class for the Unit-4
 *
 *@author    puni
 */


@WebServlet(
        name = "addExpenseServlet",
        urlPatterns = { "/addExpenseServlet" }
)


public class AddExpenseServlet extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());


    /**
     *  Handles HTTP GET requests.
     *
     *@param  request the HttpServletRequest object
     *@param  response the HttpServletResponse object
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info(" Add Expense Servlet doPost method start");
        PrintWriter out = response.getWriter();
        ServletContext servletContext = getServletContext();
        Expenses expenses = new Expenses();
        ExpensesDao expenseDao = new ExpensesDao();
        //out.println("start");
        String expense_name = request.getParameter("expense");
        //out.println("expense_name:"+expense_name);
        double amount_due = Double.parseDouble(request.getParameter("amount"));
        //out.println("amount_due:"+amount_due);
        String dueDate = request.getParameter("dueDate");
        //out.println("dueDate:"+dueDate);
        String paidDate = request.getParameter("paidDate");
        //out.println("paidDate:"+paidDate);
        expenses.setExpense_name(expense_name);
        expenses.setAmount_due(amount_due);
        expenses.setDueDate(dueDate);
        expenses.setPaidDate(paidDate);
        expenseDao.addExpense(expenses);
        //out.println("end");
        request.setAttribute("Expenses",expenses);

        //forward to jsp
        RequestDispatcher dispatcher = servletContext.getRequestDispatcher("/enterExpenses.jsp");
        dispatcher.forward(request, response);
    }

}

