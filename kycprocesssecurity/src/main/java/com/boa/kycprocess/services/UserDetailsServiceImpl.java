package com.boa.kycprocess.services;

  import java.util.ArrayList; import java.util.List;
  
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.security.core.GrantedAuthority; import
  org.springframework.security.core.authority.SimpleGrantedAuthority; import
  org.springframework.security.core.userdetails.User.UserBuilder; import
  org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.core.userdetails.UserDetailsService; import
  org.springframework.security.core.userdetails.UsernameNotFoundException;
  import org.springframework.stereotype.Service; import
  org.springframework.transaction.annotation.Transactional;
  
  import com.boa.kycprocess.models.User;
  
  
  
  @Service("userDetailsService") public class UserDetailsServiceImpl implements
  UserDetailsService {
  
  @Autowired private UserService userService;
  
  @Autowired private UserRoleService userRoleService;
  
  @Transactional(readOnly = true)
  
  @Override public UserDetails loadUserByUsername(String username) throws
  UsernameNotFoundException { System.out.println("UserName="+username);
  
  User user=this.userService.getUserByName(username);
  
  System.out.println("Found="+user.getUserName()+","+user.getPassword()+","+
  user.isEnabled()); 
  
  UserBuilder builder = null; if (user != null) {
  
  builder =
  org.springframework.security.core.userdetails.User.withUsername(username);
  
  if(user.isEnabled()) { builder.disabled(false); }
  builder.password(user.getPassword()); String[] authorities =
  this.userRoleService.getUserRoleByName(username) .stream().map(a ->
  a.getRole()).toArray(String[]::new);
  
  System.out.println("Length="+authorities.length);
  builder.authorities(authorities); } else { throw new
  UsernameNotFoundException("User not found."); } return builder.build();
  
  }
  
  }
  
  
  
  
 