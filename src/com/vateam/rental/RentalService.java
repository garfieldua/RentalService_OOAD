package com.vateam.rental;

import java.util.Date;

import com.vateam.rental.Preferences.Preference;

public class RentalService {

	//TODO:
	// + What to do with PersonInfo (Customer, Driver, Manager)
	// + Driver - Customer relation
	// + Where to put info about seat number?
	// Rental type problem
	// Insurance
	// + Need to create department with cars and managers in it
	// Extras (gas, extra insurance)
	// Currency?
	
	
	// if we go to moscow from kiev, then, when we arrive, the car MUST be available 
	// at moscow's department. 
	
	public static void main(String[] args) {
		Preferences pref = new Preferences();
		pref.addPreference(Preference.AIR_CONDITIONER, true);
		pref.addPreference(Preference.GEAR_TYPE, "automatic");
		pref.addPreference(Preference.SEAT_NUMBER, 4);
		
		Location pickLocation = new Location();
		pickLocation.setCountryName("Ukraine");
		pickLocation.setCountryCode("UA");
		pickLocation.setCityName("Kiev");
		
		Department depart = new Department();
		depart.setId(15);
		
		BookingResponder br = new BookingResponder();
		boolean b = br.isVehicleAvailable(depart, pref);
		
		System.out.println(b);
		
		//System.out.println(pref);
		
		/*
		// Creating car
		Vehicle car = new Car();
		car.setManufacturer("KIA Motors");
		car.setModel("Soul");
		car.setColor("Grey");
		car.setEngineVolume(1600);
		car.setFuelConsumption(8.0);
		car.setOdometer(12500);
		car.setPricePerDay(30);
		car.setGearBoxType("Automatic");
		car.setSeatNumber(5);
		car.setYearOfManufacture(2012);
		
		// Creating manager
		PersonInfo managerInfo = new PersonInfo();
		managerInfo.setFirstName("Anton");
		managerInfo.setPhoneNumber1("0111111111");
		
		Manager manager = new Manager();
		manager.setMaganerInfo(managerInfo);
		
		// Creating customer
		PersonInfo customerInfo = new PersonInfo();
		customerInfo.setFirstName("Vladimir");
		customerInfo.setPhoneNumber1("0222222222");
		
		Location customerLocation = new Location();
		customerLocation.setCountryName("Ukraine");
		customerLocation.setCountryCode("UA");
		customerLocation.setCityName("Kiev");
		customerLocation.setStreetName("Svobody Ave");
		customerLocation.setHouseName("2A");
		customerLocation.setApartmentName("67");
		
		Customer customer = new Customer();
		customer.setCustomerInfo(customerInfo);
		
		// Creating date range for booking
		DateRange dateRange = new DateRange();
		dateRange.setStarts(new Date(2014,11,06));
		dateRange.setEnds(new Date(2014,11,11));
		
		// Creating booking
		Booking booking = new Booking();
		booking.setBookedVehicle(car);
		booking.setBookingCustomer(customer);
		booking.setBookingManager(manager);
		booking.setBookingRange(dateRange);
		booking.setId(1234);
		booking.setRegDate(new Date());
		
		System.out.println("Super mega rental service");
		*/
	}

}
