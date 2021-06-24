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
public class OpsModifyFuseQuotaRequest extends RpcAcsRequest<OpsModifyFuseQuotaResponse> {
	   

	private String resourceType;

	private String operator;

	private String regionNo;

	private Long id;

	private Integer dailyQuota;

	private String resourceTotal;

	private String auditParamStr;
	public OpsModifyFuseQuotaRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyFuseQuota", "ecsops");
		setMethod(MethodType.POST);
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

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Integer getDailyQuota() {
		return this.dailyQuota;
	}

	public void setDailyQuota(Integer dailyQuota) {
		this.dailyQuota = dailyQuota;
		if(dailyQuota != null){
			putQueryParameter("DailyQuota", dailyQuota.toString());
		}
	}

	public String getResourceTotal() {
		return this.resourceTotal;
	}

	public void setResourceTotal(String resourceTotal) {
		this.resourceTotal = resourceTotal;
		if(resourceTotal != null){
			putQueryParameter("ResourceTotal", resourceTotal);
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
	public Class<OpsModifyFuseQuotaResponse> getResponseClass() {
		return OpsModifyFuseQuotaResponse.class;
	}

}
