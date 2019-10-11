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
	
	@Column(name="type", length = 10)
	private String type; 
	
	@Column(name = "location", length = 10)
	private String location;
	
	@Column(name= "level", length = 5)
	private String level;
}
