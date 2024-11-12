package com.example.SpringCrudMongo.Entity;

public class MedicinesUpdatePayload {
	
	private String MedicalName;

    public String getMedicalName() {
        return MedicalName;
    }

    public String Description() {
        return Description;
    }

    private String Description;
    
    public String Price() {
    	return Price;
    }
    
    private String Price;
    
    public String ManufactureDate() {
    	return ManufactureDate;
    }
    
    private String ManufactureDate;

}
