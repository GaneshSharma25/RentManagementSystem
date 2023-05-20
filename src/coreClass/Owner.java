package coreClass;

import java.io.Serializable;
import java.time.LocalDate;

public class Owner implements Serializable{

	private String aadhaarNo;
	private String firstName,lastName,email,address;
	private String mobno;
	private PropertyType propertyType;
	private LocalDate bookingDate;
	private int rent;
	private boolean isAvailable;
	
	public Owner(String aadhaarNo, String firstname, String lastname, String email, String address, String mobno,
			PropertyType propertyType,LocalDate bookingDate, int rent) {
		super();
		this.aadhaarNo = aadhaarNo;
		this.firstName = firstname;
		this.lastName = lastname;
		this.email = email;
		this.address = address;
		this.mobno = mobno;
		this.propertyType = propertyType;
		this.bookingDate = bookingDate;
		this.rent = rent;
		this.isAvailable = true;
	}


	@Override
	public String toString() {
		return "Owner [aadhaarNo=" + aadhaarNo + ", firstname=" + firstName + ", lastname=" + lastName + ", email=" + email
				+ ", address=" + address + ", mobno=" + mobno + ", propertyType=" + propertyType + ", rent=" + rent
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	


	@Override
	public boolean equals(Object obj) {
		return this.aadhaarNo.equals(((Owner)obj).getAadhaarNo());
	}
	
	


	@Override
	public int hashCode() {
		return this.aadhaarNo.hashCode();
	}


	public String getAadhaarNo() {
		return aadhaarNo;
	}


	public void setAdharNo(String adharNo) {
		aadhaarNo = adharNo;
	}


	public String getFirstname() {
		return firstName;
	}


	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}


	public String getLastname() {
		return lastName;
	}


	public void setLastname(String lastname) {
		this.lastName = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobno() {
		return mobno;
	}


	public void setMobno(String mobno) {
		this.mobno = mobno;
	}


	public PropertyType getPropertyType() {
		return propertyType;
	}


	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}


	public int getRent() {
		return rent;
	}


	public void setRent(int rent) {
		this.rent = rent;
	}
	

	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public LocalDate getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
	
	
	
	
	
}
