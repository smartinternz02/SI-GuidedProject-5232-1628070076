package com.expense.tracker;
//import java.sql.Date;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	  @Id
	   private String email;
	   private String name;
	   private String password;
	   private int amount;
//	   private String expense;
//	   private int expenseamount;
//	   private Date date;
	   public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
//	public String getExpense() {
//		return expense;
//	}
//	public void setExpense(String expense) {
//		this.expense = expense;
//	}
//	public int getExpenseamount() {
//		return expenseamount;
//	}
//	public void setExpenseamount(int expenseamount) {
//		this.expenseamount = expenseamount;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	
}
