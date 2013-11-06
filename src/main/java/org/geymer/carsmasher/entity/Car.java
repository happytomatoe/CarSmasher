package org.geymer.carsmasher.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
@Id
@GeneratedValue
private int id;
@Column(name="name")
private String name;
@Column(name="cost")
private Double cost;
@OneToMany(mappedBy = "car", fetch = FetchType.EAGER)
private List<Tire> tires;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}
public List<Tire> getTires() {
	return tires;
}
public void setTires(List<Tire> tires) {
	this.tires = tires;
}
@Override
public String toString() {
	return "Car [id=" + id + ", name=" + name + ", cost=" + cost + ", tires="
			+ tires + "]";
}


}
