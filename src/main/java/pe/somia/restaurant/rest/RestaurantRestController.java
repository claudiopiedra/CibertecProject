package pe.somia.restaurant.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.somia.restaurant.model.Restaurant;
import pe.somia.restaurant.service.RestaurantService;

@RestController
@RequestMapping(value = "restaurants")
public class RestaurantRestController {

	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping(value= "getrestaurant")
	public List<Restaurant> getFamiliesbyRestaurantName(){
		return restaurantService.findAll();
	}
	
	@GetMapping(value= "/getrestaurantforName/{restaurantname}")
	public Restaurant findByRestaurantName(@PathVariable(name= "restaurantname") String restaurantname){
		return restaurantService.findByRestaurantname(restaurantname);
	}
	
	@GetMapping(value= "/getrestaurantforDistrict/{district}")
	public Restaurant findByDistrict(@PathVariable(name= "district") String district){
		return restaurantService.findByDistrict(district);
	}
	
	@GetMapping(value= "/getrestaurantforType/{type}")
	public Restaurant findByType(@PathVariable(name= "type") String type){
		return restaurantService.findByType(type);
	}
	
	@PostMapping(value="postrestaurant")
	public Restaurant insertFamilies(@RequestBody Restaurant restaurants){
		return restaurantService.saveRestaurant(restaurants);
	}
		
	@PutMapping(value= "putrestaurant")
	public Restaurant updateFamilies(@RequestBody Restaurant restaurants){
			return restaurantService.updateRestaurant(restaurants);
	}
		
	@DeleteMapping("/deleterestaurant/{restaurantid}")
	public void deleteFamilies(@PathVariable(name= "restaurantid") Integer restaurantid) {
		restaurantService.deleteRestaurant(restaurantid);
	}
	
	@GetMapping(value= "/getrestaurantforId/{restaurantid}")
	public void findByRestaurantid(@PathVariable(name= "restaurantid") Integer restaurantid){
		restaurantService.findByRestaurantid(restaurantid);
	}
}
