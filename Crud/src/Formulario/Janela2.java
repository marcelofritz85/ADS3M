package Formulario;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Janela2 extends JFrame{
			private JLabel nomeLabel, idadeLabel;
		    private JTextField nome, idade;
		    private JButton botaoOK, botaoCancelar;
		    private JPanel painel1, painelBotoes, painelPrincipal2;
		    
		    public Janela2() {
				super("Janela 2");
				// TODO Auto-generated constructor stub
				iniciarComponentes();
		        
		        setDefaultCloseOperation(EXIT_ON_CLOSE);
		        pack();
		        setVisible(true);
			}
		    
		    private void iniciarComponentes() {
		    	painelPrincipal2 = new JPanel();
		    	painelPrincipal2.setLayout(new GridLayout(3,1));
		    	
		    	painel1 = new JPanel(); 
		    	
		        nomeLabel = new JLabel("Nome:");
		        painel1.add(nomeLabel);
		        nome = new JTextField(10);
		        painel1.add(nome);
		        
		       
		        
		        idadeLabel = new JLabel("Idade:");
		        painel1.add(idadeLabel);
		        idade = new JTextField(10);
		        painel1.add(idade);
		        
		        painelPrincipal2.add(painel1);
		    	
		        getContentPane().add(painelPrincipal2);
		    	
		    	//___________________________________________________
		    	
		    	painelBotoes = new JPanel();
		        botaoOK = new JButton("OK");
		        painelBotoes.add(botaoOK);
		        //botaoOK.addActionListener(new TratadorBotoes2());
		        
		        botaoCancelar = new JButton("Cancelar");
		        //botaoCancelar.addActionListener(new TratadorBotoes2());
		        painelBotoes.add(botaoCancelar);
		        
		        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
		        
		        
		    }
		
		}