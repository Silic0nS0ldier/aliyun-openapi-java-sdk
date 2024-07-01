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
public class SaveBatchTaskForUpdatingContactInfoRequest extends RpcAcsRequest<SaveBatchTaskForUpdatingContactInfoResponse> {
	   

	private String contactType;

	private Long registrantProfileId;

	private List<String> domainNames;

	private Boolean addTransferLock;

	private String userClientIp;

	private String lang;
	public SaveBatchTaskForUpdatingContactInfoRequest() {
		super("Domain-intl", "2017-12-18", "SaveBatchTaskForUpdatingContactInfo");
		setMethod(MethodType.POST);
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
		if(contactType != null){
			putQueryParameter("ContactType", contactType);
		}
	}

	public Long getRegistrantProfileId() {
		return this.registrantProfileId;
	}

	public void setRegistrantProfileId(Long registrantProfileId) {
		this.registrantProfileId = registrantProfileId;
		if(registrantProfileId != null){
			putQueryParameter("RegistrantProfileId", registrantProfileId.toString());
		}
	}

	public List<String> getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(List<String> domainNames) {
		this.domainNames = domainNames;	
		if (domainNames != null) {
			for (int i = 0; i < domainNames.size(); i++) {
				putQueryParameter("DomainName." + (i + 1) , domainNames.get(i));
			}
		}	
	}

	public Boolean getAddTransferLock() {
		return this.addTransferLock;
	}

	public void setAddTransferLock(Boolean addTransferLock) {
		this.addTransferLock = addTransferLock;
		if(addTransferLock != null){
			putQueryParameter("AddTransferLock", addTransferLock.toString());
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
	public Class<SaveBatchTaskForUpdatingContactInfoResponse> getResponseClass() {
		return SaveBatchTaskForUpdatingContactInfoResponse.class;
	}

}
