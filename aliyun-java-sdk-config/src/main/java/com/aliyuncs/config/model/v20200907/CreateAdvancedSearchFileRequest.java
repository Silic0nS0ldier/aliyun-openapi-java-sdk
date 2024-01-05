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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAdvancedSearchFileRequest extends RpcAcsRequest<CreateAdvancedSearchFileResponse> {
	   

	private String sql;
	public CreateAdvancedSearchFileRequest() {
		super("Config", "2020-09-07", "CreateAdvancedSearchFile", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSql() {
		return this.sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
		if(sql != null){
			putQueryParameter("Sql", sql);
		}
	}

	@Override
	public Class<CreateAdvancedSearchFileResponse> getResponseClass() {
		return CreateAdvancedSearchFileResponse.class;
	}

}
