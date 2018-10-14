package com.umg.models;



/**
 * @author valdana
 * @version 1.0
 * @created 08-oct.-2018 11:18:29 p. m.
 */
public class CodeQR {

	private int id;
	private String name;
	private String route;
	private Reservation reservation;
	private boolean status;
	
	public CodeQR(){

	}

    public CodeQR(int id, String name, String route, Reservation reservation, boolean status) {
        this.id = id;
        this.name = name;
        this.route = route;
        this.reservation = reservation;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

	
}