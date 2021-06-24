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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsRecoverDiskBpsIopsRequest extends RpcAcsRequest<OpsRecoverDiskBpsIopsResponse> {
	   

	private Long resourceOwnerId;

	private String operator;

	private String houyiDiskId;

	private String auditParamStr;
	public OpsRecoverDiskBpsIopsRequest() {
		super("Ecsops", "2016-04-01", "OpsRecoverDiskBpsIops", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getHouyiDiskId() {
		return this.houyiDiskId;
	}

	public void setHouyiDiskId(String houyiDiskId) {
		this.houyiDiskId = houyiDiskId;
		if(houyiDiskId != null){
			putQueryParameter("HouyiDiskId", houyiDiskId);
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
	public Class<OpsRecoverDiskBpsIopsResponse> getResponseClass() {
		return OpsRecoverDiskBpsIopsResponse.class;
	}

}
