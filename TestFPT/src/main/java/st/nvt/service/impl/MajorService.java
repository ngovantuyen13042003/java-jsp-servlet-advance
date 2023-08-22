package st.nvt.service.impl;

import java.util.List;

import st.nvt.dao.impl.MajorDAO;
import st.nvt.model.MajorModel;
import st.nvt.service.IMajorService;

public class MajorService implements IMajorService{

	MajorDAO majorDAO = new MajorDAO();	
	@Override
	public List<MajorModel> findAll() {
		return majorDAO.getAll();
	}

	@Override
	public MajorModel findOne(String idMajor) {
		return majorDAO.getById(idMajor);
	}

}
