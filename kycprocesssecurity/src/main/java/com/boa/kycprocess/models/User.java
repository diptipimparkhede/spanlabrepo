package com.boa.kycprocess.models;


  import java.util.List;
  
  import javax.persistence.CascadeType; import javax.persistence.Column; import
  javax.persistence.Entity; import javax.persistence.FetchType; import
  javax.persistence.Id; import javax.persistence.OneToMany; import
  javax.persistence.Table;
  
  import org.springframework.security.core.GrantedAuthority;
 

  @Entity  
  @Table(name = "Users") 
  public class User {
  @Id
  @Column( name = "USERNAME") 
  private String userName;
  
  @Column( name = "PASSWORD") 
  private String password;
  
  @Column( name = "ENABLED") 
  private boolean enabled;
  
  @OneToMany(cascade = CascadeType.ALL, mappedBy =
  "user",fetch=FetchType.EAGER) 
  private List<UserRole> userRole;
  
  
  
  public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
public List<UserRole> getUserRole() { return userRole; } public void
  setUserRole(List<UserRole> userRole) { this.userRole = userRole; } public
  String getUserName() { return userName; } public void setUserName(String
  userName) { this.userName = userName; } public String getPassword() { return
  password; } public void setPassword(String password) { this.password =
  password; } 
  
  
  
  
  }
 