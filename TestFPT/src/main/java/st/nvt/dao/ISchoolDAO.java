package st.nvt.dao;

import java.util.List;

import st.nvt.model.SchoolModel;

public interface ISchoolDAO extends IGenericDAO<SchoolModel>{
	List<SchoolModel> findAll();
	Boolean Insert(SchoolModel schoolModel);

}
