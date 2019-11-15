/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

import java.util.List;

/**
 * Context surrounding the request
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 */
public class Context {

	List<Entry> entries;

	/**
	 * Returns the context entries
	 * @return the context entries
	 */
	public List<Entry> getEntries() {
		return entries;
	}

	/**
	 * Builds a Context
	 * 
	 * @author Ben McLean &lt;ben@origma.com.au&gt;
	 *
	 */
	public static class Builder {
		private List<Entry> entries;

		/**
		 * Sets the context entries
		 * @param entries the context entries
		 * @return The builder
		 */
		public Builder entries(List<Entry> entries) {
			this.entries = entries;
			return this;
		}

		/**
		 * Returns a new instance of Context
		 * @return a new instance of Context
		 */
		public Context build() {
			return new Context(this);
		}
	}

	private Context(Builder builder) {
		this.entries = builder.entries;
	}
}
