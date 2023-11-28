package br.tec.mezon.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.tec.mezon.userdept.entities.User;
import br.tec.mezon.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;	
	
	
	@GetMapping
	public List<User> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id){
		return repository.findById(id).get();
	}
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return repository.save(user);
	}
	
	
}
