package st.nvt.dao;

import st.nvt.model.GraduateModel;

public interface IGranduateDAO extends IGenericDAO<GraduateModel>{
	Boolean Insert(GraduateModel graduateModel);
}
