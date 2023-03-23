package tn.ommp.parc.entities;


import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column
	private Long userid ;
	
	@Column(name="first-name")
	private String firstName;
	
	@Column
	private String userName;
	
	@Column(name="upassword")
	private String password;
	
	
	
	

	public User() {
		
	}





	public Long getUserid() {
		return userid;
	}





	public void setUserid(Long userid) {
		this.userid = userid;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public User(String firstName, String userName, String password) {
		super();
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;
	}





	public User(Long userid, String firstName, String userName, String password) {
		super();
		this.userid = userid;
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;
	}


	

}
