package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * A class to represent a user.
 *
 * @author puni
 */
@Entity
@Table (name ="users")
public class User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "user_Id")
    private int userId;

    @Column(name = "password")
    private String password;

    @Column(name = "email_Id")
    private String emailId;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**This is the constructor
     *
     * @param firstName
     * @param lastName
     * @param userId
     * @param password
     * @param emailId
     */
    public User(String firstName, String lastName, int userId, String password, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.password = password;
        this.emailId = emailId;
    }

    /**
     * gets first name.
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets userid.
     *
     * @return the userId
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * Sets userid.
     *
     * @param userId the user Id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }


    /**
     * gets password.
     *
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets password.
     *
     * @param password the last name
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * sets emailId.
     *
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * sets emailId.
     *
     * @param emailId the last name
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userId=" + userId +
                ", password=" + password +
                ", emailId=" + emailId +
                '}';
    }
}
