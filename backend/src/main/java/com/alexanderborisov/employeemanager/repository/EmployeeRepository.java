package com.alexanderborisov.employeemanager.repository;

import com.alexanderborisov.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Long is the type of our primary key of our Employee class.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Automatic delete method of an Employee class.
    void deleteEmployeeById(Long id);

    // Optional instead of Employee, in case if wrong id passed in.
    Optional<Employee> findEmployeeById(Long id);
}
