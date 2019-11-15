/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

/**
 * Represents the value of an analysis attribute
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 */
public class Score {

	float value;
	ScoreType type;
	
	/**
	 * Create an empty instance
	 */
	public Score(){}
	
	/**
	 * Create an instance
	 */
	public Score(float value, ScoreType type) {
		super();
		this.value = value;
		this.type = type;
	}

	/**
	 * Returns the value of a score
	 * @return the value of a score
	 */
	public float getValue() {
		return value;
	}

	/**
	 * Sets the value of a score
	 * @param value the value of a score
	 */
	public void setValue(float value) {
		this.value = value;
	}

	/**
	 * Returns the type of a score
	 * @return the type of a score
	 */
	public ScoreType getType() {
		return type;
	}

	/**
	 * Sets the type of a score
	 * @param type the type of a score
	 */
	public void setType(ScoreType type) {
		this.type = type;
	}
	
}
