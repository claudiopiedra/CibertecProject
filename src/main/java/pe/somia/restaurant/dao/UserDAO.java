package pe.somia.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.somia.restaurant.model.User;

public interface UserDAO extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
