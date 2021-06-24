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
public class OpsUpdatePlanBatchResourceRequest extends RpcAcsRequest<OpsUpdatePlanBatchResourceResponse> {
	   

	private Integer batchNo;

	private String planType;

	private List<Details> detailss;

	private String serviceVersion;

	private String planId;

	private String auditParamStr;
	public OpsUpdatePlanBatchResourceRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdatePlanBatchResource", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
		if(batchNo != null){
			putQueryParameter("BatchNo", batchNo.toString());
		}
	}

	public String getPlanType() {
		return this.planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
		if(planType != null){
			putQueryParameter("PlanType", planType);
		}
	}

	public List<Details> getDetailss() {
		return this.detailss;
	}

	public void setDetailss(List<Details> detailss) {
		this.detailss = detailss;	
		if (detailss != null) {
			for (int depth1 = 0; depth1 < detailss.size(); depth1++) {
				putQueryParameter("Details." + (depth1 + 1) + ".Reason" , detailss.get(depth1).getReason());
				putQueryParameter("Details." + (depth1 + 1) + ".Status" , detailss.get(depth1).getStatus());
				if (detailss.get(depth1).getResourceIdss() != null) {
					for (int i = 0; i < detailss.get(depth1).getResourceIdss().size(); i++) {
						putQueryParameter("Details." + (depth1 + 1) + ".ResourceIds." + (i + 1) , detailss.get(depth1).getResourceIdss().get(i));
					}
				}
			}
		}	
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
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

	public static class Details {

		private String reason;

		private String status;

		private List<String> resourceIdss;

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<String> getResourceIdss() {
			return this.resourceIdss;
		}

		public void setResourceIdss(List<String> resourceIdss) {
			this.resourceIdss = resourceIdss;
		}
	}

	@Override
	public Class<OpsUpdatePlanBatchResourceResponse> getResponseClass() {
		return OpsUpdatePlanBatchResourceResponse.class;
	}

}
