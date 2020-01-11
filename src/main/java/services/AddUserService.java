package services;

import models.User;

import org.springframework.http.ResponseEntity;

public interface AddUserService {
	
	public ResponseEntity<?> addUser(User user);

}
