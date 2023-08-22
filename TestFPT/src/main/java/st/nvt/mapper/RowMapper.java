package st.nvt.mapper;

import java.sql.ResultSet;

public interface RowMapper<T> {
	T  mapprow(ResultSet rs);
}
