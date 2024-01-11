package com.jsp.SpringJdbc.Dao;
 
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;
 
import com.jsp.SpringJdbc.Entity.Student;
 
public class RowMapperImpl implements RowMapper<Student> {
 
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		Student s=new Student();
		s.setUSN(rs.getString(1));//Fetching data from database
		s.setName(rs.getString(2));
		s.setCity(rs.getString(3));
		return s;
	}
 
}