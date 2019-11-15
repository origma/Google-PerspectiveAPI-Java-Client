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

	/**
	 * Rude, disrespectful, or unreasonable comment that is likely to make people
	 * leave a discussion.
	 */
	TOXICITY,
	/**
	 * Rude, disrespectful, or unreasonable comment that is likely to make people
	 * leave a discussion.
	 */
	TOXICITY_EXPERIMENTAL,
	/**
	 * A very hateful, aggressive, disrespectful comment or otherwise very likely to
	 * make a user leave a discussion or give up on sharing their perspective. This
	 * model is much less sensitive to comments that include positive uses of curse
	 * words, for example. A labelled dataset and details of the methodology can be
	 * found in the same toxicity dataset that is available for the toxicity model.
	 */
	SEVERE_TOXICITY,
	/**
	 * A very hateful, aggressive, disrespectful comment or otherwise very likely to
	 * make a user leave a discussion or give up on sharing their perspective. This
	 * model is much less sensitive to comments that include positive uses of curse
	 * words, for example. A labelled dataset and details of the methodology can be
	 * found in the same toxicity dataset that is available for the toxicity model.
	 */
	SEVERE_TOXICITY_EXPERIMENTAL,
	/**
	 * This model is similar to the TOXICITY model, but has lower latency and lower
	 * accuracy in its predictions. Unlike TOXICITY, this model returns summary
	 * scores as well as span scores. This model uses character-level n-grams fed
	 * into a logistic regression, a method that has been surprisingly effective at
	 * detecting abusive language.
	 */
	TOXICITY_FAST,
	/**
	 * Negative or hateful comments targeting someone because of their identity.
	 */
	IDENTITY_ATTACK,
	/**
	 * Negative or hateful comments targeting someone because of their identity.
	 */
	IDENTITY_ATTACK_EXPERIMENTAL,
	/**
	 * Insulting, inflammatory, or negative comment towards a person or a group of
	 * people.
	 */
	INSULT,
	/**
	 * Insulting, inflammatory, or negative comment towards a person or a group of
	 * people.
	 */
	INSULT_EXPERIMENTAL,
	/**
	 * Swear words, curse words, or other obscene or profane language.
	 */
	PROFANITY,
	/**
	 * Swear words, curse words, or other obscene or profane language.
	 */
	PROFANITY_EXPERIMENTAL,
	/**
	 * Describes an intention to inflict pain, injury, or violence against an
	 * individual or group.
	 */
	THREAT,
	/**
	 * Describes an intention to inflict pain, injury, or violence against an
	 * individual or group.
	 */
	THREAT_EXPERIMENTAL,
	/**
	 * Contains references to sexual acts, body parts, or other lewd content.
	 */
	SEXUALLY_EXPLICIT,
	/**
	 * Pickup lines, complimenting appearance, subtle sexual innuendos, etc.
	 */
	FLIRTATION,
	/* New York Times models below */
	/**
	 * Attack on the author of an article or post.
	 */
	ATTACK_ON_AUTHOR,
	/**
	 * Attack on fellow commenter.
	 */
	ATTACK_ON_COMMENTER,
	/**
	 * Difficult to understand, nonsensical.
	 */
	INCOHERENT,
	/**
	 * Intending to provoke or inflame.
	 */
	INFLAMMATORY,
	/**
	 * Overall measure of the likelihood for the comment to be rejected according to
	 * the NYT's moderation.
	 */
	LIKELY_TO_REJECT, 
	/**
	 * Obscene or vulgar language such as cursing.
	 */
	OBSCENE, 
	/**
	 * Irrelevant and unsolicited commercial content.
	 */
	SPAM, 
	/**
	 * Trivial or short comments.
	 */
	UNSUBSTANTIAL;

}
