package com.boa.kycprocess.services;

  import java.util.List;
  
  import javax.transaction.Transactional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.boa.kycprocess.models.UserRole; import
  com.boa.kycprocess.repositories.UserRoleRepository;
  
  
  @Service
  
  public class UserRoleService {
  
  @Autowired private UserRoleRepository userRoleRepository;
  
  public List<UserRole> getUserRoleByName(String userName) { return
  userRoleRepository.getUserRolesByName(userName); }
  
  
  
  }
 