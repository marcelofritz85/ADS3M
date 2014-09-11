package Formulario;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TratarBotoes implements ActionListener {
			Crud a = new Crud();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource().equals(a.getAdicionar())){
					new Janela2();
					
				}
			}
	}

		