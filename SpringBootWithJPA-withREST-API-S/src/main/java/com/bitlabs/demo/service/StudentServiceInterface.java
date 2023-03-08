package com.bitlabs.demo.service;

import java.util.List;

import com.bitlabs.demo.modal.Subject;

public interface StudentServiceInterface {

	public void SaveSubject(Subject subject);
	public List<Subject> getAll();
	public void updateSubject(int id,Subject subject);
	public void deletSubject(int id);
	public Subject getSubjectById(int id);
}
