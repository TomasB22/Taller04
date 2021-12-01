package gui;

import model.DesastreBio;
import model.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregar extends JFrame {
	private DesastreBio desastreBio;
	private VentanaLista ventanaLista;
	private JPanel panel2 = new JPanel();
	private JLabel nombreLabel =  new JLabel("Nombre: ");
	private JTextField nombreInput = new JTextField(10);
	private JLabel edadLabel= new JLabel("Edad: ");
	private JTextField edadInput = new JTextField(10);
	private JLabel sexoLabel = new JLabel("Sexo: ");
	private JComboBox sexoInput ;
	private JLabel estadoLabel = new JLabel("Estado: ");
	private JComboBox estadoInput;
	private JButton botonAdd = new JButton("Añadir");
	private JLabel error = new JLabel("Error");

	public VentanaAgregar(DesastreBio desastreBio){
		super("Agregar Persona Afectada");
		initVentanaAgregar();
		this.desastreBio = desastreBio;
		setSize (700,300);

		setLocationRelativeTo(null);
	}

	private void initVentanaAgregar() {

		String[] estados = {"vivo","muerto","desaparecido"};
		estadoInput=new JComboBox(estados);
		estadoInput.setSize(10,30);

		String[] sexos = {"Femenino","Masculino"};
		sexoInput = new JComboBox(sexos);
		sexoInput.setSize(10,30);

		botonAdd.setVisible(true);
		añadirPanel();
		this.add(panel2);
		error.setVisible(false);

		botonAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					if (estadoInput.getSelectedItem().toString().equals("desaparecido")){
						desastreBio.personasDesaparecidas.add(new Persona(nombreInput.getText(),Integer.parseInt(edadInput.getText()),sexoInput.getSelectedItem().toString(),estadoInput.getSelectedItem().toString()));
					}
					dispose();
				}catch (Exception exception){
					error.setVisible(true);
				}
			}
		});
	}

	private void añadirPanel() {
		panel2.add(nombreLabel);
		panel2.add(nombreInput);
		panel2.add(edadLabel);
		panel2.add(edadInput);
		panel2.add(sexoLabel);
		panel2.add(sexoInput);
		panel2.add(estadoLabel);
		panel2.add(estadoInput);
		panel2.add(botonAdd);
		panel2.add(error);
	}

}