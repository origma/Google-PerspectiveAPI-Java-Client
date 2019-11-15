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
	public SpanScore() {
	}

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
	 * Beginning of the text span in the request comment.
	 * 
	 * @return the beginning position of the span
	 */
	public int getBegin() {
		return begin;
	}

	/**
	 * Sets the beginning position of the span
	 * 
	 * @param begin the beginning position of the span
	 */
	public void setBegin(int begin) {
		this.begin = begin;
	}

	/**
	 * End of the text span in the request comment.
	 * 
	 * @return the ending position of the span
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * Sets the ending position of the span
	 * 
	 * @param end the ending position of the span
	 */
	public void setEnd(int end) {
		this.end = end;
	}

	/**
	 * Returns the score of the span
	 * 
	 * @return the score of the span
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * Sets the score of the span
	 * 
	 * @param score the score of the span
	 */
	public void setScore(Score score) {
		this.score = score;
	}

}
