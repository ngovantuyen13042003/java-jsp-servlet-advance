package st.nvt.service.impl;

import java.util.List;

import st.nvt.dao.ISchoolDAO;
import st.nvt.dao.impl.SchoolDAO;
import st.nvt.model.SchoolModel;
import st.nvt.service.ISchoolService;

public class SchoolService implements ISchoolService{
	ISchoolDAO school = new SchoolDAO();
	@Override
	public List<SchoolModel> findAll() {
		return school.findAll();
	}
	@Override
	public Boolean insert(SchoolModel schoolModel) {
		return school.Insert(schoolModel);
	}
	
	

}
