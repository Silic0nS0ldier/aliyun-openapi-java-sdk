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
public class OpsDescribeCloudOpsDiskOpsEventsRequest extends RpcAcsRequest<OpsDescribeCloudOpsDiskOpsEventsResponse> {
	   

	private String channel;

	private String endTimeStr;

	private Integer pageSize;

	private String key;

	private String beginTimeStr;

	private Integer pageNo;

	private String auditParamStr;
	public OpsDescribeCloudOpsDiskOpsEventsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeCloudOpsDiskOpsEvents", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getEndTimeStr() {
		return this.endTimeStr;
	}

	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
		if(endTimeStr != null){
			putQueryParameter("EndTimeStr", endTimeStr);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getBeginTimeStr() {
		return this.beginTimeStr;
	}

	public void setBeginTimeStr(String beginTimeStr) {
		this.beginTimeStr = beginTimeStr;
		if(beginTimeStr != null){
			putQueryParameter("BeginTimeStr", beginTimeStr);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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
	public Class<OpsDescribeCloudOpsDiskOpsEventsResponse> getResponseClass() {
		return OpsDescribeCloudOpsDiskOpsEventsResponse.class;
	}

}
