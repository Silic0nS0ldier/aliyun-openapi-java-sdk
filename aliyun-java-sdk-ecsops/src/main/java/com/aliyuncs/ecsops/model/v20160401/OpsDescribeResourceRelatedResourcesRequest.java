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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceRelatedResourcesRequest extends RpcAcsRequest<OpsDescribeResourceRelatedResourcesResponse> {
	   

	private List<String> resourceIds;

	private String resourceType;

	private List<String> relatedResourceTypes;

	private String auditParamStr;
	public OpsDescribeResourceRelatedResourcesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeResourceRelatedResources", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<String> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int i = 0; i < resourceIds.size(); i++) {
				putQueryParameter("ResourceId." + (i + 1) , resourceIds.get(i));
			}
		}	
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public List<String> getRelatedResourceTypes() {
		return this.relatedResourceTypes;
	}

	public void setRelatedResourceTypes(List<String> relatedResourceTypes) {
		this.relatedResourceTypes = relatedResourceTypes;	
		if (relatedResourceTypes != null) {
			for (int i = 0; i < relatedResourceTypes.size(); i++) {
				putQueryParameter("RelatedResourceType." + (i + 1) , relatedResourceTypes.get(i));
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeResourceRelatedResourcesResponse> getResponseClass() {
		return OpsDescribeResourceRelatedResourcesResponse.class;
	}

}
