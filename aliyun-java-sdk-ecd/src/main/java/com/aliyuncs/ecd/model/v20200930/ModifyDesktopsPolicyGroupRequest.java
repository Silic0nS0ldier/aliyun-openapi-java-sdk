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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDesktopsPolicyGroupRequest extends RpcAcsRequest<ModifyDesktopsPolicyGroupResponse> {
	   

	private List<String> policyGroupIdss;

	private List<String> desktopIds;

	private String policyGroupId;
	public ModifyDesktopsPolicyGroupRequest() {
		super("ecd", "2020-09-30", "ModifyDesktopsPolicyGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getPolicyGroupIdss() {
		return this.policyGroupIdss;
	}

	public void setPolicyGroupIdss(List<String> policyGroupIdss) {
		this.policyGroupIdss = policyGroupIdss;	
		if (policyGroupIdss != null) {
			for (int i = 0; i < policyGroupIdss.size(); i++) {
				putQueryParameter("PolicyGroupIds." + (i + 1) , policyGroupIdss.get(i));
			}
		}	
	}

	public List<String> getDesktopIds() {
		return this.desktopIds;
	}

	public void setDesktopIds(List<String> desktopIds) {
		this.desktopIds = desktopIds;	
		if (desktopIds != null) {
			for (int i = 0; i < desktopIds.size(); i++) {
				putQueryParameter("DesktopId." + (i + 1) , desktopIds.get(i));
			}
		}	
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	@Override
	public Class<ModifyDesktopsPolicyGroupResponse> getResponseClass() {
		return ModifyDesktopsPolicyGroupResponse.class;
	}

}
