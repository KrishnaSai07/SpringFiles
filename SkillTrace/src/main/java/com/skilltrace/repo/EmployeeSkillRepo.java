package com.skilltrace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilltrace.model.EmployeeSkill;

@Repository
public interface EmployeeSkillRepo extends JpaRepository<EmployeeSkill, Long> {

}
