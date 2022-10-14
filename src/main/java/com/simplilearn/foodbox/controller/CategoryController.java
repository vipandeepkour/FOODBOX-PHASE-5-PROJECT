package com.simplilearn.foodbox.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.simplilearn.foodbox.entity.Category;
import com.simplilearn.foodbox.service.CategoryService;
@RestController
@RequestMapping("/category")
public class CategoryController {
@Autowired
private CategoryService categoryService;
@GetMapping("/")
 public List<Category> ListCategories() {
	    return categoryService.listCategories();
}
@PostMapping("/create")
		public ResponseEntity<Object> createCategory(@Validated @RequestBody Category category) {
		Category Object=categoryService.createCategory(category);
		return new ResponseEntity<Object>(Object,HttpStatus.CREATED);
			}
@PostMapping("/update/{categoryID}")
	public ResponseEntity<Object> updateCategory(@PathVariable("categoryID") Integer categoryID, @Validated @RequestBody Category category) {
	Category Object=categoryService.updateCategory(categoryID, category);
	if(Object!=null)
	{
	return new ResponseEntity<Object>("category exist", HttpStatus.FOUND);
		}
	else 
	{
		return new ResponseEntity<Object>("No category found",HttpStatus.NOT_FOUND);
	}
}
}

