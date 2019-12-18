package servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.User;
import repository.UserRpository;
import services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRpository userRepository;
	@Override
	public List<User> getUsers() {

		return (List<User>) userRepository.findAll();
	}

}
