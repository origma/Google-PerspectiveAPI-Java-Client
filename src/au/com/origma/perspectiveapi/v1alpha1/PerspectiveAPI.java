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
package au.com.origma.perspectiveapi.v1alpha1;

import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentRequest;
import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentResponse;
import au.com.origma.perspectiveapi.v1alpha1.models.SuggestScoreRequest;
import au.com.origma.perspectiveapi.v1alpha1.models.SuggestScoreResponse;

/**
 * Interact with Google's PerspectiveAPI to analyze comments and content.<br>
 * See the API documentation
 * <a href="https://github.com/conversationai/perspectiveapi/blob/master/2-api/README.md">here</a>
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 */
public interface PerspectiveAPI {
	
	/**
	 * The endpoint to which analysis requests are sent
	 */
	public static final String ANALYZE_ENDPOINT = "https://commentanalyzer.googleapis.com/v1alpha1/comments:analyze";
	
	/**
	 * The endpoint to which suggestion requests are sent
	 */
	public static final String SUGGEST_ENDPOINT = "https://commentanalyzer.googleapis.com/v1alpha1/comments:suggestscore";
	
	/**
	 * Analyze a comment
	 * @param request The request
	 * @return The analysis of the request
	 */
	public AnalyzeCommentResponse analyze(AnalyzeCommentRequest request);
	
	/**
	 * Analyze a comment with the default settings
	 * @param comment The comment to analyze
	 * @return The analysis of the request
	 */
	public AnalyzeCommentResponse analyze(String comment);
	
	/**
	 * Suggest a score for a comment
	 * @param request The request
	 * @return The response
	 */
	public SuggestScoreResponse suggestScore(SuggestScoreRequest request);
	
	/**
	 * Instantiate the default implementation of the PerspectiveAPI
	 * @param apiKey The Google API key
	 * @return The default implementation of the PerspectiveAPI
	 */
	public static PerspectiveAPI create(String apiKey) {
		return new UnirestPerspectiveAPI(apiKey);
	}
	
}
