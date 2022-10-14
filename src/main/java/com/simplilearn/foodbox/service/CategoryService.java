package com.simplilearn.foodbox.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplilearn.foodbox.entity.Category;
import com.simplilearn.foodbox.repo.CategoryRepo;
@Service
public class CategoryService {
@Autowired
private CategoryRepo crepo;
public List<Category> listCategories() {
	return crepo.findAll();
}
public Category createCategory(Category category) {
	return crepo.save(category);
}
public Category readCategory(String categoryName) {
	return crepo.findByCategoryName(categoryName);
}
public Optional<Category> readCategory(Integer categoryId) {
	return crepo.findById(categoryId);
}
public Category updateCategory(Integer categoryID, Category newCategory) {
	Category category = repofindById(categoryID).get();
	category.setCategoryName(newCategory.getCategoryName());
	category.setDescription(newCategory.getDescription());
	return crepo.save(category);
}
private Optional<Category> repofindById(Integer categoryID) {
	return null;
}
}
