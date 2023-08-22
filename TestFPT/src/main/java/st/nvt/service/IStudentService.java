package st.nvt.service;

import java.util.List;

import st.nvt.model.StudentModel;

public interface IStudentService {
	Boolean insert(StudentModel student);
	List<StudentModel> search(String searchContent);
	List<StudentModel> searchJobStudent(String searchContent);
}
