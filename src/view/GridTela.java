package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.Utils;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridTela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridTela frame = new GridTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GridTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 487, 0, 0, 0};   // gbl_contentPane.columnWidths = new int[]{0, 487, 0, 0};
		gbl_contentPane.rowHeights = new int[]{321, 0, 0};         // gbl_contentPane.rowHeights = new int[]{321, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};  //gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};  //gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelDir = new JPanel();
		GridBagConstraints gbc_panelDir = new GridBagConstraints();
		gbc_panelDir.insets = new Insets(0, 0, 5, 5);
		gbc_panelDir.fill = GridBagConstraints.BOTH;
		gbc_panelDir.gridx = 1;
		gbc_panelDir.gridy = 0;
		contentPane.add(panelDir, gbc_panelDir);
		panelDir.setBackground(Utils.azul);
		
		JPanel panelNovo = new JPanel();
		GridBagConstraints gbc_panelNovo = new GridBagConstraints();
		gbc_panelNovo.insets = new Insets(0, 0, 5, 5);
		gbc_panelNovo.fill = GridBagConstraints.BOTH;
		gbc_panelNovo.gridx = 2;
		gbc_panelNovo.gridy = 0;
		contentPane.add(panelNovo, gbc_panelNovo);
		panelNovo.setBackground(Utils.bege);
		
		
		JPanel panelEsqInf = new JPanel();
		GridBagConstraints gbc_panelEsqInf = new GridBagConstraints();
		gbc_panelEsqInf.fill = GridBagConstraints.BOTH;
		gbc_panelEsqInf.gridx = 3;
		gbc_panelEsqInf.gridy = 1;
		contentPane.add(panelEsqInf, gbc_panelEsqInf);
		panelEsqInf.setBackground(Utils.Azul_esc);
	}

}
