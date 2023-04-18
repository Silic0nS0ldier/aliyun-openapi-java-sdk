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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayAuthConsumerResourceRequest extends RpcAcsRequest<UpdateGatewayAuthConsumerResourceResponse> {
	   

	private String gatewayUniqueId;

	private Long consumerId;

	@SerializedName("resourceList")
	private List<ResourceList> resourceList;

	private String acceptLanguage;
	public UpdateGatewayAuthConsumerResourceRequest() {
		super("mse", "2019-05-31", "UpdateGatewayAuthConsumerResource", "mse");
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

	public Long getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
		if(consumerId != null){
			putQueryParameter("ConsumerId", consumerId.toString());
		}
	}

	public List<ResourceList> getResourceList() {
		return this.resourceList;
	}

	public void setResourceList(List<ResourceList> resourceList) {
		this.resourceList = resourceList;	
		if (resourceList != null) {
			putQueryParameter("ResourceList" , new Gson().toJson(resourceList));
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

	public static class ResourceList {

		@SerializedName("RouteId")
		private Long routeId;

		@SerializedName("RouteName")
		private String routeName;

		public Long getRouteId() {
			return this.routeId;
		}

		public void setRouteId(Long routeId) {
			this.routeId = routeId;
		}

		public String getRouteName() {
			return this.routeName;
		}

		public void setRouteName(String routeName) {
			this.routeName = routeName;
		}
	}

	@Override
	public Class<UpdateGatewayAuthConsumerResourceResponse> getResponseClass() {
		return UpdateGatewayAuthConsumerResourceResponse.class;
	}

}
