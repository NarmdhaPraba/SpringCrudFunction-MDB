package com.example.SpringCrudMongo.Service;
import com.example.SpringCrudMongo.DAO.MedicinesDAO;
import com.example.SpringCrudMongo.Entity.Medicines;
import com.example.SpringCrudMongo.Entity.MedicinesUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@Service

public class MedicinesService {
	@Autowired
    private MedicinesDAO MedicinesDAO;

    public Collection<Medicines> getMedicines() {
        return MedicinesDAO.getMedicines();
    }

    public Medicines createMedicines(Medicines Medicines) {
        return MedicinesDAO.createMedicines(Medicines);
    }

    public Optional<Medicines> getMedicinesById(int id) {
        return MedicinesDAO.getMedicinesById(id);
    }

    public Optional<Medicines> deleteMedicinesById(int id) {
        return MedicinesDAO.deleteMedicinesById(id);
    }

    public Optional<Medicines> updateMedicinesById(int id, MedicinesUpdatePayload MedicinesUpdatePayload) {
        return MedicinesDAO.updateMedicinesById(id, MedicinesUpdatePayload);
    }

}
