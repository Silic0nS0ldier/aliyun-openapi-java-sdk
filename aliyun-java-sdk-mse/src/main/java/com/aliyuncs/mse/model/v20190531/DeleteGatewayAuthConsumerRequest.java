/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteGatewayAuthConsumerRequest extends RpcAcsRequest<DeleteGatewayAuthConsumerResponse> {
	   

	private String gatewayUniqueId;

	private Long id;

	private String acceptLanguage;
	public DeleteGatewayAuthConsumerRequest() {
		super("mse", "2019-05-31", "DeleteGatewayAuthConsumer", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<DeleteGatewayAuthConsumerResponse> getResponseClass() {
		return DeleteGatewayAuthConsumerResponse.class;
	}

}
