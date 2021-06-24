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
public class OpsQueryFunctionsRequest extends RpcAcsRequest<OpsQueryFunctionsResponse> {
	   

	private String productCode;

	private Boolean disableCache;

	private String groupCategory;

	private String auditParamStr;
	public OpsQueryFunctionsRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryFunctions", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public Boolean getDisableCache() {
		return this.disableCache;
	}

	public void setDisableCache(Boolean disableCache) {
		this.disableCache = disableCache;
		if(disableCache != null){
			putQueryParameter("DisableCache", disableCache.toString());
		}
	}

	public String getGroupCategory() {
		return this.groupCategory;
	}

	public void setGroupCategory(String groupCategory) {
		this.groupCategory = groupCategory;
		if(groupCategory != null){
			putQueryParameter("GroupCategory", groupCategory);
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
	public Class<OpsQueryFunctionsResponse> getResponseClass() {
		return OpsQueryFunctionsResponse.class;
	}

}
