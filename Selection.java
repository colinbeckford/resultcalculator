package ResultCalc;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Selection extends JFrame
{
	private JTextField txtc1;
	private JTextField txtc2;
	private JTextField txtc3;
	private JTextField txtc4;
	public static String cat1 = "Cleanliness";
	public static String cat2 = "Execution";
	public static String cat3 = "Choreography";
	public static String cat4 = "Body Control";
	
	public Selection() {
		//frame setup
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(400,400);
		
		//title
		JLabel lblSelect = new JLabel("Category Selection");
		lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelect.setBounds(139, 25, 155, 16);
		getContentPane().add(lblSelect);
		
		//label for input
		JLabel lblInput = new JLabel("Input Four Categories");
		lblInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput.setBounds(27, 53, 381, 16);
		getContentPane().add(lblInput);
		
		//button to keep standard IYYF categories
		JButton btnKeepNormalCategories = new JButton("Keep Normal Categories");
		btnKeepNormalCategories.setBounds(114, 81, 210, 29);
		getContentPane().add(btnKeepNormalCategories);
		
		//label that shows normal categories
		JLabel lblNormalCategoriesAre = new JLabel("Normal Categories are Control, Execution, Choreography, Body Control");
		lblNormalCategoriesAre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNormalCategoriesAre.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblNormalCategoriesAre.setBounds(6, 120, 438, 16);
		getContentPane().add(lblNormalCategoriesAre);
		
		//input for first category
		txtc1 = new JTextField();
		txtc1.setHorizontalAlignment(SwingConstants.CENTER);
		txtc1.setText("Category 1");
		txtc1.setBounds(27, 154, 130, 26);
		getContentPane().add(txtc1);
		txtc1.setColumns(10);
		
		//input for second category
		txtc2 = new JTextField();
		txtc2.setHorizontalAlignment(SwingConstants.CENTER);
		txtc2.setText("Category 2");
		txtc2.setBounds(27, 192, 130, 26);
		getContentPane().add(txtc2);
		txtc2.setColumns(10);
		
		//input for third category
		txtc3 = new JTextField();
		txtc3.setHorizontalAlignment(SwingConstants.CENTER);
		txtc3.setText("Category 3");
		txtc3.setBounds(169, 154, 130, 26);
		getContentPane().add(txtc3);
		txtc3.setColumns(10);
		
		//input for fourth category
		txtc4 = new JTextField();
		txtc4.setHorizontalAlignment(SwingConstants.CENTER);
		txtc4.setText("Category 4");
		txtc4.setBounds(169, 192, 130, 26);
		getContentPane().add(txtc4);
		txtc4.setColumns(10);
		
		//button to submit - assigns text values to variables for categories
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cat1 = txtc1.getText();
				cat2 = txtc2.getText();
				cat3 = txtc3.getText();
				cat4 = txtc4.getText();
			}
		});
		btnSubmit.setBounds(316, 172, 117, 29);
		getContentPane().add(btnSubmit);
		
		//button that changes panel to the player input
		JButton btnGoToPlayer = new JButton("Go to Player Input");
		btnGoToPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Player p = new Player();
			}
		});
		btnGoToPlayer.setBounds(267, 230, 164, 29);
		getContentPane().add(btnGoToPlayer);
	}
	
	//get method for first category
	public static String getc1()
	{
		return cat1;
	}
	
	//get method for second category
	public static String getc2()
	{
		return cat2;
	}
	
	//get method for third category
	public static String getc3()
	{
		return cat3;
	}
	
	//get method for fourth category
	public static String getc4()
	{
		return cat4;
	}
	
	//run
	public static void main(String[] args)
	{
		Selection s = new Selection();
	}
	
}
