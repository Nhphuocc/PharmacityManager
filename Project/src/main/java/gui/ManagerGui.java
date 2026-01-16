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
public class ManagerGui extends JFrame {

	private JPanel contentPane;
	private JPanel mainPanel;
	private JScrollPane scrollMainPane;
	private JTabbedPane tabbedMainPanel;
	private JPanel searchBillPanel;
	private JPanel medicinePanel;
	private JPanel panel_2;
	private JLabel lblDate;
	private JLabel lblRegistration;
	private JTextField inncodeText;
	private JLabel lblNewLabel_2;
	private JLabel lblName;
	private JTextField drugnameText;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblNewLabel_4;
	private JTextField textField_11;
	private JLabel lblImage;
	private JButton btnSelect;
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
	private JPanel employeeInforPanel;
	private JPanel panel_30;
	private JTextField textField_37;
	private JLabel lblNewLabel_20;
	private JPanel panel_31;
	private JPanel panel_32;
	private JLabel lblID_2;
	private JLabel lblUserName;
	private JLabel lblPass;
	private JLabel lblNewPass;
	private JLabel lblYearofBirth;
	private JTextField textIdmngEnployee;
	private JTextField textusernameEmployee;
	private JTextField textEmployid;
	private JPanel panel_33;
	private JLabel lblLastName_1;
	private JLabel lblGender_1;
	private JLabel lblAddress_1;
	private JLabel lblPhoneNumber;
	private JTextField textPNEmployee;
	private JTextField textAdressEmployee;
	private JTextField textFirsrnameEmployee;
	private JPanel panel_34;
	private JPanel panel_35;
	private JButton btnNewButton_7;
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
	private JPanel panel_39;
	private JLabel lblNewLabel;
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
	private JLabel lblNewLabel_18;
	private JLabel lblLastName_2;
	private JTextField textlastNameEmployee;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup customerGender = new ButtonGroup();
	private JTable tableCus;
	private JButton reset_informationCUS;
	private JTextField textidUnit;
	private JTextField textNameUnit;
	private JButton btnNewButton_10;
	private JTable tableUnit;
	private JTextField testIdCate;
	private JTextField textCateName;
	private JTable tableCategory;
	private JButton btnUpdateUnit;
	private JButton btnUpdateCate;
	private JTextField textIdSupplier;
	private JTextField textSuppliername;
	private JTable tableSupplier;
	private JTextField ingredientText;
	private JTextField dosageformsText;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;
	private JPanel panel_14;
	private JTextArea descriptionText;
	private JLabel lblStandard_1;
	private JPanel panel_15;
	private JTextField medicineTextsearch;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_12;
	private String filename= null;
	private String fileBefore= null;
	private String driBefore= null;
	private String driAfter= null;
	private String oldINNcode = null;
	private String oldFilePath = null;
	private final ButtonGroup searchDrugbtngr = new ButtonGroup();
	private JButton btnNewButton_14;
	private JTable tableMedicine;
	private JPanel panel_11;
	private JButton btnNewButton_15;
	private JPanel panel_12;
	private JScrollPane scrollPane_4;
	private JTable tableEmployee;
	private JPanel panel_17;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton_6;
	private JButton btnReset;
	private JRadioButton rdbtnID;
	private JRadioButton rdbtnID_2;
	private JPasswordField textPasswordEmployee;
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
	private JTextField textField_2;
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
	private JPanel panel_25;
	private JPanel panel_38;
	private JLabel lblIdemp;
	private JLabel lblDay;
	private JDateChooser dateChooser;
	private JButton btnCheck;
	private JTextField textField_22;
	private JPanel panel_26;
	private JLabel lblBillTotal;
	private JLabel lblPriceTotal;
	private JTextField textField_23;
	private JTextField textField_24;
	private JLabel lblEndDay;
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JButton btnNewButton_22;
	private JButton btnNewButton_10_6;
	private JButton btnNewButton_10_7;
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	
	
