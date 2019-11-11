package com.vroomcar.vroomcar.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
@Entity
@Table(name = "USER")
public class User {
    @Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "userId", unique = true, nullable = false)
	private Integer userid;
    
	@Column(name = "rideid", unique = false)
	private Integer rideid;
	
	@Column(name = "firstname", unique = false, length = 30)
	private String firstname;

	@Column(name = "lastname", unique = false, length = 30)
	private String lastname;

	@Column(name = "profession", unique = false, length = 30)
	private String profession;

	@Column(name = "gender", unique = false, length = 10)
	private String gender;

	@Column(name = "carname", unique = false, length = 30)
	private String carName;
	
	@Column(name = "caryears")
	private Integer carYears;

	@Column(name = "ridesOffered")
	private Integer ridesOffered;
	
	@Column(name = "email", unique = true, length = 30)
	private String email;

	@Column(name = "mobileNumber", unique = false, length = 30)
	private Long mobileNumber;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date dateOfBirth;
	

	@Column(name = "dateofbirthString", unique = false, length = 50)
	private String dateofbirthString;

	@Column(name = "address", unique = false, length = 400)
	private String address;

	@Column(name = "postalCode", unique = false, length = 50)
	private String postalCode;	
	
	@Column
	private String imageUrl;
 
	@Column(name = "carNumber", unique = false, length = 50)
	private String carNumber;
	
	
	
	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getDateofbirthString() {
		return dateofbirthString;
	}

	public void setDateofbirthString(String dateofbirthString) {
		this.dateofbirthString = dateofbirthString;
	}
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

    public Integer getRideid() {
		return rideid;
	}

	public void setRideid(Integer rideid) {
		this.rideid = rideid;
	}

	public String getFirstname() {
		System.out.println(firstname);
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Integer getCarYears() {
		return carYears;
	}

	public void setCarYears(Integer carYears) {
		this.carYears = carYears;
	}

	public Integer getRidesOffered() {
		return ridesOffered;
	}

	public void setRidesOffered(Integer ridesOffered) {
		this.ridesOffered = ridesOffered;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", rideid=" + rideid + ", firstname="
				+ firstname + ", lastname=" + lastname + ", profession="
				+ profession + ", gender=" + gender + ", carName=" + carName
				+ ", carYears=" + carYears + ", ridesOffered=" + ridesOffered
				+ ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", postalCode=" + postalCode 
				+ "]";
	}
	

}
