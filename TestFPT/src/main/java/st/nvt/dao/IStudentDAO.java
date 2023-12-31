package st.nvt.dao;

import java.util.List;

import st.nvt.model.StudentModel;

public interface IStudentDAO extends IGenericDAO<StudentModel>{
	Boolean insert(StudentModel student);
	List<StudentModel> search(String searchContent);
	List<StudentModel> searchJobStudentAfterGraduate(String searchContent);
	
}
