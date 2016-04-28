package cs235.lab8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class InterestGUI extends JFrame{
	private static final long serialVersionUID = 1L;
	private JLabel depositLabel, periodLabel, rateLabel, maturityLabel;
	private JTextField depositField, periodField, rateField, maturityField;
	private JButton calculateButton, exitButton;
	public InterestGUI(){
		//Create GUI component objects
		depositLabel	= new JLabel("Amount deposited:", SwingConstants.RIGHT);
		periodLabel		= new JLabel("Duration in years:", SwingConstants.RIGHT);
		rateLabel		= new JLabel("Interest rate:", SwingConstants.RIGHT);
		maturityLabel	= new JLabel("Value on maturity:", SwingConstants.RIGHT);
		
		depositField	= new JTextField(10);
		periodField		= new JTextField(10);
		rateField		= new JTextField(10);
		maturityField	= new JTextField(10);
		
		calculateButton	= new JButton("Calculate");
		exitButton		= new JButton("Exit");
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(5,2));
		pane.add(depositLabel);
		pane.add(depositField);
		pane.add(periodLabel);
		pane.add(periodField);
		pane.add(rateLabel);
		pane.add(rateField);
		pane.add(maturityLabel);
		pane.add(maturityField);
		pane.add(calculateButton);
		pane.add(exitButton);
		
		calculateButton.addActionListener(new calculateButtonHandler());
		exitButton.addActionListener(new exitButtonHandler());
		
		this.setSize(500, 200);
		this.setTitle("Deposit Maturity");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {new InterestGUI();}
	private class calculateButtonHandler implements ActionListener{
		@Override public void actionPerformed(ActionEvent arg0) {
			double	deposit	= Double.parseDouble(depositField.getText()),
					period	= Double.parseDouble(periodField.getText()),
					rate	= Double.parseDouble(rateField.getText());
			maturityField.setText(String.format("%.2f",deposit * Math.pow(1 + (rate / 100), period)));
		}
	}
	private class exitButtonHandler implements ActionListener{
		@Override public void actionPerformed(ActionEvent e){System.exit(0);}
	}

}
