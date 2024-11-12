package com.example.SpringCrudMongo.DAO;
import com.example.SpringCrudMongo.Entity.Medicines;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicinesRepository extends MongoRepository<Medicines, Integer> {

}
