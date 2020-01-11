package controllers;

import models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.AddUserService;
import services.UserService;

@RestController
@RequestMapping("/agregar")
public class AddUserController {

	@Autowired
	AddUserService addUserService;
	
	@PostMapping("addUser")
	public ResponseEntity<?> create(@RequestBody User usuario){
		return addUserService.addUser(usuario);
	}
}
