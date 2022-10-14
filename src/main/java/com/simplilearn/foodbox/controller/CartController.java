package com.simplilearn.foodbox.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.simplilearn.foodbox.entity.Cart;
import com.simplilearn.foodbox.service.CartService;
@RestController
@RequestMapping("/api/user/cart")
public class CartController {
@Autowired
private CartService cartservice;
@GetMapping("{id}")
public ResponseEntity<Cart> getcart(@PathVariable("id")Long id){
Cart cart=cartservice.getcart(id);
if(cart!=null) {
	return new ResponseEntity<Cart>(HttpStatus.FOUND);
}
else	
	return new ResponseEntity<Cart>(HttpStatus.NOT_FOUND);
}

@PostMapping("{uid}/{pid}")
public ResponseEntity<Cart> updatecart(@PathVariable("uid") Long uid,@PathVariable("pid")List<Long> pid, @RequestBody Cart cart)
{
	Cart updatedCart=cartservice.updateCart(uid,pid,cart);
	if (updatedCart!=null) {
		return new ResponseEntity<Cart>(updatedCart,HttpStatus.OK);
	}
	else
		return new ResponseEntity<Cart>(HttpStatus.BAD_REQUEST);
	}
}


