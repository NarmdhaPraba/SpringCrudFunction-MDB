package com.example.SpringCrudMongo.Controller;
import java.util.Collection;
import java.util.Optional;

import com.example.SpringCrudMongo.Entity.Medicines;
import com.example.SpringCrudMongo.Entity.MedicinesUpdatePayload;
import com.example.SpringCrudMongo.Service.MedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Medicines")
public class MedicinesController {
	@Autowired
    private MedicinesService MedicinesService;

    @GetMapping
    public Collection<Medicines> getMedicines() {
        return MedicinesService.getMedicines();
    }


    @PostMapping
    public Medicines postMedicines(@RequestBody Medicines Medicines) {
        return MedicinesService.createMedicines(Medicines);
    }

    @GetMapping(value="/{id}")
    public Optional<Medicines> getMedicinesById(@PathVariable("id") int id) {
        return MedicinesService.getMedicinesById(id);
    }


    @DeleteMapping(value="/{id}")
    public Optional<Medicines> deleteMedicinesById(@PathVariable("id") int id) {
        return MedicinesService.deleteMedicinesById(id);
    }

    @PutMapping(value="/{id}")
    public Optional<Medicines> deleteMedicinesById(@PathVariable("id") int id, @RequestBody MedicinesUpdatePayload
    		MedicinesUpdatePayload) {
        return MedicinesService.updateMedicinesById(id, MedicinesUpdatePayload);
    }


}
