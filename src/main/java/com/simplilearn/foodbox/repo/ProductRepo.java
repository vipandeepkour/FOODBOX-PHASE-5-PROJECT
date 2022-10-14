package com.simplilearn.foodbox.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simplilearn.foodbox.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{
	List<Product> getallproducts();
	Product getproductbyid(Long id);
	Product addproduct(Product product);
	String updateproduct(Product product, Long id);
	boolean deleteproductById(Long id); 
}

