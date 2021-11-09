package com.hrsmp.HumanRsmProjects.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.util.StringUtils;

public class SecurityUtils {
	
	public static final String ROLE_PREFIX = "ROLE_";
	public static final String AUTH_HEADER = "authorization";
	public static final String AUTH_TOKEN_TYPE = "Bearer";
	public static final String AUTH_TOKEN_PREFIX = AUTH_TOKEN_TYPE +  " ";
	
	public static SimpleGrantedAuthority convertAuthority(String role) {
		
		String formattedRole = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX + role;
		
		return new SimpleGrantedAuthority(formattedRole);
	}
	
	public static String extractAuthTokenFromRequest(HttpServletRequest request) {
		
		String bearerToken = request.getHeader(AUTH_HEADER);
		
		if(!StringUtils.hasLength(bearerToken) && bearerToken.startsWith(AUTH_TOKEN_PREFIX)) {
			
			return bearerToken.substring(7);
		}
		
		return null;
	}

}
