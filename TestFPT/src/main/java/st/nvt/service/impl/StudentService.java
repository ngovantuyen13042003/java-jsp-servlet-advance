package st.nvt.service.impl;

import java.util.List;

import st.nvt.dao.IStudentDAO;
import st.nvt.dao.impl.StudentDAO;
import st.nvt.model.StudentModel;
import st.nvt.service.IStudentService;

public class StudentService implements IStudentService{
	IStudentDAO studentDAO = new StudentDAO();
	@Override
	public Boolean insert(StudentModel student) {
		return studentDAO.insert(student);
	}
	@Override
	public List<StudentModel> search(String searchContent) {
		return studentDAO.search(searchContent);
	}
	@Override
	public List<StudentModel> searchJobStudent(String searchContent) {
		return studentDAO.searchJobStudentAfterGraduate(searchContent);
	}

}
