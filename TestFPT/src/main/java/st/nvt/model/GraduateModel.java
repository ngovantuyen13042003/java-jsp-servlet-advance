package st.nvt.model;

import java.sql.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GraduateModel {
	private String identityCardNumber;
	private String idSchool;
	private String idMajor;
	private String graduateType;
	private Date graduateDate;
	private String graduateDegree;

	
}
