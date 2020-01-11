package servicesImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import repository.UserRpository;
import services.AddUserService;

@Service
public class AddUserServiceImpl implements AddUserService{
	private final static Logger LOG = Logger.getLogger("controllers.AddUserController");
	@Autowired
	private UserRpository userRepository;
	@Override
	public ResponseEntity<?> addUser(User user) {
		userRepository.save(user);
		Map<String, Object> respuesta = new HashMap<>();
		LOG.info("El usuario se registro con exito");
		respuesta.put("Respuesta", "El usuario se registro con exito - 202Accepted");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}
	
}
