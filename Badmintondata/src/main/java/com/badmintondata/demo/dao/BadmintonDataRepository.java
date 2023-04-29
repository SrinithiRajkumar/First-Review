package com.badmintondata.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.badmintondata.demo.model.sports;
@Repository

public interface BadmintonDataRepository extends JpaRepository<sports,Integer>{

	sports findByusername(String username);
	
}