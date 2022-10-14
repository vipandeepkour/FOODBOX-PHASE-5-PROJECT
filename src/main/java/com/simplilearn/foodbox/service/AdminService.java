package com.simplilearn.foodbox.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplilearn.foodbox.entity.Admin;
import com.simplilearn.foodbox.repo.AdminRepo;
@Service
public class AdminService {
	@Autowired
	private AdminRepo arepo;
	public Admin addadmin(Admin admin) {
		return arepo.addadmin(admin);
	}
	public List<Admin> getalladmins(){
		return arepo.getalladmins();
	}
	public Admin getbyid(Long id) {
		return arepo.getbyid(id);
	}
	public String updatebyid(Admin admin,Long id) {
		return arepo.updatebyid(id, admin);
	}
	public String deletebyid(Long id){
		return arepo.deletebyid(id);
	}
	public List<Admin> login(String username,String password) {
		return arepo.Login(username, password);
	}
}


