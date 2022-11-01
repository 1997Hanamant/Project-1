package com.xworkz.userData.service;

import com.xworkz.userData.dto.UserDTO;

public interface UserServivce {

	public Boolean validateAndSave(UserDTO userDTO);
}
