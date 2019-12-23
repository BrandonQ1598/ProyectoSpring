package converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import models.User;
import dto.UserDTO;

@Component("UserConverter")
public class UserConverter {

	public UserDTO UserDTOtoUser(User user){
		if(user!=null){
		UserDTO userdto= new UserDTO();
		userdto.setId(user.getId());
		userdto.setName(user.getName());
		userdto.setLastname(user.getLastname());
		userdto.setCreateDate(user.getCreateDate());
		userdto.setStatus(user.getStatus());
		userdto.setRoles(user.getRoles());
		return userdto;
		}
		return null;
	}
	public User UsertoUserDTO(UserDTO userdto){
		if(userdto!=null){
		User user= new User();
		user.setId(userdto.getId());
		user.setName(userdto.getName());
		user.setLastname(userdto.getLastname());
		user.setCreateDate(userdto.getCreateDate());
		user.setStatus(userdto.getStatus());
		return user;
		}
		return null;
	}
	
	public List<User> ListUserDTOtoUser(List<UserDTO> users){
		List<User> users2= new ArrayList<User>();
		for(UserDTO user: users){
			User user1= new User();
			user1.setId(user.getId());
			user1.setName(user.getName());
			user1.setLastname(user.getLastname());
			user1.setCreateDate(user.getCreateDate());
			user1.setStatus(user.getStatus());
			users2.add(user1);
		}
		return users2;
	}
	public List<UserDTO> ListUsertoUserDTO(Iterable<User> users){
		List<UserDTO> users2= new ArrayList<UserDTO>();
		for(User user1: users){
			UserDTO user= new UserDTO();
			user.setId(user1.getId());
			user.setName(user1.getName());
			user.setLastname(user1.getLastname());
			user.setCreateDate(user1.getCreateDate());
			user.setStatus(user1.getStatus());
			users2.add(user);
		}
		return users2;
	}
}
