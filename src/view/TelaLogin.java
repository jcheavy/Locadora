package view;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import util.Utils;

public class TelaLogin extends JFrame{
	
	private JButton btLogin;
	private JButton btLimpar;
	private JTextField txUsuario;
	private JTextField txSenha;
	private JLabel lbTitulo;
	private JLabel lbUsuario;
	private JLabel lbSenha;
	private JPasswordField password;
	
	private JPanel panelCentro;
	
	String senha = "123";
	String usuario = "jean";
	
	
	public TelaLogin() {
		
		Container telaLogin = getContentPane();
	    setLayout(null);
	    setLocation(500,200);
	    setSize(300,300);
	    setResizable(false);
		
	    GridBagConstraints c = new GridBagConstraints();	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    
	    panelCentro = new JPanel();
	    telaLogin.add(panelCentro);
	    telaLogin.setBackground(Utils.azul);
	    panelCentro.setBackground(Utils.bege);
	    panelCentro.setBounds(10,10,280,240);
	    
	    panelCentro.setLayout(new GridBagLayout());
	    
	    
        lbTitulo = new JLabel("LOGIN");
        lbTitulo.setFont(Utils.gramond_20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
         panelCentro.add(lbTitulo, c);
         
         
	    
	    lbUsuario = new JLabel("Usuário");
	    lbUsuario.setFont(Utils.gramond_15);
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
        c.gridy = 1;	    
	    panelCentro.add(lbUsuario, c);
	    
	    
	    txUsuario = new JTextField();
	    //txUsuario.setFont(Utils.gramond_15);
	    c.gridx = 0;
	    c.gridy = 2;
	    panelCentro.add(txUsuario, c);
	    
	    lbSenha = new JLabel("Senha:");
	    lbSenha.setFont(Utils.gramond_15);
	    c.gridx = 0;
	    c.gridy = 3;
	    panelCentro.add(lbSenha, c);
	    
	    
	    password = new JPasswordField();
	   //password.setFont(Utils.gramond_15);
	    c.gridx= 0;
	    c.gridy = 4;
	    panelCentro.add(password, c);
	    
	    btLogin = new JButton("Entrar");
	    btLogin.setFont(Utils.gramond_15);
	    c.insets = new Insets(5, 0, 0, 0);
	    c.gridx = 0;
	    c.gridy = 5;
	    panelCentro.add(btLogin, c);
	    
	    btLogin.addActionListener(ev ->{
	    	
	        logar();
	    });
	    /*
	    txSenha = new JTextField();
	    txSenha.setFont(Utils.gramond_15);
	    c.gridwidth = 3;
	    c.gridy = 30;
	    panelCentro.add(txSenha, c);
	    */
		
		setVisible(true);
	}
	
	public void logar() {
		
    	if(txUsuario.getText().equals(usuario) && password.getText().equals(senha)) {
    		TelaPrincipal telaPrincipal = new TelaPrincipal();
    		telaPrincipal.setVisible(true);
    		this.dispose();
    	}else {
    		JOptionPane.showMessageDialog(null, "Usuário não localizado");
    	}
	}
	
	
	public static void main(String[] args) {
		TelaLogin tela = new TelaLogin();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
