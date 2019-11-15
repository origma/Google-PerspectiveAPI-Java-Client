/*
 * Copyright 2019 Origma Pty Ltd (ACN 629 381 184) and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

import java.util.List;

/**
 * The score of an attribute
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public class AttributeScore {

	Score summaryScore;
	List<SpanScore> spanScores;
	
	/**
	 * Create an empty instance
	 */
	public AttributeScore() {
		super();
	}

	/**
	 * Create an instance
	 */
	public AttributeScore(Score summaryScore, List<SpanScore> spanScores) {
		super();
		this.summaryScore = summaryScore;
		this.spanScores = spanScores;
	}

	/**
	 * Returns the summary of all span scores
	 * @return the summary of all span scores
	 */
	public Score getSummaryScore() {
		return summaryScore;
	}

	/**
	 * Sets the summary of all span scores
	 * @param summaryScore the summary of all span scores
	 */
	public void setSummaryScore(Score summaryScore) {
		this.summaryScore = summaryScore;
	}

	/**
	 * Returns the scores of spans
	 * @return the scores of spans
	 */
	public List<SpanScore> getSpanScores() {
		return spanScores;
	}

	/**
	 * Sets the scores of spans
	 * @param spanScores the scores of spans
	 */
	public void setSpanScores(List<SpanScore> spanScores) {
		this.spanScores = spanScores;
	}
	
}
