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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteSwimmingLaneGroupRequest extends RoaAcsRequest<DeleteSwimmingLaneGroupResponse> {
	   

	private Long groupId;
	public DeleteSwimmingLaneGroupRequest() {
		super("Edas", "2017-08-01", "DeleteSwimmingLaneGroup", "Edas");
		setUriPattern("/pop/v5/trafficmgnt/swimming_lane_groups");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	@Override
	public Class<DeleteSwimmingLaneGroupResponse> getResponseClass() {
		return DeleteSwimmingLaneGroupResponse.class;
	}

}