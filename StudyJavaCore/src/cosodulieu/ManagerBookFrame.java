package cosodulieu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ManagerBookFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTable table;
	private JTextField bookID;
	private JTextField bookName;
	private JTextField bookISBN;
	private JTextField categoryName;
	private JTextField year;
	private JTextField author;
	private DefaultTableModel dtm;

	private ResultSet rs = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ManagerBookFrame frame = new ManagerBookFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ManagerBookFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] arr = { "BookID", "BookName", "BookISBN", "Author", "CategoryName", "Year" };
		dtm = new DefaultTableModel(arr, 0);

		table = new JTable(dtm);
		JScrollPane sc = new JScrollPane(table);
		// thao tac chon chuot
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				bookID.setText(table.getValueAt(i, 0).toString());
				bookName.setText(table.getValueAt(i, 1).toString());
				bookISBN.setText(table.getValueAt(i, 2).toString());
				author.setText(table.getValueAt(i, 3).toString());
				categoryName.setText(table.getValueAt(i, 4).toString());
				year.setText(table.getValueAt(i, 5).toString());
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});

		sc.setBounds(10, 33, 827, 200);
		contentPane.add(sc);
		loadData();

		JLabel maSach = new JLabel("Mã Sách");
		maSach.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		maSach.setBounds(37, 275, 59, 24);
		contentPane.add(maSach);

		JLabel tenSach = new JLabel("Tên Sách");
		tenSach.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		tenSach.setBounds(37, 318, 59, 24);
		contentPane.add(tenSach);

		JLabel maTieuChuan = new JLabel("Mã tiêu chuẩn");
		maTieuChuan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		maTieuChuan.setBounds(292, 275, 102, 24);
		contentPane.add(maTieuChuan);

		JLabel tacGia = new JLabel("Tác giả");
		tacGia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		tacGia.setBounds(292, 318, 59, 24);
		contentPane.add(tacGia);

		JLabel tenDanhMuc = new JLabel("Tên danh mục");
		tenDanhMuc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		tenDanhMuc.setBounds(570, 275, 95, 24);
		contentPane.add(tenDanhMuc);

		JLabel nam = new JLabel("Năm");
		nam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		nam.setBounds(570, 318, 59, 24);
		contentPane.add(nam);

		bookID = new JTextField();
		bookID.setBounds(117, 279, 142, 20);
		contentPane.add(bookID);
		bookID.setColumns(10);

		bookName = new JTextField();
		bookName.setColumns(10);
		bookName.setBounds(117, 322, 142, 20);
		contentPane.add(bookName);

		bookISBN = new JTextField();
		bookISBN.setColumns(10);
		bookISBN.setBounds(404, 279, 142, 20);
		contentPane.add(bookISBN);

		categoryName = new JTextField();
		categoryName.setColumns(10);
		categoryName.setBounds(675, 279, 142, 20);
		contentPane.add(categoryName);

		year = new JTextField();
		year.setColumns(10);
		year.setBounds(675, 322, 142, 20);
		contentPane.add(year);

		author = new JTextField();
		author.setColumns(10);
		author.setBounds(404, 322, 142, 20);
		contentPane.add(author);

		JButton them = new JButton("Thêm");
		them.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookDAO mc = null;
				try {
					mc = new BookDAO();
					mc.connect();
					mc.insertBook(Integer.parseInt(bookID.getText()), bookName.getText(), bookISBN.getText(),
							author.getText(), categoryName.getText(), year.getText());

				} catch (SQLException ex) {
					Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
				} finally {
					mc.close();
				}

				loadData();
			}
		});
		them.setBounds(128, 376, 89, 35);
		contentPane.add(them);

		JButton sua = new JButton("Sửa");
		sua.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookDAO mc = null;
				try {
					mc = new BookDAO();
					mc.connect();
					mc.updateBook(Integer.parseInt(bookID.getText()), bookName.getText(), bookISBN.getText(),
							author.getText(), categoryName.getText(), year.getText());

				} catch (SQLException ex) {
					Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
				} finally {
					mc.close();
				}

				loadData();
			}
		});
		sua.setBounds(268, 376, 89, 35);
		contentPane.add(sua);

		JButton xoa = new JButton("Xóa");
		xoa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookDAO mc = null;
				try {
					mc = new BookDAO();
					mc.connect();
					mc.deleteBook(Integer.parseInt(bookID.getText()));
				} catch (NumberFormatException ex) {
					Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
				} catch (SQLException ex) {
					Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
				} finally {
					mc.close();
				}

				loadData();
			}
		});
		xoa.setBounds(408, 376, 89, 35);
		contentPane.add(xoa);

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(548, 376, 89, 35);
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bookID.setText("");
				bookName.setText("");
				bookISBN.setText("");
				author.setText("");
				categoryName.setText("");
				year.setText("");
			}
		});
		contentPane.add(btnClear);

		JLabel tenBang = new JLabel("Book");
		tenBang.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tenBang.setBounds(374, 0, 89, 35);
		contentPane.add(tenBang);
	}

	private void loadData() {
		// clear table
		dtm.setRowCount(0);

		BookDAO mc = new BookDAO();
		mc.connect();
		try {
			rs = mc.getAllBook();

			while (rs.next()) {
				Vector<String> vec = new Vector<String>();
				vec.add(rs.getString("BookID"));
				vec.add(rs.getString("BookName"));
				vec.add(rs.getString("BookISBN"));
				vec.add(rs.getString("Author"));
				vec.add(rs.getString("CategoryName"));
				vec.add(rs.getString("Year"));
				dtm.addRow(vec);
			}

		} catch (SQLException e) {
			Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			mc.close();
		}

	}
}
