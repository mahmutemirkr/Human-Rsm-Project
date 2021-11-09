package com.hrsmp.HumanRsmProjects.security;

import com.hrsmp.HumanRsmProjects.model.User;
import com.hrsmp.HumanRsmProjects.service.IUserService;
import com.hrsmp.HumanRsmProjects.util.SecurityUtils;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private IUserService userService;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userService.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException(username));
		
		Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertAuthority(user.getRole().name()));
		
		
		return UserPrincipal.builder()
				.user(user).id(user.getId())
				.username(username)
				.password(user.getPassword())
				.authorities(authorities)
				.build();
		
	}

}
