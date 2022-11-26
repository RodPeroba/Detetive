package view;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

import Modal.Dado;

public class ForcedDicePanel extends JFrame {
	
	private JFrame myFrame = new JFrame("Escolha o valor da dado");

	ForcedDicePanel(String s){
		super(s);
		JButton button;
		Dado dado = Dado.getDado();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(300, 300, 200, 600);
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0,2));
		
		//Isso ta horrivel mas n consegui fazer com for
		//TODO fechar a janela quando aperta o botao
		button = new JButton("Rodar 1" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(1);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 2" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(2);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 3" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(3);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 4" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(4);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 5" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(5);
			}
		});
		panel.add(button);
		
		
		button = new JButton("Rodar 6" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(6);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 7" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(7);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 8" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(8);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 9" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(9);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 10" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(10);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 11" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(11);
			}
		});
		panel.add(button);
		
		button = new JButton("Rodar 12" );
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado.forcaDado(12);
			}
		});
		panel.add(button);
		
		setSize(200	,300);
	
	}
}
