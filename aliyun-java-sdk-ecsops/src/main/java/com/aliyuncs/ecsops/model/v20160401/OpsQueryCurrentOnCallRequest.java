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
public class OpsQueryCurrentOnCallRequest extends RpcAcsRequest<OpsQueryCurrentOnCallResponse> {
	   

	private String department;

	private String auditParamStr;
	public OpsQueryCurrentOnCallRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryCurrentOnCall", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
		if(department != null){
			putQueryParameter("Department", department);
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
	public Class<OpsQueryCurrentOnCallResponse> getResponseClass() {
		return OpsQueryCurrentOnCallResponse.class;
	}

}
