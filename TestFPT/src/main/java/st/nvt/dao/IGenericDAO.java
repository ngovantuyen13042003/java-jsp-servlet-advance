package st.nvt.dao;

import java.util.List;

import st.nvt.mapper.RowMapper;

public interface IGenericDAO<T> {
	List<T> query(String sql, RowMapper<T> rowMapper, Object ...params);
	Boolean insert(String sql, Object... params);
	void update(String sql , Object... params);
	
}
