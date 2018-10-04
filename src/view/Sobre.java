package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sobre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(25, 11, 77, 26);
		contentPane.add(lblNome);
		
		JLabel lblSobreOSoftware = new JLabel("Sobre o Software :");
		lblSobreOSoftware.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSobreOSoftware.setBounds(25, 48, 130, 26);
		contentPane.add(lblSobreOSoftware);
		
		JLabel lblNewLabel = new JLabel("Vers\u00E3o :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 85, 77, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblDataDaVerso = new JLabel("Data da Vers\u00E3o :");
		lblDataDaVerso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDataDaVerso.setBounds(25, 122, 130, 26);
		contentPane.add(lblDataDaVerso);
	}
}
