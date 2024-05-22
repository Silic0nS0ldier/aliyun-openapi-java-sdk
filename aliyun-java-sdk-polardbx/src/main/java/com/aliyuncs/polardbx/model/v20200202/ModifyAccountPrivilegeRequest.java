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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAccountPrivilegeRequest extends RpcAcsRequest<ModifyAccountPrivilegeResponse> {
	   

	private String dBInstanceName;

	private String securityAccountPassword;

	private String accountPrivilege;

	private String accountName;

	private String dbName;

	private String securityAccountName;
	public ModifyAccountPrivilegeRequest() {
		super("polardbx", "2020-02-02", "ModifyAccountPrivilege", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getSecurityAccountPassword() {
		return this.securityAccountPassword;
	}

	public void setSecurityAccountPassword(String securityAccountPassword) {
		this.securityAccountPassword = securityAccountPassword;
		if(securityAccountPassword != null){
			putQueryParameter("SecurityAccountPassword", securityAccountPassword);
		}
	}

	public String getAccountPrivilege() {
		return this.accountPrivilege;
	}

	public void setAccountPrivilege(String accountPrivilege) {
		this.accountPrivilege = accountPrivilege;
		if(accountPrivilege != null){
			putQueryParameter("AccountPrivilege", accountPrivilege);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getSecurityAccountName() {
		return this.securityAccountName;
	}

	public void setSecurityAccountName(String securityAccountName) {
		this.securityAccountName = securityAccountName;
		if(securityAccountName != null){
			putQueryParameter("SecurityAccountName", securityAccountName);
		}
	}

	@Override
	public Class<ModifyAccountPrivilegeResponse> getResponseClass() {
		return ModifyAccountPrivilegeResponse.class;
	}

}
