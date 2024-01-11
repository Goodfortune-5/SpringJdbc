package com.jsp.SpringJdbc.CrudOperations;
 
import java.util.List;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
 
import com.jsp.SpringJdbc.Dao.StudentDao;
import com.jsp.SpringJdbc.Dao.StudentDaoImpl;
import com.jsp.SpringJdbc.Entity.Student;
 
public class App 
{
    public static void main( String[] args )
    {
    	   System.out.println( "Application Excecution  started!" );
//           ApplicationContext con= new ClassPathXmlApplicationContext("com/jsp/SpringJdbc/CrudOperations/JdbcConfig.xml");
    	   ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
//           JdbcTemplate a= con.getBean("jdbcTemplate", JdbcTemplate.class);
//           StudentDao s= con.getBean("student1",StudentDaoImpl.class);
           StudentDao s= con.getBean("StudentDao",StudentDaoImpl.class);
//           Student b = new Student();
//           b.setUSN("1rn15me419");
//           b.setName("RaghuramBv");
//           b.setCity("Kengeri KsTown");
//             int result=s.insert(b);
           //System.out.println("Record Inserted..!!!"+result);
//           Student c = con.getBean("s",Student.class);
//           s.insert(c);
           List<Student> stud=s.getStudent();
           for(Student a:stud)
           {
        	   System.out.println(a);
           }

//           String query = "insert into jdbcspring.student values(?,?,?)";
//           int b= a.update(query,"1ah14ec031","Varsha","Bangalore");
//           System.out.println("Record Inserted"+b);
           System.out.println( "Project Executed Ended!" );
    }
}