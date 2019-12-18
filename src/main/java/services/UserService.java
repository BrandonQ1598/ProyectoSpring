package services;

import java.util.List;

import models.User;

import org.springframework.stereotype.Service;

public interface UserService {
	public List<User> getUsers();

}
