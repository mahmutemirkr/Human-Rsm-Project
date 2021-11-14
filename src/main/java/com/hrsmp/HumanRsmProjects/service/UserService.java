package com.hrsmp.HumanRsmProjects.service;
import com.hrsmp.HumanRsmProjects.model.Role;
import com.hrsmp.HumanRsmProjects.model.User;
import com.hrsmp.HumanRsmProjects.repository.IUserRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;






import lombok.Data;


@Data
@Service
public class UserService implements IUserService {
	
	@Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional //TransactionalRequired when executing an update/delete query.
    public void makeAdmin(String username)
    {
        userRepository.updateUserRole(username, Role.ADMIN);
    }

	@Override
	public Object saveUser(org.springframework.security.core.userdetails.User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
