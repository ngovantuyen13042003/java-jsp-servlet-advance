package st.nvt.model;

import lombok.Data;
import lombok.ToString;

@Data
public class StudentModel {
	private String identityCardNumber;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	
	private JobModel job;
	private GraduateModel graduate;
	@Override
	public String toString() {
		return "StudentModel [identityCardNumber=" + identityCardNumber + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", job= [" +job+ "]" + ", graduate=[" + graduate + "]"
				+ "]";
	}

	
}
