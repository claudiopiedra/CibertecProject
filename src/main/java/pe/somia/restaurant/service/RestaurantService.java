package pe.somia.restaurant.service;

import java.util.List;

import pe.somia.restaurant.model.Restaurant;

public interface RestaurantService {

	List<Restaurant> findAll();
	
	Restaurant saveRestaurant(Restaurant restaurant);
			
	Restaurant updateRestaurant(Restaurant restaurant);
	
	Restaurant findByRestaurantid(int restaurantid);
		
	void deleteRestaurant(int restaurantid);
	
	List<Restaurant> findByRestaurantname(String restaurantname);

	List<Restaurant> findByDistrict(String district);

	List<Restaurant> findByType(String type);


}
