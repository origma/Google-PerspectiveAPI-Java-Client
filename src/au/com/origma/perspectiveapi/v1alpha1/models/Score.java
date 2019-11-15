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
