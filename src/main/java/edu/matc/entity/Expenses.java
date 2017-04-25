package edu.matc.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Punitha Anandan on 2/20/2017.
 */

@Entity
@Table(name = "expenses")
public class Expenses implements Serializable{

    @Id
    @Column(name = "email_Id")
    private String emailId;

    @Id
    @Column(name = "expense")
    private String expenseName;

    @Column(name = "amount")
    private double amountDue;

    @Column(name = "due_date")
    private String dueDate;

    @Column(name = "paid_date")
    private String paidDate;


    /**
     * Instantiates a new User.
     */
    public Expenses() {
    }

    /**This is the constructor
     *
     * @param emailId
     * @param expenseName
     * @param amountDue
     * @param dueDate
     * @param paidDate
     */
    public Expenses(String emailId, String expenseName, double amountDue, String dueDate, String paidDate) {
        this.emailId = emailId;
        this.expenseName = expenseName;
        this.amountDue = amountDue;
        this.dueDate = dueDate;
        this.paidDate = paidDate;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    @Override
    public String toString() {
        return "Expense{" +
                " emailId='" + emailId + '\'' +
                " expenseName='" + expenseName + '\'' +
                ", amountDue=" + amountDue +
                ", dueDate='" + dueDate + '\'' +
                ", paidDate='" + paidDate + '\'' +
                '}';
    }
}
