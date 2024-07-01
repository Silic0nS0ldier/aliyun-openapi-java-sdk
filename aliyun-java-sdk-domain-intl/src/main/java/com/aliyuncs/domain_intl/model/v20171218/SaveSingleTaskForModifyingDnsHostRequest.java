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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForModifyingDnsHostRequest extends RpcAcsRequest<SaveSingleTaskForModifyingDnsHostResponse> {
	   

	private List<String> ips;

	private String instanceId;

	private String dnsName;

	private String userClientIp;

	private String lang;
	public SaveSingleTaskForModifyingDnsHostRequest() {
		super("Domain-intl", "2017-12-18", "SaveSingleTaskForModifyingDnsHost");
		setMethod(MethodType.POST);
	}

	public List<String> getIps() {
		return this.ips;
	}

	public void setIps(List<String> ips) {
		this.ips = ips;	
		if (ips != null) {
			for (int i = 0; i < ips.size(); i++) {
				putQueryParameter("Ip." + (i + 1) , ips.get(i));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDnsName() {
		return this.dnsName;
	}

	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
		if(dnsName != null){
			putQueryParameter("DnsName", dnsName);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<SaveSingleTaskForModifyingDnsHostResponse> getResponseClass() {
		return SaveSingleTaskForModifyingDnsHostResponse.class;
	}

}
