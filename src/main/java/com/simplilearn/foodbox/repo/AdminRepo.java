package com.simplilearn.foodbox.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.foodbox.entity.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin, Long>{
	public List<Admin> findByUsername(String username);
	@Query("select a from Admin a where a.username=?1 and a.password=?2")
	public List<Admin> findByUsernameAndPassword(String username,String password);
	public Admin addadmin(Admin admin);
	public List<Admin> getalladmins();
	public Admin getbyid(Long id);
	public String updatebyid(Long id, Admin admin);
	public String deletebyid(Long id);
	public List<Admin> Login(String username, String password);
}


