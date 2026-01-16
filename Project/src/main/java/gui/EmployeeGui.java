package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import dao.CustomerDAO;
import dao.DrugCategoryDao;
import dao.EmployeDao;
import dao.MakeBillDAO;
import dao.MedicineDAO;
import dao.MedicineInventoryDAO;
import dao.SupplierDAO;
import dao.SupplierInvoiceDAO;
import dao.UnitDAO;
import entity.*;

import javax.swing.JCheckBox;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;

import java.awt.Rectangle;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
public class EmployeeGui extends JFrame {

	private JPanel contentPane;
	private JPanel mainPanel;
	private JScrollPane scrollMainPane;
	private JTabbedPane tabbedMainPanel;
	private JPanel searchBillPanel;
	private JPanel customerPanel;
	private JPanel panel_18;
	private JPanel panel_23;
	private JRadioButton idRadioCus;
	private JRadioButton nameRadioCus;
	private JLabel lblEnter;
	private JRadioButton yearRadioCus;
	private JTextField searchTextFieldCus;
	private JButton btnSearchCus;
	private JButton resetBtnCus;
	private JPanel panel_24;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JTextField addressTextfFieldCus;
	private JTextField phoneNBTextfFieldCus;
	private JDateChooser dateChooser_2;
	private JTextField idTextfFieldCus;
	private JLabel lblFirstName;
	private JTextField firstNameTextfFieldCus;
	private JLabel lblName_1;
	private JLabel lblGender;
	private JTextField lastNameTextfFieldCus;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JPanel makeBillPanel;
	private JPanel panel_29;
	private JPanel panel_36;
	private JLabel lblNewLabel_1;
	private JPanel panel_37;
	private JPanel panel_7;
	private JLabel lblCus;
	private JLabel lblId;
	private JLabel lblStaff;
	private JLabel lblBillDate;
	private JLabel lblTotal;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JPanel panel_8;
	private JPanel panel_9;
	private JLabel lblEnterInfor;
	private JRadioButton rdbtnID_1;
	private JButton btnSearch;
	private JPanel panel_40;
	private JLabel lblNewLabel_13;
	private JTextField textField_26;
	private JLabel lblNewLabel_14;
	private JLabel lblFirstName_1;
	private JLabel lblAddress;
	private JTextField textField_29;
	private JDateChooser dateChooser_4;
	private JTextField textField_28;
	private JTextField textField_30;
	private JTextField textField_31;
	private JLabel lblNewLabel_22;
	private JLabel lblLastName;
	private JLabel lblNewLabel_15;
	private JPanel panel_41;
	private JLabel lblPriceTotal_1;
	private JTextField textField_34;
	private JButton btnNewButton_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JPanel panel_21;
	private JLabel lblNewLabel_17;
	private JPanel panel;
	private JLabel lblCusInfor;
	private JPanel panel_19;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup customerGender = new ButtonGroup();
	private JTable tableCus;
	private JButton reset_informationCUS;
	private String filename= null;
	private String fileBefore= null;
	private String driBefore= null;
	private String driAfter= null;
	private String oldINNcode = null;
	private String oldFilePath = null;
	private final ButtonGroup searchDrugbtngr = new ButtonGroup();
	private JPanel supplierInvoicePanel;
	private JPanel panel_22;
	private JLabel lblNewLabel_5;
	private JPanel Supplier_1;
	private JTextField textFieldidsupply;
	private JLabel lblSypplydate;
	private JLabel lblProductiondate;
	private JLabel lblExpirationdate;
	private JLabel lblQuantitybox;
	private JLabel lblQuantitypelletslnbox;
	private JLabel lblCostprice;
	private JTextField textField_12;
	private JTextField textFieldquantityBOX;
	private JTextField textFieldPelletInBox;
	private JTextField textFieldCostPrice;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_10_2;
	private JPanel panel_43;
	private JScrollPane scrollPane_5;
	private JTable tableSupplierInvoice;
	private JPanel panel_44;
	private JPanel panel_45;
	private JLabel lblMedicineIventory;
	private JPanel Supplier;
	private JLabel lblIdunit;
	private JLabel lblIdmedin;
	private JComboBox comboBox_3;
	private JTextField textField_13;
	private JLabel lblQuantity;
	private JLabel lblSellingprice;
	private JLabel lblIdunit_1;
	private JTextField textField_15;
	private JTextField textField_16;
	private JComboBox comboBox_4supplier;
	private JButton btnNewButton_10_2_3;
	private JPanel panel_46;
	private JButton btnNewButton_10_3;
	private JPanel panel_47;
	private JScrollPane scrollPane_6;
	private JTable tableMedicineInventory;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_10;
	private JTextField textField_17;
	private JButton btnNewButton_10_4;
	private JButton btnNewButton_10_5;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JPanel panel_48;
	private JLabel lblEnter_1;
	private JButton btnSearchCus_1;
	private JButton resetBtnCus_2;
	private JRadioButton idRadioCus_1;
	private JRadioButton nameRadioCus_1;
	private JRadioButton yearRadioCus_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JTextField textField_14;
	private JTextField textField_18;
	private JPanel panel_49;
	private JScrollPane scrollPane_7;
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private JTable table;
	private JTextField textField_19;
	private JPanel panel_50;
	private JLabel lblEnter_2;
	private JButton btnSearchCus_2;
	private JButton resetBtnCus_3;
	private JRadioButton idRadioCus_2;
	private JRadioButton nameRadioCus_2;
	private JTextField textField_20;
	private JPanel panel_51;
	private JScrollPane scrollPane_8;
	private JLabel lblNewLabel_16;
	private JTextField textField_21;
	private JLabel lblQuantity_1;
	private JTextField textField_27;
	private JButton btnNewButton_21;
	private JPanel panel_52;
	private JTable table_4;
	private JTable table_5;
	private JLabel lblNewLabel_19;
	private JTextField textField_32;
	private JLabel lblQuantity_2;
	private JTextField textField_33;
	private JLabel lblNewLabel_21;
	private JTextField textField_35;
	private JTextField textField_36;
	private JScrollPane scrollPane_10;
	private JTable table_2;
	private JScrollPane scrollPane_11;
	private JTable table_3;
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JButton btnNewButton_10_6;
	private JButton btnNewButton_10_7;
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	
	
	public EmployeeGui(int idemp) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\win 10\\medicine.png"));
		setTitle("Pharmacy management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1387, 753);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Logout");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		scrollMainPane = new JScrollPane();
		mainPanel.add(scrollMainPane, BorderLayout.CENTER);
		
		tabbedMainPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedMainPanel.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		tabbedMainPanel.setMaximumSize(new Dimension(1400, 1400));
		tabbedMainPanel.setBorder(null);
		scrollMainPane.setRowHeaderView(tabbedMainPanel);
		
		makeBillPanel = new JPanel();
		makeBillPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedMainPanel.addTab("Make BIll", null, makeBillPanel, null);
		
