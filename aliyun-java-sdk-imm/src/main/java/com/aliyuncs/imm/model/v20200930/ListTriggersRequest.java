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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTriggersRequest extends RpcAcsRequest<ListTriggersResponse> {
	   

	private String nextToken;

	private String state;

	private String order;

	private String projectName;

	private String sort;

	private Integer maxResults;

	private String tagSelector;
	public ListTriggersRequest() {
		super("imm", "2020-09-30", "ListTriggers", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getTagSelector() {
		return this.tagSelector;
	}

	public void setTagSelector(String tagSelector) {
		this.tagSelector = tagSelector;
		if(tagSelector != null){
			putQueryParameter("TagSelector", tagSelector);
		}
	}

	@Override
	public Class<ListTriggersResponse> getResponseClass() {
		return ListTriggersResponse.class;
	}

}
