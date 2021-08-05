package com.expense.tracker;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, String> {
	Expense findByUniid(String uniid);
}
