package pe.somia.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.somia.restaurant.dao.RestaurantDAO;
import pe.somia.restaurant.model.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantDAO restaurantDAO;
	
	@Override
	public List<Restaurant> findAll() {
		return restaurantDAO.findAll();
	}

	@Override
	public Restaurant saveRestaurant(Restaurant restaurant) {
		return restaurantDAO.save(restaurant);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {
		return restaurantDAO.saveAndFlush(restaurant);
	}

	@Override
	public Restaurant findByRestaurantid(int restaurantid) {
		return restaurantDAO.findById(restaurantid).get();
	}

	@Override
	public void deleteRestaurant(int restaurantid) {
		restaurantDAO.deleteById(restaurantid);
	}

	@Override
	public Restaurant findByRestaurantname(String restaurantname) {
		return restaurantDAO.findByRestaurantname(restaurantname);
	}

	@Override
	public Restaurant findByDistrict(String district) {
		return restaurantDAO.findByDistrict(district);
	}

	@Override
	public Restaurant findByType(String type) {
		return restaurantDAO.findByType(type);
	}
}
