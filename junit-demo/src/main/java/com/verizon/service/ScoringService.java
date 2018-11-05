package com.verizon.service;

import com.verizon.exception.ScoreException;
import com.verizon.model.Grade;

public class ScoringService {

	public Grade getGrade(double avg) {
		Grade g = null;

		if (avg >= 90)
			g = Grade.A;
		else if (avg >= 80)
			g = Grade.B;
		else if (avg >= 70)
			g = Grade.C;
		else
			g = Grade.F;

		return g;
	}

	public double getPercentage(int[] marks, int maxMarksInEachSubject) throws ScoreException{				//exceptions will ocxcur if 0 or sopmething arithmatic exceoptions		//not good to throw exceptions directrly			
		if(maxMarksInEachSubject<=0)			
			throw new ScoreException("Invalid max mkarks");					
		if(marks==null || marks.length == 0)			
			throw new ScoreException("no marks recieved");				
		double totalMaxScore = maxMarksInEachSubject*marks.length;		
		double totalScore = 0;		
		for(int score:marks) {	
			if(score<0 || score >maxMarksInEachSubject)
				throw new ScoreException("one of the scores is negetive");
			totalScore+=score;	
			}				
		double percent = (totalScore/(double)totalMaxScore)*100;			
		return percent;	
	}


}
