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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListErRouteEntriesRequest extends RpcAcsRequest<ListErRouteEntriesResponse> {
	   

	private Boolean ignoreDetailedRouteEntry;

	private Integer pageNumber;

	private String routeType;

	private String resourceGroupId;

	private Integer pageSize;

	private String nextHopId;

	private String nextHopType;

	private String destinationCidrBlock;

	private String erId;

	private String instanceId;

	private Boolean enablePage;

	private String status;
	public ListErRouteEntriesRequest() {
		super("eflo", "2022-05-30", "ListErRouteEntries", "eflo");
		setMethod(MethodType.POST);
	}

	public Boolean getIgnoreDetailedRouteEntry() {
		return this.ignoreDetailedRouteEntry;
	}

	public void setIgnoreDetailedRouteEntry(Boolean ignoreDetailedRouteEntry) {
		this.ignoreDetailedRouteEntry = ignoreDetailedRouteEntry;
		if(ignoreDetailedRouteEntry != null){
			putBodyParameter("IgnoreDetailedRouteEntry", ignoreDetailedRouteEntry.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRouteType() {
		return this.routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
		if(routeType != null){
			putBodyParameter("RouteType", routeType);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getNextHopId() {
		return this.nextHopId;
	}

	public void setNextHopId(String nextHopId) {
		this.nextHopId = nextHopId;
		if(nextHopId != null){
			putBodyParameter("NextHopId", nextHopId);
		}
	}

	public String getNextHopType() {
		return this.nextHopType;
	}

	public void setNextHopType(String nextHopType) {
		this.nextHopType = nextHopType;
		if(nextHopType != null){
			putBodyParameter("NextHopType", nextHopType);
		}
	}

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		if(destinationCidrBlock != null){
			putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
		}
	}

	public String getErId() {
		return this.erId;
	}

	public void setErId(String erId) {
		this.erId = erId;
		if(erId != null){
			putBodyParameter("ErId", erId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Boolean getEnablePage() {
		return this.enablePage;
	}

	public void setEnablePage(Boolean enablePage) {
		this.enablePage = enablePage;
		if(enablePage != null){
			putBodyParameter("EnablePage", enablePage.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ListErRouteEntriesResponse> getResponseClass() {
		return ListErRouteEntriesResponse.class;
	}

}
