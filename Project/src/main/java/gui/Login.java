package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import dao.EmployeDao;
import database.ConnectToDB;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel Login;
	private JLabel lblNewLabel;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JTextField textField_1;
	private JButton btnLogin;
	private JButton btnReset;
	private JPasswordField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login frame = new Login();
//					frame.setLocationRelativeTo(null); 
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\win 10\\medicine.png"));
		setTitle("Pharmacy management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
		Login = new JPanel();
		Login.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		setContentPane(Login);
		
		lblNewLabel = new JLabel("Pharmacy Management");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoginActionPerformed(e);
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLogin.setForeground(new Color(0, 0, 0));
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnResetActionPerformed(e);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblUser = new JLabel("User Name:");
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textField = new JPasswordField();
		GroupLayout gl_Login = new GroupLayout(Login);
		gl_Login.setHorizontalGroup(
			gl_Login.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Login.createSequentialGroup()
					.addContainerGap(77, Short.MAX_VALUE)
					.addGroup(gl_Login.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Login.createSequentialGroup()
							.addGroup(gl_Login.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_Login.createSequentialGroup()
									.addGroup(gl_Login.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUser)
										.addComponent(lblPassword))
									.addGap(18)
									.addGroup(gl_Login.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField)
										.addComponent(textField_1)))
								.addGroup(gl_Login.createSequentialGroup()
									.addComponent(btnLogin)
									.addGap(18)
									.addComponent(btnReset)))
							.addGap(160))
						.addGroup(Alignment.TRAILING, gl_Login.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
							.addGap(68))))
		);
		gl_Login.setVerticalGroup(
			gl_Login.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Login.createSequentialGroup()
					.addGap(13)
					.addComponent(lblNewLabel)
					.addGap(32)
					.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword))
					.addGap(18)
					.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnReset))
					.addGap(67))
		);
		Login.setLayout(gl_Login);
	}
	protected void btnLoginActionPerformed(ActionEvent e) {
	    try {
	        var con = ConnectToDB.getConn();
	        String sql = "SELECT * FROM Account WHERE Username = ? AND password = ?";
	        var pst = con.prepareStatement(sql);
	        pst.setString(1, textField_1.getText()); 
	        pst.setString(2, textField.getText());   
	        var rs = pst.executeQuery();

	        if (rs.next()) {
	            String role = rs.getString("role");
	            if ("Employee".equals(role)) {   
	                try {
	                	EmployeeGui em = new EmployeeGui(EmployeDao.findIdEmpByUsername(rs.getString("Username")));
	                	setVisible(false);
	                	em.setLocationRelativeTo(null);
	                	em.setResizable(false);
	                	em.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	                	em.setVisible(true);
	                	em.addWindowListener(new java.awt.event.WindowAdapter() {
				            @Override
				            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				               
				                int choice = javax.swing.JOptionPane.showConfirmDialog(em, "Do you want to close?", "Message", javax.swing.JOptionPane.YES_NO_OPTION);
				                if (choice == javax.swing.JOptionPane.YES_OPTION) {
				                	em.setVisible(false);
				                }
				            }
				        });
				        
					} catch (Exception e1) {
						
					}
	            } else if ("Manager".equals(role)) {
	                try {
	                	ManagerGui frame = new ManagerGui(EmployeDao.findIdEmpByUsername(rs.getString("Username")));
	                	setVisible(false);
	                	frame.setLocationRelativeTo(null); 
	                	frame.setResizable(false);
						frame.setVisible(true);
						frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
				        frame.addWindowListener(new java.awt.event.WindowAdapter() {
				            @Override
				            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				               
				                int choice = javax.swing.JOptionPane.showConfirmDialog(frame, "Do you want to close?", "Message", javax.swing.JOptionPane.YES_NO_OPTION);
				                if (choice == javax.swing.JOptionPane.YES_OPTION) {
				                    frame.setVisible(false);
				                }
				            }
				        });
				         
				      
					} catch (Exception e111) {
						
					}
	            } else {
	                JOptionPane.showMessageDialog(this, "Wrong username or password.");
	            }
	        } else {
	            JOptionPane.showMessageDialog(this, "Wrong username or password.");
	        }
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Erorr");
	    }
	}


	protected void btnResetActionPerformed(ActionEvent e) {
		 textField_1.setText("");
		    textField.setText("");
	}
}
