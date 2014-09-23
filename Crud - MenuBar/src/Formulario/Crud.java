package Formulario;



import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.ListDataListener;




public class Crud extends JFrame {
	   	private JLabel Pessoa1, Pessoa2;
	    private JTextField principal, nome, idade;
	    private JButton adicionar, remover, editar;
	    private JPanel painelBotoes, painelPrincipal;
	    private JList pessoas;
	    
	    DefaultListModel model = new DefaultListModel();
	    JList lista = new JList(model);
	    JMenuItem itemEditar = new JMenuItem("Editar");
	    JMenuItem itemRemover = new JMenuItem("Remover");
	    JMenuItem itemNovo = new JMenuItem("Novo");
	    
	    public Crud() {
			super("Crud de Pessoas");
			// TODO Auto-generated constructor stub
			iniciarComponentes();
	        
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        //pack();
	        setSize(300, 200);
	        
	        setVisible(true);
	        setLocation(600,300);
		}

		public void iniciarComponentes() {
			// TODO Auto-generated method stub
			painelPrincipal = new JPanel();
			painelPrincipal.setLayout(new GridLayout(1,5));
			
			painelPrincipal.add(lista);
			
			
			
			getContentPane().add(painelPrincipal);
			
			
			painelBotoes = new JPanel();
			adicionar = new JButton("Adicionar");
			painelBotoes.add(adicionar);
			adicionar.addActionListener(new TratarBotoes1());
			
			
			editar = new JButton("Editar");
			painelBotoes.add(editar);
			editar.addActionListener(new TratarBotoes1());
			
			remover = new JButton("Remover");
			
			
			
			painelBotoes.add(remover);
			remover.addActionListener(new TratarBotoes1());
			
			getContentPane().add(painelBotoes, BorderLayout.SOUTH);
			//____________________________________________________________
			
		      JMenuBar menubar = new JMenuBar();
		        
		        JMenu menuArquivo = new JMenu("Arquivo");
		        menuArquivo.setMnemonic(KeyEvent.VK_A);
		        //-----------------------------------------------------------------
		        JMenuItem itemSair = new JMenuItem("Sair");
		        //itemSair.setIcon(
		                //createImageIcon("/imagem/sair.png","Sair"));
		        itemSair.setMnemonic(KeyEvent.VK_S);
		        itemSair.setToolTipText("Finaliza a aplicação.");
		        itemSair.setAccelerator(
		            KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_MASK ));
		                //KeyStroke.getKeyStroke("control X"));
		        
		        itemSair.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                dispose(); //System.exit(0);
		            }
		        });
		        //------------------------------------------------------------------
		        itemNovo.setMnemonic(KeyEvent.VK_S);
		        itemNovo.setToolTipText("Adicionar elemento.");
		        itemNovo.setAccelerator(
		            KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_MASK ));
		                //KeyStroke.getKeyStroke("control A"));
		        
		        itemNovo.addActionListener(new TratarBotoes1() {
		            //@Override
//		            public void actionPerformed(ActionEvent e) {
//		                dispose(); //System.exit(0);
//		            }
		        });
		        //------------------------------------------------------------------
		        
		        itemEditar.setMnemonic(KeyEvent.VK_S);
		        itemEditar.setToolTipText("Editar elemento.");
		        itemEditar.setAccelerator(
		            KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_MASK ));
		                //KeyStroke.getKeyStroke("control Z"));
		        
		        itemEditar.addActionListener(new TratarBotoes1() {
		            //@Override
//		            public void actionPerformed(ActionEvent e) {
//		                dispose(); //System.exit(0);
//		            }
		        });
		        
		        
		        //------------------------------------------------------------------
		        itemRemover.setMnemonic(KeyEvent.VK_S);
		        itemRemover.setToolTipText("Remover elemento.");
		        itemRemover.setAccelerator(
		            KeyStroke.getKeyStroke(KeyEvent.VK_Y,KeyEvent.CTRL_MASK ));
		                //KeyStroke.getKeyStroke("control y"));
		        
		        itemRemover.addActionListener(new TratarBotoes1() {
		            //@Override
//		            public void actionPerformed(ActionEvent e) {
//		                dispose(); //System.exit(0);
//		            }
		        });
		        
		        //------------------------------------------------------------------
		        menuArquivo.add(itemNovo);
		        menuArquivo.add(itemEditar);
		        menuArquivo.add(itemRemover);
		        menuArquivo.add(itemSair);
		        menubar.add(menuArquivo);
		        
		        menubar.add(Box.createHorizontalGlue());
		        
		        this.setJMenuBar(menubar);
			
		}
		//___________________________________________________

		public class TratarBotoes1 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource().equals(adicionar)||e.getSource().equals(itemNovo)){
					
					new Janela2();
					
				 }
				if(e.getSource().equals(editar)||e.getSource().equals(itemEditar)){
					//model.getListDataListeners();
					
					new Janela2();
					
					
					//model.removeElement(lista.getSelectedValue());
					
				 }
				if(e.getSource().equals(remover)||e.getSource().equals(itemRemover)){
					//int index= lista.getSelectedIndex();
					model.removeElement(lista.getSelectedValue());
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
		        setLocation(600,300);
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
						dispose();
						String nomeRecebe = nome.getText();
				        
						
				        String idadeRecebe = idade.getText();
				        
				       
				        
				       
				        model.addElement("Pessoa: "+nomeRecebe+" Idade: "+idadeRecebe);
						//cont=cont+1;
				        model.removeElement(lista.getSelectedValue());
						
					 }
				
				}

			}
			
			//___________________________________________________
		    
		}
}    
	    
	
				    				    