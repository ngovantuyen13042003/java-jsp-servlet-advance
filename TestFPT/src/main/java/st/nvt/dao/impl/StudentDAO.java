package st.nvt.dao.impl;

import java.util.List;

import st.nvt.dao.IStudentDAO;
import st.nvt.mapper.StudentMapper;
import st.nvt.mapper.Student_Job_GraduateMapper;
import st.nvt.model.StudentModel;

public class StudentDAO extends AbstractDAO<StudentModel> implements IStudentDAO{

	@Override
	public Boolean insert(StudentModel student) {
		String sql = "insert into student(identitycardnumber,name,email,phonenumber,address) values(?,?,?,?,?)";
		
		return insert(sql,student.getIdentityCardNumber(),student.getName(),student.getEmail(),student.getPhoneNumber(),student.getAddress());
	}

	@Override
	public List<StudentModel> search(String searchContent) {
		String pattern = "%" + searchContent + "%";
		String sql = "Select * from student where name LIKE ? or identitycardnumber = ? or email LIKE ? or phonenumber = ? ";
		return  query(sql,new StudentMapper(),pattern,searchContent,pattern,searchContent);
	}

	@Override
	public List<StudentModel> searchJobStudentAfterGraduate(String searchContent) {
		String pattern = "%" + searchContent + "%";
		String sql = "SELECT * FROM student AS st "
	            + "INNER JOIN graduate AS gr ON st.identitycardnumber = gr.identitycardnumber "
	            + "INNER JOIN job AS j ON st.identitycardnumber = j.identitycardnumber "
	            + "WHERE name LIKE ? OR namecompany LIKE ? OR st.identitycardnumber = ?";

		return query(sql,new Student_Job_GraduateMapper(), pattern,pattern,searchContent);
	}
	
}



















