package com.umg.models;


import java.util.Date;



/**
 * @author valdana
 * @version 1.0
 * @created 08-oct.-2018 11:18:32 p. m.
 */
public class Payment {

	private int id;
	private double amount;
	private Date registerDate;
	private CodeQR codeQR;

    public Payment() {
    }

    public Payment(int id, double amount, Date registerDate, CodeQR codeQR) {
        this.id = id;
        this.amount = amount;
        this.registerDate = registerDate;
        this.codeQR = codeQR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public CodeQR getCodeQR() {
        return codeQR;
    }

    public void setCodeQR(CodeQR codeQR) {
        this.codeQR = codeQR;
    }

	
        
        

}