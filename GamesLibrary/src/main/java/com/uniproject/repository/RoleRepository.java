package com.uniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniproject.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
}