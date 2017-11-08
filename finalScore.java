package ResultCalc;
//import arraylist file
import java.util.ArrayList;

public class finalScore {
	
	//instance variables
	double dFinal;
	int iPlacing;
	String sName;
	int iTech;
	int iC1;
	int iC2;
	int iC3;
	int iC4;
	int iRestart;
	int iDiscard;
	int iDetach;
	
	//arraylist for final scores
	public static ArrayList<finalScore> finalPlayerScores = new ArrayList<finalScore>();
	
	//constructor for final scores of each player
	public finalScore(int placing, String name, int tech, int C1, int C2, int C3, int C4, int restart, int discard, int detach, double finalscore)
	{
		dFinal = finalscore;
		iPlacing = placing;
		sName = name;
		iTech = tech;
		iC1 = C1;
		iC2 = C2;
		iC3 = C3;
		iC4 = C4;
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
	
	//get method for C1
	public int getC1()
	{
		return iC1;
	}
	
	//get method for C2
	public int getC2()
	{
		return iC2;
	}
	
	//get method for C3
	public int getC3()
	{
		return iC3;
	}
	
	//get method for body C1
	public int getC4()
	{
		return iC4;
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
