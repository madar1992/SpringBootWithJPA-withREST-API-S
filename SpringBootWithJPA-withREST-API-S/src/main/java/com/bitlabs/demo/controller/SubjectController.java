package com.bitlabs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.demo.modal.Subject;
import com.bitlabs.demo.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addSubjest(@RequestBody Subject subject) {
		this.subjectService.saveSubject(subject);
		return "New user is added";
	}
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Subject> getAllSubjects(){
		List<Subject> list=this.subjectService.getAll();
		return list;
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public String update(@PathVariable("id") int id,@RequestBody Subject subject){
		this.subjectService.updateSubject(id, subject);
		return "User is updated";
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id){
		this.subjectService.deletSubject(id);
		return "User is deleted";
	}
	
	@RequestMapping(value="/getById/{id}", method=RequestMethod.GET)
	public Subject getSubjectById(@PathVariable("id") int id){
		Subject subject=subjectService.getSubjectById(id);
		return subject;
	}
	
	
}