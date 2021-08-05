package com.expense.tracker;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Expense {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String uniid;
	
	
	private String expense;
	
	private String email;
	
    
   
	

	
	private int expenseamount;
	
//	private Date date;
   public int getExpenseamount() {
		return expenseamount;
	}
	public void setExpenseamount(int expenseamount) {
		this.expenseamount = expenseamount;
	}
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUniid() {
		return uniid;
	}
	public void setUniid(String uniid) {
		this.uniid = uniid;
	}
}
