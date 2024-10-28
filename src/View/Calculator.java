package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class Calculator {
	
	double valor1;
	double valor2;
	char op;

	private JFrame frmCalculator;
	private JTextField txfResult;

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
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "1");
			}
		});
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnOne.setBounds(10, 252, 75, 68);
		frmCalculator.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "2");
			}
		});
		btnTwo.setBounds(86, 252, 75, 68);
		frmCalculator.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "3");
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnThree.setBounds(162, 252, 75, 68);
		frmCalculator.getContentPane().add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "4");
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnFour.setBounds(10, 180, 75, 68);
		frmCalculator.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "5");
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnFive.setBounds(86, 180, 75, 68);
		frmCalculator.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "6");
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSix.setBounds(162, 180, 75, 68);
		frmCalculator.getContentPane().add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "7");
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSeven.setBounds(10, 108, 75, 68);
		frmCalculator.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "8");
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEight.setBounds(86, 108, 75, 68);
		frmCalculator.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "9");
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNine.setBounds(162, 108, 75, 68);
		frmCalculator.getContentPane().add(btnNine);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText(txfResult.getText() + "0");
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnZero.setBounds(86, 325, 75, 68);
		frmCalculator.getContentPane().add(btnZero);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            valor2 = Double.parseDouble(txfResult.getText());
		            txfResult.setText("");

		            switch (op) {
		                case '/':
		                    if (valor2 == 0) {
		                        throw new ArithmeticException("Divisão por zero não é permitida!");
		                    }
		                    txfResult.setText("" + (valor1 / valor2));
		                    break;
		                case '*':
		                	txfResult.setText("" + (valor1 * valor2));
		                    break;
		                case '-':
		                	txfResult.setText("" + (valor1 - valor2));
		                    break;
		                case '+':
		                	txfResult.setText("" + (valor1 + valor2));
		                    break;
		                default:
		                    JOptionPane.showMessageDialog(null, "Operação inválida!");
		            }
		        } catch (NumberFormatException error) {
		            JOptionPane.showMessageDialog(null, "Erro: Insira números válidos!");
		        } catch (ArithmeticException error) {
		            JOptionPane.showMessageDialog(null, "Erro: " + error.getMessage());
		        } catch (Exception error) {
		            JOptionPane.showMessageDialog(null, "Erro inesperado: " + error.getMessage());
		        }
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEqual.setBounds(162, 325, 75, 68);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = '+';
		        valor1 = !txfResult.getText().isEmpty() ? Double.parseDouble(txfResult.getText()) : valor1;
		        txfResult.setText("");
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAddition.setBounds(238, 325, 75, 68);
		frmCalculator.getContentPane().add(btnAddition);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = '-';
		        valor1 = !txfResult.getText().isEmpty() ? Double.parseDouble(txfResult.getText()) : valor1;
		        txfResult.setText("");
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSubtract.setBounds(238, 252, 75, 68);
		frmCalculator.getContentPane().add(btnSubtract);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = '*';
		        valor1 = !txfResult.getText().isEmpty() ? Double.parseDouble(txfResult.getText()) : valor1;
		        txfResult.setText("");
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMultiplication.setBounds(238, 180, 75, 68);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = '/';
		        try {
		            valor1 = !txfResult.getText().isEmpty() ? Double.parseDouble(txfResult.getText()) : valor1;
		        } catch (NumberFormatException error) {
		            JOptionPane.showMessageDialog(null, "Erro: Insira um número válido!");
		        }
		        txfResult.setText("");
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDivision.setBounds(238, 108, 75, 68);
		frmCalculator.getContentPane().add(btnDivision);
		
		JButton btnClear = new JButton("CE");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfResult.setText("");
		        valor1 = 0;
		        valor2 = 0;
		        op = ' ';
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnClear.setBounds(10, 325, 75, 68);
		frmCalculator.getContentPane().add(btnClear);
		
		txfResult = new JTextField();
		txfResult.setBackground(new Color(255, 255, 255));
		txfResult.setForeground(new Color(0, 0, 0));
		txfResult.setEnabled(false);
		txfResult.setFont(new Font("SansSerif", Font.BOLD, 32));
		txfResult.setBounds(10, 6, 303, 80);
		frmCalculator.getContentPane().add(txfResult);
		txfResult.setColumns(10);
	}
}
