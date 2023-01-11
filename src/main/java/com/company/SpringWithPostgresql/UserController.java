package com.company.SpringWithPostgresql;


import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class UserController {
	private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

    @Autowired
    private Repository userRepo;
    
    
    @PostMapping("/AddUsers")
    public ResponseEntity<?> insertUser(@RequestBody User user){
    	LOGGER.info("Created Succesfully : "+user);
        userRepo.save(user);
        return ResponseEntity.status(200).body("Sucessfully Created User Details: ");

    }

    @GetMapping("/getUsers")
    public List<User> findAllUser( User user){
    	LOGGER.info("Fetched All Users Details : "+user);
        return userRepo.findAll();

    }
}
