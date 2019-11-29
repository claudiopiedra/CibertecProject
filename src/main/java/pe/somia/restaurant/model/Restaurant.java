package pe.somia.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantid;
	
	@Column(name="restaurantname", length = 50)
	private String restaurantname;
	
	@Column(name= "level", length = 200)
	private String description;
	
	@Column(name="type", length = 20)
	private String type; 
	
	@Column(name = "district", length = 20)
	private String district;

	@Column(name = "mainAddress", length = 50)
	private String mainAddress;

	@Column(name = "phone", length = 9)
	private String phone;
	
	@Column(name = "preciopromedio", length = 10)
	private String preciopromedio;
	
	@Column(name = "sitioweb", length = 100)
	private String sitioweb;
	
	@Column(name = "atencion", length = 200)
	private String atencion;
	
	
}
