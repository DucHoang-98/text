package cosodulieu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookDAO {
	private Connection conn;
	private String url = "jdbc:mysql://localhost:3306/quanli?characterEncoding=UTF-8";

	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				conn = (Connection) DriverManager.getConnection(url, "root", "");
				System.out.println("Kết nối thành công!");
			} catch (SQLException e) {
				Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, e);
			}
		} catch (ClassNotFoundException e) {
			Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	public ResultSet getAllBook() throws SQLException {
		ResultSet kq = null;
		String sql = "select * from book";
		Statement st = conn.createStatement();
		kq = st.executeQuery(sql);
		return kq;

	}

	public void updateBook(int BookID, String BookName, String BookISBN, String Author, String CategoryName,
			String Year) throws SQLException {
		Statement st = conn.createStatement();
		String sql = "Update book set BookName = '" + BookName + "', BookISBN = '" + BookISBN + "', Author = '" + Author
				+ "', CategoryName = '" + CategoryName + "', Year = '" + Year + "' where BookID = '" + BookID + "'";
		st.executeUpdate(sql);
	}

	public void insertBook(int BookID, String BookName, String BookISBN, String Author, String CategoryName,
			String Year) throws SQLException {
		Statement st = conn.createStatement();
		String sql = "Insert into book values(" + BookID + ",'" + BookName + "','" + BookISBN + "','" + Author + "','"
				+ CategoryName + "','" + Year + "')";
		st.executeUpdate(sql);
	}

	public void deleteBook(int bookID) throws SQLException {
		Statement st = conn.createStatement();
		String sql = "Delete from book where BookID = " + bookID + "";
		st.executeUpdate(sql);
	}

	public void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
