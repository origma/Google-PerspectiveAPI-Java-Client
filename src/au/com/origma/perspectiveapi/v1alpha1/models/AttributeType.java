/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

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
