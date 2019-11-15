/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyzeCommentRequest {
	
	Entry comment;
	Context context;
	Map<AttributeType, RequestedAttribute> requestedAttributes;
	List<String> languages;
	Boolean doNotStore;
	String clientToken;
	String sessionId;
	Double suggestCommentScore;

	public AnalyzeCommentRequest() {
		super();
	}

	public AnalyzeCommentRequest(Entry comment, Context context, Map<AttributeType, RequestedAttribute> requestedAttributes,
			List<String> languages, Boolean doNotStore, String clientToken, String sessionId,
			Double suggestCommentScore) {
		super();
		this.comment = comment;
		this.context = context;
		this.requestedAttributes = requestedAttributes;
		this.languages = languages;
		this.doNotStore = doNotStore;
		this.clientToken = clientToken;
		this.sessionId = sessionId;
		this.suggestCommentScore = suggestCommentScore;
	}

	public Entry getComment() {
		return comment;
	}

	public void setComment(Entry comment) {
		this.comment = comment;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public Map<AttributeType, RequestedAttribute> getRequestedAttributes() {
		return requestedAttributes;
	}

	public void setRequestedAttributes(Map<AttributeType, RequestedAttribute> requestedAttributes) {
		this.requestedAttributes = requestedAttributes;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Boolean getDoNotStore() {
		return doNotStore;
	}

	public void setDoNotStore(Boolean doNotStore) {
		this.doNotStore = doNotStore;
	}

	public String getClientToken() {
		return clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Double getSuggestCommentScore() {
		return suggestCommentScore;
	}

	public void setSuggestCommentScore(Double suggestCommentScore) {
		this.suggestCommentScore = suggestCommentScore;
	}

	public static class Builder {
		private Entry comment;
		private Context context;
		private Map<AttributeType, RequestedAttribute> requestedAttributes = new HashMap<>();
		private List<String> languages = new ArrayList<>();
		private Boolean doNotStore;
		private String clientToken;
		private String sessionId;
		private Double suggestCommentScore;

		public Builder comment(Entry comment) {
			this.comment = comment;
			return this;
		}

		public Builder context(Context context) {
			this.context = context;
			return this;
		}

		public Builder requestedAttributes(Map<AttributeType, RequestedAttribute> requestedAttributes) {
			this.requestedAttributes = requestedAttributes;
			return this;
		}
		
		public Builder addRequestedAttribute(AttributeType type, RequestedAttribute requestedAttribute) {
			requestedAttributes.put(type, requestedAttribute);
			return this;
		}

		public Builder languages(List<String> languages) {
			this.languages = languages;
			return this;
		}
		
		public Builder addLanguage(String language){
			languages.add(language);
			return this;
		}

		public Builder doNotStore(Boolean doNotStore) {
			this.doNotStore = doNotStore;
			return this;
		}

		public Builder clientToken(String clientToken) {
			this.clientToken = clientToken;
			return this;
		}

		public Builder sessionId(String sessionId) {
			this.sessionId = sessionId;
			return this;
		}

		public Builder suggestCommentScore(Double suggestCommentScore) {
			this.suggestCommentScore = suggestCommentScore;
			return this;
		}

		public AnalyzeCommentRequest build() {
			return new AnalyzeCommentRequest(this);
		}
	}

	private AnalyzeCommentRequest(Builder builder) {
		this.comment = builder.comment;
		this.context = builder.context;
		this.requestedAttributes = builder.requestedAttributes;
		this.languages = builder.languages;
		this.doNotStore = builder.doNotStore;
		this.clientToken = builder.clientToken;
		this.sessionId = builder.sessionId;
		this.suggestCommentScore = builder.suggestCommentScore;
	}
}
