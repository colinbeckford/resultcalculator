package ResultCalc;
//importing necessary files
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Player extends JFrame
{
	//arraylist that holds the list of players
	public static ArrayList<String> alPlayerList = new ArrayList<String>();
	public Player() {
		
		//basic frame info
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(400,400);
		
		//textarea where player list is input - each player separated by enter key/each player on each line
		JTextArea txtrPlayerInput = new JTextArea();
		txtrPlayerInput.setBackground(Color.LIGHT_GRAY);
		txtrPlayerInput.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtrPlayerInput.setBounds(37, 137, 170, 193);
		getContentPane().add(txtrPlayerInput);
		
		//submit button initializes arraylist from textarea
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				for (String line : txtrPlayerInput.getText().split("\\n"))
				{
					alPlayerList.add(line);
				}
			}
		});
		btnSubmit.setBackground(new Color(30, 144, 255));
		btnSubmit.setBounds(239, 260, 117, 29);
		getContentPane().add(btnSubmit);
		
		//button to go to the input scores page
		JButton btnGoToScore = new JButton("Go to Score Input");
		btnGoToScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ScoreInput run = new ScoreInput();
			}
		});
		btnGoToScore.setBackground(new Color(135, 206, 250));
		btnGoToScore.setBounds(224, 301, 170, 29);
		getContentPane().add(btnGoToScore);
		
		//title
		JLabel lblPlayerListInput = new JLabel("Player List Input");
		lblPlayerListInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerListInput.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblPlayerListInput.setBounds(18, 28, 357, 52);
		getContentPane().add(lblPlayerListInput);
		
		//label to show where to put player list
		JLabel lblInputPlayersHere = new JLabel("Input Players Here");
		lblInputPlayersHere.setBounds(64, 109, 117, 16);
		getContentPane().add(lblInputPlayersHere);
	}
	//run 
	public static void main(String[] args)
	{
		Player p = new Player();
	}
}
