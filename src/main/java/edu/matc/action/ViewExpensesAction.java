package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.matc.entity.Expenses;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Punitha Anandan on 3/6/2017.
 */
public class ViewExpensesAction extends ActionSupport implements UserAware, ModelDriven<User> {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private Expenses expenses;
    private User user;
    private List<Expenses> expensesList;

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
        expenses.setEmailId(user.getEmailId());
        expensesList = expensesDao.viewExpense(expenses.getDueDate(), expenses.getEmailId());
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
    public void validate()
    {
        if (expenses.getDueDate() == null || expenses.getDueDate().trim().equals(""))
        {
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

    /**get User
     *
     * @param user
     * @return user
     */
    public User getUser(User user){
        return this.user;
    }

    /**get Model
     *
     * @return user
     */
    @Override
    public User getModel() {
        return this.user;
    }
}