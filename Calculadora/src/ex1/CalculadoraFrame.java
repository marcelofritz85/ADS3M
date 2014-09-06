/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
class CalculadoraFrame extends JFrame{
    private JLabel labelNumero1, labelNumero2, labelResultado;
    private JTextField textoNumero1, textoNumero2, textoResultado;
    private JButton botaoSomar, botaoLimpar;
    private JPanel painelBotoes, painelPrincipal, painelNum1, painelNum2, painelRes;
    
    public CalculadoraFrame() {
        super ("Calculadora");
        
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
        textoNumero1 = new JTextField(10);
        painelNum1.add(textoNumero1);
        painelPrincipal.add(painelNum1);
        
        painelNum2 = new JPanel();
        labelNumero2 = new JLabel("Numero2:");
        painelNum2.add(labelNumero2);
        textoNumero2 = new JTextField(10);
        painelNum2.add(textoNumero2);
        painelPrincipal.add(painelNum2);
        
        painelRes = new JPanel();
        labelResultado = new JLabel("Resultado:");
        painelRes.add(labelResultado);
        textoResultado = new JTextField(10);
        textoResultado.setEditable(false);        
        painelRes.add(textoResultado);
        painelPrincipal.add(painelRes);
        
        getContentPane().add(painelPrincipal);
        
        //Painel de botões
        painelBotoes = new JPanel();
        botaoSomar = new JButton("Somar");
        botaoSomar.addActionListener(new TratadorBotoes());
        painelBotoes.add(botaoSomar);
        botaoLimpar = new JButton("Limpar");
        botaoLimpar.addActionListener(new TratadorBotoes());
        painelBotoes.add(botaoLimpar);
        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
   }
   
    class TratadorBotoes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(botaoSomar)){
                try{
                    int num1 = Integer.parseInt(textoNumero1.getText());
                    int num2 = Integer.parseInt(textoNumero2.getText());
                    int resultado = num1+num2;
                    textoResultado.setText(String.valueOf(resultado));                
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(CalculadoraFrame.this, 
                            "Campos Numero1 e Numero2 devem ser números inteiros",
                            "Erro de Formato",
                            JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
                    
            }
            else if(e.getSource().equals(botaoLimpar))
            {
                textoNumero1.setText("");
                textoNumero2.setText("");
                textoResultado.setText("");
            }
        }
        
    }
    
}
