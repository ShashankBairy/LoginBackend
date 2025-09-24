package com.scemplogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scemplogin.entity.SCEmployeeEntity;

@Repository
public interface SCEmployeeLoginRepository extends JpaRepository<SCEmployeeEntity, Integer> {

	@Query("SELECT e from SCEmployeeEntity e WHERE e.email = :email")
	public Optional<SCEmployeeEntity> findByCrendentails(@Param("email") String email);

}
