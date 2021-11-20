package br.senai.sp.jandira.Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Jogo;


import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
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
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Zerado;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;
import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;

import javax.swing.JTextArea;

public class GestãoDeJogosFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtcaixinhadotitulodojogo;
	private JTextField txtcaixavalorestimado;

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

	private int posicao = 0;
	public GestãoDeJogosFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 524);
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
		
		
		
				
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(35, 359, 89, 23);
		contentPane.add(btnSalvar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(278, 89, 146, 161);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		DefaultListModel<String> listamodel = new DefaultListModel<String>();
		list.setModel(listamodel);
		
		JLabel lblFabricante = new JLabel("Fabricante : ");
		lblFabricante.setBounds(10, 53, 110, 14);
		contentPane.add(lblFabricante);
		
		JLabel lblZerado = new JLabel("Zerado");
		lblZerado.setBounds(10, 91, 46, 14);
		contentPane.add(lblZerado);
		
		JComboBox comboBoxzerado = new JComboBox();
		DefaultComboBoxModel<String> modelConsole = new DefaultComboBoxModel<String>();
		comboBoxzerado.setModel(new DefaultComboBoxModel(Zerado.values()));
		comboBoxzerado.setBounds(54, 87, 66, 22);
		contentPane.add(comboBoxzerado);
		for (Console p : Console.values()) {
			modelConsole.addElement(p.getDescricao());
		}
		JComboBox comboBoxConsole = new JComboBox();
		comboBoxConsole.setModel(new DefaultComboBoxModel(Console.values()));
		
		
		comboBoxConsole.setBounds(85, 131, 146, 22);
		contentPane.add(comboBoxConsole);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(10, 135, 65, 14);
		contentPane.add(lblConsole);
		
		JLabel lblValorestimado = new JLabel("Valor Estimado:");
		lblValorestimado.setBounds(10, 175, 89, 14);
		contentPane.add(lblValorestimado);
		
		txtcaixavalorestimado = new JTextField();
		txtcaixavalorestimado.setBounds(118, 172, 86, 20);
		contentPane.add(txtcaixavalorestimado);
		txtcaixavalorestimado.setColumns(10);
		
		JLabel lblObservaçoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaçoes.setBounds(10, 216, 89, 14);
		contentPane.add(lblObservaçoes);
		
		JTextArea txtobservaçoes = new JTextArea();
		txtobservaçoes.setBounds(85, 220, 130, 128);
		contentPane.add(txtobservaçoes);
		
		JComboBox comboBoxFabricante = new JComboBox();
		comboBoxFabricante.setBounds(119, 49, 161, 22);
		Fabricante fabricante = new Fabricante();
		
		
		DefaultListModel<String> combofabricante = new DefaultListModel<String>();
		contentPane.add(comboBoxFabricante);
		
		FabricanteRepository fabricanteRepository = new FabricanteRepository(10);
		
		DefaultListModel listModel = new DefaultListModel();
		
		JogoRepository jogos = new JogoRepository(10);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogo jogo = new Jogo();
				jogo.setTitulodojogo(txtcaixinhadotitulodojogo.getText());
				listamodel.addElement(jogo.getTitulodojogo());	
				
				// definir o console 
				jogo.setConsole((determinarConsole(comboBoxConsole.getSelectedIndex())));
				
				fabricanteRepository.gravar(jogo, posicao);
				posicao++;
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(153, 359, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnesquerdo = new JButton("<");
		btnesquerdo.setBounds(271, 299, 77, 34);
		contentPane.add(btnesquerdo);
		btnesquerdo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		
		JButton btndireito = new JButton(">");
		btndireito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btndireito.setBounds(359, 299, 77, 34);
		contentPane.add(btndireito);
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			listModel.removeElement(txtcaixinhadotitulodojogo);
			txtcaixinhadotitulodojogo.setText("");
			txtcaixinhadotitulodojogo.requestFocus();
			listModel.removeElement(txtobservaçoes);
			txtobservaçoes.setText("");
			txtobservaçoes.requestFocus();
			listModel.removeElement(txtcaixavalorestimado);
			txtcaixavalorestimado.setText("");
			txtcaixavalorestimado.requestFocus();
			listamodel.removeAllElements();	
			}
		});
	}
		private Console determinarConsole(int consoleSelecionado) {
			 if (consoleSelecionado == 0) {
			    	return Console.NINTENDOSWITCH;
			    } else if (consoleSelecionado == 1) {
			    	return  Console.PLAYSTATION4;
			    } else {
			    	return Console.XBOX;
			    }
	}
}
