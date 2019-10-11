package pe.somia.restaurant.service;

import java.util.List;

import pe.somia.restaurant.model.Restaurant;

public interface RestaurantService {

	public List<Restaurant> findAll();
	
	public Restaurant saveRestaurant(Restaurant restaurant);
			
	public Restaurant updateRestaurant(Restaurant restaurant);
	
	public Restaurant findByRestaurantid(int restaurantid);
		
	public void deleteRestaurant(int restaurantid);
}
