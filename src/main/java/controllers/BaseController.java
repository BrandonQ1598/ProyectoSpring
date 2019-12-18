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



@RestController
@RequestMapping("/base")
public class BaseController {
	private final static Logger LOG = Logger.getLogger("controllers.BaseController");
	
	@Autowired
	BaseService baseService;
	@GetMapping("holaMundo")
	public ResponseEntity<?> holaMundo(){
		Map<String, Object> respuesta = new HashMap<>();
		LOG.info("Hola mundo desde Spring");
		respuesta.put("Respuesta", "Hoa mundo desde Spring Boot - 202Accepted");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}
	@GetMapping("getHolaMundo")
	public ResponseEntity<?> getHolaMundo(){
		return baseService.getHolaMundo();
	}
}
