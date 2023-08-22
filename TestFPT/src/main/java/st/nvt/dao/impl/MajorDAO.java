package st.nvt.dao.impl;

import java.util.List;

import st.nvt.dao.IMajorDAO;
import st.nvt.mapper.MajorMapper;
import st.nvt.model.MajorModel;

public class MajorDAO extends AbstractDAO<MajorModel> implements IMajorDAO{
	public List<MajorModel> getAll(){
		String sql  = "Select * from major";
		return query(sql, new MajorMapper());
	}

	@Override
	public MajorModel getById(String id) {
		String sql = "select * from major where idmajor = ?";
		List<MajorModel> major = query(sql, new MajorMapper(),id);
		return major.isEmpty() ? null : major.get(0);
	}

	
	
	
	
	
	
	
}
