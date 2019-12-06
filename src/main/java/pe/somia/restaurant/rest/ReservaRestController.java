package pe.somia.restaurant.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.somia.restaurant.model.Reserva;
import pe.somia.restaurant.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping(value = "reservas")
public class ReservaRestController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping(value= "getreserva")
    public List<Reserva> getreserva(){
        return reservaService.findAll();
    }

    @GetMapping(value= "/getreservaid/{reservaid}")
    public void findByRestaurantid(@PathVariable(name= "reservaid") Integer reservaid){
        reservaService.findByReservaid(reservaid);
    }

    @PostMapping(value="postreserva")
    public Reserva insertFamilies(@RequestBody Reserva reserva){
        return reservaService.saveReserva(reserva);
    }

}
