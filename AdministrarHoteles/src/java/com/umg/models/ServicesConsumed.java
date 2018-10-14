package com.umg.models;


import java.util.Date;



/**
 * @author valdana
 * @version 1.0
 * @created 08-oct.-2018 11:18:45 p. m.
 */
public class ServicesConsumed {

	private RoomService service;
	private CodeQR codeQR;
	private Date serviceDate;
	private User userRegistered;

        public ServicesConsumed(){

	}

        public ServicesConsumed(RoomService service, CodeQR codeQR, Date serviceDate, User userRegistered) {
            this.service = service;
            this.codeQR = codeQR;
            this.serviceDate = serviceDate;
            this.userRegistered = userRegistered;
        }

    public RoomService getService() {
        return service;
    }

    public void setService(RoomService service) {
        this.service = service;
    }

    public CodeQR getCodeQR() {
        return codeQR;
    }

    public void setCodeQR(CodeQR codeQR) {
        this.codeQR = codeQR;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public User getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(User userRegistered) {
        this.userRegistered = userRegistered;
    }
        
        



}