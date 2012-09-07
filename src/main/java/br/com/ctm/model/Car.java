package main.java.br.com.ctm.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="car")
@RequestScoped  
public class Car {
	private String model;
	private int year;
	private String manufacturer;
	private String color;
	
	public Car(String model, int year,String manufacturer, String color){
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.color = color;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufactuer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
