package parking.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ParkingMain extends JFrame{
	
	public ParkingMain() {
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
		
		JButton btnNewButton = new JButton("Register");
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(74, 74, 74));
		btnNewButton.setBounds(623, 10, 125, 45);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		panel.add(btnNewButton);
		
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
		
		
		
		setVisible(true);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {		
		new ParkingMain();
	}
}
