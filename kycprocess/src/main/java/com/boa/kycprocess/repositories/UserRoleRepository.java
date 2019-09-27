package com.boa.kycprocess.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boa.kycprocess.models.UserRole;
@Transactional
public interface UserRoleRepository extends JpaRepository<UserRole,String>{//custom jpa
	
	@Query("SELET ur from UserRole ur WHERE ur.user.userName= :name")
	List<UserRole> getuserRolesByName(@Param("name") String name);

}
