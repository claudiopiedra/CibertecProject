package pe.somia.restaurant.service;

import pe.somia.restaurant.model.Reserva;

import java.util.List;

public interface ReservaService {
    List<Reserva> findAll();

    Reserva findByReservaid(int reservaid);

    Reserva saveReserva(Reserva reserva);

    Reserva findByReserva(int reservaid);

}
