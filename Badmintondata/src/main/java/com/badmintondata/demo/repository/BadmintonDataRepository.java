package com.badmintondata.demo.repository;

import com.badmintondata.demo.model.sports;

public interface BadmintonDataRepository {
	sports findByusername(String username);
}
