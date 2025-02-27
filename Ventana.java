package menu;

import java.awt.Dimension;

import javax.swing.*;

public  class Ventana extends JFrame {

	public Ventana() {
		
		this.setTitle("Programa");
		this.setVisible(true);
		this.setSize(1000,800);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(3);
		
		this.setResizable(true);
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		
		JLabel texto = new JLabel("Bienvenido", JTextField.CENTER);
		texto.setBounds(500, 0, 100, 100);
		this.add(texto);
		
		
			String[] titles = {"Nombre", "Apellido","Edad"};
			
			Object[][] data = {
				    {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       {"Zian", "Gaxiola", (20)},
				       {"John", "Doe", (21)},
				       
				   };
				 
		JTable tabla = new JTable(data,titles);
		JScrollPane scroll_pane = new JScrollPane(tabla);
		tabla.setFillsViewportHeight(true);
		scroll_pane.setSize(850,300);
		scroll_pane.setLocation(70,120);
	this.add(scroll_pane);
	
	JMenuBar barra = new  JMenuBar();
	
	JMenu file = new JMenu ("Archivo");
	barra.add(file);
	
	JMenuItem abrir = new JMenuItem("Abrir");
	file.add(abrir);
	
	JMenuItem nuevo = new JMenuItem("Abrir");
	file.add(nuevo);
	
	JMenu ayuda = new JMenu ("Ayuda");
	barra.add(ayuda);
	
	JMenuItem manual = new JMenuItem("Manual");
	ayuda.add(manual);
	
	this.setJMenuBar(barra);
	
	}
}
