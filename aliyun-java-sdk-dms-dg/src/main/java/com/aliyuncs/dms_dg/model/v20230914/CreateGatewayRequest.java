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

package com.aliyuncs.dms_dg.model.v20230914;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateGatewayRequest extends RpcAcsRequest<CreateGatewayResponse> {
	   

	private String gatewayDesc;

	private String gatewayName;
	public CreateGatewayRequest() {
		super("dms-dg", "2023-09-14", "CreateGateway");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getGatewayDesc() {
		return this.gatewayDesc;
	}

	public void setGatewayDesc(String gatewayDesc) {
		this.gatewayDesc = gatewayDesc;
		if(gatewayDesc != null){
			putBodyParameter("GatewayDesc", gatewayDesc);
		}
	}

	public String getGatewayName() {
		return this.gatewayName;
	}

	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
		if(gatewayName != null){
			putBodyParameter("GatewayName", gatewayName);
		}
	}

	@Override
	public Class<CreateGatewayResponse> getResponseClass() {
		return CreateGatewayResponse.class;
	}

}
