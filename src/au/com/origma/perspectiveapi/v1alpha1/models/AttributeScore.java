/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

import java.util.List;

public class AttributeScore {

	Score summaryScore;
	List<SpanScore> spanScores;
	
	public AttributeScore() {
		super();
	}

	public AttributeScore(Score summaryScore, List<SpanScore> spanScores) {
		super();
		this.summaryScore = summaryScore;
		this.spanScores = spanScores;
	}

	public Score getSummaryScore() {
		return summaryScore;
	}

	public void setSummaryScore(Score summaryScore) {
		this.summaryScore = summaryScore;
	}

	public List<SpanScore> getSpanScores() {
		return spanScores;
	}

	public void setSpanScores(List<SpanScore> spanScores) {
		this.spanScores = spanScores;
	}
	
}
