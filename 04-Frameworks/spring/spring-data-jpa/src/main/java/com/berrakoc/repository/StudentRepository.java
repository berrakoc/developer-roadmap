package com.berrakoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berrakoc.entities.Student;

@Repository  
public interface StudentRepository extends JpaRepository<Student, Integer>{ 
	//geri döndüreceği veri Student ve id'nin tipi integer

}
