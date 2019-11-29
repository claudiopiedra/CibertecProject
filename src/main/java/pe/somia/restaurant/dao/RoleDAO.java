package pe.somia.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.somia.restaurant.model.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {
	 	
}
