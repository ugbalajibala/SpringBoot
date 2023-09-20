package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.SampleModel;

@Repository
public interface EmployeeRep extends JpaRepository<SampleModel, Long> {

}
