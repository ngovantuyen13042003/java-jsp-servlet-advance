package st.nvt.model;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JobModel {
	private String identityCardNumber;
	private Date dateEnterCompany;
	private String idMajor;
	private String nameJob;
	private String nameCompany;
	private String addressCompany;
	private Date workingTime;
}
