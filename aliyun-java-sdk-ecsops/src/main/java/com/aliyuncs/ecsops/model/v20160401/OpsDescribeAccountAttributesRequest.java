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
public class OpsDescribeAccountAttributesRequest extends RpcAcsRequest<OpsDescribeAccountAttributesResponse> {
	   

	private List<String> attributeNames;

	private String zoneId;

	private Long aliUid;

	private String bid;

	private String auditParamStr;
	public OpsDescribeAccountAttributesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeAccountAttributes", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getAttributeNames() {
		return this.attributeNames;
	}

	public void setAttributeNames(List<String> attributeNames) {
		this.attributeNames = attributeNames;	
		if (attributeNames != null) {
			for (int i = 0; i < attributeNames.size(); i++) {
				putQueryParameter("AttributeName." + (i + 1) , attributeNames.get(i));
			}
		}	
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
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
	public Class<OpsDescribeAccountAttributesResponse> getResponseClass() {
		return OpsDescribeAccountAttributesResponse.class;
	}

}
