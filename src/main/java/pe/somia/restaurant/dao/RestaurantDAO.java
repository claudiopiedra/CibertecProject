package pe.somia.restaurant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.somia.restaurant.model.Restaurant;

@Repository
public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{
	
	List<Restaurant> findByRestaurantname(String restaurantname);
	List<Restaurant> findByDistrict(String district);
	List<Restaurant> findByType(String type);
}
