package br.senai.sp.jandira.Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.java2d.loops.DrawGlyphListAA;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GestãoDeJogosFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtcaixinhadotitulodojogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestãoDeJogosFrame frame = new GestãoDeJogosFrame();
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
	public GestãoDeJogosFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtcaixinhadotitulodojogo = new JTextField();
		txtcaixinhadotitulodojogo.setBounds(130, 25, 150, 20);
		contentPane.add(txtcaixinhadotitulodojogo);
		txtcaixinhadotitulodojogo.setColumns(10);
		
		
		JLabel lblTituloDoJogo = new JLabel("Titulo Do Jogo");
		lblTituloDoJogo.setBounds(10, 28, 110, 14);
		contentPane.add(lblTituloDoJogo);
		
		DefaultListModel addModel = new DefaultListModel();
		
				
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(130, 138, 89, 23);
		contentPane.add(btnSalvar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(347, 138, 2, 2);
		contentPane.add(scrollPane);
		
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
	}
}
