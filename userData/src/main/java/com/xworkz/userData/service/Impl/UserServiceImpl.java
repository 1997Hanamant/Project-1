package com.xworkz.userData.service.Impl;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.userData.dao.UserDAO;
import com.xworkz.userData.dto.UserDTO;
import com.xworkz.userData.service.UserServivce;

@Service
public class UserServiceImpl implements UserServivce {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Boolean validateAndSave(UserDTO userDTO) {
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator validate = validator.getValidator();
		Set<ConstraintViolation<UserDTO>> set = validate.validate(userDTO);
		if(set.size()>0) {
			System.out.println("Details Entered Are Invalid");
			return false;
		}
		else {
			System.out.println("Details Entered Are Valid");
			Boolean save = userDAO.save(userDTO);
			System.out.println(save);
			return true;
		}
	}

}
