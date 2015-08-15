package ModuloCalculo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import cuadriculas.dibujo;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class DibujarTriangulo extends JFrame {

	private JPanel contentPane;
	private dibujo dibujito;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DibujarTriangulo frame = new DibujarTriangulo();
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
	public DibujarTriangulo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(40, 30, 901, 601);
		panel.setLayout(new BorderLayout(0, 0));
		dibujito = new dibujo();
		panel.add(dibujito);
		contentPane.add(panel);
	}
}
