package Formulario;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Crud extends JFrame {
	   	private JLabel Pessoa1, Pessoa2;
	    private JTextField principal, nome, idade;
	    private JButton adicionar, remover, editar;
	    private JPanel painelBotoes, painelPrincipal;
	    private JList pessoas;
	    
	    DefaultListModel model = new DefaultListModel();
	    JList lista = new JList(model);
	    //ArrayList<String> lista;
	    
	    
	    public Crud() {
			super("Crud de Pessoas");
			// TODO Auto-generated constructor stub
			iniciarComponentes();
	        
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        pack();
	        setVisible(true);
		}

		public JButton getAdicionar() {
			return adicionar;
		}

		public void setAdicionar(JButton adicionar) {
			this.adicionar = adicionar;
		}

		public void iniciarComponentes() {
			// TODO Auto-generated method stub
			painelPrincipal = new JPanel();
			painelPrincipal.setLayout(new GridLayout(3,1));
			
			
			//___________________________________________________
			
			
		
			model.setSize(20);
			//model.add(0, "Pedro");
			
			
			painelPrincipal.add(lista);
			
			getContentPane().add(painelPrincipal);
			
			//___________________________________________________
			
			painelBotoes = new JPanel();
			adicionar = new JButton("Adicionar");
			painelBotoes.add(adicionar);
			adicionar.addActionListener(new TratarBotoes());
			
			
			editar = new JButton("Editar");
			painelBotoes.add(editar);
			
			remover = new JButton("Remover");
			painelBotoes.add(remover);
			
			getContentPane().add(painelBotoes, BorderLayout.SOUTH);
			//___________________________________________________
			
		}

		
		
		
		

		}