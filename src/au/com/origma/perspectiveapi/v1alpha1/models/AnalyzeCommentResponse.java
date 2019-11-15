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
import java.util.Map;

/**
 * The response of an analysis
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public class AnalyzeCommentResponse {

	Map<AttributeType, AttributeScore> attributeScores;
	List<String> languages;
	String clientToken;

	/**
	 * Create a new empty instance
	 */
	public AnalyzeCommentResponse() {
		super();
	}

	/**
	 * Create a new instance
	 */
	public AnalyzeCommentResponse(Map<AttributeType, AttributeScore> attributeScores, List<String> languages,
			String clientToken) {
		super();
		this.attributeScores = attributeScores;
		this.languages = languages;
		this.clientToken = clientToken;
	}

	/**
	 * A map from model attribute name to per-attribute score objects. The attribute
	 * names will mirror the request's requestedAttributes.
	 * 
	 * @return the scores of the requested attributes
	 */
	public Map<AttributeType, AttributeScore> getAttributeScores() {
		return attributeScores;
	}

	/**
	 * Returns a specific attribute score
	 * 
	 * @param type The attribute for which a score should be returned
	 * @return a specific attribute score
	 */
	public AttributeScore getAttributeScore(AttributeType type) {
		return attributeScores.get(type);
	}

	/**
	 * Sets the attribute scores
	 * 
	 * @param attributeScores the attribute scores
	 */
	public void setAttributeScores(Map<AttributeType, AttributeScore> attributeScores) {
		this.attributeScores = attributeScores;
	}

	/**
	 * Mirrors the request's languages. If no languages were specified, the API
	 * returns the auto-detected language.
	 * 
	 * @return the languages the request was in
	 */
	public List<String> getLanguages() {
		return languages;
	}

	/**
	 * Sets the languages the request was in
	 * 
	 * @param languages the languages the request was in
	 */
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	/**
	 * Mirrors the request's clientToken.
	 * 
	 * @return the client token
	 */
	public String getClientToken() {
		return clientToken;
	}

	/**
	 * Sets the client token
	 * 
	 * @param clientToken the client token
	 */
	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}

}
