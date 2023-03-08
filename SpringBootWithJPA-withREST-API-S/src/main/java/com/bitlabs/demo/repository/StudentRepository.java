package com.bitlabs.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.demo.modal.Subject;

@Repository
public interface StudentRepository extends JpaRepository<Subject,Integer>{

	
}
