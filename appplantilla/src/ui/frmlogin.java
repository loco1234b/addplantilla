package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class frmlogin extends JFrame {
	private static final long serialVersionUID = 1l;
	
	JTextField txtusuario;
	JPasswordField txtpassword;
	JButton btningresar,btncancelar;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmlogin frame = new frmlogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frmlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(false);
		
		JPanel pnlLogo = new JPanel();
		pnlLogo.setBounds(0,0,450,50);
		pnlLogo.setBackground( new Color(91,17,94) );
		getContentPane().add(pnlLogo);
		
		JLabel imgLogo = new JLabel();		
		imgLogo.setIcon(new ImageIcon(frmlogin.class.getResource("/uiimagen/Logo.png")));
		imgLogo.setBounds(124, 3, 208, 43);
		pnlLogo.add(imgLogo);
		
		JLabel imgCerrar= new JLabel();
		imgCerrar.setIcon(new ImageIcon(frmlogin.class.getResource("/uiimagen/cancelar.png")));
		imgCerrar.setBounds(400, 13, 24, 24);
		pnlLogo.add(imgCerrar);
		
		 
		JLabel lblusuario = new JLabel("Usuario:");
		lblusuario.setBounds(60,90,80,25);
		getContentPane().add(lblusuario);
		    
		JLabel lblpassword = new JLabel("Password:");
		lblpassword.setBounds(60,120,80,25);
		getContentPane().add(lblpassword);
		
	    
	    txtusuario = new JTextField();
	    txtusuario.setBounds(150,90,110,25);
	    txtusuario.setMargin(new Insets(2,5,2,5));
	    txtusuario.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtusuario);
	    
	    txtpassword = new JPasswordField();
	    txtpassword.setBounds(150,120,110,25);
	    txtpassword.setMargin(new Insets(2,5,2,5));
	    txtpassword.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtpassword);
	    
	    
	    btningresar = new JButton("Ingresar");
	    btningresar.setForeground(new Color(255, 255, 255));
	    btningresar.setBounds(60,180,100,25);
	    btningresar.setBackground(new Color(0,0,0));
	    btningresar.setFocusPainted(false);
	    getContentPane().add(btningresar);
	    
	    btncancelar = new JButton("Cancelar");
	    btncancelar.setForeground(new Color(255, 255, 255));
	    btncancelar.setBounds(250,180,100,25);
	    btncancelar.setBackground(new Color(91,17,94));
	    btncancelar.setFocusPainted(false);
	    getContentPane().add(btncancelar);
	    
	    
	    
	}

}
