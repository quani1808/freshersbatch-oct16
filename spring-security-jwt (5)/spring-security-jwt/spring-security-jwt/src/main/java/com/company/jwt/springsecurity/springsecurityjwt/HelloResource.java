package com.company.jwt.springsecurity.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.company.jwt.springsecurity.springsecurityjwt.jwtutil.JwtUtil;
import com.company.jwt.springsecurity.springsecurityjwt.jwtutil.User1;
import com.company.jwt.springsecurity.springsecurityjwt.models.AuthenticationRequest;
import com.company.jwt.springsecurity.springsecurityjwt.models.AuthenticationResponse;
import com.company.jwt.springsecurity.springsecurityjwt.service.MyUserDetailsService;
import com.company.jwt.springsecurity.springsecurityjwt.service.UserRepo;

@RestController
public class HelloResource {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private MyUserDetailsService userDetailsService;
	@Autowired
	private JwtUtil jwtTokenUtil;
	@Autowired
	private UserRepo repo;
	@RequestMapping("/hello")
	public String hello()
	{
		return "HelloWorld";
	}
	@PostMapping("/reg")
	private ResponseEntity<?> subscribe(@RequestBody AuthenticationRequest request)
	{
        System.out.println("sreeja");
		String username = request.getUsername();
		String password = request.getPassword();

		User1 model = new User1();
		model.setUsername(username);
		model.setPassword(password);

		try {
			repo.save(model);
		} catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error while subsribing the user with username " + username));
		}
		    return ResponseEntity.ok(new AuthenticationResponse("client subscribed with username " + username));
	}
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		try
		{
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
	}
		catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}


		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}


}
