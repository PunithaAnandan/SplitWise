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

    /** Execute Method
     *
     * @return SUCCESS
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        ExpensesDao expensesDao = new ExpensesDao();
        expenses.setEmailId(user.getEmailId());
        expensesDao.addExpense(expenses);
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
        System.out.println("EnterExpensesAction.validate");
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
