/* 
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

/**
 * A SuggestScoreRequest response
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public class SuggestScoreResponse {

	String clientToken;
	
	/**
	 * Create an empty instance
	 */
	public SuggestScoreResponse() {}

	/**
	 * Create an instance
	 */
	public SuggestScoreResponse(String clientToken) {
		super();
		this.clientToken = clientToken;
	}

	/**
	 * Mirrors the request's clientToken
	 * @return the client token
	 */
	public String getClientToken() {
		return clientToken;
	}

	/**
	 * Sets the client token
	 * @param clientToken the client token
	 */
	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}
	
}
