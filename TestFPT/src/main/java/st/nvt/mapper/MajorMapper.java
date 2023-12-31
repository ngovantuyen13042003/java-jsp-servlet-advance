package st.nvt.mapper;

import java.sql.ResultSet;

import st.nvt.model.MajorModel;

public class MajorMapper implements RowMapper<MajorModel> {

	@Override
	public MajorModel mapprow(ResultSet rs) {
		MajorModel major = new MajorModel();
		try {
			major.setName(rs.getString("name"));
			major.setCategory(rs.getString("category"));
			major.setIdMajor(rs.getString("idmajor"));
			return major;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
