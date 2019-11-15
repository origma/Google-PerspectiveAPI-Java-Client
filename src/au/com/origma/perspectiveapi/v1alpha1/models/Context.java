/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

import java.util.List;

public class Context {

	List<Entry> entries;

	public Context() {
		super();
	}

	public Context(List<Entry> entries) {
		super();
		this.entries = entries;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public static class Builder {
		private List<Entry> entries;

		public Builder entries(List<Entry> entries) {
			this.entries = entries;
			return this;
		}

		public Context build() {
			return new Context(this);
		}
	}

	private Context(Builder builder) {
		this.entries = builder.entries;
	}
}
