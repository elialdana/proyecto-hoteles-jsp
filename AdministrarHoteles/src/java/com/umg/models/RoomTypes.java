package com.umg.models;



/**
 * @author Asus TP500L
 * @version 1.0
 * @created 08-oct.-2018 11:18:40 p. m.
 */
public class RoomTypes {

	private String description;
	private int id;
	private String name;

	public RoomTypes(){

	}

        public RoomTypes(String description, int id, String name) {
            this.description = description;
            this.id = id;
            this.name = name;
        }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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


}