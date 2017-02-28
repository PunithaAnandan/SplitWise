package edu.matc.controller;

import edu.matc.entity.Expenses;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Punitha Anandan on 2/20/2017.
 */
@WebServlet(name = "viewExpensesServlet",
        urlPatterns = {"/viewExpensesServlet"})

public class ViewExpensesServlet extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("CompareExpenses Servlet doGet method start");
        String date=request.getParameter("month");
        ExpensesDao expenseDao = new ExpensesDao();
        List<Expenses> expensesList=expenseDao.viewExpense(date);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewExpenseList.jsp");
        //HttpSession session = request.getSession();
        request.setAttribute("expensesList",expensesList);
        dispatcher.forward(request, response);
      /*  <c:forEach items="${expensesList}" var="expense">
            <tr>
                <td>${expense.expense_name}</td>
                <td>${expense.amount_due}</td>
                <td>${expense.dueDate}</td>
                <td>${expense.paidDate}</td>
            </tr>
        </c:forEach>*/

    }
}
