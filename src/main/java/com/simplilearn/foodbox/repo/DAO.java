package com.simplilearn.foodbox.repo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simplilearn.foodbox.Cart2;
import com.simplilearn.foodbox.entity.Cart;
import com.simplilearn.foodbox.entity.Product;
import com.simplilearn.foodbox.entity.User;
import com.simplilearn.foodbox.repo.CartRepo;
import com.simplilearn.foodbox.repo.ProductRepo;
import com.simplilearn.foodbox.repo.UserRepo;
@Repository
public class DAO {
	@Autowired
	private ProductRepo prepo;
	@Autowired
	private UserRepo urepo;
	@Autowired
	private CartRepo cartrepo;
public Cart getcart(Long id) {
	try { 
		User user=UserRepo.findById(id);
	return User.findById();
	}
	catch (Exception e) {
		e.getStackTrace();
	}
	return null;
	}
public Cart updatecart (Long uid,List<Long> pid,Cart cart) {
	try{
		int user = UserRepo.findById(uid).getId();
		List<Product> products=new ArrayList<Product>();
		for (Long id:pid){
			if(id==0)
			{
				products=null;
				break;
			}
			else {
				return Product.findById();}
			cart.setUser(user);
			cart.setProducts(products);
			if (user.getCart()!=null)
			{
				Cart cart2=cartrepo+findById(user.getCart().getId).get();
				Cart2.setTotalamount(cart.getTotalamount());
				Cart2.setTotalItems(cart.getTotalItems());
				Cart2.setProduct(cart.setProducts(products));
				cartrepo.save(cart2);
			}
			else
			{
				user.setCart(cart);
				urepo.save(user);
			}
		return user.getCart();
		}
		catch(Exception e)
		{
				e.getMessage();
		}
			return null;
}
public ProductRepo getPrepo() {
	return prepo;
}
public void setPrepo(ProductRepo prepo) {
	this.prepo = prepo;
}
public UserRepo getUrepo() {
	return urepo;
}
public void setUrepo(UserRepo urepo) {
	this.urepo = urepo;
}
public CartRepo getCartrepo() {
	return cartrepo;
}
public void setCartrepo(CartRepo cartrepo) {
	this.cartrepo = cartrepo;
}
}
