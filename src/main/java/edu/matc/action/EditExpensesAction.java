package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.matc.entity.Expenses;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 4/20/2017.
 */
public class EditExpensesAction extends ActionSupport implements UserAware {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private User user;
    private String expenseName;
    private double amountDue;
    private String dueDate;
    private String paidDate;
    private Expenses expenses;

    /** get Amount Due
     *
     * @return amountDue
     */
    public double getAmountDue() {
        return amountDue;
    }

    /**set Amount Due
     *
     * @param amountDue
     */
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    /**get Due Date
     *
     * @return DueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**set Due Date
     *
     * @param dueDate
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**get Paid Date
     *
     * @return paidDate
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**set Paid Date
     *
     * @param paidDate
     */
    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        log.info("EditExpensesAction.execute");
        log.info("EditExpensesAction.execute emailId:" + user.getEmailId());
        log.info("EditExpensesAction.execute expenseName:" + expenseName);
        expenses = new Expenses();
        expenses.setEmailId(user.getEmailId());
        expenses.setExpenseName(expenseName);
        expenses.setAmountDue(amountDue);
        expenses.setDueDate(dueDate);
        expenses.setPaidDate(paidDate);
        return SUCCESS;
    }

    /**get ExpenseName
     *
     * @return expenseName
     */
    public String getExpenseName() {
        return expenseName;
    }

    /**set ExpenseName
     *
     * @param expenseName
     */
    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
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

    /**set User
     *
     * @param user
     */
    @Override
    public void setUser(User user) {
        this.user=user;
    }
}
