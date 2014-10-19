package com.vateam.rental;

import java.util.Date;

public class Booking {

	private Integer id;
	private String status;
	private Date regDate;
	private DateRange bookingRange;
	private Vehicle bookedVehicle;
	private Customer bookingCustomer;
	private Department pickUpLocation;
	private Preferences prefs;
	
	//agregation
	private Driver driver = null;
	
	// department -> where we get vehicle
	// department -> where get return vehicle
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public DateRange getBookingRange() {
		return bookingRange;
	}

	public void setBookingRange(DateRange bookingRange) {
		this.bookingRange = bookingRange;
	}

	public Vehicle getBookedVehicle() {
		return bookedVehicle;
	}

	public void setBookedVehicle(Vehicle bookedVehicle) {
		this.bookedVehicle = bookedVehicle;
	}

	public Customer getBookingCustomer() {
		return bookingCustomer;
	}

	public void setBookingCustomer(Customer bookingCustomer) {
		this.bookingCustomer = bookingCustomer;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Department getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(Department pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public Preferences getPrefs() {
		return prefs;
	}

	public void setPrefs(Preferences prefs) {
		this.prefs = prefs;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
