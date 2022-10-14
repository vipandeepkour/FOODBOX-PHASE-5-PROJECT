package com.simplilearn.foodbox.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simplilearn.foodbox.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

	static User getById(Long id) {
		return null;
	}

	static User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
