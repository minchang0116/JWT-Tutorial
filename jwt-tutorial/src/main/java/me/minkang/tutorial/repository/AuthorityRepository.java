package me.minkang.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.minkang.tutorial.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
