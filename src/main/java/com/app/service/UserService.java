package com.app.service;

import com.app.dto.UserDto;
import com.app.model.User;

public interface UserService {

	User save(UserDto userDto);
}
