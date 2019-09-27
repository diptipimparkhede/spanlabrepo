package com.boa.kycprocess.repositories;

  import java.util.List;
  
  import org.springframework.data.jpa.repository.JpaRepository; 
  import   org.springframework.data.jpa.repository.Query; 
  import   org.springframework.data.repository.query.Param; 
  import   org.springframework.transaction.annotation.Transactional;
  
  import com.boa.kycprocess.models.UserRole;
  
  @Transactional 
  public interface UserRoleRepository extends JpaRepository<UserRole,String>{ 
	  //custom jpa method
  
  @Query("SELECT ur FROM UserRole ur WHERE ur.user.userName = :name")
  List<UserRole> getUserRolesByName(@Param("name") String name);
  
  }
 