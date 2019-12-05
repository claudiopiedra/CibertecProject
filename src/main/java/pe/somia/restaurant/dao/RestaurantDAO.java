package pe.somia.restaurant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.somia.restaurant.model.Restaurant;

@Repository
public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{
	
	public List<Restaurant> findByRestaurantname(String restaurantname);
	public List<Restaurant> findByDistrict(String district);
	public List<Restaurant> findByType(String type);
}
