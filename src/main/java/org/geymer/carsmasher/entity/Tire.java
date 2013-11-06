package org.geymer.carsmasher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tire")
public class Tire {
@Id
@GeneratedValue
int id;
@Column(name="name")
String name;
@Column(name="cost")
double cost;
@Column(name="size")
Double size;
@ManyToOne
@JoinColumn(name = "car_id", referencedColumnName = "id")
private Car car;
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
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public Double getSize() {
	return size;
}
public void setSize(Double size) {
	this.size = size;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}

}
