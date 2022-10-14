package com.simplilearn.foodbox.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name = "category_name")
private  String categoryName;
private String description;
public Category() {}
public Category(int id, String categoryName, String description) {
	super();
	this.id = id;
	this.categoryName = categoryName;
	this.description = description;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Category [id=" + id + ", categoryName=" + categoryName + ", description=" + description + "]";
}

}
