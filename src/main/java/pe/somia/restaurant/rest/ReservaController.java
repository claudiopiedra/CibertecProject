package pe.somia.restaurant.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.somia.restaurant.model.Reserva;
import pe.somia.restaurant.model.Restaurant;
import pe.somia.restaurant.service.ReservaService;

@Controller
@Slf4j
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @GetMapping(value = "form")
    public String form(Model model){
        model.addAttribute("reservax" , new Reserva());
        return "formReserva";
    }


    @PostMapping(value = {"/reserva/reservar"})
    public String reservar(Reserva reservax) {
        reservaService.saveReserva(reservax);
        return "redirect:/restaurant/buscar";
    }
}
