/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;
/**
 * A score representing a span of the analyzed comment
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public class SpanScore {

	int begin;
	int end;
	Score score;
	
	/**
	 * Create an empty instance
	 */
	public SpanScore(){}

	/**
	 * Create an instance
	 */
	public SpanScore(int begin, int end, Score score) {
		super();
		this.begin = begin;
		this.end = end;
		this.score = score;
	}

	/**
	 * Returns the beginning position of the span
	 * @return the beginning position of the span
	 */
	public int getBegin() {
		return begin;
	}

	/**
	 * Sets the beginning position of the span
	 * @param begin the beginning position of the span
	 */
	public void setBegin(int begin) {
		this.begin = begin;
	}

	/**
	 * Returns the ending position of the span
	 * @return the ending position of the span
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * Sets the ending position of the span
	 * @param end the ending position of the span
	 */
	public void setEnd(int end) {
		this.end = end;
	}

	/**
	 * Returns the score of the span
	 * @return the score of the span
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * Sets the score of the span
	 * @param score the score of the span
	 */
	public void setScore(Score score) {
		this.score = score;
	}
	
}
