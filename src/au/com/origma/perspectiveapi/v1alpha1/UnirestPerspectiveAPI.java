/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1;

import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentRequest;
import au.com.origma.perspectiveapi.v1alpha1.models.AnalyzeCommentResponse;
import au.com.origma.perspectiveapi.v1alpha1.models.AttributeType;
import au.com.origma.perspectiveapi.v1alpha1.models.ContentType;
import au.com.origma.perspectiveapi.v1alpha1.models.Entry;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class UnirestPerspectiveAPI implements PerspectiveAPI {
	
	String apiKey;
	boolean doNotStore = true;

	public UnirestPerspectiveAPI(String apiKey) {
		super();
		this.apiKey = apiKey;
	}

	@Override
	public AnalyzeCommentResponse analyze(AnalyzeCommentRequest request) {
		HttpResponse<AnalyzeCommentResponse> response = Unirest.post(ANALYZE_ENDPOINT)
			.queryString("key", apiKey)
			.body(request)
			.asObject(AnalyzeCommentResponse.class);
		
		if(!response.isSuccess()){
			return null;
		}
		
		return response.getBody();
	}

	@Override
	public AnalyzeCommentResponse analyze(String comment) {
		return analyze(new AnalyzeCommentRequest.Builder()
				.addRequestedAttribute(AttributeType.TOXICITY, null)
				.comment(new Entry.Builder()
						.type(ContentType.PLAIN_TEXT)
						.text(comment)
						.build())
				.build());
	}

	public boolean isDoNotStore() {
		return doNotStore;
	}

	public void setDoNotStore(boolean doNotStore) {
		this.doNotStore = doNotStore;
	}

}
