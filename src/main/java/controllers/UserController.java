package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.BaseService;
import services.UserService;

@RestController
@RequestMapping("/base")
public class UserController {
	private final static Logger LOG = Logger.getLogger("controllers.UserController");
	
	@Autowired
	UserService userService;
	
	@GetMapping("getHolaMundo")
	public ResponseEntity<?> getHolaMundo(){
		Map<String, Object> respuesta = new HashMap<>();
		if(userService.getUsers().isEmpty()){
			respuesta.put("No data", "No hay usuarios");
		}else{
			respuesta.put("Data", userService.getUsers());
		}
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}
}
