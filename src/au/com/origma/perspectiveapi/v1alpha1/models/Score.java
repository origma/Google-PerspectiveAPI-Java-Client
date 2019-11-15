/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

public class Score {

	float value;
	ScoreType type;
	
	public Score(){}
	
	public Score(float value, ScoreType type) {
		super();
		this.value = value;
		this.type = type;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public ScoreType getType() {
		return type;
	}

	public void setType(ScoreType type) {
		this.type = type;
	}
	
}
