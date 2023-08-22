package st.nvt.dao.impl;

import java.text.SimpleDateFormat;

import st.nvt.dao.IGranduateDAO;
import st.nvt.model.GraduateModel;

public class GraduateDAO extends AbstractDAO<GraduateModel>  implements IGranduateDAO{

	@Override
	public Boolean Insert(GraduateModel graduate) {
		String sql = "insert into graduate(identitycardnumber,idschool,idmajor,dategraduate,graduationtype,graduationdegree) value(?,?,?,?,?,?)";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return insert(sql, graduate.getIdentityCardNumber(),graduate.getIdSchool(),graduate.getIdMajor(),format.format(graduate.getGraduateDate()),graduate.getGraduateType(),graduate.getGraduateDegree());
	}


	
}
