package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by Punitha Anandan on 2/20/2017.
 */

@Entity
@Table(name ="expenses")
public class Expense {

    @Column(name = "expense")
    private String expense_name;

    @Column(name = "amount")
    private int amount_due;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "paid_date")
    private Date paidDate;


    /**
     * Instantiates a new User.
     */
    public Expense() {
    }

    /**This is the constructor
     *
     * @param expense_name
     * @param amount_due
     * @param dueDate
     * @param paidDate
     */
    public Expense(String expense_name, int amount_due, Date dueDate, Date paidDate) {
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

    public int getAmount_due() {
        return amount_due;
    }

    public void setAmount_due(int amount_due) {
        this.amount_due = amount_due;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }


    @Override
    public String toString() {
        return "Expense{" +
                "expense_name='" + expense_name + '\'' +
                ", amount_due=" + amount_due +
                ", dueDate=" + dueDate +
                ", paidDate=" + paidDate +
                '}';
    }
}
