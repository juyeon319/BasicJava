package chap11.sec02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TempDao {
    private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String USER = "pc06";
    private final String PASSWD = "java";

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    private static TempDao instance = null;

    private TempDao() {
    }

    public static TempDao getInstance() {
        if (instance == null)
            instance = new TempDao();
        return instance;
    }

    public List<TempVO> selectList(String sql) {
        List<TempVO> list = new ArrayList<TempVO>(); // TempVO 객체를 담을 리스트 생성
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TempVO tempVO = new TempVO();
                tempVO.setEmpNo(rs.getString("EMPNO"));
                tempVO.setEname(rs.getString("ENAME"));
                tempVO.setJob(rs.getString("JOB"));
                tempVO.setDeptNo(rs.getInt("DEPTNO"));
                list.add(tempVO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (Exception e) {
                }
            if (stmt != null)
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            if (conn != null)
                try {
                    conn.close();
                } catch (Exception e) {
                }
        }
        return list;
    }
}
