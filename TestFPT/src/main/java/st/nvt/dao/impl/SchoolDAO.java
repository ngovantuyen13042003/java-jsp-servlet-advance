package st.nvt.dao.impl;

import java.util.List;

import st.nvt.dao.ISchoolDAO;
import st.nvt.mapper.SchoolMapper;
import st.nvt.model.SchoolModel;

public class SchoolDAO extends AbstractDAO<SchoolModel> implements ISchoolDAO{

	@Override
	public List<SchoolModel> findAll() {
		String sql  = "Select * from school";
		return query(sql, new SchoolMapper());
	}
	@Override
	public Boolean Insert(SchoolModel schoolModel) {
		String sql = "insert into school(idschool,name,address,phonenumber) value(?,?,?,?)";
		return insert(sql,schoolModel.getIdSchool(),schoolModel.getName(),schoolModel.getAddress(),schoolModel.getPhoneNumber());
	}

}
