package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField txtInput;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}


	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\C++\\Calculator\\Icons\\calculadora.png"));
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setForeground(new Color(192, 192, 192));
		frmCalculator.setBackground(new Color(192, 192, 192));
		frmCalculator.setBounds(100, 100, 340, 441);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnOne.setBounds(10, 252, 75, 68);
		frmCalculator.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTwo.setBounds(86, 252, 75, 68);
		frmCalculator.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnThree.setBounds(162, 252, 75, 68);
		frmCalculator.getContentPane().add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnFour.setBounds(10, 180, 75, 68);
		frmCalculator.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnFive.setBounds(86, 180, 75, 68);
		frmCalculator.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSix.setBounds(162, 180, 75, 68);
		frmCalculator.getContentPane().add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSeven.setBounds(10, 108, 75, 68);
		frmCalculator.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEight.setBounds(86, 108, 75, 68);
		frmCalculator.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNine.setBounds(162, 108, 75, 68);
		frmCalculator.getContentPane().add(btnNine);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnZero.setBounds(86, 325, 75, 68);
		frmCalculator.getContentPane().add(btnZero);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEqual.setBounds(162, 325, 75, 68);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnAddition = new JButton("+");
		btnAddition.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAddition.setBounds(238, 325, 75, 68);
		frmCalculator.getContentPane().add(btnAddition);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSubtract.setBounds(238, 252, 75, 68);
		frmCalculator.getContentPane().add(btnSubtract);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMultiplication.setBounds(238, 180, 75, 68);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDivision.setBounds(238, 108, 75, 68);
		frmCalculator.getContentPane().add(btnDivision);
		
		JButton btnClear = new JButton("CE");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnClear.setBounds(10, 325, 75, 68);
		frmCalculator.getContentPane().add(btnClear);
		
		txtInput = new JTextField();
		txtInput.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInput.setFont(new Font("Tahoma", Font.PLAIN, 34));
		txtInput.setBounds(10, 11, 303, 86);
		frmCalculator.getContentPane().add(txtInput);
		txtInput.setColumns(10);
	}
}
