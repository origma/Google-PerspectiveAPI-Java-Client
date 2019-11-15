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
 * Represents the parameters of a requested attribute
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public class RequestedAttribute {

	ScoreType scoreType;
	Double scoreThreshold;

	/**
	 * Returns the score type of the attribute
	 * @return the score type of the attribute
	 */
	public ScoreType getScoreType() {
		return scoreType;
	}

	/**
	 * Returns the score threshold of the attribute
	 * @return the score threshold of the attribute
	 */
	public Double getScoreThreshold() {
		return scoreThreshold;
	}

	/**
	 * Builds a RequestedAttribute
	 * 
	 * @author Ben McLean &lt;ben@origma.com.au&gt;
	 */
	public static class Builder {
		private ScoreType scoreType;
		private Double scoreThreshold;

		/**
		 * Sets the score type of the attribute
		 * @param scoreType the score type of the attribute
		 * @return The builder
		 */
		public Builder scoreType(ScoreType scoreType) {
			this.scoreType = scoreType;
			return this;
		}

		/**
		 * Sets the score threshold of the attribute
		 * @param scoreThreshold the score threshold of the attribute
		 * @return The builder
		 */
		public Builder scoreThreshold(Double scoreThreshold) {
			this.scoreThreshold = scoreThreshold;
			return this;
		}

		/**
		 * Builds a new instance of RequestedAttribute
		 * @return a new instance of RequestedAttribute
		 */
		public RequestedAttribute build() {
			return new RequestedAttribute(this);
		}
	}

	private RequestedAttribute(Builder builder) {
		this.scoreType = builder.scoreType;
		this.scoreThreshold = builder.scoreThreshold;
	}
}
