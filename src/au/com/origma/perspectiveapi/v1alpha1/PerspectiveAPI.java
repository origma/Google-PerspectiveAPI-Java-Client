/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1;

import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentRequest;
import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentResponse;

public interface PerspectiveAPI {
	
	public static final String ANALYZE_ENDPOINT = "https://commentanalyzer.googleapis.com/v1alpha1/comments:analyze";
	
	public AnalyzeCommentResponse analyze(AnalyzeCommentRequest request);
	public AnalyzeCommentResponse analyze(String comment);
	
	public static PerspectiveAPI create(String apiKey) {
		return new UnirestPerspectiveAPI(apiKey);
	}
	
}
