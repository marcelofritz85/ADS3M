/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

/**
 *
 * @author lhries
 */
class CalculadoraComboBox extends JFrame{
    private JLabel labelNumero1, labelNumero2, labelResultado;
    private JTextField textoNumero1, textoNumero2, textoResultado;
    private JButton botaoCalcular, botaoZerar;
    private JPanel painelBotoes, painelPrincipal, painelNum1, painelNum2, painelRes;
    private JComboBox somar, subtrair, multiplicar, dividir, escolha;
    
    String[] operacoes={"Soma","Multiplicação","Divisão","Subtração"}; 
    JComboBox box = new JComboBox(operacoes);
    
    public CalculadoraComboBox() {
        super ("Calculadora ComboBox");
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        
    }

    private void iniciarComponentes() {
        //Monta o layout principal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(3,1));
        
        painelNum1 = new JPanel();
        labelNumero1 = new JLabel("Numero1:");
        painelNum1.add(labelNumero1);
        textoNumero1 = new JTextField(25);
        painelNum1.add(textoNumero1);
        painelPrincipal.add(painelNum1);
        
        painelNum2 = new JPanel();
        labelNumero2 = new JLabel("Numero2:");
        painelNum2.add(labelNumero2);
        textoNumero2 = new JTextField(25);
        painelNum2.add(textoNumero2);
        painelPrincipal.add(painelNum2);
        
        painelRes = new JPanel();
        labelResultado = new JLabel("Resultado:");
        painelRes.add(labelResultado);
        textoResultado = new JTextField(25);
        textoResultado.setEditable(false);        
        painelRes.add(textoResultado);
        painelPrincipal.add(painelRes);
        
        getContentPane().add(painelPrincipal, BorderLayout.PAGE_START);
        
      //__________________________________________________________________
        
        //Painel de botões
        painelBotoes = new JPanel();
        botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(new TratarMenu());
        painelBotoes.add(botaoCalcular);
        botaoZerar = new JButton("Zerar");
        botaoZerar.addActionListener(new TratarMenu());
        painelBotoes.add(botaoZerar);
        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
      //__________________________________________________________________
 
       
        
//        somar = new JComboBox();
//        subtrair = new JComboBox();
//        multiplicar = new JComboBox();
//        dividir = new JComboBox();
//        
//        box.add(somar);
//        box.add(subtrair);
//        box.add(dividir);
//        box.add(multiplicar);
       
       
        
        

        JPanel boxPanel = new JPanel ();
        
        
        
        boxPanel.add(box);
        
        
        
        boxPanel.setLayout (new GridLayout (4, 1));
        getContentPane().add(boxPanel, BorderLayout.CENTER);
        
       
      
        
        
   }
    	//__________________________________________________________________
    
    public class TratarMenu implements ActionListener {

    	

		@Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		
    		if(e.getSource().equals(botaoCalcular)){
    			try{ 
    				if(box.getSelectedIndex()==0){
	    			int num1 = Integer.parseInt(textoNumero1.getText());
	                int num2 = Integer.parseInt(textoNumero2.getText());
	                int resultado = num1+num2;
	                textoResultado.setText(String.valueOf(resultado)); 
    				}
    			}catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(CalculadoraComboBox.this, 
                            "Campos Numero1 e Numero2 devem ser números inteiros",
                            "Erro de Formato",
                            JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
    		}
    		if(e.getSource().equals(botaoCalcular)){
    			try{
    				if(box.getSelectedIndex()==1){
	    			int num1 = Integer.parseInt(textoNumero1.getText());
	                int num2 = Integer.parseInt(textoNumero2.getText());
	                int resultado = num1*num2;
	                textoResultado.setText(String.valueOf(resultado));
    				}
    			}catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(CalculadoraComboBox.this, 
                        "Campos Numero1 e Numero2 devem ser números inteiros",
                        "Erro de Formato",
                        JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
    			}
    		}
    		if(e.getSource().equals(botaoCalcular)){
    			try{
    				if(box.getSelectedIndex()==2){
	    			int num1 = Integer.parseInt(textoNumero1.getText());
	                int num2 = Integer.parseInt(textoNumero2.getText());
	                int resultado = num1/num2;
	                textoResultado.setText(String.valueOf(resultado));  
    				}
    			}catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(CalculadoraComboBox.this, 
                        "Campos Numero1 e Numero2 devem ser números inteiros",
                        "Erro de Formato",
                        JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
    			}
    		}
    		
    		if(e.getSource().equals(botaoCalcular)){
    			try{
    				if(box.getSelectedIndex()==3){
	    			int num1 = Integer.parseInt(textoNumero1.getText());
	                int num2 = Integer.parseInt(textoNumero2.getText());
	                int resultado = num1-num2;
	                textoResultado.setText(String.valueOf(resultado));  
    				}
    			}catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(CalculadoraComboBox.this, 
                        "Campos Numero1 e Numero2 devem ser números inteiros",
                        "Erro de Formato",
                        JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
    			}
    		}
    	
    	if(e.getSource().equals(botaoZerar))
         {
              textoNumero1.setText("");
              textoNumero2.setText("");
              textoResultado.setText("");
          }

    	}
    }
}



    	//_________________________________________________________________
//    class TratadorBotoes implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//        	
//        	if(e.getSource().equals(botaoCalcular)){
//        		try{
//                    int num1 = Integer.parseInt(textoNumero1.getText());
//                    int num2 = Integer.parseInt(textoNumero2.getText());
//                    int resultado = num1+num2;
//                    textoResultado.setText(String.valueOf(resultado));                
//                
//            	
//            	}catch(NumberFormatException ex){
//                    JOptionPane.showMessageDialog(CalculadoraRadio.this, 
//                            "Campos Numero1 e Numero2 devem ser números inteiros",
//                            "Erro de Formato",
//                            JOptionPane.ERROR_MESSAGE);
//                    ex.printStackTrace();
//                }
//                    
//            }
//            else if(e.getSource().equals(botaoZerar))
//            {
//                textoNumero1.setText("");
//                textoNumero2.setText("");
//                textoResultado.setText("");
//            }
//        	
//        }
//        
//    }
    

