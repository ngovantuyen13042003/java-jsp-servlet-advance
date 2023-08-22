package st.nvt.dao;

import java.util.List;

import st.nvt.model.JobModel;

public interface IJobDAO extends IGenericDAO<JobModel>{

	List<JobModel> search();
}