		panel_29 = new JPanel();
		panel_29.setBorder(new TitledBorder(null, "Invoice Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		panel_50 = new JPanel();
		panel_50.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblEnter_2 = new JLabel("Enter Information");
		
		btnSearchCus_2 = new JButton("Search");
		btnSearchCus_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameRadioCus_2.isSelected()) {
					var listRS = MakeBillDAO.searchMedicineByName(textField_20.getText());
					DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("IdMedin");
			        model.addColumn("INNCode");
			        model.addColumn("NameMedin");
			        model.addColumn("Quantity");
			        model.addColumn("SellingPrice");
			        
			        
			        listRS.forEach(mdk -> {
			            model.addRow(new Object[] {mdk.getIdMedin(), mdk.getInnCode(), mdk.getNameMedin(), mdk.getQuantity(), mdk.getSellingPrice()});
			        });
			        
			        table_5.setModel(model);
					
				}else if(idRadioCus_2.isSelected()){
					var listRS = MakeBillDAO.searchMedicineByINNCode(textField_20.getText());
					DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("IdMedin");
			        model.addColumn("INNCode");
			        model.addColumn("NameMedin");
			        model.addColumn("Quantity");
			        model.addColumn("SellingPrice");
			        
			        
			        listRS.forEach(mdk -> {
			            model.addRow(new Object[] {mdk.getIdMedin(), mdk.getInnCode(), mdk.getNameMedin(), mdk.getQuantity(), mdk.getSellingPrice()});
			        });
			        
			        table_5.setModel(model);
				}
			}
		});
		
		resetBtnCus_3 = new JButton("⟲");
		
		idRadioCus_2 = new JRadioButton("INN Code");
		buttonGroup_8.add(idRadioCus_2);
		
		nameRadioCus_2 = new JRadioButton("Name Medicine");
		buttonGroup_8.add(nameRadioCus_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		GroupLayout gl_panel_50 = new GroupLayout(panel_50);
		gl_panel_50.setHorizontalGroup(
			gl_panel_50.createParallelGroup(Alignment.LEADING)
				.addGap(0, 394, Short.MAX_VALUE)
				.addGroup(gl_panel_50.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnter_2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_50.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_50.createSequentialGroup()
							.addComponent(btnSearchCus_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(resetBtnCus_3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_50.createSequentialGroup()
							.addComponent(idRadioCus_2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nameRadioCus_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_50.setVerticalGroup(
			gl_panel_50.createParallelGroup(Alignment.LEADING)
				.addGap(0, 204, Short.MAX_VALUE)
				.addGroup(gl_panel_50.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel_50.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnter_2)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_50.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameRadioCus_2)
						.addComponent(idRadioCus_2))
					.addGap(46)
					.addGroup(gl_panel_50.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSearchCus_2)
						.addComponent(resetBtnCus_3))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel_50.setLayout(gl_panel_50);
		
		panel_51 = new JPanel();
		panel_51.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "List of Medicines", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		scrollPane_8 = new JScrollPane();
		GroupLayout gl_panel_51 = new GroupLayout(panel_51);
		gl_panel_51.setHorizontalGroup(
			gl_panel_51.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_51.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_8, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_51.setVerticalGroup(
			gl_panel_51.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_51.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		
		table_5 = new JTable();
		scrollPane_8.setViewportView(table_5);
		table_5.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = table_5.getSelectedRow();
		            if (selectedRow >= 0) {
		               
		                int idMedin = (int) table_5.getValueAt(selectedRow, 0);
		                String inncode = (String) table_5.getValueAt(selectedRow, 1);
		                String NameMedi = (String) table_5.getValueAt(selectedRow, 2);
		                int Quantity = (int) table_5.getValueAt(selectedRow, 3);
		                double SellingPrice = (double) table_5.getValueAt(selectedRow, 4);
		               
		               
		                textField_32.setText(Integer.toString(idMedin));
		                textField_33.setText(inncode);
		                textField_21.setText(NameMedi);
		                textField_35.setText(String.valueOf(SellingPrice));
		               
		                
		            }
		        }
		    }
		});
		panel_51.setLayout(gl_panel_51);
		
		lblNewLabel_16 = new JLabel("Name Medicine");
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		
		lblQuantity_1 = new JLabel("Quantity");
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		
		btnNewButton_21 = new JButton("Add");
		DefaultTableModel modelofMakebill = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        modelofMakebill.addColumn("IdMedin");
		modelofMakebill.addColumn("NameMedin");
		modelofMakebill.addColumn("Quantity");
		modelofMakebill.addColumn("TotalPrice");
		
        
		
        
        Set<String> addedIdMedinSet = new HashSet<>();

        btnNewButton_21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String idMedin = textField_32.getText();
                    
                    if (addedIdMedinSet.contains(idMedin)) {
                        JOptionPane.showMessageDialog(null, "IdMedin already in list", "Message", JOptionPane.WARNING_MESSAGE);
                    } else {
                        int quantitybuy = Integer.parseInt(textField_27.getText());
                        int quantityChoosen = MakeBillDAO.getMedicineInventoryQuantityByIdMedin(Integer.parseInt(idMedin));
                        
                        if (quantitybuy <= quantityChoosen && quantitybuy>0) {
                            addedIdMedinSet.add(idMedin); 
                            
                            float sellingprice = Float.parseFloat(textField_35.getText());
                            float totalprice = quantitybuy * sellingprice;
                            modelofMakebill.addRow(new Object[] { idMedin, textField_21.getText(), quantitybuy, totalprice });
                            textField_32.setText("");
                            textField_33.setText("");
                            textField_21.setText("");
                            textField_35.setText("");
                            textField_27.setText("");
                            float totalPriceSum = 0.0f;
                            for (int row = 0; row < modelofMakebill.getRowCount(); row++) {
                                float totalPrice = (float) modelofMakebill.getValueAt(row, modelofMakebill.findColumn("TotalPrice"));
                                totalPriceSum += totalPrice;
                            }
                            textField_34.setText(String.valueOf(totalPriceSum));
                            table_4.setModel(modelofMakebill);
                        } else {
                            JOptionPane.showMessageDialog(null, "Insufficient quantity in stock", "Message", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Just Number", "Message", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

		
		panel_52 = new JPanel();
		panel_52.setBorder(new TitledBorder(null, "List Medicine", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_52.setBackground(UIManager.getColor("Button.background"));
		
		lblNewLabel_19 = new JLabel("idMedicine");
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBackground(Color.WHITE);
		
		lblQuantity_2 = new JLabel("INNCODE");
		
		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBackground(Color.WHITE);
		
		lblNewLabel_21 = new JLabel("Selling Price");
		
		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBackground(Color.WHITE);
		GroupLayout gl_panel_29 = new GroupLayout(panel_29);
		gl_panel_29.setHorizontalGroup(
			gl_panel_29.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_52, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
						.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_29.createSequentialGroup()
								.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblQuantity_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_33))
							.addGroup(gl_panel_29.createSequentialGroup()
								.addGroup(gl_panel_29.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_21, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_29.createSequentialGroup()
										.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(lblQuantity_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton_21, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_51, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_50, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_29.setVerticalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_50, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_51, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_29.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_19)
										.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblQuantity_2))
									.addGap(3)
									.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_29.createSequentialGroup()
									.addGap(22)
									.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_16)))
								.addGroup(gl_panel_29.createSequentialGroup()
									.addGap(25)
									.addComponent(lblQuantity_1)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_21)
									.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnNewButton_21))
							.addGap(18)
							.addComponent(panel_52, 0, 0, Short.MAX_VALUE)))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel_52.setLayout(new BorderLayout(0, 0));
		JPopupMenu popupMenu = new JPopupMenu();
		JMenuItem deleteItem = new JMenuItem("Delete");
		deleteItem.addActionListener((ActionEvent e) -> {
		    int selectedRow = table_4.getSelectedRow();
		    if (selectedRow >= 0) {
		        String idMedin = modelofMakebill.getValueAt(selectedRow, modelofMakebill.findColumn("IdMedin")).toString();
		        addedIdMedinSet.remove(idMedin); 
		        modelofMakebill.removeRow(selectedRow); 
		    }
		});
		popupMenu.add(deleteItem);
		table_4 = new JTable(modelofMakebill);
        JScrollPane scrollPane_9 = new JScrollPane();
        panel_52.add(scrollPane_9, BorderLayout.CENTER);
		scrollPane_9.setViewportView(table_4);
		table_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int r = table_4.rowAtPoint(e.getPoint());
                    if (r >= 0 && r < table_4.getRowCount()) {
                    	table_4.setRowSelectionInterval(r, r);
                    } else {
                    	table_4.clearSelection();
                    }

                    int rowindex = table_4.getSelectedRow();
                    if (rowindex < 0) {
                        return;
                    }
                    if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
                        popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
            }
        });

		
		
		panel_29.setLayout(gl_panel_29);
		
		panel_40 = new JPanel();
		panel_40.setBorder(new TitledBorder(null, "Information Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		panel_41 = new JPanel();
		
		panel_21 = new JPanel();
		GroupLayout gl_makeBillPanel = new GroupLayout(makeBillPanel);
		gl_makeBillPanel.setHorizontalGroup(
			gl_makeBillPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_makeBillPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_makeBillPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_41, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_makeBillPanel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 1316, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(2765, Short.MAX_VALUE))
		);
		gl_makeBillPanel.setVerticalGroup(
			gl_makeBillPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_makeBillPanel.createSequentialGroup()
					.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_41, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(721, Short.MAX_VALUE))
		);
		
		lblNewLabel_17 = new JLabel("MAKE BILL");
		lblNewLabel_17.setForeground(Color.RED);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel_21.add(lblNewLabel_17);
		
		lblPriceTotal_1 = new JLabel("Price Total (USD):");
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setText("");
		textField_34.setColumns(10);
		JDateChooser datechooserSupplyDate_2 = new JDateChooser();
		btnNewButton_5 = new JButton("Add Bill");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					var bill = new Bill();
				 	String input = textField_30.getText();
			        String regex = "\\(id:(\\d+)\\)";   
			        Pattern pattern = Pattern.compile(regex);
			        Matcher matcher = pattern.matcher(input);
			        
			        List<MedincineShort> medincineShortList = new ArrayList<>();
			        for (int row = 0; row < modelofMakebill.getRowCount(); row++) {
			        	var meds = new MedincineShort();
			            int idMedin = Integer.parseInt(modelofMakebill.getValueAt(row, modelofMakebill.findColumn("IdMedin")).toString());
			            int quantity = Integer.parseInt(modelofMakebill.getValueAt(row, modelofMakebill.findColumn("Quantity")).toString());
			            meds.setIdMedin(idMedin);
			            meds.setQuantity(quantity);
			            
			            medincineShortList.add(meds);
			        }
			        java.util.Date selectedDate = datechooserSupplyDate_2.getDate();
					
			        if (matcher.find()) {
			        	if(!textField_18.getText().isEmpty() && selectedDate!=null && !medincineShortList.isEmpty()) {
			        		 String idString = matcher.group(1);
					            bill.setIdEmp(Integer.parseInt(idString));
					            bill.setIdCus(Integer.parseInt(textField_18.getText()));
								bill.setTotalBill(Double.parseDouble(textField_34.getText()));
								java.time.LocalDate localDate = selectedDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
								bill.setInvoiceDate(localDate);
								bill.setListMedincineInBill(medincineShortList);
								var check = MakeBillDAO.insertBillandInvoiceDetailAndMinusMedicineInvetory(bill);
								if(check) {
									JOptionPane.showMessageDialog(null, "success");
									modelofMakebill.setRowCount(0);
									textField_34.setText("");
									addedIdMedinSet.clear();
								}else {
									JOptionPane.showMessageDialog(null, "Error");
								}
			        	}else if(selectedDate!=null && !medincineShortList.isEmpty()) {
			        		String idString = matcher.group(1);
				            bill.setIdEmp(Integer.parseInt(idString));
				            bill.setIdCus(4);
							bill.setTotalBill(Double.parseDouble(textField_34.getText()));
							java.time.LocalDate localDate = selectedDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
							bill.setInvoiceDate(localDate);
							bill.setListMedincineInBill(medincineShortList);
							var check = MakeBillDAO.insertBillandInvoiceDetailAndMinusMedicineInvetory(bill);
							if(check) {
								JOptionPane.showMessageDialog(null, "success");
								modelofMakebill.setRowCount(0);
								textField_34.setText("");
								addedIdMedinSet.clear();
							}else {
								JOptionPane.showMessageDialog(null, "Error");
							}
		        	} else {
				        	JOptionPane.showMessageDialog(null, "Enter information", "Message", JOptionPane.WARNING_MESSAGE);
				        }
			        }
			       
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_22 = new JLabel("Staff Name:");
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBackground(new Color(255, 255, 255));
		textField_30.setEditable(false);
		EmpAndAcc empAndAcc = EmployeDao.getEmployeeAndAccountById(idemp);
		textField_30.setText(empAndAcc.getFirstName()+" "+empAndAcc.getLastName() + "(id:" + empAndAcc.getIdEmp()+")");
		
		JLabel lblNewLabel_22_1 = new JLabel("Invoice Day:");
		
		
		GroupLayout gl_panel_41 = new GroupLayout(panel_41);
		gl_panel_41.setHorizontalGroup(
			gl_panel_41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_41.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPriceTotal_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_22_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(datechooserSupplyDate_2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(3076, Short.MAX_VALUE))
		);
		gl_panel_41.setVerticalGroup(
			gl_panel_41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_41.createSequentialGroup()
					.addGroup(gl_panel_41.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_41.createSequentialGroup()
							.addGap(13)
							.addComponent(lblPriceTotal_1))
						.addGroup(gl_panel_41.createSequentialGroup()
							.addGap(9)
							.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_41.createSequentialGroup()
							.addGap(13)
							.addComponent(lblNewLabel_22))
						.addGroup(gl_panel_41.createSequentialGroup()
							.addGap(7)
							.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_41.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel_22_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_41.createSequentialGroup()
							.addContainerGap()
							.addComponent(datechooserSupplyDate_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_41.createSequentialGroup()
							.addGap(8)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		panel_41.setLayout(gl_panel_41);
		
		lblNewLabel_13 = new JLabel("Phone Number:");
		
		textField_26 = new JTextField();
		textField_26.setBackground(Color.WHITE);
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Date:");
		
		lblFirstName_1 = new JLabel("First Name:");
		
		lblAddress = new JLabel("Address:");
		
		textField_29 = new JTextField();
		textField_29.setBackground(Color.WHITE);
		textField_29.setEnabled(false);
		textField_29.setColumns(10);
		
		dateChooser_4 = new JDateChooser();
		dateChooser_4.setBackground(new Color(255, 255, 255));
		dateChooser_4.setEnabled(false);
		textField_28 = new JTextField();
		textField_28.setBackground(Color.WHITE);
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBackground(Color.WHITE);
		textField_31.setEnabled(false);
		textField_31.setColumns(10);
		
		lblLastName = new JLabel("Last Name:");
		
		lblNewLabel_15 = new JLabel("Gender:");
		
		JLabel lblIdCustomer = new JLabel("Id Customer");
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setBackground(Color.WHITE);
		textField_18.setColumns(10);
		
		panel_49 = new JPanel();
		panel_49.setBorder(new TitledBorder(null, "List of Customers", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		scrollPane_7 = new JScrollPane();
		GroupLayout gl_panel_49 = new GroupLayout(panel_49);
		gl_panel_49.setHorizontalGroup(
			gl_panel_49.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_49.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_7, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_49.setVerticalGroup(
			gl_panel_49.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_49.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_7, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
					.addGap(45))
		);
		
		table = new JTable();
		scrollPane_7.setViewportView(table);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = table.getSelectedRow();
		            if (selectedRow >= 0) {
		               
		                int idCus = (int) table.getValueAt(selectedRow, 0);
		                String lastName = (String) table.getValueAt(selectedRow, 1);
		                String firstName = (String) table.getValueAt(selectedRow, 2);
		                LocalDate dob = (LocalDate) table.getValueAt(selectedRow, 3);
		                boolean gender = table.getValueAt(selectedRow, 4).equals("male");
		                String address = (String) table.getValueAt(selectedRow, 5);
		                String phoneNb = (String) table.getValueAt(selectedRow, 6);
		                
		               
		                textField_18.setText(Integer.toString(idCus));
		                textField_28.setText(firstName);
		                textField_31.setText(lastName);
		                dateChooser_4.setDate(Date.valueOf(dob));
		                textField_29.setText(address);
		                textField_26.setText(phoneNb);
		                if(gender) {
		                	textField_19.setText("male");
		                }else {
		                	textField_19.setText("female");
		                }
		                
		            }
		        }
		    }
		});
		panel_49.setLayout(gl_panel_49);
		
		panel_48 = new JPanel();
		panel_48.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblEnter_1 = new JLabel("Enter Information");
		
		btnSearchCus_1 = new JButton("Search");
		btnSearchCus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idRadioCus_1.isSelected()) {
					List<Customer> list = new ArrayList<Customer>();
					try {
						list = CustomerDAO.searchCustomerById(Integer.parseInt(textField_14.getText()));
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Just Number", "Message", JOptionPane.WARNING_MESSAGE);
					}
			        
			        
			        DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("id");
			        model.addColumn("lastName");
			        model.addColumn("firstName");
			        model.addColumn("dob");
			        model.addColumn("gender");
			        model.addColumn("Address");
			        model.addColumn("phoneNb");
			        
			        list.forEach(cus -> {
			            String genderString = cus.isGender() ? "male" : "female";
			            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
			                cus.getAddress(), cus.getPhoneNb()});
			        });
			        
			        table.setModel(model);
				}else if(nameRadioCus_1.isSelected()) {
					 List<Customer> list = CustomerDAO.searchCustomerByLastName(textField_14.getText());
				        
				        DefaultTableModel model = new DefaultTableModel() {
				            @Override
				            public boolean isCellEditable(int row, int column) {
				                return false; 
				            }
				        };
				        
				        model.addColumn("id");
				        model.addColumn("lastName");
				        model.addColumn("firstName");
				        model.addColumn("dob");
				        model.addColumn("gender");
				        model.addColumn("Address");
				        model.addColumn("phoneNb");
				        
				        list.forEach(cus -> {
				            String genderString = cus.isGender() ? "male" : "female";
				            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
				                cus.getAddress(), cus.getPhoneNb()});
				        });
				        
				        table.setModel(model);
				}else if(yearRadioCus_1.isSelected()) {
					List<Customer> list = new ArrayList<Customer>();
					try {
						list = CustomerDAO.searchCustomerByBirthYear(Integer.parseInt(textField_14.getText()));
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Just Number", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
			        
			        DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("id");
			        model.addColumn("lastName");
			        model.addColumn("firstName");
			        model.addColumn("dob");
			        model.addColumn("gender");
			        model.addColumn("Address");
			        model.addColumn("phoneNb");
			        
			        list.forEach(cus -> {
			            String genderString = cus.isGender() ? "male" : "female";
			            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
			                cus.getAddress(), cus.getPhoneNb()});
			        });
			        
			        table.setModel(model);
				}else if(rdbtnNewRadioButton_2.isSelected()) {
					List<Customer> list = CustomerDAO.findCustomerByPhoneNumber(textField_14.getText());
			        
			        DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("id");
			        model.addColumn("lastName");
			        model.addColumn("firstName");
			        model.addColumn("dob");
			        model.addColumn("gender");
			        model.addColumn("Address");
			        model.addColumn("phoneNb");
			        
			        list.forEach(cus -> {
			            String genderString = cus.isGender() ? "male" : "female";
			            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
			                cus.getAddress(), cus.getPhoneNb()});
			        });
			        
			        table.setModel(model);
				} else {
					JOptionPane.showMessageDialog(null, "Choose Option", "Message", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		resetBtnCus_2 = new JButton("⟲");
		
		idRadioCus_1 = new JRadioButton("ID");
		buttonGroup_5.add(idRadioCus_1);
		
		nameRadioCus_1 = new JRadioButton("Name");
		buttonGroup_5.add(nameRadioCus_1);
		
		yearRadioCus_1 = new JRadioButton("Year of Birth");
		buttonGroup_5.add(yearRadioCus_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("PhoneNumber");
		buttonGroup_5.add(rdbtnNewRadioButton_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		GroupLayout gl_panel_48 = new GroupLayout(panel_48);
		gl_panel_48.setHorizontalGroup(
			gl_panel_48.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_48.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnter_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_48.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_48.createSequentialGroup()
							.addComponent(yearRadioCus_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_48.createSequentialGroup()
							.addComponent(btnSearchCus_1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(resetBtnCus_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_48.createSequentialGroup()
							.addComponent(idRadioCus_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nameRadioCus_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(272, Short.MAX_VALUE))
		);
		gl_panel_48.setVerticalGroup(
			gl_panel_48.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_48.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel_48.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnter_1)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_48.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameRadioCus_1)
						.addComponent(idRadioCus_1))
					.addGap(7)
					.addGroup(gl_panel_48.createParallelGroup(Alignment.BASELINE)
						.addComponent(yearRadioCus_1)
						.addComponent(rdbtnNewRadioButton_2))
					.addGap(18)
					.addGroup(gl_panel_48.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSearchCus_1)
						.addComponent(resetBtnCus_2))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel_48.setLayout(gl_panel_48);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		GroupLayout gl_panel_40 = new GroupLayout(panel_40);
		gl_panel_40.setHorizontalGroup(
			gl_panel_40.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_40.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_40.createSequentialGroup()
								.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textField_26)
									.addComponent(dateChooser_4, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
								.addGap(18)
								.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
									.addComponent(lblFirstName_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
									.addComponent(textField_31, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
									.addComponent(textField_28, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
							.addComponent(textField_29))
						.addGroup(gl_panel_40.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblIdCustomer, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_49, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_48, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(2776, Short.MAX_VALUE))
		);
		gl_panel_40.setVerticalGroup(
			gl_panel_40.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_40.createSequentialGroup()
					.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_40.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_panel_40.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_40.createSequentialGroup()
									.addGroup(gl_panel_40.createParallelGroup(Alignment.TRAILING)
										.addComponent(dateChooser_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_14))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel_40.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblFirstName_1)
									.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(15)
							.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_40.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_13))
								.addGroup(gl_panel_40.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblLastName)
									.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAddress)
								.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_40.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_15)
								.addComponent(lblIdCustomer)
								.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_40.createParallelGroup(Alignment.BASELINE)
							.addComponent(panel_49, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_48, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_40.setLayout(gl_panel_40);
		makeBillPanel.setLayout(gl_makeBillPanel);
		
		searchBillPanel = new JPanel();
		searchBillPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedMainPanel.addTab("Bill", null, searchBillPanel, null);
		
		panel_36 = new JPanel();
		panel_36.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		panel_37 = new JPanel();
		panel_37.setBorder(new TitledBorder(null, "Search Bill", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblCus = new JLabel("Customer:");
		
		lblId = new JLabel("ID Bill:");
		
		lblStaff = new JLabel("Staff:");
		
		lblBillDate = new JLabel("Bill Date:");
		
		lblTotal = new JLabel("Total:");
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.WHITE);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.WHITE);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.WHITE);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(255, 255, 255));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblCus, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblId, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(lblStaff, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblBillDate, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_5)
						.addComponent(textField_6)
						.addComponent(textField_7)
						.addComponent(textField_8)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE))
					.addGap(70))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBillDate))
							.addGap(18)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStaff))
							.addGap(18)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCus))
							.addGap(18)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTotal)))
						.addComponent(lblId))
					.addContainerGap(127, Short.MAX_VALUE))
		);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "Invoice List", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		panel_10.setLayout(new BorderLayout(0, 0));
		
		panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "Function", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblEnterInfor = new JLabel("Enter Information:");
		
		rdbtnID_1 = new JRadioButton("ID Bill");
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        
		           var billList = MakeBillDAO.searchBillById(Integer.parseInt(textField_36.getText()));

		           var model = new DefaultTableModel() {
					    public boolean isCellEditable(int row, int column) {
					        return false;
					    }
					};
				    
				    model.addColumn("IdBill");
				    model.addColumn("IdCus");
				    model.addColumn("InvoiceDate");
				    model.addColumn("TotalBill");
				    model.addColumn("IdEmp");
				    billList.forEach(bil -> {
				    	 model.addRow(new Object[] {
					                bil.getIdBill(),
					                bil.getIdCus(),
					                bil.getInvoiceDate(),
					                bil.getTotalBill(),
					                (int) bil.getIdEmp()
					            });
				    });
			        
				    table_2.setModel(model);
			}
		});
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnterInfor, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSearch)
								.addComponent(rdbtnID_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(111, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterInfor)
						.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnID_1)
					.addGap(18)
					.addComponent(btnSearch)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		panel_9.setLayout(gl_panel_9);
		
		panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Bill Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		panel_8.setLayout(new BorderLayout(0, 0));
		
		scrollPane_10 = new JScrollPane();
		panel_8.add(scrollPane_10, BorderLayout.CENTER);
		
		table_2 = new JTable();
		scrollPane_10.setViewportView(table_2);
		table_2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = table_2.getSelectedRow();
		            if (selectedRow >= 0) {
		               
		            	Object IdBill = table_2.getValueAt(selectedRow, 0);
		            	Object IdCus = table_2.getValueAt(selectedRow, 1);
		            	Object InvoiceDate =  table_2.getValueAt(selectedRow, 2);
		            	Object totalbill = table_2.getValueAt(selectedRow, 3);
		            	Object IdEmp =  table_2.getValueAt(selectedRow, 4);
					 
		                textField_9.setText(IdBill.toString());
		                textField_8.setText(InvoiceDate.toString());
		                textField_7.setText(IdEmp.toString());
		                textField_6.setText(IdCus.toString());
		                textField_5.setText(totalbill.toString());
		                var listinv = MakeBillDAO.getInvoiceDetailsByBillId(Integer.parseInt(IdBill.toString()));
		                

				           var model = new DefaultTableModel() {
							    public boolean isCellEditable(int row, int column) {
							        return false;
							    }
							};
						    
						    model.addColumn("ID Bill");
						    model.addColumn("ID Medin");
						    model.addColumn("Quantity");
						    
						    listinv.forEach(bil -> {
						    	 model.addRow(new Object[] {
						    			 	bil.getIdBill(),
							                bil.getIdMedin(),
							                bil.getQuantity(),
							            });
						    });
					        
						    table_3.setModel(model);
		                
		            }
		        }
		    }
		});
		GroupLayout gl_panel_37 = new GroupLayout(panel_37);
		gl_panel_37.setHorizontalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGap(8)
							.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
						.addComponent(panel_7, Alignment.TRAILING, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_37.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_8, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE))
					.addGap(15))
		);
		gl_panel_37.setVerticalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		scrollPane_11 = new JScrollPane();
		panel_10.add(scrollPane_11, BorderLayout.CENTER);
		
		table_3 = new JTable();
		scrollPane_11.setViewportView(table_3);
		panel_37.setLayout(gl_panel_37);
		
		lblNewLabel_1 = new JLabel("BILL");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		GroupLayout gl_panel_36 = new GroupLayout(panel_36);
		gl_panel_36.setHorizontalGroup(
			gl_panel_36.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addGap(610)
					.addComponent(lblNewLabel_1))
		);
		gl_panel_36.setVerticalGroup(
			gl_panel_36.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1))
		);
		panel_36.setLayout(gl_panel_36);
		GroupLayout gl_searchBillPanel = new GroupLayout(searchBillPanel);
		gl_searchBillPanel.setHorizontalGroup(
			gl_searchBillPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_searchBillPanel.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_searchBillPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_37, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_36, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE))
					.addContainerGap(2764, GroupLayout.PREFERRED_SIZE))
		);
		gl_searchBillPanel.setVerticalGroup(
			gl_searchBillPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_searchBillPanel.createSequentialGroup()
					.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE)
					.addGap(683))
		);
		searchBillPanel.setLayout(gl_searchBillPanel);
		
		customerPanel = new JPanel();
		customerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedMainPanel.addTab("Customer", null, customerPanel, null);
		
		panel_18 = new JPanel();
		
		panel_23 = new JPanel();
		panel_23.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		idRadioCus = new JRadioButton("ID");
		buttonGroup.add(idRadioCus);
		
		nameRadioCus = new JRadioButton("Name");
		buttonGroup.add(nameRadioCus);
		
		lblEnter = new JLabel("Enter Information");
		
		yearRadioCus = new JRadioButton("Year of Birth");
		buttonGroup.add(yearRadioCus);
		
		searchTextFieldCus = new JTextField();
		searchTextFieldCus.setColumns(10);
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("PhoneNumber");
		btnSearchCus = new JButton("Search");
		btnSearchCus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idRadioCus.isSelected()) {
					List<Customer> list = new ArrayList<Customer>();
					try {
						list = CustomerDAO.searchCustomerById(Integer.parseInt(searchTextFieldCus.getText()));
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Just Number", "Message", JOptionPane.WARNING_MESSAGE);
					}
			        
			        
			        DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("id");
			        model.addColumn("lastName");
			        model.addColumn("firstName");
			        model.addColumn("dob");
			        model.addColumn("gender");
			        model.addColumn("Address");
			        model.addColumn("phoneNb");
			        
			        list.forEach(cus -> {
			            String genderString = cus.isGender() ? "male" : "female";
			            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
			                cus.getAddress(), cus.getPhoneNb()});
			        });
			        
			        tableCus.setModel(model);
				}else if(nameRadioCus.isSelected()) {
					 List<Customer> list = CustomerDAO.searchCustomerByLastName(searchTextFieldCus.getText());
				        
				        DefaultTableModel model = new DefaultTableModel() {
				            @Override
				            public boolean isCellEditable(int row, int column) {
				                return false; 
				            }
				        };
				        
				        model.addColumn("id");
				        model.addColumn("lastName");
				        model.addColumn("firstName");
				        model.addColumn("dob");
				        model.addColumn("gender");
				        model.addColumn("Address");
				        model.addColumn("phoneNb");
				        
				        list.forEach(cus -> {
				            String genderString = cus.isGender() ? "male" : "female";
				            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
				                cus.getAddress(), cus.getPhoneNb()});
				        });
				        
				        tableCus.setModel(model);
				}else if(yearRadioCus.isSelected()) {
					List<Customer> list = new ArrayList<Customer>();
					try {
						list = CustomerDAO.searchCustomerByBirthYear(Integer.parseInt(searchTextFieldCus.getText()));
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Just Number", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
			        
			        DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("id");
			        model.addColumn("lastName");
			        model.addColumn("firstName");
			        model.addColumn("dob");
			        model.addColumn("gender");
			        model.addColumn("Address");
			        model.addColumn("phoneNb");
			        
			        list.forEach(cus -> {
			            String genderString = cus.isGender() ? "male" : "female";
			            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
			                cus.getAddress(), cus.getPhoneNb()});
			        });
			        
			        tableCus.setModel(model);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					List<Customer> list = CustomerDAO.findCustomerByPhoneNumber(searchTextFieldCus.getText());
			        
			        DefaultTableModel model = new DefaultTableModel() {
			            @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; 
			            }
			        };
			        
			        model.addColumn("id");
			        model.addColumn("lastName");
			        model.addColumn("firstName");
			        model.addColumn("dob");
			        model.addColumn("gender");
			        model.addColumn("Address");
			        model.addColumn("phoneNb");
			        
			        list.forEach(cus -> {
			            String genderString = cus.isGender() ? "male" : "female";
			            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
			                cus.getAddress(), cus.getPhoneNb()});
			        });
			        
			        tableCus.setModel(model);
				} else {
					JOptionPane.showMessageDialog(null, "Choose Option", "Message", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		resetBtnCus = new JButton("⟲");
		resetBtnCus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchTextFieldCus.setText("");
				idRadioCus.setSelected(false);
				nameRadioCus.setSelected(false);
				yearRadioCus.setSelected(false);
			}
		});
		
		
		buttonGroup.add(rdbtnNewRadioButton_1);
		GroupLayout gl_panel_23 = new GroupLayout(panel_23);
		gl_panel_23.setHorizontalGroup(
			gl_panel_23.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_23.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnter, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_23.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_23.createSequentialGroup()
							.addComponent(btnSearchCus, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(resetBtnCus, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_23.createSequentialGroup()
							.addComponent(idRadioCus, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nameRadioCus, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(yearRadioCus, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
						.addComponent(searchTextFieldCus, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
					.addGap(81))
		);
		gl_panel_23.setVerticalGroup(
			gl_panel_23.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_23.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel_23.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnter)
						.addComponent(searchTextFieldCus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_23.createParallelGroup(Alignment.BASELINE)
						.addComponent(yearRadioCus)
						.addComponent(nameRadioCus)
						.addComponent(idRadioCus)
						.addComponent(rdbtnNewRadioButton_1))
					.addGap(18)
					.addGroup(gl_panel_23.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSearchCus)
						.addComponent(resetBtnCus))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		panel_23.setLayout(gl_panel_23);
		
		panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(null, "List of Customers", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		JButton btnNewButton_9 = new JButton("⟲");
		btnNewButton_9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        List<Customer> list = CustomerDAO.getListCus();
		        
		        DefaultTableModel model = new DefaultTableModel() {
		            @Override
		            public boolean isCellEditable(int row, int column) {
		                return false; 
		            }
		        };
		        
		        model.addColumn("id");
		        model.addColumn("lastName");
		        model.addColumn("firstName");
		        model.addColumn("dob");
		        model.addColumn("gender");
		        model.addColumn("Address");
		        model.addColumn("phoneNb");
		        
		        list.forEach(cus -> {
		            String genderString = cus.isGender() ? "male" : "female";
		            model.addRow(new Object[] {cus.getIdCus(), cus.getLastName(), cus.getFirstName(), cus.getDob(), genderString,
		                cus.getAddress(), cus.getPhoneNb()});
		        });
		        
		        tableCus.setModel(model);
		    }
		});

		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_9)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_9)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
		);
		JRadioButton customerMALE = new JRadioButton("Male");
		customerGender.add(customerMALE);
		
		JRadioButton customerFEMALE = new JRadioButton("Female");
		customerGender.add(customerFEMALE);
		tableCus = new JTable();
		JButton btnNewButton_8 = new JButton("Add");
		scrollPane.setViewportView(tableCus);
		tableCus.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tableCus.getSelectedRow();
		            if (selectedRow >= 0) {
		               
		                int idCus = (int) tableCus.getValueAt(selectedRow, 0);
		                String lastName = (String) tableCus.getValueAt(selectedRow, 1);
		                String firstName = (String) tableCus.getValueAt(selectedRow, 2);
		                LocalDate dob = (LocalDate) tableCus.getValueAt(selectedRow, 3);
		                boolean gender = tableCus.getValueAt(selectedRow, 4).equals("male");
		                String address = (String) tableCus.getValueAt(selectedRow, 5);
		                String phoneNb = (String) tableCus.getValueAt(selectedRow, 6);
		                
		               
		                idTextfFieldCus.setText(Integer.toString(idCus));
		                firstNameTextfFieldCus.setText(firstName);
		                lastNameTextfFieldCus.setText(lastName);
		                dateChooser_2.setDate(Date.valueOf(dob));
		                addressTextfFieldCus.setText(address);
		                phoneNBTextfFieldCus.setText(phoneNb);
		                if(gender) {
		                	customerMALE.setSelected(true);
		                }else {
		                	customerFEMALE.setSelected(true);
		                }
		                btnNewButton_3.setEnabled(true);
		                btnNewButton_4.setEnabled(true);
		                btnNewButton_8.setEnabled(false);
		            }
		        }
		    }
		});

		panel_19.setLayout(gl_panel_19);
		GroupLayout gl_panel_18 = new GroupLayout(panel_18);
		gl_panel_18.setHorizontalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(2736, Short.MAX_VALUE))
		);
		gl_panel_18.setVerticalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_18.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel_18.setLayout(gl_panel_18);
		
		panel_24 = new JPanel();
		
		lblNewLabel_8 = new JLabel("Phone Number");
		
		lblNewLabel_9 = new JLabel("Address");
		
		lblNewLabel_10 = new JLabel("ID:");
		
		lblNewLabel_11 = new JLabel("day of Birth:");
		
		addressTextfFieldCus = new JTextField();
		addressTextfFieldCus.setColumns(10);
		
		phoneNBTextfFieldCus = new JTextField();
		phoneNBTextfFieldCus.setColumns(10);
		
		dateChooser_2 = new JDateChooser();
		
		idTextfFieldCus = new JTextField();
		idTextfFieldCus.setBackground(new Color(255, 255, 255));
		idTextfFieldCus.setEditable(false);
		idTextfFieldCus.setColumns(10);
		
		lblFirstName = new JLabel("First Name:");
		
		firstNameTextfFieldCus = new JTextField();
		firstNameTextfFieldCus.setColumns(10);
		
		lblName_1 = new JLabel("Last Name:");
		
		lblGender = new JLabel("Gender:");
		
		lastNameTextfFieldCus = new JTextField();
		lastNameTextfFieldCus.setColumns(10);
		
		btnNewButton_3 = new JButton("Update");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 	var cus = new Customer();
			        boolean missingInfo = false; 

			      
			        String firstName =firstNameTextfFieldCus.getText() ;
			        if (firstName.isEmpty()) {
			            missingInfo = true; 
			        } else {
			            cus.setFirstName(firstName);
			        }

			    
			        String lastName = lastNameTextfFieldCus.getText();
			        if (lastName.isEmpty()) {
			            missingInfo = true; 
			        } else {
			            cus.setLastName(lastName);
			        }

			        
			        java.util.Date selectedDate = dateChooser_2.getDate();
			        if (selectedDate == null) {
			            missingInfo = true;
			        } else {
			            java.time.LocalDate dobld = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			            cus.setDob(dobld);
			        }

			     

			      
			        if (missingInfo) {
			            JOptionPane.showMessageDialog(null, "Please enter complete information.", "Message", JOptionPane.WARNING_MESSAGE);
			        } else {
			           
			            cus.setAddress(addressTextfFieldCus.getText());
			            cus.setPhoneNb(phoneNBTextfFieldCus.getText());
			            cus.setGender(customerMALE.isSelected());
			            cus.setIdCus(Integer.parseInt(idTextfFieldCus.getText()));
			            int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
			            
			            if (choice == JOptionPane.YES_OPTION) {
			            	CustomerDAO.updateCustomerInDb(cus);
			            	firstNameTextfFieldCus.setText("");
			            	lastNameTextfFieldCus.setText("");
			            	dateChooser_2.setDate(null);
			            	addressTextfFieldCus.setText("");
			            	phoneNBTextfFieldCus.setText("");
			            	idTextfFieldCus.setText("");
			            	btnNewButton_3.setEnabled(false);
				            btnNewButton_4.setEnabled(false);
				            btnNewButton_8.setEnabled(true);
			            } 
			            
			        }
			}
		});
		
		btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		            int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
		            
		            if (choice == JOptionPane.YES_OPTION) {
		            	CustomerDAO.deleteCustomerFromDb(Integer.parseInt(idTextfFieldCus.getText()));
		            	firstNameTextfFieldCus.setText("");
		            	lastNameTextfFieldCus.setText("");
		            	dateChooser_2.setDate(null);
		            	addressTextfFieldCus.setText("");
		            	phoneNBTextfFieldCus.setText("");
		            	idTextfFieldCus.setText("");
		            	btnNewButton_3.setEnabled(false);
			            btnNewButton_4.setEnabled(false);
			            btnNewButton_8.setEnabled(true);
		            } 
		            
		        
			}
		});
		btnNewButton_4.setEnabled(false);
		panel = new JPanel();
		
		
		
		
		
		btnNewButton_8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        var cus = new Customer();
		        boolean missingInfo = false; 

		      
		        String firstName =firstNameTextfFieldCus.getText() ;
		        if (firstName.isEmpty()) {
		            missingInfo = true; 
		        } else {
		            cus.setFirstName(firstName);
		        }

		    
		        String lastName = lastNameTextfFieldCus.getText();
		        if (lastName.isEmpty()) {
		            missingInfo = true; 
		        } else {
		            cus.setLastName(lastName);
		        }

		        
		        java.util.Date selectedDate = dateChooser_2.getDate();
		        if (selectedDate == null) {
		            missingInfo = true;
		        } else {
		            java.time.LocalDate dobld = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		            cus.setDob(dobld);
		        }

		     

		      
		        if (missingInfo) {
		            JOptionPane.showMessageDialog(null, "Please enter complete information.", "Message", JOptionPane.WARNING_MESSAGE);
		        } else {
		           
		            cus.setAddress(addressTextfFieldCus.getText());
		            cus.setPhoneNb(phoneNBTextfFieldCus.getText());
		            cus.setGender(customerMALE.isSelected());

		            CustomerDAO.insertCustomerToDb(cus);
		        }
		    }
		});
		
		reset_informationCUS = new JButton("⟲");
		reset_informationCUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNameTextfFieldCus.setText("");
            	lastNameTextfFieldCus.setText("");
            	dateChooser_2.setDate(null);
            	addressTextfFieldCus.setText("");
            	phoneNBTextfFieldCus.setText("");
            	idTextfFieldCus.setText("");
            	btnNewButton_3.setEnabled(false);
	            btnNewButton_4.setEnabled(false);
	            btnNewButton_8.setEnabled(true);
			}
		});

		GroupLayout gl_panel_24 = new GroupLayout(panel_24);
		gl_panel_24.setHorizontalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(gl_panel_24.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_24.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_24.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_24.createSequentialGroup()
							.addGroup(gl_panel_24.createParallelGroup(Alignment.LEADING, false)
								.addComponent(dateChooser_2, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
								.addComponent(idTextfFieldCus, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
								.addComponent(phoneNBTextfFieldCus))
							.addGap(63)
							.addGroup(gl_panel_24.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName_1, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
								.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGender, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_24.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_24.createSequentialGroup()
									.addComponent(customerMALE, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(customerFEMALE, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_24.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lastNameTextfFieldCus, Alignment.LEADING)
									.addComponent(firstNameTextfFieldCus, Alignment.LEADING, 316, 316, Short.MAX_VALUE)))
							.addGap(418))
						.addGroup(gl_panel_24.createSequentialGroup()
							.addComponent(btnNewButton_8)
							.addGap(18)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(reset_informationCUS)
							.addGap(800))
						.addGroup(gl_panel_24.createSequentialGroup()
							.addComponent(addressTextfFieldCus, GroupLayout.PREFERRED_SIZE, 1009, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel_24.setVerticalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addGroup(gl_panel_24.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(idTextfFieldCus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFirstName)
						.addComponent(firstNameTextfFieldCus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_24.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_24.createSequentialGroup()
							.addGroup(gl_panel_24.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName_1)
								.addComponent(lastNameTextfFieldCus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addComponent(dateChooser_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11))
					.addGap(18)
					.addGroup(gl_panel_24.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_24.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_8)
							.addComponent(phoneNBTextfFieldCus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_24.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblGender)
							.addComponent(customerMALE)
							.addComponent(customerFEMALE)))
					.addGap(18)
					.addGroup(gl_panel_24.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_9)
						.addComponent(addressTextfFieldCus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_24.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_8)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_3)
						.addComponent(reset_informationCUS))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		lblCusInfor = new JLabel("CUSTOMER INFORMATION");
		lblCusInfor.setForeground(Color.RED);
		lblCusInfor.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel.add(lblCusInfor);
		panel_24.setLayout(gl_panel_24);
		GroupLayout gl_customerPanel = new GroupLayout(customerPanel);
		gl_customerPanel.setHorizontalGroup(
			gl_customerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_customerPanel.createSequentialGroup()
					.addGroup(gl_customerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_customerPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(panel_18, 0, 0, Short.MAX_VALUE))
						.addGroup(gl_customerPanel.createSequentialGroup()
							.addGap(32)
							.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 1302, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_customerPanel.setVerticalGroup(
			gl_customerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_customerPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(550, Short.MAX_VALUE))
		);
		customerPanel.setLayout(gl_customerPanel);
		
		panel_44 = new JPanel();
		tabbedMainPanel.addTab("MedicineIventory", null, panel_44, null);
		
		panel_45 = new JPanel();
		
		lblMedicineIventory = new JLabel("MEDICINE IVENTORY");
		lblMedicineIventory.setForeground(Color.RED);
		lblMedicineIventory.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel_45.add(lblMedicineIventory);
		
		Supplier = new JPanel();
		Supplier.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		lblIdunit = new JLabel("Status");
		lblIdunit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblIdmedin = new JLabel("IdMedin");
		lblIdmedin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		comboBox_3 = new JComboBox();
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblSellingprice = new JLabel("SellingPrice");
		lblSellingprice.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblIdunit_1 = new JLabel("IdUnit");
		lblIdunit_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		JComboBox comboBox_3_1 = new JComboBox();
		JButton btnNewButton_20 = new JButton("Save");
		
		
		btnNewButton_10_4 = new JButton("⟲");
		btnNewButton_10_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
				
			            
			   model.addElement("In Stock");
			   model.addElement("Out Stock");
			   model.addElement("Returns");
			    
			   comboBox_3.setModel(model);
			}
		});
		
		btnNewButton_10_5 = new JButton("⟲");
		btnNewButton_10_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var units = UnitDAO.getListUnits();
				DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
				
				units.forEach(unit -> model.addElement(unit.getNameUnit()+"(id:"+unit.getIdUnit()+")"));
				   
				    
				comboBox_3_1.setModel(model);
			}
		});
		
		btnNewButton_10_7 = new JButton("⟲");
		
		
		
		GroupLayout gl_Supplier = new GroupLayout(Supplier);
		gl_Supplier.setHorizontalGroup(
			gl_Supplier.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Supplier.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Supplier.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Supplier.createSequentialGroup()
							.addGroup(gl_Supplier.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIdunit, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIdmedin, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuantity))
							.addGap(4)
							.addGroup(gl_Supplier.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_15)
								.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
								.addGroup(gl_Supplier.createSequentialGroup()
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNewButton_10_4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_Supplier.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSellingprice, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIdunit_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(gl_Supplier.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Supplier.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnNewButton_20, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_Supplier.createSequentialGroup()
										.addComponent(comboBox_3_1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_10_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(btnNewButton_10_7, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_Supplier.setVerticalGroup(
			gl_Supplier.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Supplier.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Supplier.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdmedin, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSellingprice, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Supplier.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantity, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdunit_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox_3_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_10_5))
					.addGroup(gl_Supplier.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Supplier.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_Supplier.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdunit, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_10_4))
							.addGap(18)
							.addComponent(btnNewButton_10_7)
							.addGap(58))
						.addGroup(gl_Supplier.createSequentialGroup()
							.addGap(27)
							.addComponent(btnNewButton_20)
							.addContainerGap())))
		);
		Supplier.setLayout(gl_Supplier);
		
		panel_46 = new JPanel();
		panel_46.setBorder(new TitledBorder(null, "List Medicine Iventory", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel Supplier_1_1 = new JPanel();
		Supplier_1_1.setBorder(new TitledBorder(null, "Supplier", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblSypplydate_1 = new JLabel("Sypply_date");
		lblSypplydate_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblInncode_1 = new JLabel("INNCode");
		lblInncode_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblExpirationdate_1 = new JLabel("ExpirationDate");
		lblExpirationdate_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblIdSupplier_1 = new JLabel("IdSupplier");
		lblIdSupplier_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblIdsupply_2 = new JLabel("idSupply");
		lblIdsupply_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblProductiondate_1 = new JLabel("ProductionDate");
		lblProductiondate_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JDateChooser datechooserExpriationdate_1 = new JDateChooser();
		datechooserExpriationdate_1.setEnabled(false);
		JDateChooser datechooserSupplyDate_1 = new JDateChooser();
		datechooserSupplyDate_1.setEnabled(false);
		JDateChooser datechooserProductionDate_1 = new JDateChooser();
		datechooserProductionDate_1.setEnabled(false);
		btnNewButton_10_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_13.setText("");
            	textField_16.setText("");
            	textField_15.setText("");
            	textField_15.setText("");
            	textField.setText("");
            	textField_4.setText("");
            	textField_3.setText("");
            	textField_1.setText("");
            	textField_10.setText("");
            	datechooserSupplyDate_1.setDate(null);
            	datechooserProductionDate_1.setDate(null);
            	datechooserExpriationdate_1.setDate(null);
            	textField_13.setText("");
            	textField_16.setText("");
            	textField_15.setText("");
            	textField_17.setText("");
			}
		});
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
	            
	            if (choice == JOptionPane.YES_OPTION) {
	            	int idmedin = Integer.parseInt(textField_13.getText());
	            	float sellingPrice = Float.parseFloat(textField_16.getText());
	            	int quantity = Integer.parseInt(textField_15.getText());
	            	
	            	String selectedValue = (String) comboBox_3_1.getSelectedItem();
	            	Integer idunit = null;

	            	if (selectedValue != null) {
	            	    int openingBracketIndex = selectedValue.lastIndexOf("(");
	            	    int closingBracketIndex = selectedValue.lastIndexOf(")");

	            	    if (openingBracketIndex != -1 && closingBracketIndex != -1 && openingBracketIndex < closingBracketIndex) {
	            	        try {
	            	            String idString = selectedValue.substring(openingBracketIndex + 4, closingBracketIndex);
	            	            idunit = Integer.parseInt(idString);
	            	        } catch (NumberFormatException e1) {
	            	            
	            	        }
	            	    }
	            	}

	            	String status = (String) comboBox_3.getSelectedItem();
	            	

	            	var check = MedicineInventoryDAO.updateMedicineInventory(idmedin, sellingPrice,idunit, quantity, status);
	            	if (check) {
	            		JOptionPane.showMessageDialog(null, "Success");
		            	textField_13.setText("");
		            	textField_16.setText("");
		            	textField_15.setText("");
		            	textField_15.setText("");
		            	textField.setText("");
		            	textField_4.setText("");
		            	textField_3.setText("");
		            	textField_1.setText("");
		            	textField_10.setText("");
		            	datechooserSupplyDate_1.setDate(null);
		            	datechooserProductionDate_1.setDate(null);
		            	datechooserExpriationdate_1.setDate(null);
		            	textField_13.setText("");
		            	textField_16.setText("");
		            	textField_15.setText("");
		            	textField_17.setText("");
	            	}
	            	
	            }
				

			}
		});
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		
		JLabel lblQuantitypelletslnbox_1 = new JLabel("Quantity(pellet1box)");
		lblQuantitypelletslnbox_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblQuantitybox_1 = new JLabel("Quantity(Box)");
		lblQuantitybox_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblCostprice_1 = new JLabel("CostPrice");
		lblCostprice_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		GroupLayout gl_Supplier_1_1 = new GroupLayout(Supplier_1_1);
		gl_Supplier_1_1.setHorizontalGroup(
			gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Supplier_1_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Supplier_1_1.createSequentialGroup()
							.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblInncode_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIdSupplier_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblIdsupply_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
								.addComponent(lblProductiondate_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(4)
							.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_17, Alignment.LEADING)
									.addComponent(textField_10, Alignment.LEADING)
									.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
								.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_Supplier_1_1.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(datechooserSupplyDate_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addComponent(datechooserProductionDate_1, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
							.addGap(18)
							.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblExpirationdate_1, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
								.addComponent(lblCostprice_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuantitypelletslnbox_1)
								.addComponent(lblQuantitybox_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Supplier_1_1.createSequentialGroup()
							.addComponent(lblSypplydate_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(298)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_1)
							.addComponent(textField_3)
							.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
						.addComponent(datechooserExpriationdate_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Supplier_1_1.setVerticalGroup(
			gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Supplier_1_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdsupply_2, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQuantitybox_1, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Supplier_1_1.createSequentialGroup()
							.addGap(16)
							.addComponent(lblIdSupplier_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblInncode_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_Supplier_1_1.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuantitypelletslnbox_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCostprice_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSypplydate_1)
						.addGroup(gl_Supplier_1_1.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblExpirationdate_1)
								.addComponent(datechooserSupplyDate_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(datechooserExpriationdate_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Supplier_1_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProductiondate_1)
						.addComponent(datechooserProductionDate_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(74))
		);
		Supplier_1_1.setLayout(gl_Supplier_1_1);
		GroupLayout gl_panel_44 = new GroupLayout(panel_44);
		gl_panel_44.setHorizontalGroup(
			gl_panel_44.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_44.createSequentialGroup()
					.addGroup(gl_panel_44.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_44.createSequentialGroup()
							.addComponent(Supplier_1_1, GroupLayout.PREFERRED_SIZE, 590, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(Supplier, 0, 0, Short.MAX_VALUE))
						.addGroup(gl_panel_44.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_45, GroupLayout.PREFERRED_SIZE, 1292, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(2801, Short.MAX_VALUE))
				.addGroup(gl_panel_44.createSequentialGroup()
					.addComponent(panel_46, GroupLayout.DEFAULT_SIZE, 1297, Short.MAX_VALUE)
					.addGap(2809))
		);
		gl_panel_44.setVerticalGroup(
			gl_panel_44.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_44.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_45, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_44.createParallelGroup(Alignment.BASELINE)
						.addComponent(Supplier_1_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(Supplier, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_46, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(902, Short.MAX_VALUE))
		);
		
		btnNewButton_10_3 = new JButton("⟲");
		btnNewButton_10_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<MedicineInventory> list = MedicineInventoryDAO.getAllMedicineInventoryData();

				DefaultTableModel model = new DefaultTableModel() {
				    @Override
				    public boolean isCellEditable(int row, int column) {
				        return false;
				    }
				};

				model.addColumn("idSupply");
				model.addColumn("idSupplier");
				model.addColumn("INNCode");
				model.addColumn("supply_date");
				model.addColumn("productionDate");
				model.addColumn("ExpirationDate");
				model.addColumn("Quantity(box)");
				model.addColumn("Quantity(pelletsIn1Box)");
				model.addColumn("CostPrice");
				model.addColumn("idMedin");
				model.addColumn("SellingPrice");
				model.addColumn("idUnit");
				model.addColumn("Quantity");
				model.addColumn("Status");

				list.forEach(medicineInventory -> {
				    model.addRow(new Object[] {
				        medicineInventory.getIdSupply(),
				        medicineInventory.getIdSupplier(),
				        medicineInventory.getiNNCode(),
				        medicineInventory.getSupply_date(),
				        medicineInventory.getProductionDate(),
				        medicineInventory.getExpirationDate(),
				        medicineInventory.getQuantityBox(),
				        medicineInventory.getQuantityPelletsIn1Box(),
				        medicineInventory.getCostPrice(),
				        medicineInventory.getIdMedin(),
				        medicineInventory.getSellingPrice(),
				        medicineInventory.getIdUnit(),
				        medicineInventory.getQuantity(),
				        medicineInventory.getStatus()
				    });
				});

				tableMedicineInventory.setModel(model);
			}
		});
		
		panel_47 = new JPanel();
		
		JButton btnNewButton_10_3_1 = new JButton("Product is about to expire");
		btnNewButton_10_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<MedicineInventory> list = MedicineInventoryDAO.getExpiringMedicineInventory();

				DefaultTableModel model = new DefaultTableModel() {
				    @Override
				    public boolean isCellEditable(int row, int column) {
				        return false;
				    }
				};

				model.addColumn("idSupply");
				model.addColumn("idSupplier");
				model.addColumn("INNCode");
				model.addColumn("supply_date");
				model.addColumn("productionDate");
				model.addColumn("ExpirationDate");
				model.addColumn("Quantity(box)");
				model.addColumn("Quantity(pelletsIn1Box)");
				model.addColumn("CostPrice");
				model.addColumn("idMedin");
				model.addColumn("SellingPrice");
				model.addColumn("idUnit");
				model.addColumn("Quantity");
				model.addColumn("Status");

				list.forEach(medicineInventory -> {
				    model.addRow(new Object[] {
				        medicineInventory.getIdSupply(),
				        medicineInventory.getIdSupplier(),
				        medicineInventory.getiNNCode(),
				        medicineInventory.getSupply_date(),
				        medicineInventory.getProductionDate(),
				        medicineInventory.getExpirationDate(),
				        medicineInventory.getQuantityBox(),
				        medicineInventory.getQuantityPelletsIn1Box(),
				        medicineInventory.getCostPrice(),
				        medicineInventory.getIdMedin(),
				        medicineInventory.getSellingPrice(),
				        medicineInventory.getIdUnit(),
				        medicineInventory.getQuantity(),
				        medicineInventory.getStatus()
				    });
				});

				tableMedicineInventory.setModel(model);
			}
		});
		GroupLayout gl_panel_46 = new GroupLayout(panel_46);
		gl_panel_46.setHorizontalGroup(
			gl_panel_46.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_46.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_46.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_47, GroupLayout.PREFERRED_SIZE, 1231, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_46.createSequentialGroup()
							.addComponent(btnNewButton_10_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_10_3_1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_panel_46.setVerticalGroup(
			gl_panel_46.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_46.createSequentialGroup()
					.addGroup(gl_panel_46.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_10_3)
						.addComponent(btnNewButton_10_3_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_47, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
		);
		panel_47.setLayout(new BorderLayout(0, 0));
		
		scrollPane_6 = new JScrollPane();
		panel_47.add(scrollPane_6, BorderLayout.CENTER);
		
		tableMedicineInventory = new JTable();
		scrollPane_6.setViewportView(tableMedicineInventory);
		tableMedicineInventory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tableMedicineInventory.getSelectedRow();
		            if (selectedRow >= 0) {
		            	textField.setText(tableMedicineInventory.getValueAt(selectedRow, 0).toString());
		                
		            	datechooserSupplyDate_1.setDate(Date.valueOf(((java.time.LocalDate) tableMedicineInventory.getValueAt(selectedRow, 3))));
		            	datechooserProductionDate_1.setDate(Date.valueOf((java.time.LocalDate) tableMedicineInventory.getValueAt(selectedRow, 4)));
		            	datechooserExpriationdate_1.setDate(Date.valueOf((java.time.LocalDate) tableMedicineInventory.getValueAt(selectedRow, 5)));

		            	textField_4.setText(tableMedicineInventory.getValueAt(selectedRow, 6).toString());
		            	textField_3.setText(tableMedicineInventory.getValueAt(selectedRow, 7).toString());
		            	textField_1.setText(tableMedicineInventory.getValueAt(selectedRow, 8).toString());


		            	
		            	var supplier = SupplierDAO.getSupplierById(Integer.parseInt(tableMedicineInventory.getValueAt(selectedRow, 1).toString()));
					
		            	textField_10.setText(supplier.getNameSupplier()+"(id:"+supplier.getIdSupplier()+")");  
						
						
						var med = MedicineDAO.searchMedicineByINNCode(tableMedicineInventory.getValueAt(selectedRow, 2).toString());
						StringBuilder medhaha = new StringBuilder();
						med.forEach(meddd -> medhaha.append(meddd.getNameMedin()).append("(id:").append(meddd.getiNNcode()).append(")"));
						textField_17.setText(medhaha.toString());
						try {
							textField_13.setText(tableMedicineInventory.getValueAt(selectedRow, 9).toString());
							textField_16.setText(tableMedicineInventory.getValueAt(selectedRow, 10).toString());
							textField_15.setText(tableMedicineInventory.getValueAt(selectedRow, 12).toString());
							
							DefaultComboBoxModel<String> model = new DefaultComboBoxModel();
							model.addElement(tableMedicineInventory.getValueAt(selectedRow, 13).toString());
							comboBox_3.setModel(model);
							
							var unit = UnitDAO.getUnitById(Integer.parseInt(tableMedicineInventory.getValueAt(selectedRow, 11).toString()));
							DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
							model1.addElement(unit.getNameUnit()+"(id:"+unit.getIdUnit()+")");  
							comboBox_3_1.setModel(model1);
							
						} catch (Exception e2) {
							
						}
						
		            }
		        }
		    }
		});
		panel_46.setLayout(gl_panel_46);
		panel_44.setLayout(gl_panel_44);
		
		supplierInvoicePanel = new JPanel();
		tabbedMainPanel.addTab("SupplierInvoice", null, supplierInvoicePanel, null);
		
		panel_22 = new JPanel();
		
		Supplier_1 = new JPanel();
		Supplier_1.setBorder(new TitledBorder(null, "Supplier", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_42 = new JPanel();
		panel_42.setBorder(new TitledBorder(null, "List SupplierInvoice", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_supplierInvoicePanel = new GroupLayout(supplierInvoicePanel);
		gl_supplierInvoicePanel.setHorizontalGroup(
			gl_supplierInvoicePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_supplierInvoicePanel.createSequentialGroup()
					.addGroup(gl_supplierInvoicePanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_22, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1358, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_supplierInvoicePanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(Supplier_1, 0, 0, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
							.addGap(12)))
					.addGap(1832))
				.addGroup(gl_supplierInvoicePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_42, GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
					.addGap(2760))
		);
		gl_supplierInvoicePanel.setVerticalGroup(
			gl_supplierInvoicePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_supplierInvoicePanel.createSequentialGroup()
					.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_supplierInvoicePanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(Supplier_1, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_42, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(766, Short.MAX_VALUE))
		);
		
		btnNewButton_10_2 = new JButton("⟲");
		btnNewButton_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<SupplierInvoice> list = SupplierInvoiceDAO.getAllSupplierInvoices(); 

			    DefaultTableModel model = new DefaultTableModel() {
			        @Override
			        public boolean isCellEditable(int row, int column) {
			            return false;
			        }
			    };

			    model.addColumn("idSupply");
			    model.addColumn("idSupplier");
			    model.addColumn("INNCode");
			    model.addColumn("supply_date");
			    model.addColumn("productionDate");
			    model.addColumn("ExpirationDate");
			    model.addColumn("Quantity(box)");
			    model.addColumn("Quantity(pelletsIn1Box)");
			    model.addColumn("CostPrice");

			    list.forEach(supplierInvoice -> {
			        model.addRow(new Object[] {
			            supplierInvoice.getIdSupply(),
			            supplierInvoice.getIdSupplier(),
			            supplierInvoice.getiNNCode(),
			            supplierInvoice.getSupply_date(),
			            supplierInvoice.getProductionDate(),
			            supplierInvoice.getExpirationDate(),
			            supplierInvoice.getQuantityBox(),
			            supplierInvoice.getQuantityPelletsIn1Box(),
			            supplierInvoice.getCostPrice()
			        });
			    });

			    tableSupplierInvoice.setModel(model);
			}
		});
		
		panel_43 = new JPanel();
		GroupLayout gl_panel_42 = new GroupLayout(panel_42);
		gl_panel_42.setHorizontalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_42.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_42.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_43, GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
						.addComponent(btnNewButton_10_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_42.setVerticalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_42.createSequentialGroup()
					.addComponent(btnNewButton_10_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_43, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel_43.setLayout(new BorderLayout(0, 0));
		
		scrollPane_5 = new JScrollPane();
		panel_43.add(scrollPane_5, BorderLayout.CENTER);
		
		
		panel_42.setLayout(gl_panel_42);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		JLabel lblEnterInformation = new JLabel("Enter Information");
		lblEnterInformation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Id");
		buttonGroup_9.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtnName = new JRadioButton("supplyday");
		buttonGroup_9.add(rdbtnName);
		rdbtnName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JRadioButton rdbtnSupplierid = new JRadioButton("supplierId");
		buttonGroup_9.add(rdbtnSupplierid);
		rdbtnSupplierid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JDateChooser datechooserSupplyDate_3 = new JDateChooser();
		JButton btnNewButton_16 = new JButton("Search");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					try {
						List<SupplierInvoice> list = SupplierInvoiceDAO.searchSupplierInvoiceByIdSupply(Integer.parseInt(textField_12.getText())); 

					    DefaultTableModel model = new DefaultTableModel() {
					        @Override
					        public boolean isCellEditable(int row, int column) {
					            return false;
					        }
					    };

					    model.addColumn("idSupply");
					    model.addColumn("idSupplier");
					    model.addColumn("INNCode");
					    model.addColumn("supply_date");
					    model.addColumn("productionDate");
					    model.addColumn("ExpirationDate");
					    model.addColumn("Quantity(box)");
					    model.addColumn("Quantity(pelletsIn1Box)");
					    model.addColumn("CostPrice");

					    list.forEach(supplierInvoice -> {
					        model.addRow(new Object[] {
					            supplierInvoice.getIdSupply(),
					            supplierInvoice.getIdSupplier(),
					            supplierInvoice.getiNNCode(),
					            supplierInvoice.getSupply_date(),
					            supplierInvoice.getProductionDate(),
					            supplierInvoice.getExpirationDate(),
					            supplierInvoice.getQuantityBox(),
					            supplierInvoice.getQuantityPelletsIn1Box(),
					            supplierInvoice.getCostPrice()
					        });
					    });

					    tableSupplierInvoice.setModel(model);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Just Number", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
				}else if(rdbtnSupplierid.isSelected()){
					try {
						List<SupplierInvoice> list = SupplierInvoiceDAO.searchSupplierInvoiceByIdSupplier(Integer.parseInt(textField_12.getText())); 

					    DefaultTableModel model = new DefaultTableModel() {
					        @Override
					        public boolean isCellEditable(int row, int column) {
					            return false;
					        }
					    };

					    model.addColumn("idSupply");
					    model.addColumn("idSupplier");
					    model.addColumn("INNCode");
					    model.addColumn("supply_date");
					    model.addColumn("productionDate");
					    model.addColumn("ExpirationDate");
					    model.addColumn("Quantity(box)");
					    model.addColumn("Quantity(pelletsIn1Box)");
					    model.addColumn("CostPrice");

					    list.forEach(supplierInvoice -> {
					        model.addRow(new Object[] {
					            supplierInvoice.getIdSupply(),
					            supplierInvoice.getIdSupplier(),
					            supplierInvoice.getiNNCode(),
					            supplierInvoice.getSupply_date(),
					            supplierInvoice.getProductionDate(),
					            supplierInvoice.getExpirationDate(),
					            supplierInvoice.getQuantityBox(),
					            supplierInvoice.getQuantityPelletsIn1Box(),
					            supplierInvoice.getCostPrice()
					        });
					    });

					    tableSupplierInvoice.setModel(model);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Just Number", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
				}else if(rdbtnName.isSelected()) {
					try {
						java.util.Date selectedDate = datechooserSupplyDate_3.getDate();
						java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
						LocalDate localDate = sqlDate.toLocalDate();
						
						List<SupplierInvoice> list = SupplierInvoiceDAO.searchSupplierInvoiceBySupplyDate(localDate); 

					    DefaultTableModel model = new DefaultTableModel() {
					        @Override
					        public boolean isCellEditable(int row, int column) {
					            return false;
					        }
					    };

					    model.addColumn("idSupply");
					    model.addColumn("idSupplier");
					    model.addColumn("INNCode");
					    model.addColumn("supply_date");
					    model.addColumn("productionDate");
					    model.addColumn("ExpirationDate");
					    model.addColumn("Quantity(box)");
					    model.addColumn("Quantity(pelletsIn1Box)");
					    model.addColumn("CostPrice");

					    list.forEach(supplierInvoice -> {
					        model.addRow(new Object[] {
					            supplierInvoice.getIdSupply(),
					            supplierInvoice.getIdSupplier(),
					            supplierInvoice.getiNNCode(),
					            supplierInvoice.getSupply_date(),
					            supplierInvoice.getProductionDate(),
					            supplierInvoice.getExpirationDate(),
					            supplierInvoice.getQuantityBox(),
					            supplierInvoice.getQuantityPelletsIn1Box(),
					            supplierInvoice.getCostPrice()
					        });
					    });

					    tableSupplierInvoice.setModel(model);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Error", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Choose Option", "Message", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		
		
		
		GroupLayout gl_panel_28 = new GroupLayout(panel_28);
		gl_panel_28.setHorizontalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_28.createSequentialGroup()
					.addGap(23)
					.addComponent(lblEnterInformation, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_28.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_16, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_28.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnSupplierid, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
									.addComponent(rdbtnName, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(65, Short.MAX_VALUE))
						.addGroup(gl_panel_28.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(datechooserSupplyDate_3, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel_28.setVerticalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_28.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING, false)
						.addComponent(datechooserSupplyDate_3, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
						.addGroup(gl_panel_28.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblEnterInformation, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_28.createSequentialGroup()
							.addGroup(gl_panel_28.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnSupplierid, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(btnNewButton_16))
						.addComponent(rdbtnName, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		panel_28.setLayout(gl_panel_28);
		
		JLabel lblIdSupplier = new JLabel("IdSupplier");
		lblIdSupplier.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblIdsupply = new JLabel("idSupply");
		lblIdsupply.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblInncode = new JLabel("INNCode");
		lblInncode.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textFieldidsupply = new JTextField();
		textFieldidsupply.setBackground(Color.WHITE);
		textFieldidsupply.setEditable(false);
		textFieldidsupply.setColumns(10);
		
		lblSypplydate = new JLabel("Sypply_date");
		lblSypplydate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblProductiondate = new JLabel("ProductionDate");
		lblProductiondate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblExpirationdate = new JLabel("ExpirationDate");
		lblExpirationdate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblQuantitybox = new JLabel("Quantity(Box)");
		lblQuantitybox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblQuantitypelletslnbox = new JLabel("Quantity(pellet1box)");
		lblQuantitypelletslnbox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblCostprice = new JLabel("CostPrice");
		lblCostprice.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JDateChooser datechooserSupplyDate = new JDateChooser();
		
		JDateChooser datechooserProductionDate = new JDateChooser();
		
		JDateChooser datechooserExpriationdate = new JDateChooser();
		
		textFieldquantityBOX = new JTextField();
		textFieldquantityBOX.setColumns(10);
		
		textFieldPelletInBox = new JTextField();
		textFieldPelletInBox.setColumns(10);
		
		textFieldCostPrice = new JTextField();
		textFieldCostPrice.setColumns(10);
		JComboBox comboBox_2inncode = new JComboBox();
		tableSupplierInvoice = new JTable();
		scrollPane_5.setViewportView(tableSupplierInvoice);
		tableSupplierInvoice.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tableSupplierInvoice.getSelectedRow();
		            if (selectedRow >= 0) {
		            	textFieldidsupply.setText(tableSupplierInvoice.getValueAt(selectedRow, 0).toString());
		                
		            	datechooserSupplyDate.setDate(Date.valueOf(((java.time.LocalDate) tableSupplierInvoice.getValueAt(selectedRow, 3))));
		            	datechooserProductionDate.setDate(Date.valueOf((java.time.LocalDate) tableSupplierInvoice.getValueAt(selectedRow, 4)));
		            	datechooserExpriationdate.setDate(Date.valueOf((java.time.LocalDate) tableSupplierInvoice.getValueAt(selectedRow, 5)));

		                textFieldquantityBOX.setText(tableSupplierInvoice.getValueAt(selectedRow, 6).toString());
		                textFieldPelletInBox.setText(tableSupplierInvoice.getValueAt(selectedRow, 7).toString());
		                textFieldCostPrice.setText(tableSupplierInvoice.getValueAt(selectedRow, 8).toString());

		                btnNewButton_18.setEnabled(true);
		                btnNewButton_19.setEnabled(true);
		            	btnNewButton_17.setEnabled(false);
		            	
		            	
		            	var supplier = SupplierDAO.getSupplierById(Integer.parseInt(tableSupplierInvoice.getValueAt(selectedRow, 1).toString()));
						DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
					    model.addElement(supplier.getNameSupplier()+"(id:"+supplier.getIdSupplier()+")");  
						comboBox_4supplier.setModel(model);
						
						var med = MedicineDAO.searchMedicineByINNCode(tableSupplierInvoice.getValueAt(selectedRow, 2).toString());
						DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
						med.forEach(meddd -> model1.addElement(meddd.getNameMedin()+"(id:"+meddd.getiNNcode()+")"));
					    comboBox_2inncode.setModel(model1);
			            
		            }
		        }
		    }
		});
		btnNewButton_17 = new JButton("Add");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var sui = new SupplierInvoice();
		        boolean missingInfo = false; 

		      
		        String quantity_box =textFieldquantityBOX.getText() ;
		        if (quantity_box.isEmpty()) {
		            missingInfo = true; 
		        } else {
		        	sui.setQuantityBox(Integer.parseInt(quantity_box));
		        }

		    
		        String quanntity_pelellet1box = textFieldPelletInBox.getText();
		        if (quanntity_pelellet1box.isEmpty()) {
		            missingInfo = true; 
		        } else {
		        	sui.setQuantityPelletsIn1Box(Integer.parseInt(quanntity_pelellet1box));
		        }
		        String costPrice = textFieldCostPrice.getText();
		        if (costPrice.isEmpty()) {
		            missingInfo = true; 
		        } else {
		        	sui.setCostPrice(Float.parseFloat(costPrice));
		        }
		        
		        java.util.Date supplydate = datechooserSupplyDate.getDate();
		        if (supplydate == null) {
		            missingInfo = true;
		        } else {
		            java.time.LocalDate dobld = supplydate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		            sui.setSupply_date(dobld);
		        }
		        java.util.Date dateproduction = datechooserProductionDate.getDate();
		        if (dateproduction == null) {
		            missingInfo = true;
		        } else {
		            java.time.LocalDate dobld = dateproduction.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		            sui.setProductionDate(dobld);
		        }
		        java.util.Date dateExprire = datechooserExpriationdate.getDate();
		        if (dateExprire == null) {
		            missingInfo = true;
		        } else {
		            java.time.LocalDate dobld = dateExprire.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		            sui.setExpirationDate(dobld);
		        }

		   
		        String selectedValue = (String) comboBox_4supplier.getSelectedItem();

		        int id = -1; 
		        if (selectedValue != null) {
		           
		            String regex = "\\(id:(\\d+)\\)";
		            Pattern pattern = Pattern.compile(regex);
		            Matcher matcher = pattern.matcher(selectedValue);
		            if (matcher.find()) {
		                String idString = matcher.group(1); 
		                id = Integer.parseInt(idString);
		            }
		        }

		        sui.setIdSupplier(id);

		  
		        String selectedValue1 = (String) comboBox_2inncode.getSelectedItem();

		    
		        String id1 = null; 
		        if (selectedValue1 != null) {
		           
		            String regex1 = "\\(id:(.*?)\\)";
		            Pattern pattern1 = Pattern.compile(regex1);
		            Matcher matcher1 = pattern1.matcher(selectedValue1);
		            if (matcher1.find()) {
		                id1 = matcher1.group(1); 
		            }
		        }
		        sui.setiNNCode(id1);

		        if (missingInfo) {
		            JOptionPane.showMessageDialog(null, "Hãy nhập đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
		        } else {
		        	if (sui.getProductionDate().isAfter(sui.getExpirationDate())) {
		        		 JOptionPane.showMessageDialog(null, "Hãy nhập đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
		            }else {
		            	SupplierInvoiceDAO.insertSupplierInvoice(sui);
		            	DefaultComboBoxModel<String> modelaa = new DefaultComboBoxModel<>();
		            	textFieldidsupply.setText("");
		            	comboBox_4supplier.setModel(modelaa);
		            	comboBox_2inncode.setModel(modelaa);
		            	datechooserSupplyDate.setDate(null);
		            	datechooserProductionDate.setDate(null);
		            	datechooserExpriationdate.setDate(null);
		            	textFieldquantityBOX.setText("");
		            	textFieldPelletInBox.setText("");
		            	textFieldCostPrice.setText("");
		            	btnNewButton_17.setEnabled(true);
		            	btnNewButton_19.setEnabled(false);
		            	btnNewButton_18.setEnabled(false);
		            }
		        
		        }
			}
		});
		
		btnNewButton_18 = new JButton("Update");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục?", "Hỏi", JOptionPane.YES_NO_OPTION);
	            
	            if (choice == JOptionPane.YES_OPTION) {
				var sui = new SupplierInvoice();
		        boolean missingInfo = false; 

		        sui.setIdSupply(Integer.parseInt(textFieldidsupply.getText()));
		        String quantity_box =textFieldquantityBOX.getText() ;
		        if (quantity_box.isEmpty()) {
		            missingInfo = true; 
		        } else {
		        	sui.setQuantityBox(Integer.parseInt(quantity_box));
		        }

		    
		        String quanntity_pelellet1box = textFieldPelletInBox.getText();
		        if (quanntity_pelellet1box.isEmpty()) {
		            missingInfo = true; 
		        } else {
		        	sui.setQuantityPelletsIn1Box(Integer.parseInt(quanntity_pelellet1box));
		        }
		        String costPrice = textFieldCostPrice.getText();
		        if (costPrice.isEmpty()) {
		            missingInfo = true; 
		        } else {
		        	sui.setCostPrice(Float.parseFloat(costPrice));
		        }
		        
		        java.util.Date supplydate = datechooserSupplyDate.getDate();
		        if (supplydate == null) {
		            missingInfo = true;
		        } else {
		            java.time.LocalDate dobld = supplydate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		            sui.setSupply_date(dobld);
		        }
		        java.util.Date dateproduction = datechooserProductionDate.getDate();
		        if (dateproduction == null) {
		            missingInfo = true;
		        } else {
		            java.time.LocalDate dobld = dateproduction.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		            sui.setProductionDate(dobld);
		        }
		        java.util.Date dateExprire = datechooserExpriationdate.getDate();
		        if (dateExprire == null) {
		            missingInfo = true;
		        } else {
		            java.time.LocalDate dobld = dateExprire.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		            sui.setExpirationDate(dobld);
		        }

		   
		        String selectedValue = (String) comboBox_4supplier.getSelectedItem();

		        int id = -1; 
		        if (selectedValue != null) {
		           
		            String regex = "\\(id:(\\d+)\\)";
		            Pattern pattern = Pattern.compile(regex);
		            Matcher matcher = pattern.matcher(selectedValue);
		            if (matcher.find()) {
		                String idString = matcher.group(1); 
		                id = Integer.parseInt(idString);
		            }
		        }

		        sui.setIdSupplier(id);

		  
		        String selectedValue1 = (String) comboBox_2inncode.getSelectedItem();

		    
		        String id1 = null; 
		        if (selectedValue1 != null) {
		           
		            String regex1 = "\\(id:(.*?)\\)";
		            Pattern pattern1 = Pattern.compile(regex1);
		            Matcher matcher1 = pattern1.matcher(selectedValue1);
		            if (matcher1.find()) {
		                id1 = matcher1.group(1); 
		            }
		        }
		        sui.setiNNCode(id1);

		        if (missingInfo) {
		            JOptionPane.showMessageDialog(null, "Hãy nhập đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
		        } else {
		        	if (sui.getProductionDate().isAfter(sui.getExpirationDate())) {
		        		 JOptionPane.showMessageDialog(null, "Hãy nhập đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
		            }else {
		            	SupplierInvoiceDAO.updateSupplierInvoice(sui);
		            	DefaultComboBoxModel<String> modelaa = new DefaultComboBoxModel<>();
		            	textFieldidsupply.setText("");
		            	comboBox_4supplier.setModel(modelaa);
		            	comboBox_2inncode.setModel(modelaa);
		            	datechooserSupplyDate.setDate(null);
		            	datechooserProductionDate.setDate(null);
		            	datechooserExpriationdate.setDate(null);
		            	textFieldquantityBOX.setText("");
		            	textFieldPelletInBox.setText("");
		            	textFieldCostPrice.setText("");
		            	btnNewButton_18.setEnabled(true);
		            	btnNewButton_19.setEnabled(false);
		            	btnNewButton_18.setEnabled(false);
		            }
		        
		        }
			}
		}
		});
		btnNewButton_18.setEnabled(false);
		btnNewButton_19 = new JButton("Delete");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					var check = SupplierInvoiceDAO.deleteSupplierInvoice(Integer.parseInt(textFieldidsupply.getText()));
					if(check) {
						DefaultComboBoxModel<String> modelaa = new DefaultComboBoxModel<>();
		            	textFieldidsupply.setText("");
		            	comboBox_4supplier.setModel(modelaa);
		            	comboBox_2inncode.setModel(modelaa);
		            	datechooserSupplyDate.setDate(null);
		            	datechooserProductionDate.setDate(null);
		            	datechooserExpriationdate.setDate(null);
		            	textFieldquantityBOX.setText("");
		            	textFieldPelletInBox.setText("");
		            	textFieldCostPrice.setText("");
		            	btnNewButton_18.setEnabled(true);
		            	btnNewButton_19.setEnabled(false);
		            	btnNewButton_18.setEnabled(false);
		            	JOptionPane.showMessageDialog(null, "Success");
					}else {
						JOptionPane.showMessageDialog(null, "The item is not in \"Returns\" status or has been sold");
					}
	            	
				}
			}
		});
		btnNewButton_19.setEnabled(false);
		
	
		
		JButton btnNewButton_10_2_1 = new JButton("⟲");
		btnNewButton_10_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Medicine> list = MedicineDAO.getAllMedicineData();
				DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
				 list.forEach(med -> {
			            
			            model.addElement(med.getNameMedin()+"(id:"+med.getiNNcode()+")");
			        });
				 comboBox_2inncode.setModel(model);
			}
		});
		
		comboBox_4supplier = new JComboBox();
		
		btnNewButton_10_2_3 = new JButton("⟲");
		btnNewButton_10_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					List<Supplier> list = SupplierDAO.getListSuppliers();
					DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
					 list.forEach(supp -> {
				            
				            model.addElement(supp.getNameSupplier()+"(id:"+supp.getIdSupplier()+")");
				        });
					 comboBox_4supplier.setModel(model);
				
			}
		});
		
		btnNewButton_10_6 = new JButton("⟲");
		btnNewButton_10_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel<String> modelaa = new DefaultComboBoxModel<>();
            	textFieldidsupply.setText("");
            	comboBox_4supplier.setModel(modelaa);
            	comboBox_2inncode.setModel(modelaa);
            	datechooserSupplyDate.setDate(null);
            	datechooserProductionDate.setDate(null);
            	datechooserExpriationdate.setDate(null);
            	textFieldquantityBOX.setText("");
            	textFieldPelletInBox.setText("");
            	textFieldCostPrice.setText("");
            	btnNewButton_17.setEnabled(true);
            	btnNewButton_19.setEnabled(false);
            	btnNewButton_18.setEnabled(false);
			}
		});
		GroupLayout gl_Supplier_1 = new GroupLayout(Supplier_1);
		gl_Supplier_1.setHorizontalGroup(
			gl_Supplier_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Supplier_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblSypplydate, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_Supplier_1.createSequentialGroup()
								.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblInncode, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblExpirationdate, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
									.addComponent(lblIdSupplier, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblIdsupply, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
									.addComponent(lblProductiondate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(4)
								.addGroup(gl_Supplier_1.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(datechooserExpriationdate, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
										.addGroup(gl_Supplier_1.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(datechooserSupplyDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(datechooserProductionDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(gl_Supplier_1.createSequentialGroup()
										.addComponent(comboBox_2inncode, 0, 204, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_10_2_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
									.addComponent(textFieldidsupply)
									.addGroup(gl_Supplier_1.createSequentialGroup()
										.addComponent(comboBox_4supplier, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_10_2_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_Supplier_1.createSequentialGroup()
										.addGap(83)
										.addComponent(btnNewButton_17)
										.addGap(18)
										.addComponent(btnNewButton_19)
										.addGap(18)
										.addComponent(btnNewButton_18))
									.addGroup(gl_Supplier_1.createSequentialGroup()
										.addGap(50)
										.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING)
											.addComponent(lblQuantitypelletslnbox)
											.addComponent(lblQuantitybox, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblCostprice, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textFieldCostPrice)
											.addComponent(textFieldPelletInBox)
											.addComponent(textFieldquantityBOX, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
								.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)))
						.addComponent(btnNewButton_10_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_Supplier_1.setVerticalGroup(
			gl_Supplier_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Supplier_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Supplier_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblIdsupply, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
							.addComponent(textFieldidsupply, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Supplier_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblQuantitybox, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
							.addComponent(textFieldquantityBOX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Supplier_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Supplier_1.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_Supplier_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblQuantitypelletslnbox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textFieldPelletInBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_Supplier_1.createSequentialGroup()
								.addGap(6)
								.addComponent(lblIdSupplier, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_Supplier_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBox_4supplier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_10_2_3)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Supplier_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInncode, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
						.addComponent(textFieldCostPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCostprice, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox_2inncode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_10_2_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Supplier_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Supplier_1.createSequentialGroup()
							.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSypplydate)
								.addGroup(gl_Supplier_1.createSequentialGroup()
									.addGap(4)
									.addComponent(datechooserSupplyDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblProductiondate)
								.addComponent(datechooserProductionDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_Supplier_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_17)
							.addComponent(btnNewButton_19)
							.addComponent(btnNewButton_18)))
					.addGap(11)
					.addGroup(gl_Supplier_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblExpirationdate)
						.addComponent(datechooserExpriationdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton_10_6)
					.addGap(34))
		);
		Supplier_1.setLayout(gl_Supplier_1);
		
		lblNewLabel_5 = new JLabel("Supplier Invoice");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 0, 51));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		GroupLayout gl_panel_22 = new GroupLayout(panel_22);
		gl_panel_22.setHorizontalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_22.createSequentialGroup()
					.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 1348, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_22.setVerticalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_22.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_22.setLayout(gl_panel_22);
		supplierInvoicePanel.setLayout(gl_supplierInvoicePanel);
	}
}
