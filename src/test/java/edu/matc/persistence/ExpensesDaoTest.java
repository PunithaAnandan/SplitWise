package edu.matc.persistence;

import edu.matc.entity.Expenses;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Punitha Anandan on 2/26/2017.
 */
public class ExpensesDaoTest {
    ExpensesDao expensesDao;

    @Before
    public void setup() {
        expensesDao = new ExpensesDao();
    }

    @Test
    public void getExpense() throws Exception {
        Expenses expenses = expensesDao.getExpense("Gas");
        assertTrue(expenses.getDueDate().equals("2017-02-15"));
    }


}