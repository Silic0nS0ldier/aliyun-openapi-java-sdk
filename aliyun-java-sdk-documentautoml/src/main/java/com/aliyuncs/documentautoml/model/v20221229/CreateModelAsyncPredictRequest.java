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

package com.aliyuncs.documentautoml.model.v20221229;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateModelAsyncPredictRequest extends RpcAcsRequest<CreateModelAsyncPredictResponse> {
	   

	private String body;

	private Boolean binaryToText;

	private String content;

	private String serviceName;

	private Long modelId;

	private String serviceVersion;

	private String modelVersion;
	public CreateModelAsyncPredictRequest() {
		super("documentAutoml", "2022-12-29", "CreateModelAsyncPredict", "documentAutoml");
		setMethod(MethodType.POST);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public Boolean getBinaryToText() {
		return this.binaryToText;
	}

	public void setBinaryToText(Boolean binaryToText) {
		this.binaryToText = binaryToText;
		if(binaryToText != null){
			putQueryParameter("BinaryToText", binaryToText.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public Long getModelId() {
		return this.modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId.toString());
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putQueryParameter("ModelVersion", modelVersion);
		}
	}

	@Override
	public Class<CreateModelAsyncPredictResponse> getResponseClass() {
		return CreateModelAsyncPredictResponse.class;
	}

}
