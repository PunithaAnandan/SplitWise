package edu.matc.persistence;

import edu.matc.entity.Expenses;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Punitha Anandan on 2/26/2017.
 */
public class ExpensesDaoTest {
    ExpensesDao expensesDao;
    Expenses expenses;

    @Before
    public void setup() {
        expensesDao = new ExpensesDao();
        expenses = new Expenses();
    }

    @Test
    @Ignore
    public void addExpenseTest() throws Exception {
        expenses.setEmailId("ram@gmail.com");
        expenses.setExpenseName("Credit Card1");
        expenses.setAmountDue(700.78);
        expenses.setDueDate("2017-04-17");
        expenses.setPaidDate("2017-04-21");
        assertTrue(expensesDao.addExpense(expenses)>0);

    }

    @Test
    public void getExpense() throws Exception {
        Expenses expenses = expensesDao.getExpense("ram@gmail.com","Credit Card1");
        assertTrue(expenses.getDueDate().equals("2017-04-17"));
    }




    @Test
    public void viewExpense() throws Exception {

    }

    @Test
    public void getExpense1() throws Exception {

    }

    @Test
    public void updateExpenses() throws Exception {

    }




}