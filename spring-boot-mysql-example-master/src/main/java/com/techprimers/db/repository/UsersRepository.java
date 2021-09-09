package com.techprimers.db.repository;

import com.techprimers.db.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//login
@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
//	doubt
	Users findByUserNameAndPassword(String userName, String password);
}
