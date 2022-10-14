package com.simplilearn.foodbox.entity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="cart")
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Cart_ID")
private long id;
@Column(nullable=false)
private Double totalamount;
@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinColumn(name="user_id")
private User user;
@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST)
@JoinTable(name="cart-products",joinColumns= {@JoinColumn(name="cart_id")},inverseJoinColumns= {@JoinColumn(name="product_id")})
private List<Product>products;
public Cart() {}
public Cart(long id, Double totalamount, User user, List<Product> products) {
	super();
	this.id = id;
	this.totalamount = totalamount;
	this.user = user;
	this.products = products;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Double getTotalamount() {
	return totalamount;
}
public void setTotalamount(Double totalamount) {
	this.totalamount = totalamount;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Cart [id=" + id + ", totalamount=" + totalamount + ", user=" + user + ", products=" + products + "]";
}
public void setUser(int user) {
	
	
}
public Object getTotalItems() {
	return getTotalItems();
}
}


