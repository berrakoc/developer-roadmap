package com.berrakoc.services;

import java.util.List;

import com.berrakoc.dto.DtoStudent;
import com.berrakoc.dto.DtoStudentIU;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student); 
	//insert işlemi olduğu için IU olarak kaydedicez ama kullanıcıya dönerken DtoStudent olarak döndür
	
	public List<DtoStudent> getallStudents();
	
	public DtoStudent getStudentById(Integer id);
	 
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU updatedDtoStudentIU);
}

