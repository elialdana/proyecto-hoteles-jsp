package com.umg.models;



/**
 * @author valdana
 * @version 1.0
 * @created 08-oct.-2018 11:18:37 p. m.
 */
public class Room {

	private long id;
	private int number;
	private int level;
	private String characteristic;
	private double price;
        private RoomTypes roomTypes;

	public Room(){

	}

    public Room(long id, int number, int level, String characteristic, double price, RoomTypes roomTypes) {
        this.id = id;
        this.number = number;
        this.level = level;
        this.characteristic = characteristic;
        this.price = price;
        this.roomTypes = roomTypes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RoomTypes getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(RoomTypes roomTypes) {
        this.roomTypes = roomTypes;
    }
        
 


}