package Diseño;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Funcion.Funciones;

public class Principal extends JFrame{
	
	private JPanel pnlDisplay;
	private JPanel pnlJuego;
	
	private JPanel pnlImagen;
	
	private Icon img;
	
	private JLabel jlbValorar;
	
	private JButton btnJugar;
	
	private Funciones metodos;
	
	private JTextField tfLugar1;
	private JTextField tfLugar2;
	private JTextField tfLugar3;
	private JTextField tfLugar4;
	private JTextField tfLugar5;
	private JTextField tfLugar6;
	private JTextField tfLugar7;
	private JTextField tfLugar8;
	private JTextField tfLugar9;
	private JTextField tfLugar10;
	private JTextField tfLugar11;
	private JTextField tfLugar12;
	private JTextField tfLugar13;
	private JTextField tfLugar14;
	private JTextField tfLugar15;
	private JTextField tfLugar16;
	private JTextField tfLugar17;
	private JTextField tfLugar18;
	private JTextField tfLugar19;
	private JTextField tfLugar20;
	private JTextField tfLugar21;
	private JTextField tfLugar22;
	private JTextField tfLugar23;
	private JTextField tfLugar24;
	private JTextField tfLugar25;
	private JTextField tfLugar26;
	private JTextField tfLugar27;
	private JTextField tfLugar28;
	private JTextField tfLugar29;
	private JTextField tfLugar30;
	private JTextField tfLugar31;
	private JTextField tfLugar32;
	private JTextField tfLugar33;
	private JTextField tfLugar34;
	private JTextField tfLugar35;
	private JTextField tfLugar36;
	private JTextField tfLugar37;
	private JTextField tfLugar38;
	private JTextField tfLugar39;
	private JTextField tfLugar40;
	private JTextField tfLugar41;
	private JTextField tfLugar42;
	private JTextField tfLugar43;
	private JTextField tfLugar44;
	private JTextField tfLugar45;
	private JTextField tfLugar46;
	private JTextField tfLugar47;
	private JTextField tfLugar48;
	private JTextField tfLugar49;
	private JTextField tfLugar50;
	private JTextField tfLugar51;
	private JTextField tfLugar52;
	private JTextField tfLugar53;
	private JTextField tfLugar54;
	private JTextField tfLugar55;
	private JTextField tfLugar56;
	private JTextField tfLugar57;
	private JTextField tfLugar58;
	private JTextField tfLugar59;
	private JTextField tfLugar60;
	private JTextField tfLugar61;
	private JTextField tfLugar62;
	private JTextField tfLugar63;
	private JTextField tfLugar64;
	private JTextField tfLugar65;
	private JTextField tfLugar66;
	private JTextField tfLugar67;
	private JTextField tfLugar68;
	private JTextField tfLugar69;
	private JTextField tfLugar70;
	private JTextField tfLugar71;
	private JTextField tfLugar72;
	private JTextField tfLugar73;
	private JTextField tfLugar74;
	private JTextField tfLugar75;
	private JTextField tfLugar76;
	private JTextField tfLugar77;
	private JTextField tfLugar78;
	private JTextField tfLugar79;
	private JTextField tfLugar80;
	private JTextField tfLugar81;
	
