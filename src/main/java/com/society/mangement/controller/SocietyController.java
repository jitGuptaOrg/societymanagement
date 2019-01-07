package com.society.mangement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.society.mangement.bean.RegisterSocietyUser;
import com.society.mangement.exception.SocietyResourceNotFound;
import com.society.mangement.repository.RegisterUserRepository;

@RestController
@RequestMapping("/societyinformation")
public class SocietyController {

	@Autowired
	RegisterUserRepository registerUserRepository;
	
	@GetMapping("/getSoceityData")
	public List<RegisterSocietyUser> getAllRegisterUser(){
		return registerUserRepository.findAll();
		
	}
	
	@PostMapping("/createSocietyData")
	public RegisterSocietyUser createSocietyUser(@Valid @RequestBody RegisterSocietyUser registerSocietyUser) {	
	    return registerUserRepository.save(registerSocietyUser);
	}
	
	
	@GetMapping("/societyInformation/{id}")
	public RegisterSocietyUser getsocietyById(@PathVariable(value = "id") Long id) {
	    return registerUserRepository.findById(id)
	            .orElseThrow(() -> new SocietyResourceNotFound("society", "id", id));
	}
	
	@RequestMapping("/hello")
	public String getHello() {

		return "I am in society controller";
	}

}
