package ResultCalc;
//import necessary files
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class ResultsOutput extends JFrame
{
	//creating jframe
	static JFrame frame = new JFrame();
	
	
	public ResultsOutput() {
		//2d array of data where the scores will go
		 Object[][] rowData = {};
		 
		 //array for column names
		 String[] columnNames = 
				{"Placing",
		            "Name",
		            "Tech",
		            "Control",
		            "Execution",
		            "Choreography",
		            "Body Control",
		            "Restart",
		            "Discard",
		            "Detach",
		            "Final Score"
		        };
		 
		 //creating table model
		 DefaultTableModel table= new DefaultTableModel(columnNames, 0);
		 JTable listTable;
		 listTable = new JTable(table);
		 listTable.setSize(4000,4000);
		 listTable.setCellEditor(null);
		 listTable.setBounds(37, 143, 397, 183);
		 
		 
		    //loop to add data of scores to table
		    for (int i = 0; i < finalScore.finalPlayerScores.size(); i++) 
		    {
		    	int iPlacing = finalScore.finalPlayerScores.get(i).getPlacing();
		    	String sName = finalScore.finalPlayerScores.get(i).getName();
		    	int iTech = finalScore.finalPlayerScores.get(i).getTech();
		    	int iControl = finalScore.finalPlayerScores.get(i).getControl();
		    	int iExecution = finalScore.finalPlayerScores.get(i).getExecution();
		    	int iChoreography = finalScore.finalPlayerScores.get(i).getChoreography();
		    	int iBodyControl = finalScore.finalPlayerScores.get(i).getBodyControl();
		    	int iRestart = finalScore.finalPlayerScores.get(i).getRestart();
		    	int iDiscard = finalScore.finalPlayerScores.get(i).getDiscard();
		    	int iDetach = finalScore.finalPlayerScores.get(i).getDetach();
		    	double dFinalScore = finalScore.finalPlayerScores.get(i).getFinal();
		      table.addRow(new Object[] {iPlacing, sName, iTech, iControl, iExecution, iChoreography, iBodyControl, iRestart, iDiscard, iDetach, dFinalScore});
		    }

		    //frame info
		    frame.getContentPane().add(new JScrollPane(listTable), BorderLayout.NORTH);
		    frame.setVisible(true);
		    frame.setSize(4000,4000);
		    frame.pack();
	
	}
	
	
	
 
}

