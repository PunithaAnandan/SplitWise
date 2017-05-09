package edu.matc.persistence;

import edu.matc.entity.Expenses;
import org.apache.log4j.Logger;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StandardBasicTypes;

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
    public void addExpense(Expenses expenses) throws Exception {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(expenses);
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction != null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
            log.info("Hibernate Exception:" + hibernateException.getStackTrace());
            throw new Exception(hibernateException);
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
    public List<Expenses> viewExpense(String date,String emailId) throws Exception {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Criteria criteria = null;
        String query = null;
        List<Expenses> expensesList = new ArrayList<Expenses>();
        int month=Integer.parseInt(date.substring(5,7));
        try {
            transaction = session.beginTransaction();
            criteria = session.createCriteria(Expenses.class);
            criteria.add(Restrictions.sqlRestriction("MONTH(due_date) = ? ", month, StandardBasicTypes.INTEGER));
            criteria.add(Restrictions.eq("emailId",emailId));
            query = "from expenses where month(due_date) =:month and email_Id =:emailId";
            expensesList = criteria.list();
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction != null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
            throw new Exception(hibernateException);
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            log.error("Exception", e);
            throw e;
        } finally {
            session.close();
        }
        return expensesList;
    }

    /** Get a expenses for given expenseName
     *
     * @param expenseName
     * @param emailId
     * @return expenses
     */
    public Expenses getExpense(String emailId, String expenseName) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Expenses expenses = null;
        Expenses inputExpenses = new Expenses();
        try {
            transaction = session.beginTransaction();
            inputExpenses.setEmailId(emailId);
            inputExpenses.setExpenseName(expenseName);
            expenses = (Expenses) session.get(Expenses.class, inputExpenses);
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction!=null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
        } finally {
            session.close();
        }
        return expenses;
    }

    /** Update the expenses
     *

    /** Update the expenses
     *
     * @param expenses
     * @param oldExpenseName
     * @param oldDueDate
     * @return result
     */
    public int updateExpenses(Expenses expenses, String oldExpenseName, String oldDueDate) throws Exception {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        int result =0;
        try {
            transaction = session.beginTransaction();
            Query query = session.createSQLQuery("update expenses " +
                    "set expense = :expenseName, due_date = :dueDate, amount = :amtDue, paid_date = :paidDate"
                    + " where email_Id = :emailId and expense = :oldExpenseName and due_date = :oldDueDate");
            query.setParameter("emailId", expenses.getEmailId());
            query.setParameter("oldExpenseName", oldExpenseName);
            query.setParameter("oldDueDate", oldDueDate);
            query.setParameter("expenseName", expenses.getExpenseName());
            query.setParameter("dueDate", expenses.getDueDate());
            query.setParameter("amtDue", expenses.getAmountDue());
            query.setParameter("paidDate", expenses.getPaidDate());
            result = query.executeUpdate();
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction!=null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
            throw new Exception(hibernateException);
        } finally {
            session.close();
        }
        return result;
    }


    /**Delete Expense
     *
     * @param expenses
     * @return result
     * @throws Exception
     */
    public int deleteExpense(Expenses expenses)throws Exception {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Query query;
        int result =0;
        try {
            transaction = session.beginTransaction();
            query = session.createSQLQuery("delete from expenses " +
                    " where email_Id = :emailId and expense = :expenseName and due_date = :dueDate ");
            query.setParameter("emailId", expenses.getEmailId());
            query.setParameter("expenseName", expenses.getExpenseName());
            query.setParameter("dueDate", expenses.getDueDate());
            result = query.executeUpdate();
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction != null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
            throw new Exception(hibernateException);
        } finally {
            session.close();
        }
        return result;
    }
}

