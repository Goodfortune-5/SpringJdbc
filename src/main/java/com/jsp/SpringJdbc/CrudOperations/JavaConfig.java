package com.jsp.SpringJdbc.CrudOperations;
 
import javax.sql.DataSource;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
 
import com.jsp.SpringJdbc.Dao.StudentDao;
import com.jsp.SpringJdbc.Dao.StudentDaoImpl;
 
@Configuration
public class JavaConfig {

	@Bean("ds")
	public DataSource getDataSource() 
	{
		DriverManagerDataSource driverManagerDataSource	= new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/jdbcspring");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		return driverManagerDataSource;
	}
 
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate =new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource()); 
		return jdbcTemplate;
	}
	@Bean("StudentDao")
	public StudentDao getStudent()
	{
		StudentDaoImpl st=new StudentDaoImpl();
		st.setJdbcTemplate(getJdbcTemplate());
		return st;
	}
}