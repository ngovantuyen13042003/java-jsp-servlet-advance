package st.nvt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import st.nvt.dao.IGenericDAO;
import st.nvt.mapper.RowMapper;
import st.nvt.utils.JDBCUtil;

public class AbstractDAO<T> implements IGenericDAO<T> {

//	public List<T> query(String  sql , RowMapper<T> rowMapper){
//		List<T> result = new ArrayList<>();
//		try(Connection con = JDBCUtil.getConnection();
//				PreparedStatement ps = con.prepareStatement(sql)) {
//			ResultSet rs= ps.executeQuery();
//			while(rs.next()) {
//				result.add(rowMapper.mapprow(rs));
//			}
//			return result;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

	@Override
	public List<T> query(String sql, RowMapper<T> rowMapper, Object... params) {
		List<T> result = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			setParams(ps, params);
			rs = ps.executeQuery();
			while (rs.next()) {
				result.add(rowMapper.mapprow(rs));
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (con != null) {
					JDBCUtil.closeConnection(con);
				}
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void setParams(PreparedStatement ps, Object... params) {
		try {
			for (int i = 0; i < params.length; i++) {
				Object parameter = params[i];
				int index = i + 1;
				if (parameter instanceof Integer) {
					ps.setInt(index, (Integer) parameter);
				}else
				if (parameter instanceof String) {
					ps.setString(index, (String) parameter);
				} else if (parameter instanceof Timestamp) {
					ps.setTimestamp(index, (Timestamp) parameter);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("static-access")
	@Override
	public Boolean  insert(String sql, Object... params) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String id = "";
			con =  JDBCUtil.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql,ps.RETURN_GENERATED_KEYS);
			setParams(ps, params);
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if(rs.next()) {
				id = rs.getString(1);
			}
			con.commit();
			return true;
		} catch (SQLException e) {
			if (con != null) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public void update(String sql, Object... params) {
		
	}
}
























