package services;

import java.util.List;

import models.User;

import org.springframework.stereotype.Service;

import dto.UserDTO;

public interface UserService {
	public List<UserDTO> getUsers();
	
	public UserDTO getUserByName(String name);

	public UserDTO findByName(String name);
}
