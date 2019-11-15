/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

import java.util.List;
import java.util.Map;

public class AnalyzeCommentResponse {

	Map<AttributeType, AttributeScore> attributeScores;
	List<String> languages;
	String clientToken;
	
	public AnalyzeCommentResponse() {
		super();
	}

	public AnalyzeCommentResponse(Map<AttributeType, AttributeScore> attributeScores, List<String> languages,
			String clientToken) {
		super();
		this.attributeScores = attributeScores;
		this.languages = languages;
		this.clientToken = clientToken;
	}

	public Map<AttributeType, AttributeScore> getAttributeScores() {
		return attributeScores;
	}
	
	public AttributeScore getAttributeScore(AttributeType type){
		return attributeScores.get(type);
	}

	public void setAttributeScores(Map<AttributeType, AttributeScore> attributeScores) {
		this.attributeScores = attributeScores;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public String getClientToken() {
		return clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}
	
}
