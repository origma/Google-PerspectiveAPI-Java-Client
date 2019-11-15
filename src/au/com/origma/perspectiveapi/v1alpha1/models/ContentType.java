/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

/**
 * The format the content is in
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public enum ContentType {

	/**
	 * The content is in plain text
	 */
	PLAIN_TEXT, 
	/**
	 * Not currently supported
	 */
	@Deprecated
	HTML;
	
}
