package com.employe.em.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 import com.employe.em.project.*;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

} 