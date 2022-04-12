package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Profile;
@Entity

public class SeatDetails {
	@Id
	private int Seatnumber;
	private int Seatcost;
	private String Seattype;
	
    public SeatDetails() {
		
	}

	public int getSeatnumber() {
		return Seatnumber;
	}

	public void setSeatnumber(int Seatnumber) {
		this.Seatnumber = Seatnumber;
	}

	public int getSeatcost() {
		return Seatcost;
	}

	public void setSeatcost(int Seatcost) {
		this.Seatcost = Seatcost;
	}

	public String getSeattype() {
		return Seattype;
	}

	public void setSeattype(String Seattype) {
		this.Seattype = Seattype;
	}

	
}
