package io.javabrains.springsecurityjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	//public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		//return new MyUserDetails(s);
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {	
	java.util.Optional<User> user = userRepository.findByUserName(userName);
	
	user.orElseThrow(()->new UsernameNotFoundException("Not found: " +userName));
	
		return user.map(MyUserDetails::new).get();
	}

}
