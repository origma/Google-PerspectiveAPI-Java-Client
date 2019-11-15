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
