package me.minkang.tutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import me.minkang.tutorial.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
   @EntityGraph(attributePaths = "authorities")
   Optional<User> findOneWithAuthoritiesByUsername(String username);
}
