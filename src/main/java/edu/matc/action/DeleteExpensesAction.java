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

    /**Execute Method
     *
     * @return String
     */
    @Override
    public String execute() {
        ExpensesDao expensesDao = new ExpensesDao();
        expenses.setEmailId(user.getEmailId());
        log.info("DeleteExpensesAction.execute");
        log.info("DeleteExpensesAction.execute emailId:" + user.getEmailId());
        log.info("DeleteExpensesAction.execute expenses.getDueDate():" + expenses.getDueDate());
        int result=0;
        try {
            result= expensesDao.deleteExpense(expenses);
        } catch (Exception catchException) {
            if (catchException.getMessage().startsWith("org.hibernate.exception")) {
                exception = "Expense Already Exists";
                exceptionStack = catchException.toString();
            } else {
                exception = catchException.getMessage();
                exceptionStack = catchException.toString();
            }
            return ERROR;
        }
        if(result==0) {
            exception = "There is no expense available to delete";
            return ERROR;
        }
        return SUCCESS;
    }

    /** Get Expenses
     *
     * @return expenses
     */
    public Expenses getExpenses() {
        return expenses;
    }

    /** Set Expenses
     *
     * @param expenses
     */
    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    /**
     * validate Method
     */
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

    /** getException
     *
     * @return exception
     */
    public String getException() {
        return exception;
    }

    /**set Exception
     *
     * @param exception
     */
    public void setException(String exception) {
        this.exception = exception;
    }

    /**get Exception Stack
     *
     * @return exceptionStack
     */
    public String getExceptionStack() {
        return exceptionStack;
    }

    /** set ExceptionStack
     *
     * @param exceptionStack
     */
    public void setExceptionStack(String exceptionStack) {
        this.exceptionStack = exceptionStack;
    }

    /**set User
     *
     * @param user
     */
    @Override
    public void setUser(User user) {
        this.user=user;
    }

}
