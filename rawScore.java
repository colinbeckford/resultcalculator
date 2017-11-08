package ResultCalc;
//import necessary files
import java.util.Collections;
import java.util.Comparator;

public class rawScore {
	
	//instance variables
	static int highest;
	String Sname;
	int Irawscore;
	int IC1;
	int IC2;
	int IC3;
	int IC4;
	int Irestart;
	int Idiscard;
	int Idetach;
	
	//constructor for the player's scores
	public rawScore(String name, int raw, int C1, int C2, int C3, int C4, int restart, int discard, int detach)
	{
		Sname = name;
		Irawscore = raw;
		IC1 = C1;
		IC2 = C2;
		IC3 = C3;
		IC4 = C4;
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
	
	//get method for C1 score
	public int getC1()
	{
		return IC1;
	}
	
	//get method for C2 score
	public int getC2()
	{
		return IC2;
	}
	
	//get method for C3
	public int getC3()
	{
		return IC3;
	}
	
	//get method for body C1
	public int getC4()
	{
		return IC4;
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
			double total = (ScoreInput.rawPlayerScores.get(i).getRaw()+ScoreInput.rawPlayerScores.get(i).getC1()+ScoreInput.rawPlayerScores.get(i).getC2()+ScoreInput.rawPlayerScores.get(i).getC3()+ScoreInput.rawPlayerScores.get(i).getC4()) - ((ScoreInput.rawPlayerScores.get(i).getRestart()*1)+(ScoreInput.rawPlayerScores.get(i).getDiscard()*3)+(ScoreInput.rawPlayerScores.get(i).getDetach())*5);
			finalScore.finalPlayerScores.add(new finalScore(0, ScoreInput.rawPlayerScores.get(i).getName(), ScoreInput.rawPlayerScores.get(i).getRaw(), ScoreInput.rawPlayerScores.get(i).getC1(), ScoreInput.rawPlayerScores.get(i).getC2(), ScoreInput.rawPlayerScores.get(i).getC3(), ScoreInput.rawPlayerScores.get(i).getC4(), (ScoreInput.rawPlayerScores.get(i).getRestart()), (ScoreInput.rawPlayerScores.get(i).getDiscard()), (ScoreInput.rawPlayerScores.get(i).getDetach()), total));
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