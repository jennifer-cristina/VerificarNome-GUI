package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(600, 600);
		minhaTela.setTitle("Verificar nome");
		minhaTela.setLayout(null);
		
		// Criar os componentes da Tela
		
		JLabel lblDigitarNome = new JLabel();
		lblDigitarNome.setText("Digite seu nome:");
		lblDigitarNome.setBounds(20, 20, 150, 30);
		
		
		JTextField txtInserirNome = new JTextField();
		txtInserirNome.setBounds(20, 60, 100, 30);
		
		JButton btnVerificar = new JButton();
		btnVerificar.setText("ok");
		btnVerificar.setBounds(130, 60, 50, 30);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Olá, ");
		lblResultado.setBounds(20, 100, 150, 30);
		
		
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(btnVerificar);
		minhaTela.getContentPane().add(txtInserirNome);
		minhaTela.getContentPane().add(lblDigitarNome);
		
		minhaTela.setVisible(true);
		
		// Eventos do Botão
		btnVerificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtInserirNome.getText();
				//lblResultado.setText("Olá, " + nome);
				
				//tranformando em número inteiro
				
				int valor = Integer.parseInt(nome);
				int resultado = valor * 15;
				
				lblResultado.setText(String.valueOf(resultado)); 
				
			}
		});
	}
	
		
}
