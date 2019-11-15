/* 
 * Copyright (C) Origma Pty Ltd (ACN 629 381 184). All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Ben McLean <ben@origma.com.au>, November 2019
 */
package au.com.origma.perspectiveapi.v1alpha1.models;

public class Entry {

	String text;
	ContentType type;

	public Entry() {
	}

	public Entry(String text, ContentType type) {
		super();
		this.text = text;
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ContentType getType() {
		return type;
	}

	public void setType(ContentType type) {
		this.type = type;
	}

	public static class Builder {
		private String text;
		private ContentType type;

		public Builder text(String text) {
			this.text = text;
			return this;
		}

		public Builder type(ContentType type) {
			this.type = type;
			return this;
		}

		public Entry build() {
			return new Entry(this);
		}
	}

	private Entry(Builder builder) {
		this.text = builder.text;
		this.type = builder.type;
	}
}
