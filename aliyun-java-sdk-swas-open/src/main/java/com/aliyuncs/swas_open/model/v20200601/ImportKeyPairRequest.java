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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ImportKeyPairRequest extends RpcAcsRequest<ImportKeyPairResponse> {
	   

	private String clientToken;

	private String publicKeyBody;

	private String keyPairName;
	public ImportKeyPairRequest() {
		super("SWAS-OPEN", "2020-06-01", "ImportKeyPair", "SWAS-OPEN");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getPublicKeyBody() {
		return this.publicKeyBody;
	}

	public void setPublicKeyBody(String publicKeyBody) {
		this.publicKeyBody = publicKeyBody;
		if(publicKeyBody != null){
			putQueryParameter("PublicKeyBody", publicKeyBody);
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	@Override
	public Class<ImportKeyPairResponse> getResponseClass() {
		return ImportKeyPairResponse.class;
	}

}
