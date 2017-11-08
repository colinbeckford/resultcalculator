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
		            Selection.getc1(),
		            Selection.getc2(),
		            Selection.getc3(),
		            Selection.getc4(),
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
		    	int iC1 = finalScore.finalPlayerScores.get(i).getC1();
		    	int iC2 = finalScore.finalPlayerScores.get(i).getC2();
		    	int iC3 = finalScore.finalPlayerScores.get(i).getC3();
		    	int iC4 = finalScore.finalPlayerScores.get(i).getC4();
		    	int iRestart = finalScore.finalPlayerScores.get(i).getRestart();
		    	int iDiscard = finalScore.finalPlayerScores.get(i).getDiscard();
		    	int iDetach = finalScore.finalPlayerScores.get(i).getDetach();
		    	double dFinalScore = finalScore.finalPlayerScores.get(i).getFinal();
		      table.addRow(new Object[] {iPlacing, sName, iTech, iC1, iC2, iC3, iC4, iRestart, iDiscard, iDetach, dFinalScore});
		    }

		    //frame info
		    frame.getContentPane().add(new JScrollPane(listTable), BorderLayout.NORTH);
		    frame.setVisible(true);
		    frame.setSize(4000,4000);
		    frame.pack();
	
	}
	
	
	
 
}

