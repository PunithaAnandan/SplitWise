package edu.matc.persistence;

import org.junit.Before;

/**
 * Created on 9/13/16.
 *
 * @author pwaite
 */
public class UserDaoTest {

    UserDao dao;

    @Before
    public void setup() {
        dao = new UserDao();
    }

       /*@Test
    public void getUser() throws Exception {
        User user=dao.getUser(1);
        assertTrue(user.getUserId()==1);
    }*/

   /* @Test
    public void addUser() throws Exception {
         User user = new User();
        user.setFirstName("Harry");
        user.setLastName("Ryen");
        assertTrue(dao.addUser(user)>0);
    }*/


}
