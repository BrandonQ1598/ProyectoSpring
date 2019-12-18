package servicesImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import services.BaseService;

@Service
public class BaseServiceImpl implements BaseService{
	private final static Logger LOG = Logger.getLogger("controllers.BaseController");
	@Override
	public ResponseEntity<?> getHolaMundo() {
		Map<String, Object> respuesta = new HashMap<>();
		LOG.info("Hola mundo desde Spring");
		respuesta.put("Respuesta", "Hoa mundo desde Spring Boot - 202Accepted");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}

}
