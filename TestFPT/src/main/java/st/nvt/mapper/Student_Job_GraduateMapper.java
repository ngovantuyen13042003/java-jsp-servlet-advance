package st.nvt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import st.nvt.model.GraduateModel;
import st.nvt.model.JobModel;
import st.nvt.model.StudentModel;

public class Student_Job_GraduateMapper implements RowMapper<StudentModel>{

	@Override
	public StudentModel mapprow(ResultSet rs) {
		StudentModel student = new StudentModel();
		JobModel job = new JobModel();
		GraduateModel graduate = new GraduateModel();
		try {
			student.setIdentityCardNumber(rs.getString("identitycardnumber"));
			student.setName(rs.getString("name"));
				
			job.setNameCompany(rs.getString("namecompany"));
			job.setIdMajor(rs.getString("idmajor"));
			job.setWorkingTime(rs.getDate("workingtime"));
			
			graduate.setIdMajor(rs.getString("idmajor"));
			graduate.setIdSchool(rs.getString("idmajor"));
			
			student.setGraduate(graduate);
			student.setJob(job);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return student;
	}
	
}
