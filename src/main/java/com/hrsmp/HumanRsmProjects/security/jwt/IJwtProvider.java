package com.hrsmp.HumanRsmProjects.security.jwt;

import com.hrsmp.HumanRsmProjects.security.UserPrincipal;
import org.springframework.security.core.Authentication;
import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {

	  String generateToken(UserPrincipal auth);
	  Authentication getAuthentication(HttpServletRequest request);
	  boolean validateToken(HttpServletRequest request);
}
