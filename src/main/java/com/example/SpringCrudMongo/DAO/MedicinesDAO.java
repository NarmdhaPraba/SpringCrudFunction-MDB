package com.example.SpringCrudMongo.DAO;
import java.util.Collection;
import java.util.Optional;

import com.example.SpringCrudMongo.Entity.Medicines;
import com.example.SpringCrudMongo.Entity.MedicinesUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicinesDAO {
    @Autowired
    private MedicinesRepository repository;

    public Collection<Medicines> getMedicines() {
        return repository.findAll();
    }

    public Medicines createMedicines(Medicines Medicines) {
        return repository.insert(Medicines);
    }

    public Optional<Medicines> getMedicinesById(int id) {
        return repository.findById(id);
    }

    public Optional<Medicines> deleteMedicinesById(int id) {
        Optional<Medicines> Medicines = repository.findById(id);
        Medicines.ifPresent(b -> repository.delete(b));
        return Medicines;
   }

    public Optional<Medicines> updateMedicinesById(int id, MedicinesUpdatePayload MedicinesUpdatePayload) {
        Optional<Medicines> Medicines = repository.findById(id);
        Medicines.ifPresent(b -> b.setMedicalName(MedicinesUpdatePayload.getMedicalName()));
        Medicines.ifPresent(b -> b.setDescription(MedicinesUpdatePayload.Description()));
        Medicines.ifPresent(b -> b.setPrice(MedicinesUpdatePayload.Price()));
        Medicines.ifPresent(b -> b.setManufactureDate(MedicinesUpdatePayload.ManufactureDate()));
        Medicines.ifPresent(b -> repository.save(b));
        return Medicines;
    }
}
