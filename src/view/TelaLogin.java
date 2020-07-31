package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import util.Constantes;
import util.Utils;

public class TelaLogin extends JFrame{
	
	private JButton btLogin;
	private JButton btLimpar;
	private JTextField txUsuario;
	private JTextField txSenha;
	private JLabel lbTitulo;
	private JLabel lbUsuario;
	private JLabel lbSenha;
	
	private JPanel panelCentro;
	
	
	
	public TelaLogin() {
		
		Container telaLogin = getContentPane();
	    setLayout(null);
	    setLocation(500,200);
	    setSize(300,300);
	    setResizable(false);
		
	    panelCentro = new JPanel();
	    telaLogin.add(panelCentro);
	    telaLogin.setBackground(Utils.azul);
	    panelCentro.setBackground(Utils.bege);
	    panelCentro.setBounds(10,10,280,240);
	    panelCentro.setLayout(new FlowLayout(1, 10, 10));
	    
        lbTitulo = new JLabel("LOGIN");
        lbTitulo.setFont(Utils.gramond_20);
	    panelCentro.add(lbTitulo);
	    
	    lbUsuario = new JLabel("Usuário");
	    lbUsuario.setFont(Utils.gramond_15);
	    //panelCentro.add(lbUsuario);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaLogin tela = new TelaLogin();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
