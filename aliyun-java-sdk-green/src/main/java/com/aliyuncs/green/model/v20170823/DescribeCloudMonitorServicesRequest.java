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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudMonitorServicesRequest extends RpcAcsRequest<DescribeCloudMonitorServicesResponse> {
	   

	private String sourceIp;

	private String pageSize;

	private String page;
	public DescribeCloudMonitorServicesRequest() {
		super("Green", "2017-08-23", "DescribeCloudMonitorServices", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page);
		}
	}

	@Override
	public Class<DescribeCloudMonitorServicesResponse> getResponseClass() {
		return DescribeCloudMonitorServicesResponse.class;
	}

}