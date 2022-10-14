package com.simplilearn.foodbox.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.foodbox.entity.Category;
public interface CategoryRepo extends JpaRepository<Category,Integer> {
	Category findByCategoryName(String categoryName);
}
