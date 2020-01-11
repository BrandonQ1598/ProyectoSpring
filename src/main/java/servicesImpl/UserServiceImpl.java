package servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import converter.UserConverter;
import dto.UserDTO;
import repository.UserRpository;
import services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRpository userRepository;
	@Autowired
	@Qualifier("UserConverter")
	private UserConverter userconverter;
	@Override
	public List<UserDTO> getUsers() {
		return userconverter.ListUsertoUserDTO(userRepository.findAll());

	}
	@Override
	public UserDTO getUserByName(String name) {
		return userconverter.UserDTOtoUser(userRepository.getUserByName(name));
	}
	@Override
	public UserDTO findByName(String name) {
		return userconverter.UserDTOtoUser(userRepository.findByName(name));
	}

}
