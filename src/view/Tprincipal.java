package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Tprincipal extends JFrame {

	private JPanel contentPane;
	CadastroProduto telaCadastro = new CadastroProduto();
	Sobre sobre = new Sobre();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tprincipal frame = new Tprincipal();
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
	public Tprincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 446);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastrar = new JMenu("Cadastrar");
		mnCadastrar.setIcon(new ImageIcon(Tprincipal.class.getResource("/icones/icons8-lista-com-marcadores.png")));
		menuBar.add(mnCadastrar);

		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setIcon(
				new ImageIcon(Tprincipal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		mnCadastrar.add(mntmClientes);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 10, 1900, 930);
		contentPane.add(desktopPane);

		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		telaCadastro.setLocation(96, 29);

		desktopPane.add(telaCadastro);

		mntmProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Mostra o frame interno
				if (!telaCadastro.isVisible()) {
					telaCadastro.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "tela já criada");
				}
			}
		});
		mntmProdutos.setIcon(new ImageIcon(Tprincipal.class.getResource("/icones/icons8-comprar.png")));
		mnCadastrar.add(mntmProdutos);

		JMenu mnVisualizarClientes = new JMenu("Informa\u00E7\u00F5es");
		mnVisualizarClientes
				.setIcon(new ImageIcon(Tprincipal.class.getResource("/icones/icons8-documento-regular.png")));
		menuBar.add(mnVisualizarClientes);

		JMenuItem mntmClientes_1 = new JMenuItem("Sobre o software");
		mntmClientes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				if (!sobre.isVisible()) {
					sobre.setVisible(true);
				}

			}
		});
		mntmClientes_1
				.setIcon(new ImageIcon(Tprincipal.class.getResource("/icones/icons8-\u0441harlie-\u0441haplin.png")));
		mnVisualizarClientes.add(mntmClientes_1);

	}

}
