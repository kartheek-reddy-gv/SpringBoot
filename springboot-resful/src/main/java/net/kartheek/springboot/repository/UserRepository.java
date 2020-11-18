package net.kartheek.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.kartheek.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	


}
