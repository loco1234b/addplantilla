package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import bean.Empleado;
import dao.EmpleadoDAO;

import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class frmlogin extends JFrame {
	private static final long serialVersionUID = 1l;
	
	JTextField txtusuario;
	JPasswordField txtpassword;
	JButton btningresar,btncancelar;
	JPanel pnlnumeros;
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

	boolean bFocus = true;
	
	
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
		setUndecorated(true);
		
		JPanel pnlLogo = new JPanel();
		pnlLogo.setBounds(0,0,450,50);
		pnlLogo.setBackground( new Color(91,17,94) );
		getContentPane().add(pnlLogo);
		
		JLabel imgLogo = new JLabel();		
		imgLogo.setIcon(new ImageIcon(frmlogin.class.getResource("/uiimagen/Logo.png")));
		imgLogo.setBounds(124, 3, 208, 43);
		pnlLogo.add(imgLogo);
		
		JLabel imgCerrar= new JLabel();
		imgCerrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		imgCerrar.setIcon(new ImageIcon(frmlogin.class.getResource("/uiimagen/cancelar.png")));
		imgCerrar.setBounds(410, 13, 24, 24);
		pnlLogo.add(imgCerrar);
		
		 
		JLabel lblusuario = new JLabel("Usuario:");
		lblusuario.setBounds(60,90,80,25);
		getContentPane().add(lblusuario);
		    
		JLabel lblpassword = new JLabel("Password:");
		lblpassword.setBounds(60,120,80,25);
		getContentPane().add(lblpassword);
		
	    
	    txtusuario = new JTextField();
	    txtusuario.setBounds(150,90,110,25);
	    txtusuario.setColumns(8);
	    txtusuario.setMargin(new Insets(2,5,2,5));
	    txtusuario.setToolTipText("Ingresar DNI de 8 digitos");
	    txtusuario.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtusuario);
	    
	    txtpassword = new JPasswordField();
	    txtpassword.setBounds(150,120,110,25);
	    txtpassword.setColumns(6);
	    txtpassword.setMargin(new Insets(2,5,2,5));
	    txtpassword.setToolTipText("Ingresar contraseña de 6 digitos");
	    txtpassword.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtpassword);
	    
	    
	    btningresar = new JButton("Ingresar");
	    btningresar.setForeground(new Color(255, 255, 255));
	    btningresar.setBounds(20,180,100,25);
	    btningresar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btningresar.setBackground(new Color(91,17,94));
	    btningresar.setFocusPainted(false);
	    getContentPane().add(btningresar);
	    
	    btncancelar = new JButton("Cancelar");
	    btncancelar.setForeground(new Color(255, 255, 255));
	    btncancelar.setBounds(160,180,100,25);
	    btncancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btncancelar.setBackground(new Color(91,17,94));
	    btncancelar.setFocusPainted(false);
	    getContentPane().add(btncancelar);
	    
	    
	    pnlnumeros = new JPanel();
		pnlnumeros.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    pnlnumeros.setBounds(300,80,125,170);
	    pnlnumeros.setLayout(null);
	    getContentPane().add(pnlnumeros);
	    
	    
	    btn0 = new JButton("0");
	    btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    btn0.setBounds(10,10,30,30);
	    btn0.setMargin(new Insets(2,5,2,5));
	    btn0.setFocusPainted(false);
	    pnlnumeros.add(btn0);
	    
		btn1 = new JButton("1");
		btn1.setBounds(45, 10, 30, 30 );
		btn1.setFocusPainted(false);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(80, 10, 30, 30 );
		btn2.setFocusPainted(false);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(10, 50, 30, 30 );
		btn3.setFocusPainted(false);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(45, 50, 30, 30 );
		btn4.setFocusPainted(false);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn4.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(80, 50, 30, 30 );
		btn5.setFocusPainted(false);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn5.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn5);

		btn6 = new JButton("6");
		btn6.setBounds(10, 90, 30, 30 );
		btn6.setFocusPainted(false);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn6.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(45, 90, 30, 30 );
		btn7.setFocusPainted(false);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn7.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(80, 90, 30, 30 );
		btn8.setFocusPainted(false);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn8.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn8);

		btn9 = new JButton("9");
		btn9.setBounds(45,130, 30, 30 );
		btn9.setFocusPainted(false);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn9.setMargin(new Insets(2, 5, 2, 5));
		pnlnumeros.add(btn9);
		
		addWindowListener(new WindowAdapter() {public void windowOpened(WindowEvent e) {frm_windowOpened();}});
		
		imgCerrar.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {imgsalir_mouseClicked();}});
		
		
		txtusuario.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e){txt_focusGained(true);}});
			
		
		txtpassword.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {txt_focusGained(false);}});
		
		txtusuario.addKeyListener(new KeyAdapter() {public void keyTyped(KeyEvent e) {txt_keyTyped(e);}});	
		
		txtpassword.addKeyListener(new KeyAdapter() {public void keyTyped(KeyEvent e) {txt_keyTyped(e);}});
		
		btningresar.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btningresar_actionPerformed();	} });

	    btncancelar.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btncancelar_actionPerformed();	} });

	    btningresar.addMouseListener(new MouseAdapter() {
	    	public void mouseEntered(MouseEvent e) { btn_mouseEntered(e.getComponent());}
	    	public void mouseExited(MouseEvent e) { btn_mouseExited(e.getComponent());}});
		
	    btncancelar.addMouseListener(new MouseAdapter() {
	    	public void mouseEntered(MouseEvent e) { btn_mouseEntered(e.getComponent());}
	    	public void mouseExited(MouseEvent e) { btn_mouseExited(e.getComponent());}});
	    
	    btningresar.addFocusListener(new FocusAdapter() {
	    	public void focusGained(FocusEvent e) { btn_mouseEntered(e.getComponent());}
	    	public void focusLost(FocusEvent e) { btn_mouseExited(e.getComponent());}});
	    
	    btncancelar.addFocusListener(new FocusAdapter() {
	    	public void focusGained(FocusEvent e) { btn_mouseEntered(e.getComponent());}
	    	public void focusLost(FocusEvent e) { btn_mouseExited(e.getComponent());}});
	    
        btn0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });
        
        btn9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btndigitos_actionPerformed(e);	} });}
	
	    protected void frm_windowOpened() {
	    	BloquearCtrl_V(txtusuario);
	    	BloquearCtrl_V(txtpassword);
	    	panelnumeros();
			txtusuario.requestFocus();
	    }
	    protected void imgsalir_mouseClicked() {
	    	if(JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicacion?", "salir" , JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
	    		System.exit(0);
	    }
	    protected void txt_focusGained(boolean bFocus) {
	    	this.bFocus = bFocus;
	    	(bFocus ? txtpassword :txtusuario).setBackground(Color.white);
	    	(bFocus ? txtusuario :txtpassword).setBackground(new Color(226,244,252));
	    }
	    protected void txt_keyTyped(KeyEvent e) {
	    	JTextField txt = (JTextField) e.getSource();
	    	if (!Character.isDigit(e.getKeyChar())|| txt.getText().length()== txt.getColumns())
	    		e.consume();
	    }
	    protected void btn_mouseEntered(Component e) {
	    	e.setBackground(Color.black);
	    }
	    protected void btn_mouseExited(Component e) {
	    	e.setBackground(new Color(91,17,94));
	    }
	 
        protected void btningresar_actionPerformed() {
        	String sUsuario = txtusuario.getText();
        	String sPassword = String.valueOf(txtpassword.getPassword());
        	if(sUsuario.length()!= txtusuario.getColumns()||
        		sPassword.length() != txtpassword.getColumns()) {
        		JOptionPane.showMessageDialog(this, "Debe ingresar usuario y/o contraseña falta completar");
        		txtusuario.requestFocus();
        		return;
        	}
        	
        	bean.Empleado empleado = new bean.Empleado();
    	    empleado.setDni(sUsuario);
    	    empleado.setPasswordd(sPassword);
    	    
    	    dao.EmpleadoDAO empleadoDAO = new dao.EmpleadoDAO();
    	    empleadoDAO.Login(empleado);
    	    if (empleado.getId()> 0) {
    	    	frmplantilla frm = new frmplantilla();
    	    	frm.setEmpleado(empleado);
    	    	frm.setVisible(true);
    	    	return;
    	    }
    	    
    	    JOptionPane.showMessageDialog(this,"Usuario y/o contraseña invalida");
    	    txtusuario.setText("");
    	    txtpassword.setText("");
    	    txtusuario.requestFocus();
    	    
        	
        }
	    protected void btncancelar_actionPerformed() {
	    	txtusuario.setText("");
	    	txtpassword.setText("");
	    	txtusuario.requestFocus();
	    }
		protected void btndigitos_actionPerformed(ActionEvent e) {
			JTextField txt = bFocus ? txtusuario : txtpassword;
			if(txt.getText().length()== txt.getColumns())return;
            txt.setText(txt.getText()+ e.getActionCommand());
		}
	    private void panelnumeros() {
	    	String sNumeros ="", sNx ="";
	    	
	    	for(Component btn: pnlnumeros.getComponents()) {
	    		while( sNumeros.contains(sNx = "" + new Random().nextInt(10)));
	    		sNumeros += sNx;
	    		((JButton)btn).setText(sNx);
	    	}
	    }

	    private void BloquearCtrl_V(JTextField txt) {
	    	InputMap inputMap = txt.getInputMap(JComponent.WHEN_FOCUSED);
	    	inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, org.w3c.dom.events.Event.AT_TARGET), "null");
	    }
	    		
	
}
   
