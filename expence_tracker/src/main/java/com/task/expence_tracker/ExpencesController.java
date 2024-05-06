package com.task.expence_tracker;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Expences")
public class ExpencesController {

    ExpencesService service;

    public ExpencesController(ExpencesService service) {
        this.service = service;
    }

    @GetMapping("{expName}")
    public String getExpense(@PathVariable("expName") String expName) {
        return service.getExpense(expName);
    }

    @GetMapping
    public List<Expences> getAllExpences() {
        return service.getAllExpences();
    }

    @PostMapping
    public String createExpense(@RequestBody Expences expence) {
        service.crerateExpense(expence);
        return "Created Successfully";
    }

    @PutMapping
    public String updateExpense(@RequestBody Expences expence) {
        service.updateExpense(expence);
        return "Updated Successfully";
    }

    @DeleteMapping("{expName}")
    public String deleteExpense(@PathVariable("expName") String expName) {
        service.deleteExpense(expName);
        return "Deleted Successfully";
    }
}
