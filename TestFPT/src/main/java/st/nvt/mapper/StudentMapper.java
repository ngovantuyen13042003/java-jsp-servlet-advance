package st.nvt.mapper;

import java.sql.ResultSet;

import st.nvt.model.StudentModel;

public class StudentMapper implements RowMapper<StudentModel>{

	@Override
	public StudentModel mapprow(ResultSet rs) {
		StudentModel student = new StudentModel();
		try {
			student.setAddress(rs.getString("address"));
			student.setEmail(rs.getString("email"));
			student.setIdentityCardNumber(rs.getString("identitycardnumber"));
			student.setName(rs.getString("name"));
			student.setPhoneNumber(rs.getString("phonenumber"));
			return student;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
