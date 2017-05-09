package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.matc.entity.Expenses;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 4/19/2017.
 */
public class EnterExpensesAction extends ActionSupport implements UserAware{
    private final Logger log = Logger.getLogger(this.getClass());
    private Expenses expenses;
    private User user;
    private String exception;
    private String exceptionStack;

    /** getException
     *
     * @return exception
     */
    public String getException() {
        return exception;
    }

    /** set Exception
     *
     * @param exception
     */
    public void setException(String exception) {
        this.exception = exception;
    }

    /** get ExceptionStack
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

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute() {
        ExpensesDao expensesDao = new ExpensesDao();
        expenses.setEmailId(user.getEmailId());
        log.info("EnterExpensesAction.execute");
        try {
            expensesDao.addExpense(expenses);
        } catch (Exception actionException){
            if(actionException.getMessage().startsWith("org.hibernate.exception.ConstraintViolationException")) {
                exception = "Expense Already Exists";
                exceptionStack = actionException.toString();
            } else {
                exception = actionException.getMessage();
                exceptionStack = actionException.toString();
            }
            return ERROR;
        }
        return SUCCESS;
    }


    /**get Expenses
     *
     * @return expenses
     */
    public Expenses getExpenses() {
        return expenses;
    }

    /**set Expenses
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
        log.info("EnterExpensesAction.validate" + expenses.getDueDate());
        if (expenses.getExpenseName() == null || expenses.getExpenseName().trim().equals(""))
        {
            addFieldError("expenses.expenseName","The expense Name is required");
        }
        if (expenses.getAmountDue() <1)
        {
            addFieldError("expenses.amountDue","The amount due is too low");
        }
        if (expenses.getDueDate() == null || expenses.getDueDate().trim().equals(""))
        {
            addFieldError("expenses.dueDate","Due Date is required");
        }
        if (expenses.getPaidDate() == null || expenses.getPaidDate().trim().equals(""))
        {
            addFieldError("expenses.paidDate","Paid Date is required");
        }
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
