package st.nvt.dao;

import java.util.List;

import st.nvt.model.MajorModel;

public interface IMajorDAO extends IGenericDAO<MajorModel>{
	List<MajorModel> getAll();
	MajorModel getById(String id);
}
