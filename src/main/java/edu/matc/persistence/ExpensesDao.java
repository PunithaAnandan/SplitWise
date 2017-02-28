package edu.matc.persistence;

import edu.matc.entity.Expenses;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Punitha Anandan on 2/20/2017.
 */
public class ExpensesDao {
    private final Logger log = Logger.getLogger(this.getClass());


    /**
     * add a user expense
     *
     * @param expenses
     */
    public void addExpense(Expenses expenses) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(expenses);
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction != null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
            System.out.println("Hibernate Exception:" + hibernateException.getStackTrace());
        } finally {
            session.close();
        }
    }

    /**
     * view a user expense
     *
     * @param date
     * @return expensesList
     */
    public List<Expenses> viewExpense(String date) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        String query = null;
        List<Expenses> expensesList = new ArrayList<Expenses>();
        try {
            transaction = session.beginTransaction();
            query = "from Expenses where due_date <=:sDate";
            expensesList = (ArrayList<Expenses>) session.createQuery(query).setString("sDate",date).list();
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction != null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);

        } finally {
            session.close();
        }
        return expensesList;
    }


    /** Get a expenses for given expenseName
     *
     * @param expenseName  The name of Expense
     * @return expenses
     */
    public Expenses getExpense(String expenseName) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Expenses expenses = null;
        try {
            transaction = session.beginTransaction();
            expenses = (Expenses) session.get(Expenses.class, expenseName);
            transaction.commit();

        }catch (HibernateException hibernateException) {
            if (transaction!=null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
        }finally {
            session.close();
        }
        return expenses;
    }
}

