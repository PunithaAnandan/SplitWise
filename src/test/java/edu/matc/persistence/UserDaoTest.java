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

   /* @Test
    public void getAllUsers() throws Exception {
        List<User> users = dao.getAllUsers();

    }

    @Test
    public void getUser() throws Exception {
    //TODO test the getUser Methods
        User user=dao.getUser(1);
        assertTrue(user.getUserId()==1);
    }

    @Test
    public void addUser() throws Exception {
    // TODO test the addUser Method
        User user = new User();
        user.setFirstName("Harry");
        user.setLastName("Ryen");
        assertTrue(dao.addUser(user)>0);
    }

    @Test
    public void deleteUser() throws Exception {
        //TODO test the delete
       //dao.deleteUser(7);
        User user =new User();
        user.setUserId(5);
        dao.deleteUser(user);
        //assertTrue("User still in the DB",user.getUserid()==5);
    }

    @Test
    public void updateUser() throws Exception {
        //TODO test the update
        User user =new User();
        user.setUserId(5);
        user.setLastName("Harry");
        dao.updateUser(user);
        //assertTrue("User still in the DB",user.getLastName().equals("Harry"));


    }*/

}
