package edu.matc.persistence;

import edu.matc.entity.UserRoles;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by paulawaite on 2/2/16.
 */
public class UserRolesDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * add a user
     *
     * @param userRoles
     * @return the emailId of the inserted record
     */
    public String addUserRole(UserRoles userRoles) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        String emailId = "";
        try {
            transaction = session.beginTransaction();
            emailId = (String)session.save(userRoles);
            log.info("UserRolesDao.addUserRole emailId:"+emailId);
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction!=null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
        } finally {
            session.close();
        }
        return emailId;
    }

    /** Get a single userRole for the given emailId
     *
     * @param emailId user's emailId
     * @return UserRole
     */
    public UserRoles getUserRoles(String emailId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        UserRoles userRoles = null;
        try {
            transaction = session.beginTransaction();
            userRoles = (UserRoles) session.get(UserRoles.class, emailId);
            transaction.commit();
        } catch (HibernateException hibernateException) {
            if (transaction!=null) transaction.rollback();
            log.error("Hibernate Exception", hibernateException);
        } finally {
            session.close();
        }
        return userRoles;
    }
}

