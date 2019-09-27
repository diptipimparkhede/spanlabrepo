package com.boa.kycprocess.services;

  import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.boa.kycprocess.models.User; import
  com.boa.kycprocess.repositories.UserRepository;
  
  
  @Service
  
  public class UserService {
  
  @Autowired private UserRepository userRepository;
  
  public User getUserByName(String userName) {
  
  return userRepository.getOne(userName);
  
  }
  
  
  
  }
 