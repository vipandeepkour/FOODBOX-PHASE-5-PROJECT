package com.simplilearn.foodbox.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.simplilearn.foodbox.entity.Product;
import com.simplilearn.foodbox.service.ProductService;
@RestController
public class ProductController {
@Autowired
private ProductService service;
@PostMapping("/")
public ResponseEntity<Object> addProduct(@RequestBody Product product)
{
	Product Object=service.addproduct(product);
	return new ResponseEntity<Object>(Object,HttpStatus.CREATED); 
}
@GetMapping("/{id}")
public List<Product> getallproducts()
{
	return service.getallproducts();
}
@GetMapping("/{id}")
public ResponseEntity<Object> getProductById(@PathVariable long id)
{
	Product Object=service.getproductsbyid(id);
	if(Object!=null)
	{
		return new ResponseEntity<Object>(Object,HttpStatus.FOUND);
	}
else
{
	return new ResponseEntity<Object>("No product found",HttpStatus.NOT_FOUND);	
}
}
@DeleteMapping("/{id}")
public ResponseEntity<Object> deleteProductById(@PathVariable long id)
{
	boolean Object=service.deleteproductById(id);
	if(service.deleteproductById(id))
	{
		return new ResponseEntity<Object>(Object,HttpStatus.FOUND);
	}
else
{
	return new ResponseEntity<Object>("No product found",HttpStatus.NOT_FOUND);	
}	
}
}