	public Principal() {
		super("Sudoku");
		super.setSize(700, 500);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(new BorderLayout());
		
		pnlDisplay= new JPanel(new FlowLayout());
		pnlDisplay.setBackground( Color.WHITE);
		
		btnJugar=new JButton("Play");
		pnlDisplay.add(btnJugar);
		
		img = new ImageIcon(getClass().getResource("/icono1.gif"));
		pnlImagen = new JPanel(new BorderLayout());
		JLabel gif = new JLabel(img);
		pnlImagen.add(gif, BorderLayout.NORTH);
		pnlImagen.add(pnlDisplay,BorderLayout.SOUTH);
		
		
		
		pnlJuego=new JPanel(new BorderLayout());
		pnlJuego.setLayout(new GridLayout(9, 9));
		pnlJuego.setPreferredSize(new Dimension(600, 600));
		pnlJuego.setBackground(Color.BLACK);
		
		
		metodos = new Funciones();
		metodos.valores();
		
		tfLugar1=new JTextField();
		tfLugar1.setBackground(Color.WHITE);
		tfLugar1.setFont(new Font("Times New Roman", 2, 25));
		tfLugar1.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar2=new JTextField();
		tfLugar2.setBackground(Color.WHITE);
		tfLugar2.setFont(new Font("Times New Roman", 2, 25));
		tfLugar2.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar3=new JTextField();
		tfLugar3.setBackground(Color.WHITE);
		tfLugar3.setFont(new Font("Times New Roman", 2, 25));
		tfLugar3.setHorizontalAlignment(JTextField.CENTER);
		
		
		
		tfLugar4=new JTextField();
		tfLugar4.setBackground(Color.BLACK);
		tfLugar4.setFont(new Font("Times New Roman", 2, 25));
		tfLugar4.setForeground(Color.WHITE);
		tfLugar4.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar5=new JTextField();
		tfLugar5.setBackground(Color.BLACK);
		tfLugar5.setFont(new Font("Times New Roman", 2, 25));
		tfLugar5.setForeground(Color.WHITE);
		tfLugar5.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar6=new JTextField();
		tfLugar6.setBackground(Color.BLACK);
		tfLugar6.setFont(new Font("Times New Roman", 2, 25));
		tfLugar6.setForeground(Color.WHITE);
		tfLugar6.setHorizontalAlignment(JTextField.CENTER);
		
		
		
		tfLugar7=new JTextField();
		tfLugar7.setBackground(Color.WHITE);
		tfLugar7.setFont(new Font("Times New Roman", 2, 25));
		tfLugar7.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar7.setText(String.valueOf(metodos.matriz[2][1]));
		tfLugar7.setEditable(false);
		
		
		tfLugar8=new JTextField();
		tfLugar8.setBackground(Color.WHITE);
		tfLugar8.setFont(new Font("Times New Roman", 2, 25));
		tfLugar8.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar8.setText(String.valueOf(metodos.matriz[0][5]));
		tfLugar8.setEditable(false);
		
		tfLugar9=new JTextField();
		tfLugar9.setBackground(Color.WHITE);
		tfLugar9.setFont(new Font("Times New Roman", 2, 25));
		tfLugar9.setHorizontalAlignment(JTextField.CENTER);
	//	--------------------------------------
		tfLugar10=new JTextField();
		tfLugar10.setBackground(Color.WHITE);
		tfLugar10.setFont(new Font("Times New Roman", 2, 25));
		tfLugar10.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar11=new JTextField();
		tfLugar11.setBackground(Color.WHITE);
		tfLugar11.setFont(new Font("Times New Roman", 2, 25));
		tfLugar11.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar11.setText(String.valueOf(metodos.matriz[2][4]));
		tfLugar11.setEditable(false);
		
		
		tfLugar12=new JTextField();
		tfLugar12.setBackground(Color.WHITE);
		tfLugar12.setFont(new Font("Times New Roman", 2, 25));
		tfLugar12.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar12.setText(String.valueOf(metodos.matriz[0][6]));
		tfLugar12.setEditable(false);
		
		tfLugar13=new JTextField();
		tfLugar13.setBackground(Color.BLACK);
		tfLugar13.setFont(new Font("Times New Roman", 2, 25));
		tfLugar13.setForeground(Color.WHITE);
		tfLugar13.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar14=new JTextField();
		tfLugar14.setBackground(Color.BLACK);
		tfLugar14.setFont(new Font("Times New Roman", 2, 25));
		tfLugar14.setForeground(Color.WHITE);
		tfLugar14.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar15=new JTextField();
		tfLugar15.setBackground(Color.BLACK);
		tfLugar15.setFont(new Font("Times New Roman", 2, 25));
		tfLugar15.setForeground(Color.WHITE);
		tfLugar15.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar16=new JTextField();
		tfLugar16.setBackground(Color.WHITE);
		tfLugar16.setFont(new Font("Times New Roman", 2, 25));
		tfLugar16.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar17=new JTextField();
		tfLugar17.setBackground(Color.WHITE);
		tfLugar17.setFont(new Font("Times New Roman", 2, 25));
		tfLugar17.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar18=new JTextField();
		tfLugar18.setBackground(Color.WHITE);
		tfLugar18.setFont(new Font("Times New Roman", 2, 25));
		tfLugar18.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar19=new JTextField();
		tfLugar19.setBackground(Color.WHITE);
		tfLugar19.setFont(new Font("Times New Roman", 2, 25));
		tfLugar19.setHorizontalAlignment(JTextField.CENTER);
		
		
		tfLugar20=new JTextField();
		tfLugar20.setBackground(Color.WHITE);
		tfLugar20.setFont(new Font("Times New Roman", 2, 25));
		tfLugar20.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar21=new JTextField();
		tfLugar21.setBackground(Color.WHITE);
		tfLugar21.setFont(new Font("Times New Roman", 2, 25));
		tfLugar21.setHorizontalAlignment(JTextField.CENTER);
		
		
		tfLugar22=new JTextField();
		tfLugar22.setBackground(Color.BLACK);
		tfLugar22.setFont(new Font("Times New Roman", 2, 25));
		tfLugar22.setForeground(Color.WHITE);
		tfLugar22.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar23=new JTextField();
		tfLugar23.setBackground(Color.BLACK);
		tfLugar23.setFont(new Font("Times New Roman", 2, 25));
		tfLugar23.setForeground(Color.WHITE);
		tfLugar23.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar24=new JTextField();
		tfLugar24.setBackground(Color.BLACK);
		tfLugar24.setFont(new Font("Times New Roman", 2, 25));
		tfLugar24.setForeground(Color.WHITE);
		tfLugar24.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar24.setText(String.valueOf(metodos.matriz[2][1]));
		tfLugar24.setEditable(false);
		
		tfLugar25=new JTextField();
		tfLugar25.setBackground(Color.WHITE);
		tfLugar25.setFont(new Font("Times New Roman", 2, 25));
		tfLugar25.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar25.setText(String.valueOf(metodos.matriz[2][2]));
		tfLugar25.setEditable(false);
		
		
		tfLugar26=new JTextField();
		tfLugar26.setBackground(Color.WHITE);
		tfLugar26.setFont(new Font("Times New Roman", 2, 25));
		tfLugar26.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar27=new JTextField();
		tfLugar27.setBackground(Color.WHITE);
		tfLugar27.setFont(new Font("Times New Roman", 2, 25));
		tfLugar27.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar27.setText(String.valueOf(metodos.matriz[0][2]));
		tfLugar27.setEditable(false);
		
		tfLugar28=new JTextField();
		tfLugar28.setBackground(Color.BLACK);
		tfLugar28.setFont(new Font("Times New Roman", 2, 25));
		tfLugar28.setForeground(Color.WHITE);
		tfLugar28.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar28.setText(String.valueOf(metodos.matriz[0][7]));
		tfLugar28.setEditable(false);
		
		tfLugar29=new JTextField();
		tfLugar29.setBackground(Color.BLACK);
		tfLugar29.setFont(new Font("Times New Roman", 2, 25));
		tfLugar29.setForeground(Color.WHITE);
		tfLugar29.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar29.setText(String.valueOf(metodos.matriz[0][5]));
		tfLugar29.setEditable(false);
		
		tfLugar30=new JTextField();
		tfLugar30.setBackground(Color.BLACK);
		tfLugar30.setFont(new Font("Times New Roman", 2, 25));
		tfLugar30.setForeground(Color.WHITE);
		tfLugar30.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar30.setText(String.valueOf(metodos.matriz[2][4]));
		tfLugar30.setEditable(false);
		
		
		
		tfLugar31=new JTextField();
		tfLugar31.setBackground(Color.WHITE);
		tfLugar31.setFont(new Font("Times New Roman", 2, 25));
		tfLugar31.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar32=new JTextField();
		tfLugar32.setBackground(Color.WHITE);
		tfLugar32.setFont(new Font("Times New Roman", 2, 25));
		tfLugar32.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar33=new JTextField();
		tfLugar33.setBackground(Color.WHITE);
		tfLugar33.setFont(new Font("Times New Roman", 2, 25));
		tfLugar33.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar34=new JTextField();
		tfLugar34.setBackground(Color.BLACK);
		tfLugar34.setFont(new Font("Times New Roman", 2, 25));
		tfLugar34.setForeground(Color.WHITE);
		tfLugar34.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar34.setText(String.valueOf(metodos.matriz[1][8]));
		tfLugar34.setEditable(false);
		
		tfLugar35=new JTextField();
		tfLugar35.setBackground(Color.BLACK);
		tfLugar35.setFont(new Font("Times New Roman", 2, 25));
		tfLugar35.setForeground(Color.WHITE);
		tfLugar35.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar36=new JTextField();
		tfLugar36.setBackground(Color.BLACK);
		tfLugar36.setFont(new Font("Times New Roman", 2, 25));
		tfLugar36.setForeground(Color.WHITE);
		tfLugar36.setHorizontalAlignment(JTextField.CENTER);
		
		
		tfLugar37=new JTextField();
		tfLugar37.setBackground(Color.BLACK);
		tfLugar37.setFont(new Font("Times New Roman", 2, 25));
		tfLugar37.setForeground(Color.WHITE);
		tfLugar37.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar38=new JTextField();
		tfLugar38.setBackground(Color.BLACK);
		tfLugar38.setFont(new Font("Times New Roman", 2, 25));
		tfLugar38.setForeground(Color.WHITE);
		tfLugar38.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar39=new JTextField();
		tfLugar39.setBackground(Color.BLACK);
		tfLugar39.setFont(new Font("Times New Roman", 2, 25));
		tfLugar39.setForeground(Color.WHITE);
		tfLugar39.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar40=new JTextField();
		tfLugar40.setBackground(Color.WHITE);
		tfLugar40.setFont(new Font("Times New Roman", 2, 25));
		tfLugar40.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar40.setText(String.valueOf(metodos.matriz[0][6]));
		tfLugar40.setEditable(false);
		
		tfLugar41=new JTextField();
		tfLugar41.setBackground(Color.WHITE);
		tfLugar41.setFont(new Font("Times New Roman", 2, 25));
		tfLugar41.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar42=new JTextField();
		tfLugar42.setBackground(Color.WHITE);
		tfLugar42.setFont(new Font("Times New Roman", 2, 25));
		tfLugar42.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar42.setText(String.valueOf(metodos.matriz[0][7]));
		tfLugar42.setEditable(false);
		
		tfLugar43=new JTextField();
		tfLugar43.setBackground(Color.BLACK);
		tfLugar43.setFont(new Font("Times New Roman", 2, 25));
		tfLugar43.setForeground(Color.WHITE);
		tfLugar43.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar43.setText(String.valueOf(metodos.matriz[0][0]));
		tfLugar43.setEditable(false);
		
		tfLugar44=new JTextField();
		tfLugar44.setBackground(Color.BLACK);
		tfLugar44.setFont(new Font("Times New Roman", 2, 25));
		tfLugar44.setForeground(Color.WHITE);
		tfLugar44.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar45=new JTextField();
		tfLugar45.setBackground(Color.BLACK);
		tfLugar45.setFont(new Font("Times New Roman", 2, 25));
		tfLugar45.setForeground(Color.WHITE);
		tfLugar45.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar46=new JTextField();
		tfLugar46.setBackground(Color.BLACK);
		tfLugar46.setFont(new Font("Times New Roman", 2, 25));
		tfLugar46.setForeground(Color.WHITE);
		tfLugar46.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar46.setText(String.valueOf(metodos.matriz[0][2]));
		tfLugar46.setEditable(false);
		
		tfLugar47=new JTextField();
		tfLugar47.setBackground(Color.BLACK);
		tfLugar47.setFont(new Font("Times New Roman", 2, 25));
		tfLugar47.setForeground(Color.WHITE);
		tfLugar47.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar48=new JTextField();
		tfLugar48.setBackground(Color.BLACK);
		tfLugar48.setFont(new Font("Times New Roman", 2, 25));
		tfLugar48.setForeground(Color.WHITE);
		tfLugar48.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar49=new JTextField();
		tfLugar49.setBackground(Color.WHITE);
		tfLugar49.setFont(new Font("Times New Roman", 2, 25));
		tfLugar49.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar50=new JTextField();
		tfLugar50.setBackground(Color.WHITE);
		tfLugar50.setFont(new Font("Times New Roman", 2, 25));
		tfLugar50.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar51=new JTextField();
		tfLugar51.setBackground(Color.WHITE);
		tfLugar51.setFont(new Font("Times New Roman", 2, 25));
		tfLugar51.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar51.setText(String.valueOf(metodos.matriz[2][4]));
		tfLugar51.setEditable(false);
		
		tfLugar52=new JTextField();
		tfLugar52.setBackground(Color.BLACK);
		tfLugar52.setFont(new Font("Times New Roman", 2, 25));
		tfLugar52.setForeground(Color.WHITE);
		tfLugar52.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar53=new JTextField();
		tfLugar53.setBackground(Color.BLACK);
		tfLugar53.setFont(new Font("Times New Roman", 2, 25));
		tfLugar53.setForeground(Color.WHITE);
		tfLugar53.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar54=new JTextField();
		tfLugar54.setBackground(Color.BLACK);
		tfLugar54.setFont(new Font("Times New Roman", 2, 25));
		tfLugar54.setForeground(Color.WHITE);
		tfLugar54.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar55=new JTextField();
		tfLugar55.setBackground(Color.WHITE);
		tfLugar55.setFont(new Font("Times New Roman", 2, 25));
		tfLugar55.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar55.setText(String.valueOf(metodos.matriz[0][5]));
		tfLugar55.setEditable(false);
		
		tfLugar56=new JTextField();
		tfLugar56.setBackground(Color.WHITE);
		tfLugar56.setFont(new Font("Times New Roman", 2, 25));
		tfLugar56.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar56.setText(String.valueOf(metodos.matriz[2][1]));
		tfLugar56.setEditable(false);
		
		tfLugar57=new JTextField();
		tfLugar57.setBackground(Color.WHITE);
		tfLugar57.setFont(new Font("Times New Roman", 2, 25));
		tfLugar57.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar58=new JTextField();
		tfLugar58.setBackground(Color.BLACK);
		tfLugar58.setFont(new Font("Times New Roman", 2, 25));
		tfLugar58.setForeground(Color.WHITE);
		tfLugar58.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar59=new JTextField();
		tfLugar59.setBackground(Color.BLACK);
		tfLugar59.setFont(new Font("Times New Roman", 2, 25));
		tfLugar59.setForeground(Color.WHITE);
		tfLugar59.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar59.setText(String.valueOf(metodos.matriz[0][7]));
		tfLugar59.setEditable(false);
		
		tfLugar60=new JTextField();
		tfLugar60.setBackground(Color.BLACK);
		tfLugar60.setFont(new Font("Times New Roman", 2, 25));
		tfLugar60.setForeground(Color.WHITE);
		tfLugar60.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar60.setText(String.valueOf(metodos.matriz[1][8]));
		tfLugar60.setEditable(false);
		
		tfLugar61=new JTextField();
		tfLugar61.setBackground(Color.WHITE);
		tfLugar61.setFont(new Font("Times New Roman", 2, 25));
		tfLugar61.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar62=new JTextField();
		tfLugar62.setBackground(Color.WHITE);
		tfLugar62.setFont(new Font("Times New Roman", 2, 25));
		tfLugar62.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar63=new JTextField();
		tfLugar63.setBackground(Color.WHITE);
		tfLugar63.setFont(new Font("Times New Roman", 2, 25));
		tfLugar63.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar64=new JTextField();
		tfLugar64.setBackground(Color.WHITE);
		tfLugar64.setFont(new Font("Times New Roman", 2, 25));
		tfLugar64.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar65=new JTextField();
		tfLugar65.setBackground(Color.WHITE);
		tfLugar65.setFont(new Font("Times New Roman", 2, 25));
		tfLugar65.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar66=new JTextField();
		tfLugar66.setBackground(Color.WHITE);
		tfLugar66.setFont(new Font("Times New Roman", 2, 25));
		tfLugar66.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar66.setText(String.valueOf(metodos.matriz[1][8]));
		tfLugar66.setEditable(false);
		
		tfLugar67=new JTextField();
		tfLugar67.setBackground(Color.BLACK);
		tfLugar67.setFont(new Font("Times New Roman", 2, 25));
		tfLugar67.setForeground(Color.WHITE);
		tfLugar67.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar68=new JTextField();
		tfLugar68.setBackground(Color.BLACK);
		tfLugar68.setFont(new Font("Times New Roman", 2, 25));
		tfLugar68.setForeground(Color.WHITE);
		tfLugar68.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar69=new JTextField();
		tfLugar69.setBackground(Color.BLACK);
		tfLugar69.setFont(new Font("Times New Roman", 2, 25));
		tfLugar69.setForeground(Color.WHITE);
		tfLugar69.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar70=new JTextField();
		tfLugar70.setBackground(Color.WHITE);
		tfLugar70.setFont(new Font("Times New Roman", 2, 25));
		tfLugar70.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar71=new JTextField();
		tfLugar71.setBackground(Color.WHITE);
		tfLugar71.setFont(new Font("Times New Roman", 2, 25));
		tfLugar71.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar72=new JTextField();
		tfLugar72.setBackground(Color.WHITE);
		tfLugar72.setFont(new Font("Times New Roman", 2, 25));
		tfLugar72.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar73=new JTextField();
		tfLugar73.setBackground(Color.WHITE);
		tfLugar73.setFont(new Font("Times New Roman", 2, 25));
		tfLugar73.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar74=new JTextField();
		tfLugar74.setBackground(Color.WHITE);
		tfLugar74.setFont(new Font("Times New Roman", 2, 25));
		tfLugar74.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar75=new JTextField();
		tfLugar75.setBackground(Color.WHITE);
		tfLugar75.setFont(new Font("Times New Roman", 2, 25));
		tfLugar75.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar76=new JTextField();
		tfLugar76.setBackground(Color.BLACK);
		tfLugar76.setFont(new Font("Times New Roman", 2, 25));
		tfLugar76.setForeground(Color.WHITE);
		tfLugar76.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar76.setText(String.valueOf(metodos.matriz[0][2]));
		tfLugar76.setEditable(false);
		
		tfLugar77=new JTextField();
		tfLugar77.setBackground(Color.BLACK);
		tfLugar77.setFont(new Font("Times New Roman", 2, 25));
		tfLugar77.setForeground(Color.WHITE);
		tfLugar77.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar78=new JTextField();
		tfLugar78.setBackground(Color.BLACK);
		tfLugar78.setFont(new Font("Times New Roman", 2, 25));
		tfLugar78.setForeground(Color.WHITE);
		tfLugar78.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar79=new JTextField();
		tfLugar79.setBackground(Color.WHITE);
		tfLugar79.setFont(new Font("Times New Roman", 2, 25));
		tfLugar79.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar80=new JTextField();
		tfLugar80.setBackground(Color.WHITE);
		tfLugar80.setFont(new Font("Times New Roman", 2, 25));
		tfLugar80.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar81=new JTextField();
		tfLugar81.setBackground(Color.WHITE);
		tfLugar81.setFont(new Font("Times New Roman", 2, 25));
		tfLugar81.setHorizontalAlignment(JTextField.CENTER);
		
		tfLugar81.setText(String.valueOf(metodos.matriz[0][5]));
		tfLugar81.setEditable(false);
		
		
		
		btnJugar.setFont(new Font("Copperplate Gothic Bold", 2,25));
		btnJugar.setForeground(Color.WHITE);
		btnJugar.setBackground(Color.BLACK);
		jlbValorar=new JLabel("");
		btnJugar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlImagen.setVisible(false);
				pnlDisplay.setVisible(false);
				pnlJuego.setVisible(true);
				jlbValorar.setVisible(true);
				jlbValorar.setFont(new Font("Times New Roman", 2,25));
				
			}
		});
		
		
		pnlJuego.add(tfLugar1);
		pnlJuego.add(tfLugar2);
		pnlJuego.add(tfLugar3);
		pnlJuego.add(tfLugar4);
		pnlJuego.add(tfLugar5);
		pnlJuego.add(tfLugar6);
		pnlJuego.add(tfLugar7);
		pnlJuego.add(tfLugar8);
		pnlJuego.add(tfLugar9);
		pnlJuego.add(tfLugar10);
		pnlJuego.add(tfLugar11);
		pnlJuego.add(tfLugar12);
		pnlJuego.add(tfLugar13);
		pnlJuego.add(tfLugar14);
		pnlJuego.add(tfLugar15);
		pnlJuego.add(tfLugar16);
		pnlJuego.add(tfLugar17);
		pnlJuego.add(tfLugar18);
		pnlJuego.add(tfLugar19);
		pnlJuego.add(tfLugar20);
		pnlJuego.add(tfLugar21);
		pnlJuego.add(tfLugar22);
		pnlJuego.add(tfLugar23);
		pnlJuego.add(tfLugar24);
		pnlJuego.add(tfLugar25);
		pnlJuego.add(tfLugar26);
		pnlJuego.add(tfLugar27);
		pnlJuego.add(tfLugar28);
		pnlJuego.add(tfLugar29);
		pnlJuego.add(tfLugar30);
		pnlJuego.add(tfLugar31);
		pnlJuego.add(tfLugar32);
		pnlJuego.add(tfLugar33);
		pnlJuego.add(tfLugar34);
		pnlJuego.add(tfLugar35);
		pnlJuego.add(tfLugar36);
		pnlJuego.add(tfLugar37);
		pnlJuego.add(tfLugar38);
		pnlJuego.add(tfLugar39);
		pnlJuego.add(tfLugar40);
		pnlJuego.add(tfLugar41);
		pnlJuego.add(tfLugar42);
		pnlJuego.add(tfLugar43);
		pnlJuego.add(tfLugar44);
		pnlJuego.add(tfLugar45);
		pnlJuego.add(tfLugar46);
		pnlJuego.add(tfLugar47);
		pnlJuego.add(tfLugar48);
		pnlJuego.add(tfLugar49);
		pnlJuego.add(tfLugar50);
		pnlJuego.add(tfLugar51);
		pnlJuego.add(tfLugar52);
		pnlJuego.add(tfLugar53);
		pnlJuego.add(tfLugar54);
		pnlJuego.add(tfLugar55);
		pnlJuego.add(tfLugar56);
		pnlJuego.add(tfLugar57);
		pnlJuego.add(tfLugar58);
		pnlJuego.add(tfLugar59);
		pnlJuego.add(tfLugar60);
		pnlJuego.add(tfLugar61);
		pnlJuego.add(tfLugar62);
		pnlJuego.add(tfLugar63);
		pnlJuego.add(tfLugar64);
		pnlJuego.add(tfLugar65);
		pnlJuego.add(tfLugar66);
		pnlJuego.add(tfLugar67);
		pnlJuego.add(tfLugar68);
		pnlJuego.add(tfLugar69);
		pnlJuego.add(tfLugar70);
		pnlJuego.add(tfLugar71);
		pnlJuego.add(tfLugar72);
		pnlJuego.add(tfLugar73);
		pnlJuego.add(tfLugar74);
		pnlJuego.add(tfLugar75);
		pnlJuego.add(tfLugar76);
		pnlJuego.add(tfLugar77);
		pnlJuego.add(tfLugar78);
		pnlJuego.add(tfLugar79);
		pnlJuego.add(tfLugar80);
		pnlJuego.add(tfLugar81);
		
		jlbValorar.setVisible(false);
		pnlJuego.setVisible(false);
		super.getContentPane().add(pnlImagen,BorderLayout.NORTH);
		//super.add(pnlDisplay,BorderLayout.NORTH);
		super.add(pnlJuego,BorderLayout.CENTER);
		super.add(jlbValorar,BorderLayout.SOUTH);
		super.setVisible(true);
		
	}
	
}
