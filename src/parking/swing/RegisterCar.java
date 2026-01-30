package parking.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import parking.db.ParkingDAO;
import parking.db.ParkingVO;

import javax.swing.DefaultComboBoxModel;

@SuppressWarnings({"serial", "rawtypes"})
public class RegisterCar extends JFrame{
	private JTextField textFieldPlateNum;
	private JTextField textFieldDriverName;
	private JTextField textFieldLicenseNum;
	private JTextField textFieldAddress;


	JComboBox comboBox = new JComboBox();
	
	ParkingVO vo = null;
	ParkingDAO dao = new ParkingDAO();
	
	@SuppressWarnings( "unchecked" )
	public RegisterCar() {
		super("");
		getContentPane().setBackground(new Color(0, 0, 0));
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(57, 57, 57));
		panel.setBounds(12, 10, 760, 65);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnRegisterForm = new JButton("Register");
		
		btnRegisterForm.setForeground(new Color(255, 255, 255));
		btnRegisterForm.setBackground(new Color(74, 74, 74));
		btnRegisterForm.setBounds(623, 10, 125, 45);
		btnRegisterForm.setBorderPainted(false);
		btnRegisterForm.setFocusPainted(false);
		panel.add(btnRegisterForm);
		
		JButton btnExit = new JButton("Exit");
		
		btnExit.setForeground(Color.WHITE);
		btnExit.setFocusPainted(false);
		btnExit.setBorderPainted(false);
		btnExit.setBackground(new Color(74, 74, 74));
		btnExit.setBounds(12, 10, 125, 45);
		panel.add(btnExit);
		
		JButton btnManage = new JButton("Manage");
		btnManage.setForeground(Color.WHITE);
		btnManage.setFocusPainted(false);
		btnManage.setBorderPainted(false);
		btnManage.setBackground(new Color(74, 74, 74));
		btnManage.setBounds(486, 10, 125, 45);
		panel.add(btnManage);
		
		JButton btnParkingLot = new JButton("Parking Lot");
		btnParkingLot.setForeground(Color.WHITE);
		btnParkingLot.setFocusPainted(false);
		btnParkingLot.setBorderPainted(false);
		btnParkingLot.setBackground(new Color(74, 74, 74));
		btnParkingLot.setBounds(349, 10, 125, 45);
		panel.add(btnParkingLot);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(74, 74, 74));
		panel_1.setBounds(12, 87, 760, 464);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(79, 79, 79));
		panel_2.setBounds(12, 10, 736, 64);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register a Car");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 72));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(163, 2, 573, 73);
		panel_2.add(lblNewLabel);
		
		textFieldPlateNum = new JTextField();
		textFieldPlateNum.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		textFieldPlateNum.setBackground(new Color(79, 79, 79));
		textFieldPlateNum.setBounds(348, 84, 400, 46);
		textFieldPlateNum.setColumns(10);
		textFieldPlateNum.setBorder(null);
		panel_1.add(textFieldPlateNum);
		
		JLabel lblNewLabel_1 = new JLabel("Plate Number 자동차번호판");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_1.setBounds(12, 84, 314, 46);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Driver Name 이 름");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(12, 142, 314, 46);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("License Number 운전면허번호");
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_1_2.setBounds(12, 198, 323, 46);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address 주 소");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_3.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_1_3.setBounds(12, 254, 314, 46);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Parking Type 주차장소");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_4.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_1_4.setBounds(12, 312, 314, 46);
		panel_1.add(lblNewLabel_1_4);
		
		textFieldDriverName = new JTextField();
		textFieldDriverName.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		textFieldDriverName.setColumns(10);
		textFieldDriverName.setBorder(null);
		textFieldDriverName.setBackground(new Color(79, 79, 79));
		textFieldDriverName.setBounds(348, 142, 400, 46);
		panel_1.add(textFieldDriverName);
		
		textFieldLicenseNum = new JTextField();
		textFieldLicenseNum.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		textFieldLicenseNum.setColumns(10);
		textFieldLicenseNum.setBorder(null);
		textFieldLicenseNum.setBackground(new Color(79, 79, 79));
		textFieldLicenseNum.setBounds(348, 198, 400, 46);
		panel_1.add(textFieldLicenseNum);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBorder(null);
		textFieldAddress.setBackground(new Color(79, 79, 79));
		textFieldAddress.setBounds(348, 255, 400, 46);
		panel_1.add(textFieldAddress);
		
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" normal", " disabled", " compact", " maternity", " ev"}));
		comboBox.setBackground(new Color(79, 79, 79));
		comboBox.setBounds(348, 312, 400, 46);
		comboBox.setBorder(BorderFactory.createEmptyBorder());
		panel_1.add(comboBox);
		
		JButton btnRegister = new JButton("Register");
		
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFocusPainted(false);
		btnRegister.setBorderPainted(false);
		btnRegister.setBackground(new Color(79, 79, 79));
		btnRegister.setBounds(12, 409, 736, 45);
		panel_1.add(btnRegister);
		
		
		
		setVisible(true);
		
		btnRegisterForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCarInfo();
			}
		});
		
	}
	
	protected void setCarInfo() {
		String plateNum = textFieldPlateNum.getText().trim();
		String driverName = textFieldDriverName.getText().trim();
		String licenseNum = textFieldLicenseNum.getText().trim();
		String address = textFieldAddress.getText().trim();
		int intLicenseNum = Integer.parseInt(licenseNum);
		int intAddress = Integer.parseInt(address);
		String parkingType = comboBox.getSelectedItem()+"";
		
		String regExPlateNum = "^\\d{2,3}[가-힣]{1}\\d{4}$";
		String regExLicenseNum = "^([0-9]{2}-){2}[0-9]{6}-[0-9]{2}$ ";
		String regExAddress = "^\\d{3}";
		
		if(plateNum.equals("") || driverName.equals("") 
				|| licenseNum.equals("") || address.equals("")) {
			JOptionPane.showMessageDialog(null, "Please fill out all the required fields.");
			textFieldPlateNum.requestFocus();
		}else if(!Pattern.matches(regExPlateNum, plateNum) || !Pattern.matches(regExAddress, address)  
				|| !Pattern.matches(regExLicenseNum, licenseNum)) {
			JOptionPane.showMessageDialog(null, "Invalid Format");
		}else {
			vo = dao.getCarByPlateNum(plateNum);
			if(vo.getPlateNum() != null) {
				JOptionPane.showMessageDialog(null, "The plate number already exist.");
				textFieldPlateNum.requestFocus();
				//update?
			}else {
				vo.setPlateNum(plateNum);
				vo.setDriverName(driverName);
				vo.setLicenseNum(intLicenseNum);
				vo.setDriverAddress(intAddress);
				vo.setParkingType(parkingType);
				
				int res = dao.upsertCarInfo(vo);
				
				if(res !=0) {
					JOptionPane.showMessageDialog(null, "a new car aproved");
					try {
						dao.connClose();
						dispose();
						new ParkingMain();
					} catch (Exception e) {}
				}
			}
		}
	}
	
	public static void main(String[] args) {		
		new RegisterCar();
	}
}
