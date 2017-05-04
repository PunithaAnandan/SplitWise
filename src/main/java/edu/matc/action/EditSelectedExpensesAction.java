package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.matc.entity.Expenses;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 4/20/2017.
 */
public class EditSelectedExpensesAction extends ActionSupport implements UserAware {
    private final Logger log = Logger.getLogger(this.getClass());
    private Expenses expenses;
    private  User user;
    private  String expenseName;
    private String dueDate;

    @Override
    public String execute() throws Exception {
        System.out.println("EditSelectedExpensesAction.execute");
        System.out.println("EditSelectedExpensesAction.execute expenseName:"+expenseName);
        System.out.println("EditSelectedExpensesAction.execute dueDate:"+dueDate);
        ExpensesDao expensesDao = new ExpensesDao();
        expenses.setEmailId(user.getEmailId());
        expensesDao.updateExpenses(expenses, expenseName,dueDate);
        return SUCCESS;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void validate()
    {
        System.out.println("EditSelectedExpensesAction.validate");
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

    @Override
    public void setUser(User user) {
        this.user=user;
    }
}
