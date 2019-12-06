package pe.somia.restaurant.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.somia.restaurant.model.Restaurant;
import pe.somia.restaurant.service.RestaurantService;

@Controller
@Slf4j
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = {"/"})
    public String listAll(){
        return "listar";
    }

    @GetMapping(value = {"/restaurant"})
    public String listar(Model model){
        model.addAttribute("restaurant", restaurantService.findAll());
        return "restaurant/listar";
    }

    @GetMapping(value = {"/restaurant/buscar"})
    public String buscar(@RequestParam(value = "restaurantname", required = false) String restaurantname, Model model){
        model.addAttribute("restaurantx", restaurantService.findByRestaurantname(restaurantname));
        return "listar";
    }

    @GetMapping(value = {"/restaurant/buscartipo"})
    public String buscartipo(@RequestParam(value = "type", required = false) String type, Model model){
        model.addAttribute("restaurantt", restaurantService.findByType(type));
        return "listartipo";
    }

    @GetMapping(value = {"/restaurant/buscardistrito"})
    public String buscardistrito(@RequestParam(value = "district", required = false) String district, Model model){
        model.addAttribute("restaurantd", restaurantService.findByDistrict(district));
        return "listardistrito";
    }

    @GetMapping("/restaurant/ver/{id}")
    public String verporId(Model model, @PathVariable("id") Integer id ){
        Restaurant restaurant = restaurantService.findByRestaurantid(id);
        System.out.println("Objeto: "+ restaurant.toString() + " Desc: ");
        model.addAttribute("restaurantx", restaurant);
        return "ver";
    }

    @PostMapping(value = {"/restaurant/reservar"})
    public String reservar(Restaurant restaurant) {
        restaurantService.saveRestaurant(restaurant);
        return "redirect:/restaurant";
    }

}
