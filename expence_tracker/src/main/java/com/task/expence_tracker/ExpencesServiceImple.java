package com.task.expence_tracker;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExpencesServiceImple implements ExpencesService{

    ExpencesRepo repo;

    
    public ExpencesServiceImple(ExpencesRepo repo) {
        this.repo = repo;
    }

    @Override
    public String crerateExpense(Expences expense) {
        repo.save(expense);
        return "New Expense Added Successfully";
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'crerateExpense'");
    }

    @Override
    public String updateExpense(Expences expense) {
        repo.save(expense);
        return "Expense Updated Successfully";
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateExpense'");
    }

    @Override
    public String deleteExpense(String expName) {
        repo.deleteById(expName);
        return "Expense Deleted Successfully";
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteExpense'");
    }

    @Override
    public String getExpense(String expName) {
        repo.findById(expName).get();
        return "Success";
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getExpense'");
    }

    @Override
    public List<Expences> getAllExpences() {
        return repo.findAll();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllExpences'");
    }
    
}
