package com.vroomcar.vroomcar.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "RIDE")
public class Ride {

	@Id
	@GeneratedValue
	@Column(name = "rideid", unique = true, nullable = false)
	private Long rideid;

	

	public Ride() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ride(Long rideid, Double pricePerTraveller, Integer riderAge, String riderName, String carType,
			Integer seats, String source, String destination, String desc, String departureDateString,
			Boolean homepickup, String insuranceStatus, Integer userId, String imageUrl, Date departureDate,
			Long distanceTravelled) {
		super();
		this.rideid = rideid;
		this.pricePerTraveller = pricePerTraveller;
		this.riderAge = riderAge;
		this.riderName = riderName;
		this.carType = carType;
		this.seats = seats;
		this.source = source;
		this.destination = destination;
		this.desc = desc;
		this.departureDateString = departureDateString;
		this.homepickup = homepickup;
		this.insuranceStatus = insuranceStatus;
		this.userId = userId;
		this.imageUrl = imageUrl;
		this.departureDate = departureDate;
		this.distanceTravelled = distanceTravelled;
	}

	public Ride(Long rideid, String riderName) {
		super();
		this.rideid = rideid;
		this.riderName = riderName;
	}

	public Ride(int i, int j, String string, String string2, int k, String string3, String string4, int l,
			String string5, String string6, int m, String string7, int n, String string8) {
		// TODO Auto-generated constructor stub
	}

	public void setRideid(Long rideid) {
		this.rideid = rideid;
	}


	@Column(name = "pricePerTraveller", unique = false, length = 100)
	private Double pricePerTraveller;

	@Column(name = "riderAge",length = 100)
	private Integer riderAge;


	@Column(name = "riderName", unique = false, length = 100)
	private String riderName;


	@Column(name = "carType", unique = false, length = 100)
	private String carType;

	@Column(name = "seats", unique = false, length = 100)
	private Integer seats;

	@Column(name = "source", unique = false, length = 100)
	private String source;

	@Column(name = "destination", unique = false, length = 100)
	private String destination;
	
	@Column(name = "description", unique = false, length = 400)
	private String desc;

	@Column
	private String departureDateString;
	
	@Column(name = "homepickup", unique = false, length = 100)
	private Boolean homepickup;
	
	@Column(name = "insuranceStatus", unique = false, length = 100)
	private String insuranceStatus;

	@Column
	private Integer userId;
	
	@Column
	private String imageUrl;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date departureDate;
	
	@Column(name = "distanceTravelled", unique = false, length = 50)
	private Long distanceTravelled;
	
	
	public Long getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(Long distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	public String getInsuranceStatus() {
		return insuranceStatus;
	}

	public void setInsuranceStatus(String insuranceStatus) {
		this.insuranceStatus = insuranceStatus;
	}

	public Boolean getHomepickup() {
		return homepickup;
	}

	public void setHomepickup(Boolean homepickup) {
		this.homepickup = homepickup;
	}

	public String getDepartureDateString() {
		return departureDateString;
	}

	public void setDepartureDateString(String departureDateString) {
		this.departureDateString = departureDateString;
	}


	
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	

	public Date getDepartureDate() {
		return departureDate;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String ImageUrl) {
		imageUrl = ImageUrl;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer UserId) {
		userId = UserId;
	}

	public Integer getRiderAge() {
		return riderAge;
	}

	public void setRiderAge(Integer riderAge) {
		this.riderAge = riderAge;
	}
	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDesc() {
		return desc;
	}

	public void setDesc(String description) {
		this.desc = description;
	}

	public Long getRideid() {
		return rideid;
	}

	public String getRiderName() {
		return riderName;
	}

	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seat) {
		seats = seat;
	}


	public Double getPricePerTraveller() {
		return pricePerTraveller;
	}

	public void setPricePerTraveller(Double pricePerTraveller) {
		this.pricePerTraveller = pricePerTraveller;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((riderName == null) ? 0 : riderName.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ride other = (Ride) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (riderName == null) {
			if (other.riderName != null)
				return false;
		} else if (!riderName.equals(other.riderName))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ride [rideid=" + rideid + 
				 " pricePerTraveller=" + pricePerTraveller + ", riderAge="
				+ riderAge + ", riderName=" + riderName + ", carType=" + carType + ", Seats=" + seats
				+ ", source=" + source + ", Desc=" + desc + ", Destination="
				+ destination + ", DepartureDate=" + departureDate + "]";
	}
	
}

