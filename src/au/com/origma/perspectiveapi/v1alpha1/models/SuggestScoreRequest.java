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
 * Send a suggested score for a request
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public class SuggestScoreRequest {

	Entry comment;
	Context context;
	Map<AttributeType, AttributeScore> attributeScores;
	List<String> languages;
	String communityId;
	String clientToken;

	/**
	 * Same as AnalyzeComment request.
	 * 
	 * @return the comment for which the score is being suggested
	 */
	public Entry getComment() {
		return comment;
	}

	/**
	 * Same as AnalyzeComment request.
	 * 
	 * @return the context of the request
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * Similar to AnalyzeComment response. This holds the attribute scores that the
	 * client believes the comment should have. It has the same format as the
	 * attributeScores field in the AnalyzeComment response, as it's what the client
	 * believes is the correct "answer" for what this comment should be scored as.
	 * The client can specify just summary scores, just span scores, or both.
	 * 
	 * @return the attribute scores of the request
	 */
	public Map<AttributeType, AttributeScore> getAttributeScores() {
		return attributeScores;
	}

	/**
	 * Returns the languages of the request
	 * 
	 * @return the languages of the request
	 */
	public List<String> getLanguages() {
		return languages;
	}

	/**
	 * Opaque identifier associating this score suggestion with a particular
	 * community. If set, this field allows us to differentiate suggestions from
	 * different communities, as each community may have different norms.
	 * 
	 * @return the community id
	 */
	public String getCommunityId() {
		return communityId;
	}

	/**
	 * An opaque token that is echoed back in the response.
	 * 
	 * @return the client token
	 */
	public String getClientToken() {
		return clientToken;
	}

	/**
	 * Builds a SuggestScoreRequest
	 * 
	 * @author Ben McLean &lt;ben@origma.com.au&gt;
	 *
	 */
	public static class Builder {
		private Entry comment;
		private Context context;
		private Map<AttributeType, AttributeScore> attributeScores = new HashMap<>();
		private List<String> languages = new ArrayList<>();
		private String communityId;
		private String clientToken;

		/**
		 * Set the comment for a suggestion
		 * @param comment the comment
		 * @return The builder
		 */
		public Builder comment(Entry comment) {
			this.comment = comment;
			return this;
		}

		/**
		 * Set the context for a suggestion
		 * @param context the context
		 * @return The builder
		 */
		public Builder context(Context context) {
			this.context = context;
			return this;
		}

		/**
		 * Set the attribute scores for a suggestion
		 * @param attributeScores the attribute scores
		 * @return The builder
		 */
		public Builder attributeScores(Map<AttributeType, AttributeScore> attributeScores) {
			this.attributeScores = attributeScores;
			return this;
		}
		
		/**
		 * Add an attribute score
		 * @param type The attribute type
		 * @param score The attribute score
		 * @return The builder
		 */
		public Builder addAttributeScore(AttributeType type, AttributeScore score) {
			this.attributeScores.put(type, score);
			return this;
		}

		/**
		 * Set the languages for a suggestion
		 * @param languages the languages
		 * @return The builder
		 */
		public Builder languages(List<String> languages) {
			this.languages = languages;
			return this;
		}
		
		/**
		 * Add a language
		 * @param language the language
		 * @return The builder
		 */
		public Builder addLanugage(String language) {
			this.languages.add(language);
			return this;
		}

		/**
		 * Set the community id
		 * @param communityId the community id
		 * @return The builder
		 */
		public Builder communityId(String communityId) {
			this.communityId = communityId;
			return this;
		}

		/**
		 * Set the client token
		 * @param clientToken the client token
		 * @return The builder
		 */
		public Builder clientToken(String clientToken) {
			this.clientToken = clientToken;
			return this;
		}

		/**
		 * Build a new SuggestScoreRequest instance
		 * @return a new SuggestScoreRequest instance
		 */
		public SuggestScoreRequest build() {
			return new SuggestScoreRequest(this);
		}
	}

	private SuggestScoreRequest(Builder builder) {
		this.comment = builder.comment;
		this.context = builder.context;
		this.attributeScores = builder.attributeScores;
		this.languages = builder.languages;
		this.communityId = builder.communityId;
		this.clientToken = builder.clientToken;
	}
}
