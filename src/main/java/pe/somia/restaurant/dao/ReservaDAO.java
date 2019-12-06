package pe.somia.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.somia.restaurant.model.Reserva;

public interface ReservaDAO extends JpaRepository<Reserva, Integer> {

}
