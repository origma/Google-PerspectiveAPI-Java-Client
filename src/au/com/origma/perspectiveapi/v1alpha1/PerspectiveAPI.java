/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1;

import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentRequest;
import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentResponse;

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
	 * Instantiate the default implementation of the PerspectiveAPI
	 * @param apiKey The Google API key
	 * @return The default implementation of the PerspectiveAPI
	 */
	public static PerspectiveAPI create(String apiKey) {
		return new UnirestPerspectiveAPI(apiKey);
	}
	
}
