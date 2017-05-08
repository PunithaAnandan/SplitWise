package edu.matc.persistence;

import edu.matc.entity.Expenses;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Punitha Anandan on 2/26/2017.
 */
public class ExpensesDaoTest {

    ExpensesDao expensesDao;
    Expenses expenses;

    /**
     * setup Method
     */
    @Before
    public void setup() {
        expensesDao = new ExpensesDao();
        expenses = new Expenses();
    }

    /** addExpenseTest Method
     *
     * @throws Exception
     */
    @Test
    public void addExpenseTest() throws Exception {
        expenses.setEmailId("tom2@gmail.com");
        expenses.setExpenseName("Credit Card1");
        expenses.setAmountDue(700.78);
        expenses.setDueDate("2017-04-17");
        expenses.setPaidDate("2017-04-21");
        assertTrue(expensesDao.addExpense(expenses)>0);
    }

    /**getExpenseTest
     *
     * @throws Exception
     */
    @Test
    public void getExpenseTest() throws Exception {
        Expenses expenses = expensesDao.getExpense("ram@gmail.com","Credit Card1");
        assertTrue(expenses.getDueDate().equals("2017-04-17"));
    }

    /**viewExpenseTest
     *
     * @throws Exception
     */
    @Test
    public void viewExpenseTest() throws Exception {
        List<Expenses> expensesList = null;
        expensesList = expensesDao.viewExpense("2017-04-17","sam@gmail.com");
        assertEquals(1, expensesList.size());
    }

    /**update ExpensesTest
     *
     * @throws Exception
     */
    @Test
    public void updateExpensesTest() throws Exception {
        expenses.setAmountDue(702);
        expenses.setExpenseName("Credit Card1");
        expensesDao.updateExpenses(expenses,"Credit Card1","2017-04-17");
        assertTrue("Expense not updated",expenses.getAmountDue()==702);
    }

    /**delete ExpenseTest
     *
     * @throws Exception
     */
    @Test
    public void deleteExpenseTest() throws Exception {
        expenses.setEmailId("ton@gmail.com");
        expensesDao.deleteExpense(expenses);
        assertTrue("Expense still in the DB",expenses.getEmailId().equals("ton@gmail.com"));
    }




}