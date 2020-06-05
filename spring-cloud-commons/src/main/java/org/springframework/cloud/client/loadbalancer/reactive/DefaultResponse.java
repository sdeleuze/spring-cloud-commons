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

import org.springframework.cloud.client.ServiceInstance;

/**
 * @deprecated in favour of
 * {@link org.springframework.cloud.client.loadbalancer.DefaultResponse}
 * @author Spencer Gibb
 */
@Deprecated
public class DefaultResponse
		extends org.springframework.cloud.client.loadbalancer.DefaultResponse
		implements Response<ServiceInstance> {

	public DefaultResponse(ServiceInstance serviceInstance) {
		super(serviceInstance);
	}

	@Override
	public void onComplete(CompletionContext completionContext) {
		super.onComplete(completionContext);
		// TODO: implement
	}

}
