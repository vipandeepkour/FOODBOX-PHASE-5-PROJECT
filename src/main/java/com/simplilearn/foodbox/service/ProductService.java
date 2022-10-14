package com.simplilearn.foodbox.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplilearn.foodbox.entity.Product;
import com.simplilearn.foodbox.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private ProductRepo prepo;
	public Product addproduct(Product product) 
	{
	return prepo.addproduct(product);
	}
	public List<Product> getallproducts(){
		return prepo.getallproducts();
	}
	public Product getproductsbyid(Long id) {
		return prepo.getproductbyid(id);
	}
	
	public String updateproduct(Product product, Long id) {
		return prepo.updateproduct(product, id);
	}
	//public boolean deleteproductById(Long id) {
		//return repo.deleteproductById(id);
	
	public boolean deleteproductById(long id) {
		
		return false;
	}
}


