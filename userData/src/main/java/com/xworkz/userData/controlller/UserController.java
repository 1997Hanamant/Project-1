package com.xworkz.userData.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.userData.dto.UserDTO;
import com.xworkz.userData.service.UserServivce;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServivce  userService;
	
	@PostMapping
	public String onSave(UserDTO userDTO,Model model) {
		System.out.println("Calling onSave Method");
		System.out.println(userDTO);
		Boolean validateAndSave = userService.validateAndSave(userDTO);
		System.out.println(validateAndSave);
		if(validateAndSave) {
			model.addAttribute("DTO", userDTO);
			model.addAttribute("mesg", "Data Added SuccessFull Enter Next Detail");
		}
		else {
			model.addAttribute("mesg", "Data Entered Are Not Valid");
		}
		
		return "SignUp";
	}
}
