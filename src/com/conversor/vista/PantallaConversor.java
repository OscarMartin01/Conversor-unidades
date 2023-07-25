package com.conversor.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.conversor.modelo.*;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class PantallaConversor extends JFrame implements ActionListener, Params {

	private JPanel contentPane, panel, panel_1, panel_3;
	private JTextField textField, textField_1, textField_2, textField_3, textField_4, textField_5;
	private JButton btnNewButton, btnNewButton_1, btnNewButton_2;
	private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
	private JLabel lblNewLabel_5, lblNewLabel_4, lblNewLabel_10, lblNewLabel_14;

	public PantallaConversor() {

//**********************************VENTANA************************************

		setResizable(false);
		setTitle("Conversor unidades");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showInternalMessageDialog(null, "Hola");
		setBounds(500, 100, 700, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaConversor.class.getResource("/img/icono.png")));

//********************************PANEL TEMPERATURA*******************************

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 686, 300);
		panel.setLayout(null);
		panel.setVisible(false);
		contentPane.add(panel);

		lblNewLabel_5 = new JLabel("Conversor de temperatura");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_5.setBounds(155, 28, 381, 39);
		panel.add(lblNewLabel_5);

		textField_2 = new JTextField("0");
		textField_2.setBounds(80, 120, 110, 30);
		textField_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		panel.add(textField_2);
		textField_2.setColumns(10);

		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Celsius a Fahrenheit", "Fahrenheit a Celsius" }));
		comboBox_1.setBounds(250, 120, 190, 30);
		comboBox_1.addActionListener(this);
		panel.add(comboBox_1);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(477, 120, 125, 30);
		textField_3.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField_3.setBackground(new Color(255, 255, 255));
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Valor Inicial");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_6.setBounds(94, 100, 96, 18);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Valor Final");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_7.setBounds(500, 100, 79, 17);
		panel.add(lblNewLabel_7);

		btnNewButton_1 = new JButton("Convertir");
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton_1.setBounds(250, 220, 180, 40);
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);

		lblNewLabel_4 = new JLabel("°C");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_4.setBounds(195, 124, 45, 26);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(0, 0, 686, 300);
		panel.add(lblNewLabel_9);
		SetImage(lblNewLabel_9, "src/img/temperatura.png");

//**********************************PANEL DIVISA************************************

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 686, 300);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel_10 = new JLabel("COP");
		lblNewLabel_10.setBackground(new Color(218, 218, 218));
		lblNewLabel_10.setBounds(244, 113, 58, 29);
		lblNewLabel_10.setBackground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_10);
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 20));

		// Texto entrada
		textField = new JTextField("0");
		textField.setBounds(97, 110, 140, 30);
		panel_1.add(textField);
		textField.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Divisa Inicial");
		lblNewLabel.setBounds(97, 95, 95, 13);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel lblNewLabel_1 = new JLabel("Tipo de divisa");
		lblNewLabel_1.setBounds(355, 95, 118, 13);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));

		// Selector
		comboBox = new JComboBox();
		comboBox.setBounds(355, 110, 267, 30);
		panel_1.add(comboBox);
		comboBox.setFont(new Font("SansSerif", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1-Peso Colombiano a Dólar",
				"2-Peso Colombiano a Euro", "3-Peso Colombiano a Libra Estrlina", "4-Peso Colombiano a Yen Japonés",
				"5-Peso Colombiano a Won Sul-coreano", "6-Dólar a Peso Colombiano", "7-Euro a Peso Colombiano",
				"8-Libra Esterlina a Peso Colombiano", "9-Yen Japonés a Peso Colombiano",
				"10-Won Sul-coreano a Peso Colombiano" }));

		// Boton
		btnNewButton = new JButton("Convertir");
		btnNewButton.setBounds(252, 160, 180, 40);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 20));

		// Texto salida
		textField_1 = new JTextField();
		textField_1.setBounds(191, 230, 301, 35);
		panel_1.add(textField_1);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		textField_1.setColumns(5);

		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(299, 213, 89, 13);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel lblNewLabel_3 = new JLabel("Conversor de divisas");
		lblNewLabel_3.setBounds(191, 25, 318, 45);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.addActionListener(this);
		comboBox.addActionListener(this);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(0, 0, 686, 300);
		panel_1.add(lblNewLabel_8);
		this.setLocationRelativeTo(this);
		SetImage(lblNewLabel_8, "src/img/moneda.png");
		lblNewLabel_8.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 300, 686, 40);
		contentPane.add(panel_2);

