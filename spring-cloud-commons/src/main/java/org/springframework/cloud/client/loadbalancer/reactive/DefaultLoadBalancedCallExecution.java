/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.client.loadbalancer.reactive;

/**
 * @author Olga Maciaszek-Sharma
 */
public class DefaultLoadBalancedCallExecution<C, T> implements LoadBalancedCallExecution<C, T> {

	private final Request<C> request;
	private final Response<T> response;
	private final CompletionContext completionContext;

	public DefaultLoadBalancedCallExecution(Request<C> request, Response<T> response, CompletionContext completionContext) {
		this.request = request;
		this.response = response;
		this.completionContext = completionContext;
	}

	@Override
	public Request<C> getRequest() {
		return request;
	}

	@Override
	public Response<T> getResponse() {
		return response;
	}

	@Override
	public CompletionContext completionContext() {
		return completionContext;
	}
}
