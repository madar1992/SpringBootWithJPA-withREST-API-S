package com.bitlabs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.demo.modal.Subject;
import com.bitlabs.demo.repository.StudentRepository;

@Service
public class SubjectService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public void saveSubject(Subject subject) {
		this.studentRepo.save(subject);
	}
	public List<Subject> getAll(){
		List<Subject> list=studentRepo.findAll();
		return list;
		
	}
	public void updateSubject(int id,Subject subject) {
		this.studentRepo.save(subject);
	}
	public void deletSubject(int id) {
		this.studentRepo.deleteById(id);
	}
	public Subject getSubjectById(int id) {
	 Subject subject=studentRepo.getById(id);
		return subject;
	}

}
