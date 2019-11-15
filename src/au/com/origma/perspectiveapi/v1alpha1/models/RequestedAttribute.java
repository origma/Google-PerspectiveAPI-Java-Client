/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

public class RequestedAttribute {

	ScoreType scoreType;
	Double scoreThreshold;

	public RequestedAttribute() {
		super();
	}

	public RequestedAttribute(ScoreType scoreType, Double scoreThreshold) {
		super();
		this.scoreType = scoreType;
		this.scoreThreshold = scoreThreshold;
	}

	public ScoreType getScoreType() {
		return scoreType;
	}

	public void setScoreType(ScoreType scoreType) {
		this.scoreType = scoreType;
	}

	public Double getScoreThreshold() {
		return scoreThreshold;
	}

	public void setScoreThreshold(Double scoreThreshold) {
		this.scoreThreshold = scoreThreshold;
	}

	public static class Builder {
		private ScoreType scoreType;
		private Double scoreThreshold;

		public Builder scoreType(ScoreType scoreType) {
			this.scoreType = scoreType;
			return this;
		}

		public Builder scoreThreshold(Double scoreThreshold) {
			this.scoreThreshold = scoreThreshold;
			return this;
		}

		public RequestedAttribute build() {
			return new RequestedAttribute(this);
		}
	}

	private RequestedAttribute(Builder builder) {
		this.scoreType = builder.scoreType;
		this.scoreThreshold = builder.scoreThreshold;
	}
}
