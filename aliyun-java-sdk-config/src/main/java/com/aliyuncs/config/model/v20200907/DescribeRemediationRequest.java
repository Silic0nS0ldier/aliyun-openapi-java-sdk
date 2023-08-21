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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRemediationRequest extends RpcAcsRequest<DescribeRemediationResponse> {
	   

	private String configRuleId;

	private String remediationId;
	public DescribeRemediationRequest() {
		super("Config", "2020-09-07", "DescribeRemediation");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleId() {
		return this.configRuleId;
	}

	public void setConfigRuleId(String configRuleId) {
		this.configRuleId = configRuleId;
		if(configRuleId != null){
			putQueryParameter("ConfigRuleId", configRuleId);
		}
	}

	public String getRemediationId() {
		return this.remediationId;
	}

	public void setRemediationId(String remediationId) {
		this.remediationId = remediationId;
		if(remediationId != null){
			putQueryParameter("RemediationId", remediationId);
		}
	}

	@Override
	public Class<DescribeRemediationResponse> getResponseClass() {
		return DescribeRemediationResponse.class;
	}

}
