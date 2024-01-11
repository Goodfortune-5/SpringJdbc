package com.jsp.SpringJdbc.Dao;
 
import java.util.List;
 
import org.springframework.jdbc.core.JdbcTemplate;
 
import com.jsp.SpringJdbc.Entity.Student;
 
public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student)
			{
		String inquery="insert into jdbcspring.Student values(?,?,?)";
		int result =jdbcTemplate.update(inquery,student.getUSN(),student.getName(),student.getCity());
		System.out.println("Record Inserted...!!!!!" +result);
		return result;


	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
//	public Student getStudent(String USN) {
//		String sql="select * from jdbcspring.Student where USN=?";
//		RowMapperImpl r = new RowMapperImpl();
//		
//		Student student=this.jdbcTemplate.queryForObject(sql, r, USN);
//		return student;
//	}
	public List<Student> getStudent(){
		String sql="select * from jdbcspring.Student";
		List<Student> s=(List<Student>) this.jdbcTemplate.query(sql,  new RowMapperImpl());
		return (List) s;
	}
	}