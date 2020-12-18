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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadIcpBasicMaterialRequest extends RpcAcsRequest<UploadIcpBasicMaterialResponse> {
	   

	private String bizId;

	private String businessLicense;

	private String idCardList;
	public UploadIcpBasicMaterialRequest() {
		super("companyreg", "2019-05-08", "UploadIcpBasicMaterial");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
		if(businessLicense != null){
			putQueryParameter("BusinessLicense", businessLicense);
		}
	}

	public String getIdCardList() {
		return this.idCardList;
	}

	public void setIdCardList(String idCardList) {
		this.idCardList = idCardList;
		if(idCardList != null){
			putQueryParameter("IdCardList", idCardList);
		}
	}

	@Override
	public Class<UploadIcpBasicMaterialResponse> getResponseClass() {
		return UploadIcpBasicMaterialResponse.class;
	}

}