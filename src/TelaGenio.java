import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGenio {

	private JFrame frame;
	JLabel txtFrase = new JLabel("New label");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGenio window = new TelaGenio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setBounds(0, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnPalpite = new JButton("Palpite");
		
		btnPalpite.setBounds(26, 63, 89, 23);
		frame.getContentPane().add(btnPalpite);
		
		JSpinner txtValor = new JSpinner();
		txtValor.setBounds(37, 34, 46, 20);
		frame.getContentPane().add(txtValor);
		
		
		txtFrase.setBounds(36, 97, 250, 50);
		frame.getContentPane().add(txtFrase);
		
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double n= 1 + Math.random() * (6 - 1);
				int valor = (int) n;
				
				int num = Integer.parseInt(txtValor.getValue().toString());
				
				String f1= "<html>ACERTOU</html>";
				String f2 = "<html>ERROU!eu pensei no numero " + valor +"</html>";
				
				String res = (valor == num)?f1:f2;
				txtFrase.setFont(new Font(" Arial Black", Font.PLAIN,16));
				txtFrase.setText(res);
			
			}
		});
	}
	/**
	 * Create the application.
	 */
	public TelaGenio() {
		initialize();
		txtFrase.setText("<html>Vou pensar em um valor entre <strong>1 e 5</strong>.Tente adivinhar</html>");
	}

}
