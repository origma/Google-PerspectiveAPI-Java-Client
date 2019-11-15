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
 * Represents the types of attributes that can be analysed in any given request
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public enum AttributeType {

	TOXICITY, 
	TOXICITY_EXPERIMENTAL, 
	SEVERE_TOXICITY, 
	SEVERE_TOXICITY_EXPERIMENTAL, 
	TOXICITY_FAST, 
	IDENTITY_ATTACK, 
	IDENTITY_ATTACK_EXPERIMENTAL,
	INSULT,
	INSULT_EXPERIMENTAL,
	PROFANITY,
	PROFANITY_EXPERIMENTAL,
	THREAT,
	THREAT_EXPERIMENTAL,
	SEXUALLY_EXPLICIT,
	FLIRTATION,
	/* New York Times models below */
	ATTACK_ON_AUTHOR,
	ATTACK_ON_COMMENTER,
	INCOHERENT,
	INFLAMMATORY,
	LIKELY_TO_REJECT,
	OBSCENE,
	SPAM,
	UNSUBSTANTIAL;
	
}
