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
	private JTextField txtControl;
	private JTextField txtExecution;
	private JTextField txtBodyControl;
	private JTextField txtChoreography;
	private JTextField txtRestart;
	private JTextField txtDiscard;
	private JTextField txtDetach;
	private JLabel lblScoreInput;
	private JLabel lblName;
	private JLabel labelPlus;
	private JLabel labelMinus;
	private JLabel lblControl;
	private JLabel lblExecution;
	private JLabel lblChoreography;
	private JLabel lblBodyControl;
	private JLabel lblRestart;
	private JLabel lblDiscard;
	private JLabel lblDetach;
	int minus;
	int control;
	int execution;
	int choreography;
	int bodycontrol;
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
		
		//where to put control score
		txtControl = new JTextField();
		txtControl.setText("");
		txtControl.setBounds(6, 113, 61, 26);
		getContentPane().add(txtControl);
		txtControl.setColumns(10);
		
		//where to put execution score
		txtExecution = new JTextField();
		txtExecution.setText("");
		txtExecution.setBounds(71, 113, 82, 26);
		getContentPane().add(txtExecution);
		txtExecution.setColumns(10);
		
		//where to put body control score
		txtBodyControl = new JTextField();
		txtBodyControl.setText("");
		txtBodyControl.setBounds(271, 113, 95, 26);
		getContentPane().add(txtBodyControl);
		txtBodyControl.setColumns(10);
		
		//where to put choreography score
		txtChoreography = new JTextField();
		txtChoreography.setText("");
		txtChoreography.setBounds(158, 113, 101, 26);
		getContentPane().add(txtChoreography);
		txtChoreography.setColumns(10);
		
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
						txtControl.setText("");
						txtExecution.setText("");
						txtBodyControl.setText("");
						txtChoreography.setText("");
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
					control = Integer.parseInt(txtControl.getText());
					execution = Integer.parseInt(txtExecution.getText());
					choreography = Integer.parseInt(txtChoreography.getText());
					bodycontrol = Integer.parseInt(txtBodyControl.getText());
					
					
					

					rawPlayerScores.add(new rawScore(name, raw, control, execution, choreography, bodycontrol, restart, discard, detach));		
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
					txtControl.setText("");
					txtExecution.setText("");
					txtBodyControl.setText("");
					txtChoreography.setText("");
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
				if (Integer.parseInt(txtControl.getText()) > 10 || Integer.parseInt(txtControl.getText()) < 0 || Integer.parseInt(txtExecution.getText()) > 10 || Integer.parseInt(txtExecution.getText()) < 0 || Integer.parseInt(txtChoreography.getText()) > 10 || Integer.parseInt(txtChoreography.getText()) < 0 || Integer.parseInt(txtBodyControl.getText()) > 10 || Integer.parseInt(txtBodyControl.getText()) < 0 )
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
		
		//label for control score
		lblControl = new JLabel("Control");
		lblControl.setBounds(6, 98, 61, 16);
		getContentPane().add(lblControl);
		
		//label for execution score
		lblExecution = new JLabel("Execution");
		lblExecution.setBounds(71, 98, 82, 16);
		getContentPane().add(lblExecution);
		
		//label for choreography score
		lblChoreography = new JLabel("Choreography");
		lblChoreography.setBounds(158, 98, 101, 16);
		getContentPane().add(lblChoreography);
		
		//label for body control score
		lblBodyControl = new JLabel("Body Control");
		lblBodyControl.setBounds(271, 98, 95, 16);
		getContentPane().add(lblBodyControl);
		
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
