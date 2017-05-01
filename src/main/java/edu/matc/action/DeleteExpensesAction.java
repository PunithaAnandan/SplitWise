package edu.matc.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import edu.matc.entity.Expenses;
import edu.matc.entity.User;
import edu.matc.interceptors.UserAware;
import edu.matc.persistence.ExpensesDao;
import org.apache.log4j.Logger;

/**
 * Created by Punitha Anandan on 4/27/2017.
 */
public class DeleteExpensesAction extends ActionSupport implements UserAware, ModelDriven<User> {
    private final Logger log = Logger.getLogger(this.getClass());
    private static final long serialVersionUID = 1L;
    private Expenses expenses;
    private User user;
    //private MessageStore messageStore;

    public String execute() throws Exception {
        System.out.println("DeleteExpensesAction.execute");
        System.out.println("DeleteExpensesAction.execute emailId:"+user.getEmailId());
        System.out.println("DeleteExpensesAction.execute expenses.getDueDate():"+expenses.getDueDate());
        ExpensesDao expensesDao = new ExpensesDao();
        expenses.setEmailId(user.getEmailId());
        expensesDao.deleteExpense(expenses);
        return SUCCESS;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

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

    @Override
    public void setUser(User user) {
        this.user=user;
    }

    public User getUser(User user){
        return this.user;
    }

    @Override
    public User getModel() {
        return this.user;
    }

}
