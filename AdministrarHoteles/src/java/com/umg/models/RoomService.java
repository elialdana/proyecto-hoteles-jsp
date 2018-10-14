package com.umg.models;



/**
 * @author valdana
 * @version 1.0
 * @created 08-oct.-2018 11:18:38 p. m.
 */
public class RoomService {

	private int id;
	private String name;
	private String description;
	private double price;

	public RoomService(){

	}

    public RoomService(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
         
        
	

}