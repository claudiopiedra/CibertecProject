package pe.somia.restaurant.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.somia.restaurant.service.RestaurantService;

@Controller
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = {"/restaurant"})
    public String listar(Model model){
        model.addAttribute("restaurant", restaurantService.findAll());
        return "restaurant/listar";
    }

    @GetMapping(value = {"/restaurant/porNombre"})
    public String buscarPorNombre(@RequestParam(value = "restaurantname", required = false) String restaurantname, Model model){
        model.addAttribute("restaurant", restaurantService.findByRestaurantname(restaurantname));
        return null;
    }

}
