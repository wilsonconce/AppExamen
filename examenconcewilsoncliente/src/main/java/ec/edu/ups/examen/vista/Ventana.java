package ec.edu.ups.examen.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JTable;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Id Producto");
		label.setBounds(10, 10, 62, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Descripcion");
		label_1.setBounds(10, 50, 62, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Precio");
		label_2.setBounds(10, 100, 62, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Peso");
		label_3.setBounds(10, 151, 62, 22);
		contentPane.add(label_3);
		
		TextField textField = new TextField();
		textField.setBounds(91, 10, 69, 22);
		contentPane.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(91, 50, 170, 22);
		contentPane.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(91, 100, 170, 22);
		contentPane.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(91, 151, 170, 22);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(285, 9, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insertar");
		btnNewButton_1.setBounds(285, 50, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Actualizar");
		btnNewButton_2.setBounds(285, 84, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Listar");
		btnNewButton_3.setBounds(285, 118, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
