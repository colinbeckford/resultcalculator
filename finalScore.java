package ResultCalc;
//import arraylist file
import java.util.ArrayList;

public class finalScore {
	
	//instance variables
	double dFinal;
	int iPlacing;
	String sName;
	int iTech;
	int iControl;
	int iExecution;
	int iChoreography;
	int iBodyControl;
	int iRestart;
	int iDiscard;
	int iDetach;
	
	//arraylist for final scores
	public static ArrayList<finalScore> finalPlayerScores = new ArrayList<finalScore>();
	
	//constructor for final scores of each player
	public finalScore(int placing, String name, int tech, int control, int execution, int choreography, int bodycontrol, int restart, int discard, int detach, double finalscore)
	{
		dFinal = finalscore;
		iPlacing = placing;
		sName = name;
		iTech = tech;
		iControl = control;
		iExecution = execution;
		iChoreography = choreography;
		iBodyControl = bodycontrol;
		iRestart = restart;
		iDiscard = discard;
		iDetach = detach;
	}
	
	//get method for placing
	public int getPlacing()
	{
		return iPlacing;
	}
	
	//get method for name
	public String getName()
	{
		return sName;
	}
	
	//get method for tech score
	public int getTech()
	{
		return iTech;
	}
	
	//get method for control
	public int getControl()
	{
		return iControl;
	}
	
	//get method for execution
	public int getExecution()
	{
		return iExecution;
	}
	
	//get method for choreography
	public int getChoreography()
	{
		return iChoreography;
	}
	
	//get method for body control
	public int getBodyControl()
	{
		return iBodyControl;
	}
	
	//get method for restarts
	public int getRestart()
	{
		return iRestart;
	}
	
	//get method for discards
	public int getDiscard()
	{
		return iDiscard;
	}
	
	//get method for detaches
	public int getDetach()
	{
		return iDetach;
	}
	
	//get method for final score
	public double getFinal()
	{
		return dFinal;
	}
	
	//set method to set the placing of each player
	public void setPlacing(int d)
	{
		iPlacing = d;
	}
	
	

}
