package org.generation.italy.demo.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.generation.italy.demo.pojo.Role;
import org.generation.italy.demo.pojo.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class DatabaseUserDetails implements UserDetails{
	
	private static final long serialVersionUID = -763145497702040355L;
	
	private final User user;
	
	//costruttore => utente esterno
	public DatabaseUserDetails(User user) {
		
		this.user = user;
	}
	
	
	@Override
	
	//Set<GrantedAuthority>Set<GrantedAuthority> che mappa le Role
	//getUsername
	//getPassword
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Set<Role> roles = user.getRoles();
		Set<GrantedAuthority> grantRole = new HashSet<>();
		
		for(Role role : roles)
			grantRole.add(new SimpleGrantedAuthority(role.getName()));
		
		return grantRole;
		

	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
