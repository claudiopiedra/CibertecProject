package pe.somia.restaurant.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservaid;

    @Column(name="restaurantname", length = 50)
    private String restaurantname;

    @Column(name="type", length = 20)
    private String type;

    @Column(name = "district", length = 20)
    private String district;

    @Column(name="nombrePersona", length = 20)
    private String nombrePersona;

    @Column(name="horarioDisponible", length = 20)
    private String horarioDisponible;
}
