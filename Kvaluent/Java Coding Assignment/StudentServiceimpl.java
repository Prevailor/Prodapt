package SERVICE;

import java.util.List;

import DAO.StudentDAO;
import DAO.StudentDAOimpl;
import Exception.DataNotPresentException;
import Exception.StudentNotFoundException;
import MODEL.Student;

public class StudentServiceimpl implements StudentService {

	@Override
	public String addStudent(Student student) throws DataNotPresentException{
		//Create an object of DAO Impl class
		StudentDAO studentDAO = new StudentDAOimpl();
		//Using above object call the addStudent 
		//and pass the student reference variable
		//addStudent method on successful addition returns message
		String message = studentDAO.addStudent(student);
		//return the message to the caller
		return message;
	}

	@Override
	public List<Student> getAllStudents() {
		StudentDAO studentDAO = new StudentDAOimpl();
		List<Student> student =studentDAO.getAllStudents();
		return student;
	}

	@Override
	public List<Student> getStudentByCity(String city) throws StudentNotFoundException {
		StudentDAO studentDAO = new StudentDAOimpl();
		return studentDAO.getStudentByCity(city);
	}

	@Override
	public Student getStudentById(Integer id) throws StudentNotFoundException {
		StudentDAO studentDAO = new StudentDAOimpl();
		return studentDAO.getStudentById(id);
	}
}