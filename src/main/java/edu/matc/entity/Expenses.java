package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Punitha Anandan on 2/20/2017.
 */

@Entity
@Table(name = "expenses")
public class Expenses {

    @Id
    @Column(name = "expense")
    private String expense_name;

    @Column(name = "amount")
    private double amount_due;

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
     * @param expense_name
     * @param amount_due
     * @param dueDate
     * @param paidDate
     */
    public Expenses(String expense_name, double amount_due, String dueDate, String paidDate) {
        this.expense_name = expense_name;
        this.amount_due = amount_due;
        this.dueDate = dueDate;
        this.paidDate = paidDate;
    }


    public String getExpense_name() {
        return expense_name;
    }

    public void setExpense_name(String expense_name) {
        this.expense_name = expense_name;
    }

    public double getAmount_due() {
        return amount_due;
    }

    public void setAmount_due(double amount_due) {
        this.amount_due = amount_due;
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
                "expense_name='" + expense_name + '\'' +
                ", amount_due=" + amount_due +
                ", dueDate='" + dueDate + '\'' +
                ", paidDate='" + paidDate + '\'' +
                '}';
    }
}
