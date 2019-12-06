package pe.somia.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.somia.restaurant.dao.ReservaDAO;
import pe.somia.restaurant.model.Reserva;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    ReservaDAO reservaDAO;

    @Override
    public List<Reserva> findAll() {
        return reservaDAO.findAll();
    }

    @Override
    public Reserva findByReservaid(int reservaid) {
        return reservaDAO.findById(reservaid).get();
    }

    @Override
    public Reserva saveReserva(Reserva reserva) {
        return reservaDAO.save(reserva);
    }

    @Override
    public Reserva findByReserva(int reservaid) {
        return reservaDAO.findById(reservaid).get();
    }

}
