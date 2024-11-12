package com.example.SpringCrudMongo.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Medicines")

public class Medicines {
	@Id
    private Integer id;
    private String MedicalName;
    private String Description;
    private String Price;
    private String ManufactureDate;

    public Integer getId() {
        return id;
    }

    public String getMedicalName() {
        return MedicalName;
    }

    public void setMedicalName(String MedicalName) {
        this.MedicalName = MedicalName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
    public String getManufactureDate() {
        return ManufactureDate;
    }

    public void setManufactureDate(String ManufactureDate) {
        this.ManufactureDate = ManufactureDate;
    }
        

}
