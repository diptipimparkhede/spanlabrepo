package com.boa.kycprocess.repositories;

  import org.springframework.data.jpa.repository.JpaRepository; 
  
  import com.boa.kycprocess.models.User;
  
  
  public interface UserRepository extends JpaRepository<User, String>{
  
  }
 