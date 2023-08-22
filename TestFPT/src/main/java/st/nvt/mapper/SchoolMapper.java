package st.nvt.mapper;

import java.sql.ResultSet;

import st.nvt.model.SchoolModel;

public class SchoolMapper implements RowMapper<SchoolModel>{

	@Override
	public SchoolModel mapprow(ResultSet rs) {
		SchoolModel school = new SchoolModel();
		try {
			school.setAddress(rs.getString("address"));
			school.setIdSchool(rs.getString("idschool"));
			school.setName(rs.getString("name"));
			school.setPhoneNumber(rs.getString("phonenumber"));
			return school;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
