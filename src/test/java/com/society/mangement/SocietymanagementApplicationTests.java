package com.society.mangement;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.society.mangement.bean.RegisterSocietyUser;
import com.society.mangement.repository.RegisterUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class SocietymanagementApplicationTests {
	
	private static final Logger logger = LogManager.getLogger();
	@Autowired
	RegisterUserRepository registerUserRepository;
	
	@Test
	public void testRegisteruser() {
		try {
		RegisterSocietyUser registerSocietyUser = new RegisterSocietyUser();
		
		registerSocietyUser.setId((long) 2);
		registerSocietyUser.setFlatNo("603");
		registerSocietyUser.setMobileNo("9028018399");
		registerSocietyUser.setSocietyName("Rustic paradise Housing Society");
		registerSocietyUser.setOwner("rented");
		registerSocietyUser.setWingName("D");
		registerSocietyUser.setUsername("jitgupta");
		registerSocietyUser.setPassword("india");
		registerSocietyUser.setEmailId("jitendragupta1899@gmail.com");
		System.out.println(registerSocietyUser + "calling to register Society user");	
		registerUserRepository.save(registerSocietyUser);
		logger.info("information sucessfully updated");
				
	}catch (Exception e) {
		logger.error("User data not saved sucessfully", e);
		
	}
	}
	
	@Test
	public void contextLoads() {
	}

}

