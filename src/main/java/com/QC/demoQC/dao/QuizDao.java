package com.QC.demoQC.dao;

import com.QC.demoQC.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}

