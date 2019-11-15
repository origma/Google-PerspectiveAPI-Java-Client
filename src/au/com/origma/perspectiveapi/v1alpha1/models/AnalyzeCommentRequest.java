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

/**
 * A request to analyze a string of text for attributes
 * @author Ben McLean &gt; ben@origma.com.au &lt;
 */
public class AnalyzeCommentRequest {
	
	Entry comment;
	Context context;
	Map<AttributeType, RequestedAttribute> requestedAttributes;
	List<String> languages;
	Boolean doNotStore;
	String clientToken;
	String sessionId;
	Double suggestCommentScore;
	
	/**
	 * Returns the comment to be analyzed by the request
	 * @return
	 */
	public Entry getComment() {
		return comment;
	}

	/**
	 * Returns the content of the request
	 * @return the content of the request
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * Returns the attributes that will be requested
	 * @return the attributes that will be requested
	 */
	public Map<AttributeType, RequestedAttribute> getRequestedAttributes() {
		return requestedAttributes;
	}

	/**
	 * Returns the set languages for the request
	 * @return the set languages for the request
	 */
	public List<String> getLanguages() {
		return languages;
	}
	
	/**
	 * Returns whether the comment will be stored for analysis or not
	 * @return whether the comment will be stored for analysis or not
	 */
	public Boolean getDoNotStore() {
		return doNotStore;
	}

	/**
	 * Returns the client token of the request
	 * @return the client token of the request
	 */
	public String getClientToken() {
		return clientToken;
	}

	/**
	 * Returns the session ID of the request
	 * @return the session ID of the request
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * Returns the comment score suggested to the analyzer
	 * @return the comment score suggested to the analyzer
	 */
	public Double getSuggestCommentScore() {
		return suggestCommentScore;
	}

	/**
	 * Builds an AnalyzeCommentRequest
	 * 
	 * @author Ben McLean &gt; ben@origma.com.au &lt;
	 *
	 */
	public static class Builder {
		private Entry comment;
		private Context context;
		private Map<AttributeType, RequestedAttribute> requestedAttributes = new HashMap<>();
		private List<String> languages = new ArrayList<>();
		private Boolean doNotStore;
		private String clientToken;
		private String sessionId;
		private Double suggestCommentScore;

		/**
		 * Set the comment of the future AnalyzeCommentRequest
		 * @param comment the comment of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder comment(Entry comment) {
			this.comment = comment;
			return this;
		}

		/**
		 * Set the context of the future AnalyzeCommentRequest
		 * @param context the context of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder context(Context context) {
			this.context = context;
			return this;
		}

		/**
		 * Set the requested attributes of the future AnalyzeCommentRequest
		 * @param requestedAttributes the requested attributes of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder requestedAttributes(Map<AttributeType, RequestedAttribute> requestedAttributes) {
			this.requestedAttributes = requestedAttributes;
			return this;
		}
		
		/**
		 * Add a requested attribute to the future AnalyzeCommentRequest
		 * @param type The type of the requested attribute
		 * @param requestedAttribute The parameters of the requested attribute
		 * @return The builder
		 */
		public Builder addRequestedAttribute(AttributeType type, RequestedAttribute requestedAttribute) {
			if(requestedAttribute != null){
				requestedAttributes.put(type, requestedAttribute);
			}else{
				requestedAttributes.put(type, new RequestedAttribute());
			}
			return this;
		}

		/**
		 * Set the languages of the future AnalyzeCommentRequest
		 * @param languages the languages of the future AnalyzeCommentRequest in ISO 639-1
		 * @return The builder
		 */
		public Builder languages(List<String> languages) {
			this.languages = languages;
			return this;
		}
		
		/**
		 * Add a language to the future AnalyzeCommentRequest
		 * @param language The language in ISO 639-1
		 * @return The builder
		 */
		public Builder addLanguage(String language){
			languages.add(language);
			return this;
		}

		/**
		 * Set the do not store of the future AnalyzeCommentRequest
		 * @param doNotStore the do not store of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder doNotStore(Boolean doNotStore) {
			this.doNotStore = doNotStore;
			return this;
		}

		/**
		 * Set the client token of the future AnalyzeCommentRequest
		 * @param clientToken the clientToken of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder clientToken(String clientToken) {
			this.clientToken = clientToken;
			return this;
		}

		/**
		 * Set the session ID of the future AnalyzeCommentRequest
		 * @param sessionId the sessionId of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder sessionId(String sessionId) {
			this.sessionId = sessionId;
			return this;
		}

		/**
		 * Set the suggested comment score of the future AnalyzeCommentRequest
		 * @param suggestCommentScore the suggested comment score of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder suggestCommentScore(Double suggestCommentScore) {
			this.suggestCommentScore = suggestCommentScore;
			return this;
		}

		/**
		 * Build and create a new instance of AnalyzeCommentRequest
		 * @return
		 */
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