	public ManagerGui(int idemp) {
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
			        float minus = (float) table_4.getValueAt(selectedRow, 3);

			        float totalnill = Float.parseFloat(textField_34.getText());
			        totalnill -= minus;
			        textField_34.setText(String.valueOf(totalnill));
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
					.addContainerGap(39, Short.MAX_VALUE)
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
						.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
					.addGap(342))
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
					.addContainerGap(72, Short.MAX_VALUE))
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
		
		panel_25 = new JPanel();
		panel_25.setBorder(new TitledBorder(null, "statistical", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		panel_38 = new JPanel();
		panel_38.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblIdemp = new JLabel("IDEMP:");
		
		lblDay = new JLabel("Start day:");
		
		dateChooser = new JDateChooser();
		JDateChooser dateChooser_1 = new JDateChooser();
		JRadioButton raditosearchbill = new JRadioButton("Day");
		buttonGroup_6.add(raditosearchbill);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("ID");
		buttonGroup_6.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Day and ID");
		buttonGroup_6.add(rdbtnNewRadioButton_4);
		btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(raditosearchbill.isSelected()) {
					try 
					{
						java.util.Date selectedDateS = dateChooser.getDate();
						java.sql.Date sqlDate = new java.sql.Date(selectedDateS.getTime());
						LocalDate localDate = sqlDate.toLocalDate();
						java.util.Date selectedDateE = dateChooser_1.getDate();
						java.sql.Date sqlDate1 = new java.sql.Date(selectedDateE.getTime());
						LocalDate localDate1 = sqlDate1.toLocalDate();
						var billList = MakeBillDAO.searchBillsByDate(localDate,localDate1);
						
				           var model = new DefaultTableModel() {
							    public boolean isCellEditable(int row, int column) {
							        return false;
							    }
							};
							AtomicReference<Double> totalbilllll = new AtomicReference<>(0.0);
							AtomicInteger quantitybilllll = new AtomicInteger(0);
						    model.addColumn("IdBill");
						    model.addColumn("IdCus");
						    model.addColumn("InvoiceDate");
						    model.addColumn("TotalBill");
						    model.addColumn("IdEmp");
						    billList.forEach(bil -> {
						    	totalbilllll.updateAndGet(currentTotal -> currentTotal + bil.getTotalBill());
						    	quantitybilllll.incrementAndGet();
						    	 model.addRow(new Object[] {
							                bil.getIdBill(),
							                bil.getIdCus(),
							                bil.getInvoiceDate(),
							                bil.getTotalBill(),
							                (int) bil.getIdEmp()
							            });
						    });
						    textField_24.setText(Double.toString(totalbilllll.get()));
						    textField_23.setText(Integer.toString(quantitybilllll.get()));
						    table_2.setModel(model);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Enter Information", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
				}else if (rdbtnNewRadioButton_3.isSelected()) {
					try 
					{
						
						int idemppp = Integer.parseInt(textField_22.getText());
						var billList = MakeBillDAO.searchBillsByEmpId(idemppp);
						
				           var model = new DefaultTableModel() {
							    public boolean isCellEditable(int row, int column) {
							        return false;
							    }
							};
							AtomicReference<Double> totalbilllll = new AtomicReference<>(0.0);
							AtomicInteger quantitybilllll = new AtomicInteger(0);
						    model.addColumn("IdBill");
						    model.addColumn("IdCus");
						    model.addColumn("InvoiceDate");
						    model.addColumn("TotalBill");
						    model.addColumn("IdEmp");
						    billList.forEach(bil -> {
						    	totalbilllll.updateAndGet(currentTotal -> currentTotal + bil.getTotalBill());
						    	quantitybilllll.incrementAndGet();
						    	 model.addRow(new Object[] {
							                bil.getIdBill(),
							                bil.getIdCus(),
							                bil.getInvoiceDate(),
							                bil.getTotalBill(),
							                (int) bil.getIdEmp()
							            });
						    });
						    textField_24.setText(Double.toString(totalbilllll.get()));
						    textField_23.setText(Integer.toString(quantitybilllll.get()));
						    table_2.setModel(model);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Enter Information", "Message", JOptionPane.WARNING_MESSAGE);
					}
				}else if (rdbtnNewRadioButton_4.isSelected()) {
					try 
					{
						java.util.Date selectedDateS = dateChooser.getDate();
						java.sql.Date sqlDate = new java.sql.Date(selectedDateS.getTime());
						LocalDate localDate = sqlDate.toLocalDate();
						java.util.Date selectedDateE = dateChooser_1.getDate();
						java.sql.Date sqlDate1 = new java.sql.Date(selectedDateE.getTime());
						LocalDate localDate1 = sqlDate1.toLocalDate();
						
						int idemppp = Integer.parseInt(textField_22.getText());
						var billList = MakeBillDAO.searchBillsByDateAndEmpId(localDate,localDate1,idemppp);
						
				           var model = new DefaultTableModel() {
							    public boolean isCellEditable(int row, int column) {
							        return false;
							    }
							};
							AtomicReference<Double> totalbilllll = new AtomicReference<>(0.0);
							AtomicInteger quantitybilllll = new AtomicInteger(0);
						    model.addColumn("IdBill");
						    model.addColumn("IdCus");
						    model.addColumn("InvoiceDate");
						    model.addColumn("TotalBill");
						    model.addColumn("IdEmp");
						    billList.forEach(bil -> {
						    	totalbilllll.updateAndGet(currentTotal -> currentTotal + bil.getTotalBill());
						    	quantitybilllll.incrementAndGet();
						    	 model.addRow(new Object[] {
							                bil.getIdBill(),
							                bil.getIdCus(),
							                bil.getInvoiceDate(),
							                bil.getTotalBill(),
							                (int) bil.getIdEmp()
							            });
						    });
						    textField_24.setText(Double.toString(totalbilllll.get()));
						    textField_23.setText(Integer.toString(quantitybilllll.get()));
						    table_2.setModel(model);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Enter Information", "Message", JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Choose Option", "Message", JOptionPane.WARNING_MESSAGE);
				}
				
				
				
				
					
			}
		});
		btnCheck.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		lblEndDay = new JLabel("End Day:");
		
		
		
		
		GroupLayout gl_panel_38 = new GroupLayout(panel_38);
		gl_panel_38.setHorizontalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblIdemp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblDay, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_22)
						.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_38.createSequentialGroup()
								.addComponent(lblEndDay, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_38.createSequentialGroup()
								.addComponent(raditosearchbill, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(rdbtnNewRadioButton_3, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnNewRadioButton_4, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(3)))
						.addComponent(btnCheck, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addGap(80))
		);
		gl_panel_38.setVerticalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_38.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblDay)
						.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(dateChooser_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblEndDay, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_38.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_panel_38.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdemp)
								.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_38.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_38.createParallelGroup(Alignment.BASELINE)
								.addComponent(raditosearchbill)
								.addComponent(rdbtnNewRadioButton_3)
								.addComponent(rdbtnNewRadioButton_4))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCheck)))
					.addGap(25))
		);
		panel_38.setLayout(gl_panel_38);
		
		panel_26 = new JPanel();
		panel_26.setBorder(new TitledBorder(null, "Detailed statistics", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblBillTotal = new JLabel("Quantity Bill");
		
		lblPriceTotal = new JLabel("Total:");
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		GroupLayout gl_panel_26 = new GroupLayout(panel_26);
		gl_panel_26.setHorizontalGroup(
			gl_panel_26.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_26.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_26.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_26.createSequentialGroup()
							.addComponent(lblPriceTotal, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addComponent(lblBillTotal, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_23)))
					.addGap(135))
		);
		gl_panel_26.setVerticalGroup(
			gl_panel_26.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_26.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_26.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPriceTotal)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_26.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBillTotal)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		panel_26.setLayout(gl_panel_26);
		GroupLayout gl_panel_25 = new GroupLayout(panel_25);
		gl_panel_25.setHorizontalGroup(
			gl_panel_25.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_25.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_25.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_25.createSequentialGroup()
							.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 573, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_25.createSequentialGroup()
							.addComponent(panel_26, 0, 0, Short.MAX_VALUE)
							.addGap(25))))
		);
		gl_panel_25.setVerticalGroup(
			gl_panel_25.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_25.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_38, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		panel_25.setLayout(gl_panel_25);
		GroupLayout gl_panel_37 = new GroupLayout(panel_37);
		gl_panel_37.setHorizontalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGap(8)
							.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 803, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_37.setVerticalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGap(10)
							.addComponent(panel_25, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE, false)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
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
		
		medicinePanel = new JPanel();
		medicinePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedMainPanel.addTab("Medicine", null, medicinePanel, null);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Drug Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblDate = new JLabel("MFG:");
		
		lblRegistration = new JLabel("INN Code:");
		
		inncodeText = new JTextField();
		inncodeText.setColumns(10);
		
		lblNewLabel_2 = new JLabel("ingredient:");
		
		lblName = new JLabel("Drug Name:");
		
		drugnameText = new JTextField();
		drugnameText.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Category");
		
		ingredientText = new JTextField();
		ingredientText.setColumns(10);
		
		dosageformsText = new JTextField();
		dosageformsText.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Dosage forms:");
		
		comboBox = new JComboBox();
		
		
		lblImage = new JLabel("Image:");
		JLabel lblpictureMedicine = new JLabel("");
		lblpictureMedicine.setBackground(new Color(255, 255, 255));
		btnSelect = new JButton("Select Image");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var chooser = new JFileChooser("C:\\Users\\PC\\OneDrive\\Máy tính");
				chooser.setDialogTitle("open image");
				chooser.setFileFilter(
						new FileNameExtensionFilter("image (jpg,png,gif)","jpg","png","gif")
						);
				chooser.setAcceptAllFileFilterUsed(false);
				var result = chooser.showOpenDialog(null);
				if(result == chooser.APPROVE_OPTION) {
					File f = chooser.getSelectedFile();
					filename = f.getName();
					driBefore = f.getAbsolutePath();
					
					lblpictureMedicine.setIcon(
							new ImageIcon(
								new ImageIcon(
										f.getAbsolutePath()
										
											)
								.getImage()
								.getScaledInstance(255,245, Image.SCALE_SMOOTH)
									)
							);
				}
			}
		});
		
		panel_14 = new JPanel();
		
		descriptionText = new JTextArea();
		
		lblStandard_1 = new JLabel("Description:");
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addComponent(lblStandard_1, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
					.addGap(220))
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGap(20)
					.addComponent(descriptionText, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addComponent(lblStandard_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(descriptionText, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_14.setLayout(gl_panel_14);
		
		panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		
		JButton btnNewButton = new JButton("⟲");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<DrugCategory> list = DrugCategoryDao.getListDrugCategories();
				DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
				 list.forEach(cate -> {
			            
			            model.addElement(cate.getCategoryName()+"(id:"+cate.getIdCate()+")");
			        });
				 comboBox.setModel(model);
			}
		});
		
		btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        var med = new Medicine();

		        if (inncodeText.getText().isEmpty() || drugnameText.getText().isEmpty() || dosageformsText.getText().isEmpty() || descriptionText.getText().isEmpty() || ingredientText.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Hãy nhập đủ thông tin");
		            return;
		        }

		        med.setiNNcode(inncodeText.getText());
		        med.setNameMedin(drugnameText.getText());
		        med.setDosageForm(dosageformsText.getText());
		        med.setContent(descriptionText.getText());
		        med.setIngredient(ingredientText.getText());

		        String selectedValue = (String) comboBox.getSelectedItem();
		        if (selectedValue == null || !selectedValue.contains("(id:")) {
		            JOptionPane.showMessageDialog(null, "Invalid ID category");
		            return;
		        }

		        int startIndex = selectedValue.indexOf("(id:") + 4;
		        int endIndex = selectedValue.indexOf(")");
		        if (startIndex == -1 || endIndex == -1) {
		            JOptionPane.showMessageDialog(null, "Invalid ID category");
		            return;
		        }

		        String id = selectedValue.substring(startIndex, endIndex);
		        med.setIdCate(Integer.parseInt(id));

		        Icon icon = lblpictureMedicine.getIcon();
		        if (!(icon instanceof ImageIcon)) {
		            JOptionPane.showMessageDialog(null, "Please select an image");
		            return;
		        }

		        ImageIcon imageIcon = (ImageIcon) icon;
		        Image image = imageIcon.getImage();

		        try {
		            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
		            bufferedImage.getGraphics().drawImage(image, 0, 0, null);
		            ByteArrayOutputStream baos = new ByteArrayOutputStream();
		            ImageIO.write(bufferedImage, "jpg", baos);

		            byte[] imageBytes = baos.toByteArray();
		            String base64Image = Base64.getEncoder().encodeToString(imageBytes);

		            String projectDirectory = System.getProperty("user.dir");
		            String imageFolder = projectDirectory + File.separator + "image";

		            String uniqueFileName = UUID.randomUUID().toString() + ".jpg";
		            String imagePath = Paths.get(imageFolder, uniqueFileName).toString();

		            med.setPathImg("image/" + uniqueFileName);
		            
		            var check = MedicineDAO.insertMedicine(med);
		            if (check) {
		                JOptionPane.showMessageDialog(null, "Success");
		                Files.write(Paths.get(imagePath), imageBytes);
		                lblpictureMedicine.setIcon(null);
		                inncodeText.setText("");
		                drugnameText.setText("");
		                dosageformsText.setText("");
		                descriptionText.setText("");
		                ingredientText.setText("");
		            } else {
		                JOptionPane.showMessageDialog(null, "Insertion failed");
		            }
		        } catch (Exception e1) {
		            e1.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Error while processing image");
		        }
		    }
		});
		
		
		
				
				
				btnNewButton_2 = new JButton("Update");
				btnNewButton_2.setEnabled(false);
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
	            
	            if (choice == JOptionPane.YES_OPTION) {
						var med = new Medicine();

				        if (inncodeText.getText().isEmpty() || drugnameText.getText().isEmpty() || dosageformsText.getText().isEmpty() || descriptionText.getText().isEmpty() || ingredientText.getText().isEmpty()) {
				            JOptionPane.showMessageDialog(null, "Please enter complete information.");
				            return;
				        }

				        med.setiNNcode(inncodeText.getText());
				        med.setNameMedin(drugnameText.getText());
				        med.setDosageForm(dosageformsText.getText());
				        med.setContent(descriptionText.getText());
				        med.setIngredient(ingredientText.getText());

				        String selectedValue = (String) comboBox.getSelectedItem();
				        if (selectedValue == null || !selectedValue.contains("(id:")) {
				            JOptionPane.showMessageDialog(null, "Invalid ID category");
				            return;
				        }

				        int startIndex = selectedValue.indexOf("(id:") + 4;
				        int endIndex = selectedValue.indexOf(")");
				        if (startIndex == -1 || endIndex == -1) {
				            JOptionPane.showMessageDialog(null, "Invalid ID category");
				            return;
				        }

				        String id = selectedValue.substring(startIndex, endIndex);
				        med.setIdCate(Integer.parseInt(id));

				        Icon icon = lblpictureMedicine.getIcon();
				        if (!(icon instanceof ImageIcon)) {
				            JOptionPane.showMessageDialog(null, "Please select an image");
				            return;
				        }

				        ImageIcon imageIcon = (ImageIcon) icon;
				        Image image = imageIcon.getImage();

				        try {
				            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
				            bufferedImage.getGraphics().drawImage(image, 0, 0, null);
				            ByteArrayOutputStream baos = new ByteArrayOutputStream();
				            ImageIO.write(bufferedImage, "jpg", baos);

				            byte[] imageBytes = baos.toByteArray();
				            String base64Image = Base64.getEncoder().encodeToString(imageBytes);

				            String projectDirectory = System.getProperty("user.dir");
				            String imageFolder = projectDirectory + File.separator + "image";

				            String uniqueFileName = UUID.randomUUID().toString() + ".jpg";
				            String imagePath = Paths.get(imageFolder, uniqueFileName).toString();

				            med.setPathImg("image/" + uniqueFileName);
				            
				            var check = MedicineDAO.updateMedicine(med,oldFilePath,oldINNcode);
				            if (check) {
				                JOptionPane.showMessageDialog(null, "Success");
				                Files.write(Paths.get(imagePath), imageBytes);
				                lblpictureMedicine.setIcon(null);
				                inncodeText.setText("");
				                drugnameText.setText("");
				                dosageformsText.setText("");
				                descriptionText.setText("");
				                ingredientText.setText("");
				            } else {
				                JOptionPane.showMessageDialog(null, "Insertion failed");
				            }
				        } catch (Exception e1) {
				            e1.printStackTrace();
				            JOptionPane.showMessageDialog(null, "Error while processing image");
				        }
					}
	            }
				});
				
				btnNewButton_12 = new JButton("Delete");
				btnNewButton_12.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
	            
	            if (choice == JOptionPane.YES_OPTION) {
	            	var check = MedicineDAO.deleteMedicineByINNCode(inncodeText.getText());
	            	if(check) {
	            		inncodeText.setText("");
				            	drugnameText.setText("");
				            	ingredientText.setText("");
				            	dosageformsText.setText("");
				            	descriptionText.setText("");
				            	lblpictureMedicine.setIcon(null);
				            	DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
				            	comboBox.setModel(model);
				            	btnNewButton_12.setEnabled(false);
				            	btnNewButton_2.setEnabled(false);
					            btnNewButton_1.setEnabled(true);
	            	}
	            	
	            } 
					}
				});
				btnNewButton_12.setEnabled(false);
				
				btnNewButton_22 = new JButton("⟲");
				btnNewButton_22.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lblpictureMedicine.setIcon(null);
		                inncodeText.setText("");
		                drugnameText.setText("");
		                dosageformsText.setText("");
		                descriptionText.setText("");
		                ingredientText.setText("");
		                btnNewButton_1.setEnabled(true);
		                btnNewButton_2.setEnabled(false);
		                btnNewButton_12.setEnabled(false);
					}
				});
				
				GroupLayout gl_panel_2 = new GroupLayout(panel_2);
				gl_panel_2.setHorizontalGroup(
					gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_2.createSequentialGroup()
													.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
														.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblRegistration, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
														.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
														.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
														.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
													.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(gl_panel_2.createSequentialGroup()
													.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
													.addGap(14)))
											.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addComponent(dosageformsText, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
												.addComponent(ingredientText, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
												.addComponent(drugnameText, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
												.addComponent(inncodeText, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
												.addGroup(gl_panel_2.createSequentialGroup()
													.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
													.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
										.addComponent(panel_14, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnSelect, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(btnNewButton_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNewButton_12)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNewButton_2))
										.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)))
								.addComponent(btnNewButton_22, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
				);
				gl_panel_2.setVerticalGroup(
					gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnNewButton_22, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRegistration)
								.addComponent(inncodeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblImage)
								.addComponent(btnSelect))
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton_1)
										.addComponent(btnNewButton_12)
										.addComponent(btnNewButton_2)))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGap(27)
											.addComponent(lblDate))
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblName)
												.addComponent(drugnameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
												.addComponent(ingredientText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_2))))
									.addGap(18)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3)
										.addComponent(dosageformsText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_6)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(23, Short.MAX_VALUE))
				);
				panel_15.setLayout(new BorderLayout(0, 0));
				
				
				panel_15.add(lblpictureMedicine, BorderLayout.CENTER);
				panel_2.setLayout(gl_panel_2);
				
				panel_3 = new JPanel();
				panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
				
				panel_4 = new JPanel();
				
				panel_5 = new JPanel();
				
				lblNewLabel_4 = new JLabel("ingredient:");
				
				textField_11 = new JTextField();
				textField_11.setColumns(10);
				GroupLayout gl_panel_5 = new GroupLayout(panel_5);
				gl_panel_5.setHorizontalGroup(
					gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addGap(20))
				);
				gl_panel_5.setVerticalGroup(
					gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGap(0, 32, Short.MAX_VALUE)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
				panel_5.setLayout(gl_panel_5);
				GroupLayout gl_panel_4 = new GroupLayout(panel_4);
				gl_panel_4.setHorizontalGroup(
					gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(19, Short.MAX_VALUE))
				);
				gl_panel_4.setVerticalGroup(
					gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap(12, Short.MAX_VALUE)
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
				panel_4.setLayout(gl_panel_4);
				
				JLabel lblNewLabel_7_2 = new JLabel("Enter Information:");
				
				JRadioButton inncodeRadio = new JRadioButton("INNcode");
				searchDrugbtngr.add(inncodeRadio);
				
				JRadioButton drugnameRadio = new JRadioButton("Drug Name");
				searchDrugbtngr.add(drugnameRadio);
				
				JRadioButton categorydrugRadio = new JRadioButton("Category");
				searchDrugbtngr.add(categorydrugRadio);
				
				medicineTextsearch = new JTextField();
				medicineTextsearch.setColumns(10);
				
				JButton btnNewButton_13 = new JButton("Search");
				btnNewButton_13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(inncodeRadio.isSelected()) {
							 List<Medicine> list = MedicineDAO.searchMedicineByINNCode(medicineTextsearch.getText());

						        DefaultTableModel model = new DefaultTableModel() {
						            @Override
						            public boolean isCellEditable(int row, int column) {
						                return false;
						            }
						        };

						        model.addColumn("INN Code");
						        model.addColumn("Medicine Name");
						        model.addColumn("Category ID");
						        model.addColumn("Dosage Form");
						        model.addColumn("Image");
						        model.addColumn("Content");
						        model.addColumn("Ingredient");

						        list.forEach(med -> {
						            

						            model.addRow(new Object[] {
						                med.getiNNcode(),
						                med.getNameMedin(),
						                med.getIdCate(),
						                med.getDosageForm(),
						                new ImageIcon(
												new ImageIcon(
														med.getPathImg()
												)
												.getImage()
												.getScaledInstance(120, 60, Image.SCALE_SMOOTH)), 
						                med.getContent(),
						                med.getIngredient()
						            });
						        });

						        tableMedicine.setModel(model);
						        tableMedicine.getColumn("Image").setMinWidth(0);
						        tableMedicine.getColumn("Image").setMaxWidth(0);
						        tableMedicine.getColumn("Image").setWidth(0);

						    
						}else if(drugnameRadio.isSelected()){
							List<Medicine> list = MedicineDAO.searchMedicineByName(medicineTextsearch.getText());

					        DefaultTableModel model = new DefaultTableModel() {
					            @Override
					            public boolean isCellEditable(int row, int column) {
					                return false;
					            }
					        };

					        model.addColumn("INN Code");
					        model.addColumn("Medicine Name");
					        model.addColumn("Category ID");
					        model.addColumn("Dosage Form");
					        model.addColumn("Image");
					        model.addColumn("Content");
					        model.addColumn("Ingredient");

					        list.forEach(med -> {
					            

					            model.addRow(new Object[] {
					                med.getiNNcode(),
					                med.getNameMedin(),
					                med.getIdCate(),
					                med.getDosageForm(),
					                new ImageIcon(
											new ImageIcon(
													med.getPathImg()
											)
											.getImage()
											.getScaledInstance(120, 60, Image.SCALE_SMOOTH)), 
					                med.getContent(),
					                med.getIngredient()
					            });
					        });

					        tableMedicine.setModel(model);
					        tableMedicine.getColumn("Image").setMinWidth(0);
					        tableMedicine.getColumn("Image").setMaxWidth(0);
					        tableMedicine.getColumn("Image").setWidth(0);
						}else if(categorydrugRadio.isSelected()) {
							List<Medicine> list = MedicineDAO.searchMedicineByCategory(medicineTextsearch.getText());

					        DefaultTableModel model = new DefaultTableModel() {
					            @Override
					            public boolean isCellEditable(int row, int column) {
					                return false;
					            }
					        };

					        model.addColumn("INN Code");
					        model.addColumn("Medicine Name");
					        model.addColumn("Category ID");
					        model.addColumn("Dosage Form");
					        model.addColumn("Image");
					        model.addColumn("Content");
					        model.addColumn("Ingredient");

					        list.forEach(med -> {
					            

					            model.addRow(new Object[] {
					                med.getiNNcode(),
					                med.getNameMedin(),
					                med.getIdCate(),
					                med.getDosageForm(),
					                new ImageIcon(
											new ImageIcon(
													med.getPathImg()
											)
											.getImage()
											.getScaledInstance(120, 60, Image.SCALE_SMOOTH)), 
					                med.getContent(),
					                med.getIngredient()
					            });
					        });

					        tableMedicine.setModel(model);
					        tableMedicine.getColumn("Image").setMinWidth(0);
					        tableMedicine.getColumn("Image").setMaxWidth(0);
					        tableMedicine.getColumn("Image").setWidth(0);
						}else {
							JOptionPane.showMessageDialog(null, "Choose Option", "Message", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				GroupLayout gl_panel_3 = new GroupLayout(panel_3);
				gl_panel_3.setHorizontalGroup(
					gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(lblNewLabel_7_2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(medicineTextsearch, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(88)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_13)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addComponent(inncodeRadio, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(drugnameRadio, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(categorydrugRadio, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))))
							.addGap(32))
				);
				gl_panel_3.setVerticalGroup(
					gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_7_2))
								.addComponent(medicineTextsearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(inncodeRadio)
								.addComponent(drugnameRadio)
								.addComponent(categorydrugRadio))
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(41)
									.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(18)
									.addComponent(btnNewButton_13)))
							.addContainerGap(166, Short.MAX_VALUE))
				);
				panel_3.setLayout(gl_panel_3);
				
				panel_39 = new JPanel();
				
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "List Medicine", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				GroupLayout gl_medicinePanel = new GroupLayout(medicinePanel);
				gl_medicinePanel.setHorizontalGroup(
					gl_medicinePanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_medicinePanel.createSequentialGroup()
							.addGroup(gl_medicinePanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_39, GroupLayout.DEFAULT_SIZE, 1297, Short.MAX_VALUE)
								.addGroup(gl_medicinePanel.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_medicinePanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
										.addGroup(gl_medicinePanel.createSequentialGroup()
											.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)))
									.addGap(12)))
							.addGap(2799))
				);
				gl_medicinePanel.setVerticalGroup(
					gl_medicinePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_medicinePanel.createSequentialGroup()
							.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_medicinePanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(701))
				);
				
				btnNewButton_14 = new JButton("⟲");
				btnNewButton_14.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        List<Medicine> list = MedicineDAO.getAllMedicineData();

				        DefaultTableModel model = new DefaultTableModel() {
				            @Override
				            public boolean isCellEditable(int row, int column) {
				                return false;
				            }
				        };

				        model.addColumn("INN Code");
				        model.addColumn("Medicine Name");
				        model.addColumn("Category ID");
				        model.addColumn("Dosage Form");
				        model.addColumn("Image");
				        model.addColumn("Content");
				        model.addColumn("Ingredient");
				        model.addColumn("pathimg");
				        list.forEach(med -> {
				            

				            model.addRow(new Object[] {
				                med.getiNNcode(),
				                med.getNameMedin(),
				                med.getIdCate(),
				                med.getDosageForm(),
				                new ImageIcon(
										new ImageIcon(
												med.getPathImg()
										)
										.getImage()
										.getScaledInstance(120, 60, Image.SCALE_SMOOTH)), 
				               
				                med.getContent(),
				                med.getIngredient(),
				                med.getPathImg()
				            });
				        });

				        tableMedicine.setModel(model);
				        tableMedicine.getColumn("Image").setMinWidth(0);
				        tableMedicine.getColumn("Image").setMaxWidth(0);
				        tableMedicine.getColumn("Image").setWidth(0);
				        tableMedicine.getColumn("pathimg").setMinWidth(0);
				        tableMedicine.getColumn("pathimg").setMaxWidth(0);
				        tableMedicine.getColumn("pathimg").setWidth(0);

				    }
				});
				
				
				
						
						JPanel panel_6 = new JPanel();
						GroupLayout gl_panel_1 = new GroupLayout(panel_1);
						gl_panel_1.setHorizontalGroup(
							gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE)
										.addComponent(btnNewButton_14, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
									.addContainerGap())
						);
						gl_panel_1.setVerticalGroup(
							gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnNewButton_14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(35, Short.MAX_VALUE))
						);
						panel_6.setLayout(new BorderLayout(0, 0));
						
						JScrollPane scrollPane_3 = new JScrollPane();
						panel_6.add(scrollPane_3, BorderLayout.CENTER);
						
						tableMedicine = new JTable();
						scrollPane_3.setViewportView(tableMedicine);
						tableMedicine.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
						    public void valueChanged(ListSelectionEvent e) {
						        if (!e.getValueIsAdjusting()) {
						            int selectedRow = tableMedicine.getSelectedRow();
						            if (selectedRow >= 0) {
						            	inncodeText.setText(tableMedicine.getValueAt(selectedRow, 0).toString());
						            	drugnameText.setText(tableMedicine.getValueAt(selectedRow, 1).toString());
						            	dosageformsText.setText(tableMedicine.getValueAt(selectedRow, 3).toString());
						            	ingredientText.setText(tableMedicine.getValueAt(selectedRow, 6).toString());
						            	descriptionText.setText(tableMedicine.getValueAt(selectedRow, 5).toString());
						            	lblpictureMedicine.setIcon(
						        				new ImageIcon(
						        				((ImageIcon)tableMedicine.getValueAt(selectedRow, 4))
						        				.getImage()
						        				.getScaledInstance(255, 245, Image.SCALE_SMOOTH)
						        				
						        			)
						        		);
						            	var idcate = tableMedicine.getValueAt(selectedRow, 2);
						            	DrugCategory cate = DrugCategoryDao.getDrugCategoriesById((int) idcate);
						            	DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
						            	model.addElement(cate.toString());
						            	comboBox.setModel(model);
						            	oldINNcode=tableMedicine.getValueAt(selectedRow, 0).toString();
						            	oldFilePath = (String) tableMedicine.getValueAt(selectedRow, 7);

						            	btnNewButton_12.setEnabled(true);
						            	btnNewButton_2.setEnabled(true);
						                btnNewButton_1.setEnabled(false);
						                
						            }
						        }
						    }
						});
						panel_1.setLayout(gl_panel_1);
						
						lblNewLabel = new JLabel("MEDICINE MANAGEMENT");
						lblNewLabel.setForeground(Color.RED);
						lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
						panel_39.add(lblNewLabel);
						medicinePanel.setLayout(gl_medicinePanel);
		
		employeeInforPanel = new JPanel();
		employeeInforPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabbedMainPanel.addTab("Employee Information", null, employeeInforPanel, null);
		
		panel_30 = new JPanel();
		panel_30.setBorder(new TitledBorder(null, "Staff Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		
		lblNewLabel_20 = new JLabel("First Name:");
		
		panel_31 = new JPanel();
		
		panel_32 = new JPanel();
		
		lblID_2 = new JLabel("IdEmg:");
		
		lblUserName = new JLabel("User Name");
		
		lblPass = new JLabel("Password");
		
		lblNewPass = new JLabel("IdMng:");
		
		lblYearofBirth = new JLabel("Year of Birth");
		
		textIdmngEnployee = new JTextField();
		textIdmngEnployee.setColumns(10);
		
		textusernameEmployee = new JTextField();
		textusernameEmployee.setColumns(10);
		
		textEmployid = new JTextField();
		textEmployid.setBackground(new Color(255, 255, 255));
		textEmployid.setEditable(false);
		textEmployid.setColumns(10);
		
		JDateChooser datechooserEmployee = new JDateChooser();
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Employee", "Manager"}));
		
		JLabel lblNewLabel_27 = new JLabel("Role");
		
		textPasswordEmployee = new JPasswordField();
		
		
		
		btnReset = new JButton("⟲");
		
		GroupLayout gl_panel_32 = new GroupLayout(panel_32);
		gl_panel_32.setHorizontalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_32.createSequentialGroup()
							.addGroup(gl_panel_32.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_32.createSequentialGroup()
									.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
									.addComponent(lblNewLabel_27, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_32.createSequentialGroup()
									.addComponent(lblNewPass, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textIdmngEnployee, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel_32.createSequentialGroup()
							.addGroup(gl_panel_32.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUserName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(lblYearofBirth, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(lblID_2, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(lblPass, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
								.addComponent(textPasswordEmployee, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
								.addComponent(datechooserEmployee, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
								.addComponent(textEmployid, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
								.addComponent(textusernameEmployee, 399, 399, 399))))
					.addGap(29))
		);
		gl_panel_32.setVerticalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_panel_32.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblID_2)
						.addComponent(textEmployid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel_32.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblYearofBirth)
						.addComponent(datechooserEmployee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_panel_32.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserName)
						.addComponent(textusernameEmployee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_32.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPass)
						.addComponent(textPasswordEmployee, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_32.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewPass)
						.addComponent(textIdmngEnployee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel_32.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_32.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_27)
							.addComponent(btnReset))
						.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17))
		);
		panel_32.setLayout(gl_panel_32);
		
		panel_33 = new JPanel();
		
		lblLastName_1 = new JLabel("First Name");
		
		lblGender_1 = new JLabel("Gender");
		
		lblAddress_1 = new JLabel("Address");
		
		lblPhoneNumber = new JLabel("Phone Number");
		
		textPNEmployee = new JTextField();
		textPNEmployee.setColumns(10);
		
		textAdressEmployee = new JTextField();
		textAdressEmployee.setColumns(10);
		
		textFirsrnameEmployee = new JTextField();
		textFirsrnameEmployee.setColumns(10);
		
		lblLastName_2 = new JLabel("Last Name");
		
		textlastNameEmployee = new JTextField();
		textlastNameEmployee.setColumns(10);
		
		JRadioButton maleRadio = new JRadioButton("Male");
		buttonGroup_3.add(maleRadio);
		
		JRadioButton femaleRadio = new JRadioButton("Female");
		buttonGroup_3.add(femaleRadio);
		GroupLayout gl_panel_33 = new GroupLayout(panel_33);
		gl_panel_33.setHorizontalGroup(
			gl_panel_33.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_33.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblPhoneNumber, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblAddress_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblGender_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblLastName_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_33.createSequentialGroup()
							.addGap(2)
							.addComponent(lblLastName_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textPNEmployee)
							.addComponent(textAdressEmployee)
							.addComponent(textlastNameEmployee)
							.addComponent(textFirsrnameEmployee, 357, 357, Short.MAX_VALUE))
						.addGroup(gl_panel_33.createSequentialGroup()
							.addComponent(maleRadio, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(femaleRadio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
					.addGap(87))
		);
		gl_panel_33.setVerticalGroup(
			gl_panel_33.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_33.createSequentialGroup()
					.addGap(3)
					.addGroup(gl_panel_33.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName_1)
						.addComponent(textFirsrnameEmployee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_panel_33.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName_2)
						.addComponent(textlastNameEmployee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_panel_33.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender_1)
						.addComponent(maleRadio)
						.addComponent(femaleRadio))
					.addGap(14)
					.addGroup(gl_panel_33.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress_1)
						.addComponent(textAdressEmployee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_panel_33.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPhoneNumber)
						.addComponent(textPNEmployee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_33.setLayout(gl_panel_33);
		GroupLayout gl_panel_31 = new GroupLayout(panel_31);
		gl_panel_31.setHorizontalGroup(
			gl_panel_31.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_31.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_32, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(32)
					.addComponent(panel_33, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
					.addGap(24))
		);
		gl_panel_31.setVerticalGroup(
			gl_panel_31.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_31.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_31.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_33, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
						.addComponent(panel_32, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 207, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_31.setLayout(gl_panel_31);
		GroupLayout gl_panel_30 = new GroupLayout(panel_30);
		gl_panel_30.setHorizontalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addGroup(gl_panel_30.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_30.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 1281, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(204, Short.MAX_VALUE))
		);
		gl_panel_30.setVerticalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addGroup(gl_panel_30.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_31, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_30.setLayout(gl_panel_30);
		
		panel_34 = new JPanel();
		
		panel_35 = new JPanel();
		panel_35.setBorder(new TitledBorder(null, "Function", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		JButton btnNewButton_7_2 = new JButton("Update");
		JButton btnNewButton_7_1 = new JButton("Delete");
		btnNewButton_7 = new JButton("Add");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var employee = new Employee();
				   var account = new Account();
				    boolean missingInfo = false;
				    
				    String username = textusernameEmployee.getText();
				    if (username.isEmpty()) {
				        missingInfo = true;
				    } else {
				    	account.setUserName(username);
				    	employee.setUserName(username);
				    }
				    String password = textPasswordEmployee.getText();
				    if (password.isEmpty()) {
				        missingInfo = true;
				    } else {
				        account.setPassWord(password);
				    }
				    
				    Object role = comboBox_10.getSelectedItem();		    
				    if (role == null) {
				        missingInfo = true;
				    } else {
				        account.setRole(role.toString());
				    }
				    

				    String firstName = textFirsrnameEmployee.getText();
				    if (firstName.isEmpty()) {
				        missingInfo = true;
				    } else {
				        employee.setFirstName(firstName);
				    }

				    String lastName = textlastNameEmployee.getText();
				    if (lastName.isEmpty()) {
				        missingInfo = true;
				    } else {
				        employee.setLastName(lastName);
				    }

			        java.util.Date selectedDate = datechooserEmployee.getDate();
				    if (selectedDate  == null) {
				        missingInfo = true;
				    } else {
				    	  java.time.LocalDate dobld = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				            employee.setDob(dobld);
				    }

				    String idMngStr = textIdmngEnployee.getText();
				    if (!idMngStr.isEmpty()) {
				        int idMng = Integer.parseInt(idMngStr);		       
				        employee.setIdMng(idMng);
				    }
				   
				    String address = textAdressEmployee.getText();
				    if (address.isEmpty()) {
				        missingInfo = true;
				    } else {
				        employee.setAddress(address);
				    }
				    
				    String phonnumber = textPNEmployee.getText();
				    if (phonnumber.isEmpty()) {
				        missingInfo = true;
				    } else {
				        employee.setPhoneNb(phonnumber);
				    }
				    		    
				    if (missingInfo) {
				        JOptionPane.showMessageDialog(null, "Please enter complete information.", "Message", JOptionPane.WARNING_MESSAGE);
				    } else {		    	
				    	EmployeDao.insertEmployeeToDb(employee,account);
				    	
				            textEmployid.setText("");
					        textFirsrnameEmployee.setText(""); 
					        textlastNameEmployee.setText("");
				            maleRadio.setSelected(false);
				            femaleRadio.setSelected(false);
				            textAdressEmployee.setText("");
				            textPNEmployee.setText("");
				            textusernameEmployee.setText("");
				            textIdmngEnployee.setText("");
				            textPasswordEmployee.setText("");
				            datechooserEmployee.setDate(null);
				            comboBox_10.setSelectedIndex(0);           
				    	    btnNewButton_7_1.setEnabled(false);
			                btnNewButton_7_2.setEnabled(false);
			                btnNewButton_7.setEnabled(true);
				    }
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEmployid.setText("");
		        textFirsrnameEmployee.setText(""); 
		        textlastNameEmployee.setText("");
	            maleRadio.setSelected(false);
	            femaleRadio.setSelected(false);
	            textAdressEmployee.setText("");
	            textPNEmployee.setText("");
	            textusernameEmployee.setText("");
	            textIdmngEnployee.setText("");
	            textPasswordEmployee.setText("");
	            datechooserEmployee.setDate(null);
	            comboBox_10.setSelectedIndex(0);           
	    	    btnNewButton_7_1.setEnabled(false);
                btnNewButton_7_2.setEnabled(false);
                btnNewButton_7.setEnabled(true);
			}
		});
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.util.Date date = datechooserEmployee.getDate();
			        java.sql.Date sqlDate = null;
			        if (date != null) {
			            sqlDate = new java.sql.Date(date.getTime());
			        }
			        
			        String updatedFirstName = textFirsrnameEmployee.getText();
			        String updatedLastName = textlastNameEmployee.getText();
			        boolean updatedGender = maleRadio.isSelected();       
			        String updatedAddress = textAdressEmployee.getText();
			        String updatedPhoneNumber = textPNEmployee.getText();
			        String updatedUsername = textusernameEmployee.getText();
			        int updatedIdMng = Integer.parseInt(textIdmngEnployee.getText());
			        String updatedPassword = textPasswordEmployee.getText();
			        String updatedRole = comboBox_10.getSelectedItem().toString();
			        
			        EmpAndAcc empAndAcc = new EmpAndAcc();
			        empAndAcc.setIdEmp(Integer.parseInt(textEmployid.getText()));
			        empAndAcc.setFirstName(updatedFirstName);
			        empAndAcc.setLastName(updatedLastName); 
			        empAndAcc.setDob(sqlDate != null ? sqlDate.toLocalDate() : null);
			        empAndAcc.setGender(updatedGender);
			        empAndAcc.setAddress(updatedAddress);
			        empAndAcc.setPhoneNb(updatedPhoneNumber);
			        empAndAcc.setUserName(updatedUsername);
			        empAndAcc.setIdMng(updatedIdMng);
			        empAndAcc.setPassWord(updatedPassword);
			        empAndAcc.setRole(updatedRole);

			        int option = JOptionPane.showConfirmDialog(
			                null,
			                "Do you want updates?",
			                "Confirm update",
			                JOptionPane.YES_NO_OPTION
			            );
			        DefaultTableModel model = (DefaultTableModel) tableEmployee.getModel();
			            if (option == JOptionPane.YES_OPTION) {
			            	boolean updated = EmployeDao.updateEmpAndAcc(empAndAcc);
			            	
			        
			        if (updated) {
			            JOptionPane.showMessageDialog(null, "Update successful.", "Message", JOptionPane.INFORMATION_MESSAGE);                                
			          
			        } else {
			            JOptionPane.showMessageDialog(null, "Update failed.", "Message", JOptionPane.ERROR_MESSAGE);
			        	}
			          }
			            textEmployid.setText("");
			            textFirsrnameEmployee.setText(""); 
			            textlastNameEmployee.setText("");
			            maleRadio.setSelected(false);
			            femaleRadio.setSelected(false);
			            textAdressEmployee.setText("");
			            textPNEmployee.setText("");
			            textPasswordEmployee.setText("");
			            textIdmngEnployee.setText("");
			            textusernameEmployee.setText("");
			            datechooserEmployee.setDate(null);
			            comboBox_10.setSelectedIndex(0);
			            
			            model.setRowCount(0); 
			            model.fireTableDataChanged(); 
			            
				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error during update.", "Error", JOptionPane.ERROR_MESSAGE);
					}	  
			}
		});
		btnNewButton_7_2.setEnabled(false);
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		btnNewButton_7_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int selectedRow = tableEmployee.getSelectedRow();
				
			    if (selectedRow >= 0) {
			        
			        int employeeId = (int) tableEmployee.getValueAt(selectedRow, 0);
			        
			        int option = JOptionPane.showConfirmDialog(
			                null,
			                "Do you delete?",
			                "Confirm deletion",
			                JOptionPane.YES_NO_OPTION
			            );
			        DefaultTableModel model = (DefaultTableModel) tableEmployee.getModel();
			        if (option == JOptionPane.YES_OPTION) {
			        	if(employeeId != idemp) {
			        		  boolean deleted = EmployeDao.deleteEmployeeAndAccount(employeeId);
			        		if (deleted) {	           	           
					            model.removeRow(selectedRow);
					            textEmployid.setText("");
						        textFirsrnameEmployee.setText(""); 
						        textlastNameEmployee.setText("");
					            maleRadio.setSelected(false);
					            femaleRadio.setSelected(false);
					            textAdressEmployee.setText("");
					            textPNEmployee.setText("");
					            textusernameEmployee.setText("");
					            textIdmngEnployee.setText("");
					            textPasswordEmployee.setText("");
					            datechooserEmployee.setDate(null);
					            comboBox_10.setSelectedIndex(0);
					            model.setRowCount(0); 
					    	    model.fireTableDataChanged();	            
					    	    btnNewButton_7_1.setEnabled(false);
				                btnNewButton_7_2.setEnabled(false);
				                btnNewButton_7.setEnabled(true);
					        } else {
					            JOptionPane.showMessageDialog(null, "failed.", "Message", JOptionPane.ERROR_MESSAGE);
					        }
			        	}else {
			        		JOptionPane.showMessageDialog(null, "You are logged in with this account.", "Message", JOptionPane.ERROR_MESSAGE);
			        	}
			      
			        
			        
			    } 
			        
			    }	 	     
			}
		});
		
		btnNewButton_7_1.setEnabled(false);
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		GroupLayout gl_panel_35 = new GroupLayout(panel_35);
		gl_panel_35.setHorizontalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addGap(271)
					.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_7_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(btnNewButton_7_2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel_35.setVerticalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_7)
						.addGroup(gl_panel_35.createSequentialGroup()
							.addGap(1)
							.addComponent(btnNewButton_7_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_35.createSequentialGroup()
							.addGap(1)
							.addComponent(btnNewButton_7_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(120, Short.MAX_VALUE))
		);
		panel_35.setLayout(gl_panel_35);
		
		panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "List Employee", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		panel_17 = new JPanel();
		panel_17.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		
		lblNewLabel_7 = new JLabel("Enter Information:");
		
		btnNewButton_6 = new JButton("Search");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnID.isSelected()) {
					 	DefaultTableModel model = new DefaultTableModel(); 
			            model.addColumn("ID");
					    model.addColumn("First Name");
					    model.addColumn("Last Name");
					    model.addColumn("Date of Birth");
					    model.addColumn("Gender");
					    model.addColumn("Address");
					    model.addColumn("Phone Number");
					    model.addColumn("Username");
					    model.addColumn("ID Mng");
					    model.addColumn("Password");
					    model.addColumn("Role");
					try {
						
						int idToSearch = Integer.parseInt(textField_2.getText());
						var empAndAcc = EmployeDao.getEmployeeAndAccountById(idToSearch);
						if(empAndAcc !=null) {
							 model.addRow(new Object[] {
						                empAndAcc.getIdEmp(),
						                empAndAcc.getFirstName(),
						                empAndAcc.getLastName(),
						                empAndAcc.getDob(),
						                empAndAcc.isGender() ? "Male" : "Female",
						                empAndAcc.getAddress(),
						                empAndAcc.getPhoneNb(),
						                empAndAcc.getUserName(),
						                empAndAcc.getIdMng(),
						                empAndAcc.getPassWord(),
						                empAndAcc.getRole()
						            });
						}
			           
			            tableEmployee.setModel(model);
			            tableEmployee.getColumn("Password").setMinWidth(0);
					    tableEmployee.getColumn("Password").setMaxWidth(0);
					    tableEmployee.getColumn("Password").setWidth(0);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Must be Number", "Message", JOptionPane.INFORMATION_MESSAGE);
					}
			        
			        
			        
			    } else if (rdbtnID_2.isSelected()) {
			        String nameToSearch = textField_2.getText();
			
			        List<EmpAndAcc> empList = EmployeDao.getEmployeesAndAccountsByFirstName(nameToSearch);

			        DefaultTableModel model = new DefaultTableModel();
			        model.setRowCount(0);
			        model.addColumn("ID");
				    model.addColumn("First Name");
				    model.addColumn("Last Name");
				    model.addColumn("Date of Birth");
				    model.addColumn("Gender");
				    model.addColumn("Address");
				    model.addColumn("Phone Number");
				    model.addColumn("Username");
				    model.addColumn("ID Mng");
				    model.addColumn("Password");
				    model.addColumn("Role");
			        for (EmpAndAcc empAndAcc : empList) {
			            model.addRow(new Object[] {
			            		empAndAcc.getIdEmp(),
				                empAndAcc.getFirstName(),
				                empAndAcc.getLastName(),
				                empAndAcc.getDob(),
				                empAndAcc.isGender() ? "Male" : "Female",
				                empAndAcc.getAddress(),
				                empAndAcc.getPhoneNb(),
				                empAndAcc.getUserName(),
				                empAndAcc.getIdMng(),
				                empAndAcc.getPassWord(),
				                empAndAcc.getRole()
			            });
			        }
			        tableEmployee.setModel(model);
		            tableEmployee.getColumn("Password").setMinWidth(0);
				    tableEmployee.getColumn("Password").setMaxWidth(0);
				    tableEmployee.getColumn("Password").setWidth(0);
			        
			    }else {
			    	JOptionPane.showMessageDialog(null, "Choose Option", "Message", JOptionPane.INFORMATION_MESSAGE);
			    }
			}
		});
		
		rdbtnID = new JRadioButton("ID");
		buttonGroup_4.add(rdbtnID);
		
		rdbtnID_2 = new JRadioButton("Name");
		buttonGroup_4.add(rdbtnID_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_17.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addComponent(rdbtnID, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(rdbtnID_2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(250))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_6)
							.addContainerGap(100, Short.MAX_VALUE))))
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_6))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnID)
						.addComponent(rdbtnID_2))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		panel_17.setLayout(gl_panel_17);
		GroupLayout gl_employeeInforPanel = new GroupLayout(employeeInforPanel);
		gl_employeeInforPanel.setHorizontalGroup(
			gl_employeeInforPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_employeeInforPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_employeeInforPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_employeeInforPanel.createSequentialGroup()
							.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 1287, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_employeeInforPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeInforPanel.createSequentialGroup()
								.addGroup(gl_employeeInforPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 1316, Short.MAX_VALUE)
									.addGroup(gl_employeeInforPanel.createSequentialGroup()
										.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 668, GroupLayout.PREFERRED_SIZE)
										.addGap(33)
										.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
							.addGroup(gl_employeeInforPanel.createSequentialGroup()
								.addComponent(panel_30, 0, 0, Short.MAX_VALUE)
								.addGap(2772)))))
		);
		gl_employeeInforPanel.setVerticalGroup(
			gl_employeeInforPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_employeeInforPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_employeeInforPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_35, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_17, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(706, Short.MAX_VALUE))
		);
		
		btnNewButton_15 = new JButton("⟲");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						List<EmpAndAcc> list = EmployeDao.getEmpAndAccs();		
						
						var model = new DefaultTableModel() {
						    public boolean isCellEditable(int row, int column) {
						        return false;
						    }
						};
					    
					    model.addColumn("ID");
					    model.addColumn("First Name");
					    model.addColumn("Last Name");
					    model.addColumn("Date of Birth");
					    model.addColumn("Gender");
					    model.addColumn("Address");
					    model.addColumn("Phone Number");
					    model.addColumn("Username");
					    model.addColumn("ID Mng");
					    model.addColumn("Password");
					    model.addColumn("Role");
					    
					    
					    list.forEach(empacc -> {
					        model.addRow(new Object[] {
					        		empacc.getIdEmp(),
					        		empacc.getFirstName(),
					        		empacc.getLastName(),
					        		empacc.getDob(),
					        		empacc.isGender() ? "Male" : "Female",
					        		empacc.getAddress(),
					        		empacc.getPhoneNb(),
					        		empacc.getUserName(),
					        		empacc.getIdMng(), 
					        		empacc.getPassWord(),
					        		empacc.getRole()           
					        });
					    });
					    
					    
					    tableEmployee.setModel(model);
					    tableEmployee.getColumn("Password").setMinWidth(0);
					    tableEmployee.getColumn("Password").setMaxWidth(0);
					    tableEmployee.getColumn("Password").setWidth(0);
				       
					}
			
		});
		
		panel_12 = new JPanel();
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 1243, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_15, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addComponent(btnNewButton_15)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		scrollPane_4 = new JScrollPane();
		panel_12.add(scrollPane_4, BorderLayout.CENTER);
		
		tableEmployee = new JTable();
		scrollPane_4.setViewportView(tableEmployee);
		tableEmployee.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tableEmployee.getSelectedRow();
		            if (selectedRow >= 0) {
		                Object id = tableEmployee.getValueAt(selectedRow, 0);
		                Object firstName = tableEmployee.getValueAt(selectedRow, 1);
		                Object lastName = tableEmployee.getValueAt(selectedRow, 2);
		                Object dateValue = tableEmployee.getValueAt(selectedRow, 3);
		                Object gender = tableEmployee.getValueAt(selectedRow, 4);
		                Object address = tableEmployee.getValueAt(selectedRow, 5);
		                Object phoneNumber = tableEmployee.getValueAt(selectedRow, 6);
		                Object username = tableEmployee.getValueAt(selectedRow, 7);
		                Object idMng = tableEmployee.getValueAt(selectedRow, 8);
		                Object password = tableEmployee.getValueAt(selectedRow, 9);
		                Object role = tableEmployee.getValueAt(selectedRow, 10);

		                if ("Male".equals(gender)) {
		                    maleRadio.setSelected(true);
		                } else if ("Female".equals(gender)) {
		                    femaleRadio.setSelected(true);
		                }

		                textEmployid.setText(id.toString());
		                textFirsrnameEmployee.setText(firstName.toString());
		                textlastNameEmployee.setText(lastName.toString());
		                LocalDate date = LocalDate.parse(dateValue.toString());
		                datechooserEmployee.setDate(java.sql.Date.valueOf(date));
		                textAdressEmployee.setText(address.toString());
		                textPNEmployee.setText(phoneNumber.toString());
		                textusernameEmployee.setText(username.toString());
		                textIdmngEnployee.setText(idMng.toString());
		                textPasswordEmployee.setText(password.toString());
		                comboBox_10.setSelectedItem(role);
		                btnNewButton_7_1.setEnabled(true);
		                btnNewButton_7_2.setEnabled(true);
		                btnNewButton_7.setEnabled(false);
		            }
		        }
		    }
		});
		
				panel_11.setLayout(gl_panel_11);
				
				lblNewLabel_18 = new JLabel("EMPLOYEE INFORMATION");
				lblNewLabel_18.setSize(new Dimension(20, 0));
				lblNewLabel_18.setPreferredSize(new Dimension(250, 40));
				lblNewLabel_18.setMaximumSize(new Dimension(200, 14));
				lblNewLabel_18.setForeground(Color.RED);
				lblNewLabel_18.setFont(new Font("Times New Roman", Font.PLAIN, 30));
				lblNewLabel_18.setBackground(Color.RED);
				GroupLayout gl_panel_34 = new GroupLayout(panel_34);
				gl_panel_34.setHorizontalGroup(
					gl_panel_34.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_34.createSequentialGroup()
							.addGap(481)
							.addComponent(lblNewLabel_18, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
							.addGap(512))
				);
				gl_panel_34.setVerticalGroup(
					gl_panel_34.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_34.createSequentialGroup()
							.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(21, Short.MAX_VALUE))
				);
				panel_34.setLayout(gl_panel_34);
				employeeInforPanel.setLayout(gl_employeeInforPanel);
		
		JPanel otherPanel = new JPanel();
		tabbedMainPanel.addTab("Other", null, otherPanel, null);
		
		JPanel panel_21_1 = new JPanel();
		
		JLabel lblNewLabel_17_1 = new JLabel("OTHER");
		lblNewLabel_17_1.setForeground(Color.RED);
		lblNewLabel_17_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel_21_1.add(lblNewLabel_17_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new TitledBorder(null, "Unit", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(null, "DrugCategory", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_13_1 = new JPanel();
		panel_13_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Supplier", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel nameSupplierText = new JLabel("NameUnit");
		
		JLabel idSupplierText = new JLabel("idUnit");
		
		JButton btnUnitAdd_1 = new JButton("Add");
		btnUnitAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String supplierName = textSuppliername.getText();
				if (supplierName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter complete information.", "Message", JOptionPane.WARNING_MESSAGE);
			    }else {
			    	SupplierDAO.insertSupplierToDb(supplierName);
			    	textSuppliername.setText("");
			    }
			}
		});
		
		textIdSupplier = new JTextField();
		textIdSupplier.setEnabled(false);
		textIdSupplier.setColumns(10);
		textIdSupplier.setBackground(Color.WHITE);
		
		textSuppliername = new JTextField();
		textSuppliername.setColumns(10);
		JButton btnUpdateUnit_1 = new JButton("Update");
		JButton btnUnitdelete_1 = new JButton("Delete");
		btnUpdateUnit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					SupplierDAO.updateSupplierInDb(Integer.parseInt(textIdSupplier.getText()), textSuppliername.getText());
					textIdSupplier.setText("");
					textSuppliername.setText("");
					btnUnitdelete_1.setEnabled(false);
					btnUnitAdd_1.setEnabled(true);
					btnUpdateUnit_1.setEnabled(false);
				}
			}
		});
		btnUpdateUnit_1.setEnabled(false);
		
		btnUnitdelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					SupplierDAO.deleteSupplierFromDb(Integer.parseInt(textIdSupplier.getText()));
					textIdSupplier.setText("");
					textSuppliername.setText("");
					btnUnitdelete_1.setEnabled(false);
					btnUnitAdd_1.setEnabled(true);
					btnUpdateUnit_1.setEnabled(false);
				}
			}
		});
		btnUnitdelete_1.setEnabled(false);
		
		
		
		JButton btnNewButton_10_1 = new JButton("⟲");
		btnNewButton_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					List<Supplier> list = SupplierDAO.getListSuppliers();
		        
		        DefaultTableModel model = new DefaultTableModel() {
		            @Override
		            public boolean isCellEditable(int row, int column) {
		                return false; 
		            }
		        };
		        
		        model.addColumn("id Supplier");
		        model.addColumn("Name Supplier");
		        
		        
		        list.forEach(sup -> {
		            
		            model.addRow(new Object[] {sup.getIdSupplier(), sup.getNameSupplier()});
		        });
		        
		        tableSupplier.setModel(model);
		        textIdSupplier.setText("");
		        textSuppliername.setText("");
		        btnUnitdelete_1.setEnabled(false);
				btnUnitAdd_1.setEnabled(true);
				btnUpdateUnit_1.setEnabled(false);
			}
		});
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		GroupLayout gl_panel_13_1 = new GroupLayout(panel_13_1);
		gl_panel_13_1.setHorizontalGroup(
			gl_panel_13_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 655, Short.MAX_VALUE)
				.addGroup(gl_panel_13_1.createSequentialGroup()
					.addGroup(gl_panel_13_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_13_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_13_1.createParallelGroup(Alignment.LEADING)
								.addComponent(nameSupplierText, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(idSupplierText, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnUnitAdd_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_panel_13_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_13_1.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_panel_13_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textIdSupplier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textSuppliername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_13_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUnitdelete_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpdateUnit_1)))
					.addGap(64)
					.addGroup(gl_panel_13_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_10_1)
						.addComponent(scrollPane_1_1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(81, Short.MAX_VALUE))
		);
		gl_panel_13_1.setVerticalGroup(
			gl_panel_13_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 236, Short.MAX_VALUE)
				.addGroup(gl_panel_13_1.createSequentialGroup()
					.addGroup(gl_panel_13_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_13_1.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_panel_13_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(idSupplierText, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(textIdSupplier, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(gl_panel_13_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(nameSupplierText)
								.addComponent(textSuppliername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_13_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnUnitAdd_1)
								.addComponent(btnUnitdelete_1)
								.addComponent(btnUpdateUnit_1)))
						.addGroup(gl_panel_13_1.createSequentialGroup()
							.addGap(12)
							.addComponent(btnNewButton_10_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_1_1, 0, 0, Short.MAX_VALUE)))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		
		tableSupplier = new JTable();
		scrollPane_1_1.setViewportView(tableSupplier);
		tableSupplier.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tableSupplier.getSelectedRow();
		            if (selectedRow >= 0) {
		               
		                int idUnit = (int) tableSupplier.getValueAt(selectedRow, 0);
		                String nameUnit = (String) tableSupplier.getValueAt(selectedRow, 1);
		                
		                
		               
		                textIdSupplier.setText(Integer.toString(idUnit));
		                textSuppliername.setText(nameUnit);
		                btnUnitdelete_1.setEnabled(true);
		                btnUnitAdd_1.setEnabled(false);
		                btnUpdateUnit_1.setEnabled(true);
		            }
		        }
		    }
		});
		panel_13_1.setLayout(gl_panel_13_1);
		GroupLayout gl_otherPanel = new GroupLayout(otherPanel);
		gl_otherPanel.setHorizontalGroup(
			gl_otherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_otherPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_otherPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_21_1, GroupLayout.PREFERRED_SIZE, 1307, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_otherPanel.createSequentialGroup()
							.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 655, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_13_1, GroupLayout.PREFERRED_SIZE, 655, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(2784, Short.MAX_VALUE))
		);
		gl_otherPanel.setVerticalGroup(
			gl_otherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_otherPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_21_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_otherPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_13_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(578, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_23 = new JLabel("IdCate");
		
		JLabel lblNewLabel_26 = new JLabel("CategoryName");
		
		testIdCate = new JTextField();
		testIdCate.setEnabled(false);
		testIdCate.setColumns(10);
		testIdCate.setBackground(Color.WHITE);
		
		textCateName = new JTextField();
	
		textCateName.setColumns(10);
		textCateName.setBackground(Color.WHITE);
		
		JButton btnAddCate = new JButton("Add");
		btnAddCate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CategoryName = textCateName.getText();
				if (CategoryName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter complete information.", "Message", JOptionPane.WARNING_MESSAGE);
			    }else {
			    	DrugCategoryDao.insertDrugCategoryToDb(CategoryName);
			    	textCateName.setText("");
			    }
			}
		});
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		
		
		JButton btnDeleteCate = new JButton("Delete");
		btnDeleteCate.setEnabled(false);
		btnDeleteCate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					var check = DrugCategoryDao.deleteDrugCategoryFromDb(Integer.parseInt(testIdCate.getText()));
					if(check) {
						testIdCate.setText("");
						textCateName.setText("");
						btnDeleteCate.setEnabled(false);
						btnUpdateCate.setEnabled(false);
						btnAddCate.setEnabled(true);
					}else {
						JOptionPane.showMessageDialog(null, "Category is in use", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
				}
				
			}
		});
		JButton btnNewButton_11 = new JButton("⟲");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<DrugCategory> list = DrugCategoryDao.getListDrugCategories();
	        
	        DefaultTableModel model = new DefaultTableModel() {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false; 
	            }
	        };
	        
	        model.addColumn("id Unit");
	        model.addColumn("Name Unit");
	        
	        
	        list.forEach(cate -> {
	            
	            model.addRow(new Object[] {cate.getIdCate(), cate.getCategoryName()});
	        });
	        
	        tableCategory.setModel(model);
	        testIdCate.setText("");
			textCateName.setText("");
			btnDeleteCate.setEnabled(false);
			btnAddCate.setEnabled(true);
			btnUpdateCate.setEnabled(false);
			}
		});
		
		btnUpdateCate = new JButton("Update");
		btnUpdateCate.setEnabled(false);
		btnUpdateCate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					var check = DrugCategoryDao.updateDrugCategoryInDb(Integer.parseInt(testIdCate.getText()), textCateName.getText());
					if(check) {
						testIdCate.setText("");
						textCateName.setText("");
						btnDeleteCate.setEnabled(false);
						btnAddCate.setEnabled(true);
						btnUpdateCate.setEnabled(false);
					}else {
						JOptionPane.showMessageDialog(null, "Cannot delete Supplier", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		});
		GroupLayout gl_panel_16 = new GroupLayout(panel_16);
		gl_panel_16.setHorizontalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_23, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_16.createSequentialGroup()
							.addGroup(gl_panel_16.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnAddCate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_26, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_16.createSequentialGroup()
									.addGap(38)
									.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
										.addComponent(testIdCate, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addComponent(textCateName, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_16.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnDeleteCate)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnUpdateCate)))))
					.addGap(18)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_11)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
					.addGap(45))
		);
		gl_panel_16.setVerticalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_11)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_16.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_23)
								.addComponent(testIdCate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_26)
								.addComponent(textCateName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAddCate)
								.addComponent(btnDeleteCate)
								.addComponent(btnUpdateCate)))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
					.addGap(36))
		);
		
		tableCategory = new JTable();
		scrollPane_2.setViewportView(tableCategory);
		tableCategory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tableCategory.getSelectedRow();
		            if (selectedRow >= 0) {
		               
		                int idCate = (int) tableCategory.getValueAt(selectedRow, 0);
		                String nameCate = (String) tableCategory.getValueAt(selectedRow, 1);
		                
		                
		               
		                testIdCate.setText(Integer.toString(idCate));
		                textCateName.setText(nameCate);
		                btnDeleteCate.setEnabled(true);
		                btnAddCate.setEnabled(false);
		                btnUpdateCate.setEnabled(true);
		            }
		        }
		    }
		});
		panel_16.setLayout(gl_panel_16);
		
		JLabel lblNewLabel_25 = new JLabel("NameUnit");
		
		textidUnit = new JTextField();
		textidUnit.setBackground(new Color(255, 255, 255));
		textidUnit.setEnabled(false);
		textidUnit.setColumns(10);
		
		textNameUnit = new JTextField();
		textNameUnit.setColumns(10);
		
		JButton btnUnitAdd = new JButton("Add");
		btnUnitAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String unitName = textNameUnit.getText();
				if (unitName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter complete information.", "Message", JOptionPane.WARNING_MESSAGE);
			    }else {
			    	UnitDAO.insertUnitToDb(textNameUnit.getText());
					textNameUnit.setText("");
			    }
				
			}
		});
		
		JButton btnUnitdelete = new JButton("Delete");
		btnUnitdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					var check = UnitDAO.deleteUnitFromDb(Integer.parseInt(textidUnit.getText()));
					if(check) {
						textidUnit.setText("");
						textNameUnit.setText("");
						btnUnitdelete.setEnabled(false);
						btnUnitAdd.setEnabled(true);
						btnUpdateUnit.setEnabled(false);
					}else {
						JOptionPane.showMessageDialog(null, "Unit being used", "Message", JOptionPane.WARNING_MESSAGE);
					}
					
				}
				
			}
		});
		btnUnitdelete.setEnabled(false);
		btnNewButton_10 = new JButton("⟲");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					List<Unit> list = UnitDAO.getListUnits();
		        
		        DefaultTableModel model = new DefaultTableModel() {
		            @Override
		            public boolean isCellEditable(int row, int column) {
		                return false; 
		            }
		        };
		        
		        model.addColumn("id Unit");
		        model.addColumn("Name Unit");
		        
		        
		        list.forEach(unit -> {
		            
		            model.addRow(new Object[] {unit.getIdUnit(), unit.getNameUnit()});
		        });
		        
		        tableUnit.setModel(model);
		        textidUnit.setText("");
				textNameUnit.setText("");
				btnUnitdelete.setEnabled(false);
				btnUnitAdd.setEnabled(true);
				btnUpdateUnit.setEnabled(false);
			}
		});
		
		JLabel lblNewLabel_24 = new JLabel("idUnit");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		tableUnit = new JTable();
		scrollPane_1.setViewportView(tableUnit);
		tableUnit.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()) {
		            int selectedRow = tableUnit.getSelectedRow();
		            if (selectedRow >= 0) {
		               
		                int idUnit = (int) tableUnit.getValueAt(selectedRow, 0);
		                String nameUnit = (String) tableUnit.getValueAt(selectedRow, 1);
		                
		                
		               
		                textidUnit.setText(Integer.toString(idUnit));
		                textNameUnit.setText(nameUnit);
		                btnUnitdelete.setEnabled(true);
		                btnUnitAdd.setEnabled(false);
		                btnUpdateUnit.setEnabled(true);
		            }
		        }
		    }
		});
		
		btnUpdateUnit = new JButton("Update");
		btnUpdateUnit.setEnabled(false);
		btnUpdateUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Message", JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION) {
					UnitDAO.updateUnitInDb(Integer.parseInt(textidUnit.getText()), textNameUnit.getText());
					textidUnit.setText("");
					textNameUnit.setText("");
					btnUnitdelete.setEnabled(false);
					btnUnitAdd.setEnabled(true);
					btnUpdateUnit.setEnabled(false);
				}
			}
		});
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_25, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnUnitAdd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
								.addComponent(textidUnit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNameUnit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_13.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUnitdelete)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpdateUnit)))
					.addGap(64)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_10)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(textidUnit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(gl_panel_13.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_25)
								.addComponent(textNameUnit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnUnitAdd)
								.addComponent(btnUnitdelete)
								.addComponent(btnUpdateUnit)))
						.addGroup(gl_panel_13.createSequentialGroup()
							.addGap(12)
							.addComponent(btnNewButton_10)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_1, 0, 0, Short.MAX_VALUE)))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		otherPanel.setLayout(gl_otherPanel);
	}
}
