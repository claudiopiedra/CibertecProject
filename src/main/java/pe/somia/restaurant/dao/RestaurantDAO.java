package pe.somia.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.somia.restaurant.model.Restaurant;

@Repository
public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{
	
	public Restaurant findByRestaurantname(String restaurantname);
	public Restaurant findByDistrict(String district);
	public Restaurant findByType(String type);
}
