package ResultCalc;
//importing necessary files
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class ScoreInput extends JFrame
{
	//instance variables
	private JTextField txtName;
	private JTextField txtPlus;
	private JTextField txtMinus;
	private JTextField txtC1;
	private JTextField txtC2;
	private JTextField txtC4;
	private JTextField txtC3;
	private JTextField txtRestart;
	private JTextField txtDiscard;
	private JTextField txtDetach;
	private JLabel lblScoreInput;
	private JLabel lblName;
	private JLabel labelPlus;
	private JLabel labelMinus;
	private JLabel lblC1;
	private JLabel lblC2;
	private JLabel lblC3;
	private JLabel lblC4;
	private JLabel lblRestart;
	private JLabel lblDiscard;
	private JLabel lblDetach;
	int minus;
	int C1;
	int C2;
	int C3;
	int C4;
	int restart;
	int discard;
	int detach;
	int raw;

	
	
	//int that represents what player the list is on
	int increment = 0;
	
	//arraylist to take in the scores for each player
		public static ArrayList<rawScore> rawPlayerScores = new ArrayList<rawScore>();

	public ScoreInput() {
		//basic frame info
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(400,400);
		
		//name field - loaded in from arraylist
		txtName = new JTextField();
		txtName.setText(Player.alPlayerList.get(increment));
		txtName.setBounds(6, 60, 130, 26);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		//where to put positive clicks
		txtPlus = new JTextField();
		txtPlus.setText("");
		txtPlus.setBounds(184, 60, 39, 26);
		getContentPane().add(txtPlus);
		txtPlus.setColumns(10);
		
		//where to put negative clicks
		txtMinus = new JTextField();
		txtMinus.setText("");
		txtMinus.setBounds(243, 60, 52, 26);
		getContentPane().add(txtMinus);
		txtMinus.setColumns(10);
		
		//where to put C1 score
		txtC1 = new JTextField();
		txtC1.setText("");
		txtC1.setBounds(6, 113, 61, 26);
		getContentPane().add(txtC1);
		txtC1.setColumns(10);
		
		//where to put C2 score
		txtC2 = new JTextField();
		txtC2.setText("");
		txtC2.setBounds(71, 113, 82, 26);
		getContentPane().add(txtC2);
		txtC2.setColumns(10);
		
		//where to put body C1 score
		txtC4 = new JTextField();
		txtC4.setText("");
		txtC4.setBounds(271, 113, 95, 26);
		getContentPane().add(txtC4);
		txtC4.setColumns(10);
		
		//where to put C3 score
		txtC3 = new JTextField();
		txtC3.setText("");
		txtC3.setBounds(158, 113, 101, 26);
		getContentPane().add(txtC3);
		txtC3.setColumns(10);
		
		//where to put number of restarts
		txtRestart = new JTextField();
		txtRestart.setText("");
		txtRestart.setBounds(6, 164, 61, 26);
		getContentPane().add(txtRestart);
		txtRestart.setColumns(10);
		
		//where to put number of switches
		txtDiscard = new JTextField();
		txtDiscard.setText("");
		txtDiscard.setBounds(75, 164, 61, 26);
		getContentPane().add(txtDiscard);
		txtDiscard.setColumns(10);
		
		//where to put number of detaches
		txtDetach = new JTextField();
		txtDetach.setText("");
		txtDetach.setBounds(144, 164, 61, 26);
		getContentPane().add(txtDetach);
		txtDetach.setColumns(10);
		
		//label that shows confirm statement
		JLabel lblConfirm = new JLabel("Are you sure you want to submit?");
		lblConfirm.setBounds(71, 240, 224, 16);
		getContentPane().add(lblConfirm);
		lblConfirm.setVisible(false);
		
		//label that appears if there is an error 
		JLabel lblError = new JLabel("You have an invalid parameter in your input.");
		lblError.setBounds(31, 212, 295, 16);
		getContentPane().add(lblError);
		lblError.setVisible(false);
		
		//button for yes to confirm submit
		JButton btnYes = new JButton("Yes");
		
		//button for no to confirm submit
				JButton btnNo = new JButton("No");
				btnNo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						txtPlus.setText("");
						txtMinus.setText("");
						txtC1.setText("");
						txtC2.setText("");
						txtC4.setText("");
						txtC3.setText("");
						txtRestart.setText("");
						txtDiscard.setText("");
						txtDetach.setText("");
						btnYes.setVisible(false);
						btnNo.setVisible(false);
						lblError.setVisible(false);
						lblConfirm.setVisible(false);
					}
				});
				btnNo.setBounds(184, 268, 117, 29);
				getContentPane().add(btnNo);
				btnNo.setVisible(false);
		
		//yes button command
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// variables for name and scores initialized by textfield info and data is added to arraylist
				if (increment < Player.alPlayerList.size())
				{
					if (Integer.parseInt(txtRestart.getText()) < 0)
					{
						restart = Integer.parseInt(txtRestart.getText())*(-1);
					}
					else
					{
						restart = Integer.parseInt(txtRestart.getText());
					}
					if (Integer.parseInt(txtDiscard.getText()) < 0)
					{
						discard = Integer.parseInt(txtDiscard.getText())*(-1);
					}
					else
					{
						discard = Integer.parseInt(txtDiscard.getText());
					}
					if (Integer.parseInt(txtDetach.getText()) < 0)
					{
						detach = Integer.parseInt(txtDetach.getText())*(-1);
					}
					else
					{
						detach = Integer.parseInt(txtDetach.getText());
					}
					if (Integer.parseInt(txtMinus.getText()) < 0)
					{
						minus = Integer.parseInt(txtMinus.getText())*(-1);
					}
					else
					{
						minus = Integer.parseInt(txtMinus.getText());
					}
					
					String name = txtName.getText();
					raw = (Integer.parseInt(txtPlus.getText()) - minus);
					C1 = Integer.parseInt(txtC1.getText());
					C2 = Integer.parseInt(txtC2.getText());
					C3 = Integer.parseInt(txtC3.getText());
					C4 = Integer.parseInt(txtC4.getText());
					
					
					

					rawPlayerScores.add(new rawScore(name, raw, C1, C2, C3, C4, restart, discard, detach));		
					btnYes.setVisible(false);
					btnNo.setVisible(false);
					lblConfirm.setVisible(false);
					lblError.setVisible(false);
					
				}
				//if the player is the last player, if statement above is completed as well as sorting/normalizing/calculation methods are computed, resulting in opening the results table
				if (increment == Player.alPlayerList.size()-1)
				{
					rawScore.sortArray();
					rawScore.normalizeRaw();
					rawScore.calculateFinal();
					rawScore.sortFinal();
					ResultsOutput run = new ResultsOutput();
				}
				//if the player isn't the last player, increment value is increased (allowing for name field to change to next player) and other textfields are cleared
				if (increment < Player.alPlayerList.size()-1)
				{
					increment++;
					txtName.setText(Player.alPlayerList.get(increment));
					txtPlus.setText("");
					txtMinus.setText("");
					txtC1.setText("");
					txtC2.setText("");
					txtC4.setText("");
					txtC3.setText("");
					txtRestart.setText("");
					txtDiscard.setText("");
					txtDetach.setText("");
				}
			}
		});
		btnYes.setBounds(66, 268, 117, 29);
		getContentPane().add(btnYes);
		btnYes.setVisible(false);
		
		//button to submit scores for player
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				lblConfirm.setVisible(true);
				if (Integer.parseInt(txtC1.getText()) > 10 || Integer.parseInt(txtC1.getText()) < 0 || Integer.parseInt(txtC2.getText()) > 10 || Integer.parseInt(txtC2.getText()) < 0 || Integer.parseInt(txtC3.getText()) > 10 || Integer.parseInt(txtC3.getText()) < 0 || Integer.parseInt(txtC4.getText()) > 10 || Integer.parseInt(txtC4.getText()) < 0 )
				{
					lblError.setVisible(true);
				}
				btnYes.setVisible(true);
				btnNo.setVisible(true);
			}
		});
		btnSubmit.setBounds(243, 164, 117, 29);
		getContentPane().add(btnSubmit);
		
		//title
		lblScoreInput = new JLabel("Score Input");
		lblScoreInput.setBounds(158, 6, 76, 16);
		getContentPane().add(lblScoreInput);
		
		//label for name
		lblName = new JLabel("Name");
		lblName.setBounds(6, 41, 61, 16);
		getContentPane().add(lblName);
		
		//label for + clicks
		labelPlus = new JLabel("+");
		labelPlus.setBounds(184, 41, 39, 16);
		getContentPane().add(labelPlus);
		
		//label for - clicks
		labelMinus = new JLabel("-");
		labelMinus.setBounds(243, 41, 15, 16);
		getContentPane().add(labelMinus);
		
		//label for first eval
		lblC1 = new JLabel(Selection.getc1());
		lblC1.setBounds(6, 98, 61, 16);
		getContentPane().add(lblC1);
		
		//label for C2 score
		lblC2 = new JLabel(Selection.getc2());
		lblC2.setBounds(71, 98, 82, 16);
		getContentPane().add(lblC2);
		
		//label for C3 score
		lblC3 = new JLabel(Selection.getc3());
		lblC3.setBounds(158, 98, 101, 16);
		getContentPane().add(lblC3);
		
		//label for body C1 score
		lblC4 = new JLabel(Selection.getc4());
		lblC4.setBounds(271, 98, 95, 16);
		getContentPane().add(lblC4);
		
		//label for restarts
		lblRestart = new JLabel("Restart");
		lblRestart.setBounds(6, 151, 61, 16);
		getContentPane().add(lblRestart);
		
		//label for discards
		lblDiscard = new JLabel("Discard");
		lblDiscard.setBounds(71, 151, 61, 16);
		getContentPane().add(lblDiscard);
		
		//label for detaches
		lblDetach = new JLabel("Detach");
		lblDetach.setBounds(144, 151, 61, 16);
		getContentPane().add(lblDetach);
		
		
	}
}
