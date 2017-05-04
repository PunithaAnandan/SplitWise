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
    private  User user;
    private String expenseName;
    private double amountDue;
    private String dueDate;
    private String paidDate;
    private Expenses expenses;
    //private MessageStore messageStore;

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String execute() throws Exception {
        System.out.println("EditExpensesAction.execute");
        System.out.println("EditExpensesAction.execute emailId:"+user.getEmailId());
        System.out.println("EditExpensesAction.execute expenseName:"+expenseName);
        // System.out.println("EditExpensesAction.execute expenses.getDueDate():"+expenses.getDueDate());
        //ExpensesDao expensesDao = new ExpensesDao();
        expenses = new Expenses();
        expenses.setEmailId(user.getEmailId());
        expenses.setExpenseName(expenseName);
        expenses.setAmountDue(amountDue);
        expenses.setDueDate(dueDate);
        expenses.setPaidDate(paidDate);
        return SUCCESS;
    }


    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    @Override
    public void setUser(User user) {
        this.user=user;
    }
}
