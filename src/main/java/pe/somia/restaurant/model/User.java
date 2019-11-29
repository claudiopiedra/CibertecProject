package pe.somia.restaurant.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	@Transient
	private String passwordConfirm;
	@ManyToMany
	private Set<Role> roles;
}
