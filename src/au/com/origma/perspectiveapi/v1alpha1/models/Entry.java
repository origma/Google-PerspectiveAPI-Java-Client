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
 * A representation of some content or context as a String
 * 
 * @author Ben McLean &lt;ben@origma.com.au&gt;
 *
 */
public class Entry {

	String text;
	ContentType type;

	/**
	 * Create an empty instance
	 */
	public Entry() {
	}

	/**
	 * Returns the text of the entry
	 * @return the text of the entry
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text of the entry
	 * @param text the text of the entry
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Returns the type of the entry
	 * @return the type of the entry
	 */
	public ContentType getType() {
		return type;
	}

	/**
	 * Sets the type of the entry
	 * @param type the type of the entry
	 */
	public void setType(ContentType type) {
		this.type = type;
	}

	/**
	 * Builds an entry
	 * 
	 * @author Ben McLean &lt;ben@origma.com.au&gt;
	 */
	public static class Builder {
		private String text;
		private ContentType type;

		/**
		 * Sets the text of the entry
		 * @param text the text of the entry
		 * @return The builder
		 */
		public Builder text(String text) {
			this.text = text;
			return this;
		}

		/**
		 * Sets the type of the entry
		 * @param type the type of the entry
		 * @return The builder
		 */
		public Builder type(ContentType type) {
			this.type = type;
			return this;
		}

		/**
		 * Returns a new instance of Entry
		 * @return a new instance of Entry
		 */
		public Entry build() {
			return new Entry(this);
		}
	}

	private Entry(Builder builder) {
		this.text = builder.text;
		this.type = builder.type;
	}
}
