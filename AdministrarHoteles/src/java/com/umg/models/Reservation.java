package com.umg.models;


import java.util.Date;



/**
 * @author valdana
 * @version 1.0
 * @created 08-oct.-2018 11:18:34 p. m.
 */
public class Reservation {

	private int id;
	private String code;
	private Date admissionDate;
	private Date departureDate;
	private int quantityPerson;
	private Room room;
	private String customerName;
	private String customerId;
	private String customerEmail;
	private String customerPhone;
	private double amount;


	public Reservation(){

	}

    public Reservation(int id, String code, Date admissionDate, Date departureDate, int quantityPerson, Room room, String customerName, String customerId, String customerEmail, String customerPhone, double amount) {
        this.id = id;
        this.code = code;
        this.admissionDate = admissionDate;
        this.departureDate = departureDate;
        this.quantityPerson = quantityPerson;
        this.room = room;
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getQuantityPerson() {
        return quantityPerson;
    }

    public void setQuantityPerson(int quantityPerson) {
        this.quantityPerson = quantityPerson;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    
         
    
}