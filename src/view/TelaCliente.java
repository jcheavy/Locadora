package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCliente extends JInternalFrame{
	
	private JLabel lbCodigo, lbNome, lbCpf, lbEmail, lbEnderco, lbDataNascimento;
	private JTextField txCodigo, txNome, txcpf, txEmail, txEnderco, txDataNascimento;
	
	public TelaCliente() {
		super("  Tela Cliente");
		Container telaCliente = getContentPane();
		setSize(600,400);		
		setClosable(true);
		setLayout(new GridLayout(3,2));	
		
		lbCodigo = new JLabel("Código");
		txCodigo = new JTextField(30);
		
		telaCliente.add(lbCodigo);
		telaCliente.add(txCodigo);
		add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
		
		
		setBackground(Color.RED);
		setVisible(false);
	}
	
	
}
