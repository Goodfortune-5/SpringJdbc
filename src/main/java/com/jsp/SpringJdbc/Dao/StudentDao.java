package com.jsp.SpringJdbc.Dao;
 
import java.util.List;
 
import com.jsp.SpringJdbc.Entity.Student;
 
public interface StudentDao {
 
//	public int insert(Student student);
	//Specific student detail
	public List<Student> getStudent();
}