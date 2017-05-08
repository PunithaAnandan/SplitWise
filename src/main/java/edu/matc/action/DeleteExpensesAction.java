package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.matc.entity.Expenses;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 4/27/2017.
 */
public class DeleteExpensesAction extends ActionSupport implements UserAware {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private Expenses expenses;
    private User user;
    private String exception;
    private String exceptionStack;

    @Override
    public String execute() {
        ExpensesDao expensesDao = new ExpensesDao();
        expenses.setEmailId(user.getEmailId());
        System.out.println("DeleteExpensesAction.execute");
        System.out.println("DeleteExpensesAction.execute emailId:" + user.getEmailId());
        System.out.println("DeleteExpensesAction.execute expenses.getDueDate():" + expenses.getDueDate());
        int result=0;
        try {
            result= expensesDao.deleteExpense(expenses);
        } catch (Exception e) {
            if (e.getMessage().startsWith("org.hibernate.exception")) {
                exception = "Expense Already Exists";
                exceptionStack = e.toString();
            } else {
                exception = e.getMessage();
                exceptionStack = e.toString();
            }
            return ERROR;
        }
        if(result==0) {
            exception = "There is no expense available to delete";
            //exceptionStack = e.toString();
            return ERROR;
        }

        return SUCCESS;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    @Override
    public void validate()
    {
        if (expenses.getExpenseName() == null || expenses.getExpenseName().trim().equals(""))
        {
            addFieldError("expenses.expenseName","The expense Name is required");
        }
        if (expenses.getDueDate() == null || expenses.getDueDate().trim().equals(""))
        {
            addFieldError("expenses.dueDate","Due Date is required");
        }
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getExceptionStack() {
        return exceptionStack;
    }

    public void setExceptionStack(String exceptionStack) {
        this.exceptionStack = exceptionStack;
    }

    @Override
    public void setUser(User user) {
        this.user=user;
    }

}
