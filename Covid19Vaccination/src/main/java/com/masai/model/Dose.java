package com.masai.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Dose {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vaccineStatusId;
	
	private boolean dose1;
	private boolean dose2;
	private LocalDate dose1Date;
	private LocalDate dose2Date;
	
	
	public Dose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dose(int vaccineStatusId, boolean dose1, boolean dose2, LocalDate dose1Date, LocalDate dose2Date) {
		super();
		this.vaccineStatusId = vaccineStatusId;
		this.dose1 = dose1;
		this.dose2 = dose2;
		this.dose1Date = dose1Date;
		this.dose2Date = dose2Date;
	}
	public int getVaccineStatusId() {
		return vaccineStatusId;
	}
	public void setVaccineStatusId(int vaccineStatusId) {
		this.vaccineStatusId = vaccineStatusId;
	}
	public boolean isDose1() {
		return dose1;
	}
	public void setDose1(boolean dose1) {
		this.dose1 = dose1;
	}
	public boolean isDose2() {
		return dose2;
	}
	public void setDose2(boolean dose2) {
		this.dose2 = dose2;
	}
	public LocalDate getDose1Date() {
		return dose1Date;
	}
	public void setDose1Date(LocalDate dose1Date) {
		this.dose1Date = dose1Date;
	}
	public LocalDate getDose2Date() {
		return dose2Date;
	}
	public void setDose2Date(LocalDate dose2Date) {
		this.dose2Date = dose2Date;
	}
	
	
}