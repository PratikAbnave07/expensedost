package com.task.expence_tracker;

import java.util.List;

public interface ExpencesService {
    public String crerateExpense(Expences expense);
    public String updateExpense(Expences expense);
    public String deleteExpense(String expName);
    public String getExpense(String expName);
    public List<Expences> getAllExpences(); 
}
