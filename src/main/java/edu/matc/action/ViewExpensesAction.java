package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.matc.entity.Expenses;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Punitha Anandan on 3/6/2017.
 */
public class ViewExpensesAction extends ActionSupport implements UserAware {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private Expenses expenses;
    private User user;
    private List<Expenses> expensesList;
    private String exception;
    private String exceptionStack;

    /** get Exception
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

    /**get ExpensesList
     *
     * @return expensesList
     */
    public List<Expenses> getExpensesList() {
        return expensesList;
    }

    /**set ExpensesList
     *
     * @param expensesList
     */
    public void setExpensesList(List<Expenses> expensesList) {
        this.expensesList = expensesList;
    }

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        log.info("ViewExpensesAction.execute");
        log.info("ViewExpensesAction.execute emailId:" + user.getEmailId());
        log.info("ViewExpensesAction.execute expenses.getDueDate():" + expenses.getDueDate());
        ExpensesDao expensesDao = new ExpensesDao();
        int result=0;
        try {
            expenses.setEmailId(user.getEmailId());
            if(expensesList!=null && expensesList.size()>0) {
                expensesList.clear();
            }
            expensesList = expensesDao.viewExpense(expenses.getDueDate(), expenses.getEmailId());
            result=expensesList.size();
            log.info("ViewExpensesAction.execute result:" + result);
        } catch (Exception catchException) {
            exception = catchException.getMessage();
            exceptionStack = catchException.toString();
            log.info("ViewExpensesAction.execute result:exception:" + exception);
            return ERROR;
        }
        if(result==0) {
            exception = "There is no expense available to view";
            exceptionStack="";
            log.info("ViewExpensesAction.execute result:exception:" + exception);
            return ERROR;
        }
        return SUCCESS;
    }

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public void validate()
    {
        log.info("ViewExpensesAction.validate"+ expenses.getDueDate());
        if (expenses.getDueDate() == null || expenses.getDueDate().trim().equals(""))
        {
            log.info("ViewExpensesAction.validate statement starts");
            addFieldError("expenses.dueDate","Due Date is required");
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