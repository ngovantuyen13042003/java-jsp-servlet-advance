package st.nvt.service;

import java.util.List;

import st.nvt.model.SchoolModel;

public interface ISchoolService {
	List<SchoolModel> findAll();
	Boolean insert(SchoolModel schoolModel);
}
