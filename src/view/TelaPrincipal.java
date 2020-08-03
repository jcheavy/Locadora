package view;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import util.Utils;

public class TelaPrincipal extends JFrame {

	private JMenuBar barraMenu;
	private JMenu cadastro, locacao, relatorio,opcao, ajuda,espaco;
	private JMenuItem cliente, ator, item, usuarios, servicos, sobre, filme, fornecedores, sair;
	private JMenuItem locar, consultar;
	private JDesktopPane deskCentro;
	private JPanel painelLateral;
	private JLabel teste;

	public TelaPrincipal() {

		Container telaPrincipal = getContentPane();
		setSize(900, 700);
		telaPrincipal.setBackground(Utils.bege); 	 
		
		
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 500, 0, 0};
		gbl_contentPane.rowHeights = new int[]{321, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gbl_contentPane);
        
		// barra de Menu
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
        
		// Menu
		espaco = new JMenu("    ");
		locacao = new JMenu("Locação");	
		cadastro = new JMenu("Cadastro");
		relatorio = new JMenu("Relatório");		
		relatorio.setEnabled(false);
		opcao = new JMenu("Opções");
		ajuda = new JMenu("Ajuda");
        
		barraMenu.add(espaco);
		barraMenu.add(locacao);
		barraMenu.add(cadastro);
		barraMenu.add(relatorio);
		barraMenu.add(ajuda);
		barraMenu.add(opcao);

		// itens de munus
		cliente = new JMenuItem("Clientes");
		ator = new JMenuItem("Ator");
		item = new JMenuItem("Item");
		usuarios = new JMenuItem("Usuários");
		usuarios.setEnabled(false);
		servicos = new JMenuItem("Serviços");
		sobre = new JMenuItem("Sobre");
		filme = new JMenuItem("filme ");
		fornecedores = new JMenuItem("Fornecedores");
		fornecedores.setEnabled(false);
		sair = new JMenuItem("Sair");

		locar = new JMenuItem("Locar");
		consultar = new JMenuItem("Consultar");
		
		
		// separando os itens de Menu
	    locacao.add(locar);
	    locacao.add(consultar);	    
	    
		cadastro.add(cliente);
		cadastro.add(ator);
		cadastro.add(filme);
		cadastro.add(item);
		cadastro.add(usuarios);		
		cadastro.add(fornecedores);
		
		relatorio.add(servicos);
		ajuda.add(sobre);
		opcao.add(sair);
		
		// PAINEL
		deskCentro = new JDesktopPane();
		deskCentro.setBackground(Utils.azul);	
		GridBagConstraints gbc_panelDir = new GridBagConstraints();
		gbc_panelDir.insets = new Insets(0, 0, 3, 3);
		gbc_panelDir.fill = GridBagConstraints.BOTH;
		gbc_panelDir.gridx = 1;
		gbc_panelDir.gridy = 0;
		telaPrincipal.add(deskCentro, gbc_panelDir);
		deskCentro.setLayout(null);
		
		// label
	    teste = new JLabel("TESTE DE LABEL GRANDE");
	    deskCentro.add(teste);
	    
	    cliente.addActionListener(ev ->{
	    	TelaCliente telaCliente = new TelaCliente();
	    	telaCliente.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
	 		telaCliente.setVisible(true);
	 		deskCentro.add(telaCliente);
	    });
	   
		
		
		painelLateral = new JPanel();
		painelLateral.setBackground(Utils.Azul_esc);
		GridBagConstraints gbc_panelEsqInf = new GridBagConstraints();
		gbc_panelEsqInf.fill = GridBagConstraints.BOTH;
		gbc_panelEsqInf.gridx = 2;
		gbc_panelEsqInf.gridy = 1;	
		telaPrincipal.add(painelLateral, gbc_panelEsqInf);

		setVisible(false);

	}
	/*
	public static void main(String[] args) {
		TelaPrincipal tt = new TelaPrincipal();
		tt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    */
}
