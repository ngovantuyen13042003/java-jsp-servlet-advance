package st.nvt.service.impl;

import st.nvt.dao.IGranduateDAO;
import st.nvt.dao.impl.GraduateDAO;
import st.nvt.model.GraduateModel;
import st.nvt.service.IGradauteService;

public class GraduateService implements IGradauteService{
	IGranduateDAO graduateDAO = new GraduateDAO();
	@Override
	public Boolean insert(GraduateModel graduate) {
		return graduateDAO.Insert(graduate);
	}

}