//******************************PANEL SELECCION*********************************

		comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(255, 255, 255));
		comboBox_2.setFont(new Font("Arial", Font.BOLD, 18));
		comboBox_2.setModel(new DefaultComboBoxModel(
				new String[] { "Conversor de divisa", "Conversor de temperatura", "Conversor de longitud" }));
		comboBox_2.setAlignmentX(CENTER_ALIGNMENT);
		comboBox_2.addActionListener(this);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_16 = new JLabel("Seleccione tipo de conversor:");
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 17));
		panel_2.add(lblNewLabel_16);
		panel_2.add(comboBox_2);

//******************************PANEL LONGITUD*********************************

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(0, 0, 686, 300);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setVisible(false);

		textField_4 = new JTextField("0");
		textField_4.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField_4.setBounds(162, 119, 110, 30);
		panel_3.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("SansSerif", Font.BOLD, 20));
		textField_5.setBackground(new Color(255, 255, 255));
		textField_5.setEditable(false);
		textField_5.setBounds(313, 165, 200, 30);
		panel_3.add(textField_5);
		textField_5.setColumns(10);

		comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "Centimetros a Metros", "Centimetros a Kilometros",
				"Centimetros a Yardas", "Centimetros a Pulgadas", "Centimetros a Pies", "Centimetros a Millas",
				"Metros a Centimetros", "Metros a Kilometros", "Metros a Yardas", "Metros a Pulgadas", "Metros a Pies",
				"Metros a Millas", "Kilometros a Centimetros", "Kilometros a Metros", "Kilometros a Yardas",
				"Kilometros a Pulgadas", "Kilometros a Pies", "Kilometros a Millas", "Yardas a Centimetros",
				"Yardas a Metros", "Yardas a Kilometros", "Yardas a Pulgadas", "Yardas a Pies", "Yardas a Millas",
				"Pulgadas a Centimetros", "Pulgadas a Metros", "Pulgadas a Kilometros", "Pulgadas a Yardas",
				"Pulgadas a Pies", "Pulgadas a Milllas", "Pies a Centimetros", "Pies a Metros", "Pies a Kilometros",
				"Pies a Yardas", "Pies a Pulgadas", "Pies a Millas", "Millas a Centimetros", "Millas a Metros",
				"Millas a Kilometros", "Millas a Yardas", "Millas a Pulgadas", "Millas a Pies" }));
		comboBox_3.setBackground(new Color(255, 255, 255));
		comboBox_3.setBounds(373, 121, 190, 30);
		comboBox_3.addActionListener(this);
		panel_3.add(comboBox_3);

		btnNewButton_2 = new JButton("Convertir");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton_2.setBounds(250, 220, 180, 40);
		panel_3.add(btnNewButton_2);

		JLabel lblNewLabel_11 = new JLabel("Conversor de longitud");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_11.setBounds(155, 28, 381, 39);
		lblNewLabel_11.setHorizontalAlignment(JTextField.CENTER);
		panel_3.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Valor Inicial");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_12.setBounds(176, 99, 96, 18);
		panel_3.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Valor Final");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_13.setBounds(212, 175, 79, 17);
		panel_3.add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("cm");
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_14.setBounds(277, 119, 45, 30);
		panel_3.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBounds(0, 0, 686, 300);
		panel_3.add(lblNewLabel_15);
		SetImage(lblNewLabel_15, "src/img/distancia.png");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			ConversorDivisa();
			textField_2.setText("0");
			textField_3.setText("");
			textField_4.setText("0");
			textField_5.setText("");
			comboBox_1.setSelectedIndex(0);
			comboBox_3.setSelectedIndex(0);
			lblNewLabel_4.setText("°C");
			lblNewLabel_14.setText("cm");

		}
		if (e.getSource() == btnNewButton_1) {
			ConversorTemperatura();
			textField.setText("0");
			textField_1.setText("");
			textField_4.setText("0");
			textField_5.setText("");
			comboBox.setSelectedIndex(0);
			comboBox_3.setSelectedIndex(0);
			lblNewLabel_10.setText("COP");
			lblNewLabel_14.setText("cm");
		}
		if (e.getSource() == btnNewButton_2) {
			ConversorDistancia();
			textField.setText("0");
			textField_1.setText("");
			textField_2.setText("0");
			textField_3.setText("");
			comboBox.setSelectedIndex(0);
			comboBox_1.setSelectedIndex(0);
			lblNewLabel_4.setText("°C");
			lblNewLabel_10.setText("COP");
		}
		if (e.getSource() == comboBox) {
			tipoMoneda();
		}

		if (e.getSource() == comboBox_1) {
			tipoTemperatura();
		}

		if (e.getSource() == comboBox_2) {
			tipoConversor();
		}

		if (e.getSource() == comboBox_3) {
			tipoDistancia();
		}
	}

	private void SetImage(JLabel labelName, String root) {
		ImageIcon image = new ImageIcon(root);
		Icon icon = new ImageIcon(
				image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
		labelName.setIcon(icon);
		this.repaint();
	}

	private void tipoMoneda() {
		int opcion = 1 + comboBox.getSelectedIndex();
		if (opcion >= 1 && opcion <= 5) {
			lblNewLabel_10.setText("COP");
		} else if (opcion == 6) {
			lblNewLabel_10.setText("USD");
		} else if (opcion == 7) {
			lblNewLabel_10.setText("EUR");
		} else if (opcion == 8) {
			lblNewLabel_10.setText("GBP");
		} else if (opcion == 9) {
			lblNewLabel_10.setText("JPY");
		} else {
			lblNewLabel_10.setText("KRW");
		}
	}

	private void tipoTemperatura() {
		int opcion = 1 + comboBox_1.getSelectedIndex();
		if (opcion == 1) {
			lblNewLabel_4.setText("°C");
		} else {
			lblNewLabel_4.setText("°F");
		}
	}

	private void tipoDistancia() {
		int opcion = 1 + comboBox_3.getSelectedIndex();
		if (opcion >= 1 && opcion <= 6) {
			lblNewLabel_14.setText("cm");
		} else if (opcion >= 7 && opcion <= 12) {
			lblNewLabel_14.setText("m");
		} else if (opcion >= 13 && opcion <= 18) {
			lblNewLabel_14.setText("km");
		} else if (opcion >= 19 && opcion <= 24) {
			lblNewLabel_14.setText("yd");
		} else if (opcion >= 25 && opcion <= 30) {
			lblNewLabel_14.setText("in");
		} else if (opcion >= 31 && opcion <= 36) {
			lblNewLabel_14.setText("ft");
		} else {
			lblNewLabel_14.setText("mi");
		}
	}

	private void tipoConversor() {
		int opcion = 1 + comboBox_2.getSelectedIndex();

		switch (opcion) {
		case 1:
			panel.setVisible(false);
			panel_1.setVisible(true);
			panel_3.setVisible(false);
			break;
		case 2:
			panel.setVisible(true);
			panel_1.setVisible(false);
			panel_3.setVisible(false);
			break;
		case 3:
			panel.setVisible(false);
			panel_1.setVisible(false);
			panel_3.setVisible(true);
			break;
		default:
			break;
		}
	}

	public void ConversorDivisa() {

		try {
			double entrada = Double.parseDouble(textField.getText());

			int opcion = 1 + comboBox.getSelectedIndex();
			switch (opcion) {
			case 1:
				textField_1.setText(String.format("%.2f", new DividirValor(entrada, dollar).resultado()) + " USD");
				break;
			case 2:
				textField_1.setText(String.format("%.2f", new DividirValor(entrada, euro).resultado()) + " EUR");
				break;
			case 3:
				textField_1.setText(String.format("%.2f", new DividirValor(entrada, libra).resultado()) + " GBP");
				break;
			case 4:
				textField_1.setText(String.format("%.2f", new DividirValor(entrada, yen).resultado()) + " JPY");
				break;
			case 5:
				textField_1.setText(String.format("%.2f", new DividirValor(entrada, won).resultado()) + " KRW");
				break;
			case 6:
				textField_1.setText(String.format("%.2f", new MultiplicarValor(entrada, dollar).resultado()) + " COP");
				break;
			case 7:
				textField_1.setText(String.format("%.2f", new MultiplicarValor(entrada, euro).resultado()) + " COP");
				break;
			case 8:
				textField_1.setText(String.format("%.2f", new MultiplicarValor(entrada, libra).resultado()) + " COP");
				break;
			case 9:
				textField_1.setText(String.format("%.2f", new MultiplicarValor(entrada, yen).resultado()) + " COP");
				break;
			case 10:
				textField_1.setText(String.format("%.2f", new MultiplicarValor(entrada, won).resultado()) + " COP");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida, seleccione nuevamente", "Advertencia",
						JOptionPane.WARNING_MESSAGE);
				break;
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato no valido", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void ConversorTemperatura() {

		try {

			double entrada = Double.parseDouble(textField_2.getText());

			int opcion = 1 + comboBox_1.getSelectedIndex();

			switch (opcion) {
			case 1:
				textField_3.setText(String.format("%.2f", new Fahrenheit(entrada).resultado()) + " °F");
				break;
			case 2:
				textField_3.setText(String.format("%.2f", new Celsius(entrada).resultado()) + " °C");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida, seleccione nuevamente", "Advertencia",
						JOptionPane.WARNING_MESSAGE);
				break;
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato no valido", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void ConversorDistancia() {
		try {
			double entrada = Double.parseDouble(textField_4.getText());

			int opcion = 1 + comboBox_3.getSelectedIndex();
			switch (opcion) {
			case 1:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var1).resultado()) + " m");
				break;
			case 2:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var3).resultado()) + " km");
				break;
			case 3:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var4).resultado()) + " yd");
				break;
			case 4:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var5).resultado()) + " in");
				break;
			case 5:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var6).resultado()) + " ft");
				break;
			case 6:
				textField_5.setText(
						String.format("%.5f", new DividirDistancia(entrada, (var16 * var3)).resultado()) + " mi");
				break;
			case 7:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var1).resultado()) + " cm");
				break;
			case 8:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var2).resultado()) + " km");
				break;
			case 9:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var7).resultado()) + " yd");
				break;
			case 10:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var8).resultado()) + " in");
				break;
			case 11:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var9).resultado()) + " ft");
				break;
			case 12:
				textField_5.setText(
						String.format("%.5f", new DividirDistancia(entrada, (var16 * var2)).resultado()) + " mi");
				break;
			case 13:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var3).resultado()) + " cm");
				break;
			case 14:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var1).resultado()) + " m");
				break;
			case 15:
				textField_5.setText(
						String.format("%.5f", new MultiplicarValor(entrada, (var7 * var2)).resultado()) + " yd");
				break;
			case 16:
				textField_5.setText(
						String.format("%.5f", new MultiplicarValor(entrada, (var8 * var2)).resultado()) + " in");
				break;
			case 17:
				textField_5.setText(
						String.format("%.5f", new MultiplicarValor(entrada, (var9 * var2)).resultado()) + " ft");
				break;
			case 18:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var16).resultado()) + " mi");
				break;
			case 19:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var4).resultado()) + " cm");
				break;
			case 20:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var7).resultado()) + " m");
				break;
			case 21:
				textField_5.setText(
						String.format("%.5f", new DividirDistancia(entrada, (var7 * var2)).resultado()) + " km");
				break;
			case 22:
				textField_5.setText(String.format("%.3f", new MultiplicarValor(entrada, var10).resultado()) + " in");
				break;
			case 23:
				textField_5.setText(String.format("%.3f", new MultiplicarValor(entrada, var11).resultado()) + " ft");
				break;
			case 24:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var12).resultado()) + " mi");
				break;
			case 25:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var5).resultado()) + " cm");
				break;
			case 26:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var8).resultado()) + " m");
				break;
			case 27:
				textField_5.setText(
						String.format("%.5f", new DividirDistancia(entrada, (var8 * var2)).resultado()) + " km");
				break;
			case 28:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var10).resultado()) + " yd");
				break;
			case 29:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var13).resultado()) + " ft");
				break;
			case 30:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var14).resultado()) + " mi");
				break;
			case 31:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var6).resultado()) + " cm");
				break;
			case 32:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var9).resultado()) + " m");
				break;
			case 33:
				textField_5.setText(
						String.format("%.5f", new DividirDistancia(entrada, (var9 * var2)).resultado()) + " km");
				break;
			case 34:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var11).resultado()) + " yd");
				break;
			case 35:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var13).resultado()) + " in");
				break;
			case 36:
				textField_5.setText(String.format("%.5f", new DividirDistancia(entrada, var15).resultado()) + " mi");
				break;
			case 37:
				textField_5.setText(
						String.format("%.5f", new MultiplicarValor(entrada, (var16 * var3)).resultado()) + " cm");
				break;
			case 38:
				textField_5.setText(
						String.format("%.5f", new MultiplicarValor(entrada, (var16 * var2)).resultado()) + " m");
				break;
			case 39:
				textField_5.setText(String.format("%.5f", new MultiplicarValor(entrada, var16).resultado()) + " km");
				break;
			case 40:
				textField_5.setText(String.format("%.3f", new MultiplicarValor(entrada, var12).resultado()) + " yd");
				break;
			case 41:
				textField_5.setText(String.format("%.3f", new MultiplicarValor(entrada, var14).resultado()) + " in");
				break;
			case 42:
				textField_5.setText(String.format("%.3f", new MultiplicarValor(entrada, var15).resultado()) + " ft");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida, seleccione nuevamente", "Advertencia",
						JOptionPane.WARNING_MESSAGE);
				break;
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato no valido", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
