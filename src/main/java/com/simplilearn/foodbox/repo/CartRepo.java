package com.simplilearn.foodbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.foodbox.entity.Cart;
@Repository
public interface CartRepo extends JpaRepository<Cart, Long>{

}
