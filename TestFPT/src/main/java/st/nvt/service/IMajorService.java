package st.nvt.service;

import java.util.List;

import st.nvt.model.MajorModel;

public interface IMajorService {
	List<MajorModel> findAll();
	
	MajorModel findOne(String idMajor);
	
}
