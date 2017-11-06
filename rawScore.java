package ResultCalc;
//import necessary files
import java.util.Collections;
import java.util.Comparator;

public class rawScore {
	
	//instance variables
	static int highest;
	String Sname;
	int Irawscore;
	int Icontrol;
	int Iexecution;
	int Ichoreography;
	int Ibodycontrol;
	int Irestart;
	int Idiscard;
	int Idetach;
	
	//constructor for the player's scores
	public rawScore(String name, int raw, int control, int execution, int choreography, int bodycontrol, int restart, int discard, int detach)
	{
		Sname = name;
		Irawscore = raw;
		Icontrol = control;
		Iexecution = execution;
		Ichoreography = choreography;
		Ibodycontrol = bodycontrol;
		Irestart = restart;
		Idiscard = discard;
		Idetach = detach;
		
	}
	
	//get method for name
	public String getName()
	{
		return Sname;
	}
	
	//get method for raw score
	public int getRaw()
	{
		return Irawscore;
	}
	
	//get method for control score
	public int getControl()
	{
		return Icontrol;
	}
	
	//get method for execution score
	public int getExecution()
	{
		return Iexecution;
	}
	
	//get method for choreography
	public int getChoreography()
	{
		return Ichoreography;
	}
	
	//get method for body control
	public int getBodyControl()
	{
		return Ibodycontrol;
	}
	
	//get method for restarts
	public int getRestart()
	{
		return Irestart;
	}
	
	//get methods for discards
	public int getDiscard()
	{
		return Idiscard;
	}
	
	//get method for detaches
	public int getDetach()
	{
		return Idetach;
	}

	//sorts arraylist of scores based on who has highest tech raw score (used to normalize scores)
	public static void sortArray()
	{
		ScoreInput.rawPlayerScores.sort(Comparator.comparing(rawScore::getRaw).reversed());
	}
	
	//normalizes scores /60 based on raw score of first arraylist index raw score
	public static void normalizeRaw()
	{
		for (int i=0;i<ScoreInput.rawPlayerScores.size();i++)
		{
			if (i==0)
			{
				highest = ScoreInput.rawPlayerScores.get(i).Irawscore;
				ScoreInput.rawPlayerScores.get(i).Irawscore = 60;
			}
			else
				ScoreInput.rawPlayerScores.get(i).Irawscore = (int) (((double)ScoreInput.rawPlayerScores.get(i).Irawscore/highest)*60);
		}
	}
	
	//calculates final scores and adds to new finalPlayerScores array
	public static void calculateFinal()
	{
		for (int i=0;i<ScoreInput.rawPlayerScores.size();i++)
		{
			double total = (ScoreInput.rawPlayerScores.get(i).getRaw()+ScoreInput.rawPlayerScores.get(i).getControl()+ScoreInput.rawPlayerScores.get(i).getExecution()+ScoreInput.rawPlayerScores.get(i).getChoreography()+ScoreInput.rawPlayerScores.get(i).getBodyControl()) - ((ScoreInput.rawPlayerScores.get(i).getRestart()*1)+(ScoreInput.rawPlayerScores.get(i).getDiscard()*3)+(ScoreInput.rawPlayerScores.get(i).getDetach())*5);
			finalScore.finalPlayerScores.add(new finalScore(0, ScoreInput.rawPlayerScores.get(i).getName(), ScoreInput.rawPlayerScores.get(i).getRaw(), ScoreInput.rawPlayerScores.get(i).getControl(), ScoreInput.rawPlayerScores.get(i).getExecution(), ScoreInput.rawPlayerScores.get(i).getChoreography(), ScoreInput.rawPlayerScores.get(i).getBodyControl(), (ScoreInput.rawPlayerScores.get(i).getRestart()*-1), (ScoreInput.rawPlayerScores.get(i).getDiscard()*-3), (ScoreInput.rawPlayerScores.get(i).getDetach()*-5), total));
		}
	}
	
	//method to reorder final results
	public static void sortFinal()
	{
		finalScore.finalPlayerScores.sort(Comparator.comparing(finalScore::getFinal).reversed());
		for (int i=0;i<finalScore.finalPlayerScores.size();i++)
		{
			finalScore.finalPlayerScores.get(i).setPlacing(i+1);
		}
	}
	
	

}