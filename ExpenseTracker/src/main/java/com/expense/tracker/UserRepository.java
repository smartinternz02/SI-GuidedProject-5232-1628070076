package com.expense.tracker;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String>{
   User findByEmail(String email);
}
