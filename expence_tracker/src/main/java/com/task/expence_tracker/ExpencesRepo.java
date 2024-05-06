package com.task.expence_tracker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpencesRepo extends JpaRepository<Expences, String> {
    
}
