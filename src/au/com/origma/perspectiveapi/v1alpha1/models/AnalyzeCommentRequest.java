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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A request to analyze a string of text for attributes
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
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
	 * The text to score. This is assumed to be utf8 raw text of the text to be
	 * checked. Emoji and other non-ascii characters can be included (HTML will
	 * probably result in lower performance).
	 * 
	 * @return the comment
	 */
	public Entry getComment() {
		return comment;
	}

	/**
	 * A list of objects providing the context for comment. Currently not supported
	 * by the API.
	 * 
	 * @return the content of the request
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * A map from model's attribute name to a configuration object. See the models
	 * section for a list of available model attribute names. If no configuration
	 * options are specified, defaults are used, so the empty object {} is a valid
	 * (and common) choice. You can specify multiple model names here to get scores
	 * from multiple models in a single request.
	 * 
	 * @return the attributes that will be requested
	 */
	public Map<AttributeType, RequestedAttribute> getRequestedAttributes() {
		return requestedAttributes;
	}

	/**
	 * A list of ISO 631-1 two-letter language codes specifying the language(s) that
	 * comment is in (for example, "en", "es", "fr", "de", etc). If unspecified, the
	 * API will auto-detect the comment language. If language detection fails, the
	 * API returns an error. Note: Currently, all production models only support
	 * English, Spanish, and French. There is no simple way to use the API across
	 * languages with production support and languages with experimental support
	 * only.
	 * 
	 * @return the set languages for the request
	 */
	public List<String> getLanguages() {
		return languages;
	}

	/**
	 * Whether the API is permitted to store comment and context from this request.
	 * Stored comments will be used for future research and community model building
	 * purposes to improve the API over time. We also plan to provide dashboards and
	 * automated analysis of the comments submitted, which will apply only to those
	 * stored. Defaults to false (request data may be stored). Warning: This should
	 * be set to true if data being submitted is private (i.e. not publicly
	 * accessible), or if the data submitted contains content written by someone
	 * under 13 years old.
	 * 
	 * @return whether the comment will be stored for analysis or not
	 */
	public Boolean getDoNotStore() {
		return doNotStore;
	}

	/**
	 * An opaque token that is echoed back in the response.
	 * 
	 * @return the client token of the request
	 */
	public String getClientToken() {
		return clientToken;
	}

	/**
	 * An opaque session id. This should be set for authorship experiences by the
	 * client side so that groups of requests can be grouped together into a
	 * session. This should not be used for any user-specific id. This is intended
	 * for abuse protection and individual sessions of interaction.
	 * 
	 * @return the session ID of the request
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * Used to notify the Perspective API team of specific biases, in order to help
	 * us improve our model. Many kinds of toxic language are disproportionately
	 * represented in our dataset, which leads to some obviously incorrect scores,
	 * as well as unintended biases. Use this method to help us correct them.
	 * 
	 * @return the comment score suggested to the analyzer
	 */
	public Double getSuggestCommentScore() {
		return suggestCommentScore;
	}

	/**
	 * Builds an AnalyzeCommentRequest
	 * 
	 * @author Ben McLean &lt;ben@origma.com.au&gt;
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
		 * 
		 * @param comment the comment of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder comment(Entry comment) {
			this.comment = comment;
			return this;
		}

		/**
		 * Set the context of the future AnalyzeCommentRequest
		 * 
		 * @param context the context of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder context(Context context) {
			this.context = context;
			return this;
		}

		/**
		 * Set the requested attributes of the future AnalyzeCommentRequest
		 * 
		 * @param requestedAttributes the requested attributes of the future
		 *                            AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder requestedAttributes(Map<AttributeType, RequestedAttribute> requestedAttributes) {
			this.requestedAttributes = requestedAttributes;
			return this;
		}

		/**
		 * Add a requested attribute to the future AnalyzeCommentRequest
		 * 
		 * @param type               The type of the requested attribute
		 * @param requestedAttribute The parameters of the requested attribute
		 * @return The builder
		 */
		public Builder addRequestedAttribute(AttributeType type, RequestedAttribute requestedAttribute) {
			if (requestedAttribute != null) {
				requestedAttributes.put(type, requestedAttribute);
			} else {
				requestedAttributes.put(type, new RequestedAttribute.Builder().build());
			}
			return this;
		}

		/**
		 * Set the languages of the future AnalyzeCommentRequest
		 * 
		 * @param languages the languages of the future AnalyzeCommentRequest in ISO
		 *                  639-1
		 * @return The builder
		 */
		public Builder languages(List<String> languages) {
			this.languages = languages;
			return this;
		}

		/**
		 * Add a language to the future AnalyzeCommentRequest
		 * 
		 * @param language The language in ISO 639-1
		 * @return The builder
		 */
		public Builder addLanguage(String language) {
			languages.add(language);
			return this;
		}

		/**
		 * Set the do not store of the future AnalyzeCommentRequest
		 * 
		 * @param doNotStore the do not store of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder doNotStore(Boolean doNotStore) {
			this.doNotStore = doNotStore;
			return this;
		}

		/**
		 * Set the client token of the future AnalyzeCommentRequest
		 * 
		 * @param clientToken the clientToken of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder clientToken(String clientToken) {
			this.clientToken = clientToken;
			return this;
		}

		/**
		 * Set the session ID of the future AnalyzeCommentRequest
		 * 
		 * @param sessionId the sessionId of the future AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder sessionId(String sessionId) {
			this.sessionId = sessionId;
			return this;
		}

		/**
		 * Set the suggested comment score of the future AnalyzeCommentRequest
		 * 
		 * @param suggestCommentScore the suggested comment score of the future
		 *                            AnalyzeCommentRequest
		 * @return The builder
		 */
		public Builder suggestCommentScore(Double suggestCommentScore) {
			this.suggestCommentScore = suggestCommentScore;
			return this;
		}

		/**
		 * Build and create a new instance of AnalyzeCommentRequest
		 * 
		 * @return The builder
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
