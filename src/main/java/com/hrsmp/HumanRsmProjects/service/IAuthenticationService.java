package com.hrsmp.HumanRsmProjects.service;

import com.hrsmp.HumanRsmProjects.model.User;

public interface IAuthenticationService {

	User signInAndReturnJWT(User signInRequest);

}
