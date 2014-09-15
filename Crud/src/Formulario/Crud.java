package Formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;




public class Crud extends JFrame {
	   	//private JLabel label1;
	    private JTextField principal, nome, idade;
	    private JButton adicionar, remover, editar;
	    private JPanel painelBotoes, painelPrincipal;
	    //private JList pessoas;
	    //JLabel label1 = new JLabel();
	    DefaultListModel model = new DefaultListModel();
	    JList lista = new JList(model);
	   
	    
	    
	    public Crud() {
			super("Crud de Pessoas");
			// TODO Auto-generated constructor stub
			iniciarComponentes();
	        
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        pack();
	        setVisible(true);
		}

		public void iniciarComponentes() {
			// TODO Auto-generated method stub
			//JFrame janela = new JFrame();
			//janela.setSize(300, 200);
			
			
			painelPrincipal = new JPanel();
			
			
			
			lista.setSize(300, 200);
			
			painelPrincipal.setSize(300, 200);
			
			
			
		 	
			
			
			
			painelPrincipal.add(lista);
			
			
			
			getContentPane().add(painelPrincipal, BorderLayout.NORTH);
			
			//janela.add(painelPrincipal);
			
			painelBotoes = new JPanel();
			adicionar = new JButton("Adicionar");
			painelBotoes.add(adicionar);
			adicionar.addActionListener(new TratarBotoes1());
			
			
			editar = new JButton("Editar");
			painelBotoes.add(editar);
			editar.addActionListener(new TratarBotoes1());
			
			remover = new JButton("Remover");
			painelBotoes.add(remover);
			
			getContentPane().add(painelBotoes, BorderLayout.SOUTH);
			
			//janela.add(painelBotoes);
			
			//janela.setVisible(true);
			
		}
		//___________________________________________________

		public class TratarBotoes1 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource().equals(adicionar)){
					
					new Janela2();
					
				 }
				if(e.getSource().equals(editar)){
					//model.getListDataListeners();
					new Janela2();
					
				 }
			}

		}
		
		//___________________________________________________
		
		class Janela2 extends JFrame{
			private JLabel nomeLabel, idadeLabel;
		    //private JTextField nome, idade;
		    private JButton botaoOK, botaoCancelar;
		    private JPanel painel1, painelBotoes;
		    
		    public Janela2() {
				super("Janela 2");
				// TODO Auto-generated constructor stub
				iniciarComponentes();
		        
		        //setDefaultCloseOperation(EXIT_ON_CLOSE);
		        pack();
		        setVisible(true);
			}
		    
		    private void iniciarComponentes() {
		    	painelPrincipal = new JPanel();
		    	painelPrincipal.setLayout(new GridLayout(3,1));
		    	
		    	painel1 = new JPanel();
		    	
		        nomeLabel = new JLabel("Nome:");
		        painel1.add(nomeLabel);
		        nome = new JTextField(10);
		        painel1.add(nome);
		        
		        nome.addActionListener(new TratarBotoes2());
		       
		        
		        idadeLabel = new JLabel("Idade:");
		        painel1.add(idadeLabel);
		        idade = new JTextField(10);
		        painel1.add(idade);
		      
		        
		        painelPrincipal.add(painel1);
		    	
		    	getContentPane().add(painelPrincipal);
		    	
		    	
		    	
		    	painelBotoes = new JPanel();
		       
		        
		    	botaoOK = new JButton("OK");
		        botaoOK.addActionListener(new TratarBotoes2());
		        painelBotoes.add(botaoOK);
		        
		        botaoCancelar = new JButton("Cancelar");
		        botaoCancelar.addActionListener(new TratarBotoes2());
		        painelBotoes.add(botaoCancelar);
		        
		        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
		        
		        
		        
		    }
		    
		  //___________________________________________________
		    
			public class TratarBotoes2 implements ActionListener{
				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//int cont=1;
					if(e.getSource().equals(botaoOK)){
						
						String nomeRecebe = nome.getText();
				        
						
				        String idadeRecebe = idade.getText();
				        
				       
				        
				       
				        model.addElement("Pessoa: "+nomeRecebe+" Idade: "+idadeRecebe);
						//cont=cont+1;
						
						
					 }
				}

			}
			
			//___________________________________________________
		    
		}//Janela 2
}//Crud    
	    
	
				    