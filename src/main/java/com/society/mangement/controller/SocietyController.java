package com.society.mangement.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.society.mangement.bean.RegisterSocietyUser;
import com.society.mangement.exception.SocietyResourceNotFound;
import com.society.mangement.repository.RegisterUserRepository;


@RestController
@RequestMapping("/societyinformation")
public class SocietyController {
	
	private static final Logger logger = LogManager.getLogger(SocietyController.class);

	@Autowired
	RegisterUserRepository registerUserRepository;

	@GetMapping("/getSoceityData")
	public List<RegisterSocietyUser> getAllRegisterUser(){
		logger.info("Entering into registerUser::getAllRegisterUser()");
		return registerUserRepository.findAll();	
	}
	
	@PostMapping("/createSocietyData")
	public RegisterSocietyUser createSocietyUser(@Valid @RequestBody RegisterSocietyUser registerSocietyUser) {	
		logger.info("Entering into registerUser::createSocietyUser()");
		return registerUserRepository.save(registerSocietyUser);
	}
	
	
	@GetMapping("/societyfind/{id}")
	public RegisterSocietyUser getsocietyById(@PathVariable(value = "id") Long id)  {
		logger.info("Entering into registerUser::getsocietyById()");
	    return registerUserRepository.findById(id)
	            .orElseThrow(() -> new SocietyResourceNotFound("society", "id", id));

	}
	
	// Update a Note
	@PutMapping("/societyUpdate/{id}")
	public RegisterSocietyUser updateNote(@PathVariable(value = "id") Long id,
	                                        @Valid @RequestBody RegisterSocietyUser registerSocietyUser) {
		logger.info("Entering into registerUser::updateNote()");
		RegisterSocietyUser registerUsderbySociety = registerUserRepository.findById(id)
	            .orElseThrow(() -> new SocietyResourceNotFound("society", "id", id));

		registerUsderbySociety.setId(registerSocietyUser.getId());
		registerUsderbySociety.setEmailId(registerSocietyUser.getEmailId());
	    

	    return registerUserRepository.save(registerUsderbySociety);

	}		
}
