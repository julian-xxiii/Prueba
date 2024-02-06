package interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCampo;
	private JPanel panelBotones;
	private String operador;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton10;
	private JButton boton11;
	private JButton boton12;
	private JButton boton13;
	private JButton boton14;
	private JButton boton15;
	private JButton boton16;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setFont(new Font("Arial", Font.PLAIN, 23));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 628);
		ui();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setDividerLocation(120);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		textCampo = new JTextField();
		textCampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//PARA USAR DECIMALES
				char tecla = e.getKeyChar();
				if(tecla!='.') {
					e.consume();
				}
			}
		});
		textCampo.setFont(getFont());
		splitPane.setLeftComponent(textCampo);
		textCampo.setColumns(10);
		
		panelBotones = new JPanel();
		splitPane.setRightComponent(panelBotones);
		panelBotones.setLayout(new GridLayout(4, 4));
		
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 1);
			}
		});
		panelBotones.add(boton1);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 2);
			}
		});
		panelBotones.add(boton2);
		
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 3);
			}
		});
		panelBotones.add(boton3);
		
		boton4 = new JButton("+");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + "+");
				operador = "+";
			}
		});
		panelBotones.add(boton4);
		
		boton5 = new JButton("4");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 4);
			}
		});
		panelBotones.add(boton5);
		
		boton6 = new JButton("5");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 5);
			}
		});
		panelBotones.add(boton6);
		
		boton7 = new JButton("6");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 6);
			}
		});
		panelBotones.add(boton7);
		
		boton8 = new JButton("-");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + "-");
				operador = "-";
			}
		});
		panelBotones.add(boton8);
		
		boton9 = new JButton("7");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 7);
			}
		});
		panelBotones.add(boton9);
		
		boton10 = new JButton("8");
		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 8);
			}
		});
		panelBotones.add(boton10);
		
		boton11 = new JButton("9");
		boton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 9);
			}
		});
		panelBotones.add(boton11);
		
		boton12 = new JButton("x");
		boton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + "x");
				operador = "x";
			}
		});
		panelBotones.add(boton12);
		
		boton13 = new JButton("0");
		boton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + 0);
			}
		});
		panelBotones.add(boton13);
		
		boton14 = new JButton("AC");
		boton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCampo.setText("");
			}
		});
		panelBotones.add(boton14);
		
		boton15 = new JButton("CALC");
		boton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				calcular(actual);
			}
		});
		panelBotones.add(boton15);
		
		boton16 = new JButton("/");
		boton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actual = textCampo.getText();
				textCampo.setText(actual + "/");
				operador = "/";
			}
		});
		panelBotones.add(boton16);
	}
	
	public void calcular(String texto) {
		String[] numeros = texto.split(operador);
		if(numeros.length==2) {
			float num1 = Float.parseFloat(numeros[0]);
			float num2 = Float.parseFloat(numeros[1]);
			float resultado = 0;
			switch(operador) {
				case "+":
					resultado = num1 + num2;
					break;
				case "-":
					resultado = num1 - num2;
					break;
				case "x":
					resultado = num1 * num2;
					break;
				case "/":
					if(num2!=0) {
						resultado = num1 / num2;
					}else {
						JOptionPane.showMessageDialog(boton1, "No puedo dividir entre 0");
					}
					break;
			}
			String actual = textCampo.getText();
			textCampo.setText(actual + "=" + resultado);
		}else {
			JOptionPane.showMessageDialog(boton1, "Solo puedo operar entre 2 números");
		}
		
	}
	
	public void ui() {
		UIManager.put("Button.background", Color.green.brighter());
		UIManager.put("Button.foreground", Color.black);
		UIManager.put("Button.font", getFont());
		SwingUtilities.updateComponentTreeUI(this);
	}
}
