package gui;

import model.DesastreBio;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class VentanaLista extends JFrame {
	private JTable tabla;
	private JPanel panel1 = new JPanel();
	private JButton añadir = new JButton("Añadir");
	private DesastreBio desastreBio;


	public VentanaLista(DesastreBio desastreBio){
		super("Lista Personas Desaparecidas");
		this.desastreBio = desastreBio;
		initVentanaAgregar();
		setSize (700,300);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setLocationRelativeTo(null);


	}

	private void initVentanaAgregar() {
		String[] categorias = {"Nombre","Edad","Sexo","Estado"};
		String[][] datos = new String[4][desastreBio.personasDesaparecidas.size()];
		for (int i=0;i<desastreBio.personasDesaparecidas.size();i++){
			datos[0][i]=desastreBio.personasDesaparecidas.get(0).getNombre();
			datos[1][i]= String.valueOf(desastreBio.personasDesaparecidas.get(1).getEdad());
			datos[2][i]=desastreBio.personasDesaparecidas.get(2).getSexo();
			datos[3][i]=desastreBio.personasDesaparecidas.get(3).getEstado();
		}

		JTable tabla = new JTable(datos,categorias);
		add(new JScrollPane(tabla),BorderLayout.CENTER);
		this.add(panel1);
		añadirPanel(tabla);
	}

	private void añadirPanel(JTable tabla) {
		panel1.add(tabla);
		panel1.add(añadir);
	}

	private JFrame getFrame(){
		return this;
	}
}
