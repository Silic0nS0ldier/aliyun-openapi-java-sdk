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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendMessageRequest extends RpcAcsRequest<SendMessageResponse> {
	   

	private Boolean feedback;

	@SerializedName("streamExtension")
	private StreamExtension streamExtension;

	private String textRequest;

	private Long tenantId;

	@SerializedName("vAMLRequest")
	private VAMLRequest vAMLRequest;

	private String sessionId;
	public SendMessageRequest() {
		super("avatar", "2022-01-30", "SendMessage");
		setMethod(MethodType.POST);
	}

	public Boolean getFeedback() {
		return this.feedback;
	}

	public void setFeedback(Boolean feedback) {
		this.feedback = feedback;
		if(feedback != null){
			putQueryParameter("Feedback", feedback.toString());
		}
	}

	public StreamExtension getStreamExtension() {
		return this.streamExtension;
	}

	public void setStreamExtension(StreamExtension streamExtension) {
		this.streamExtension = streamExtension;	
		if (streamExtension != null) {
			putQueryParameter("StreamExtension" , new Gson().toJson(streamExtension));
		}	
	}

	public String getTextRequest() {
		return this.textRequest;
	}

	public void setTextRequest(String textRequest) {
		this.textRequest = textRequest;
		if(textRequest != null){
			putQueryParameter("TextRequest", textRequest);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	public VAMLRequest getVAMLRequest() {
		return this.vAMLRequest;
	}

	public void setVAMLRequest(VAMLRequest vAMLRequest) {
		this.vAMLRequest = vAMLRequest;	
		if (vAMLRequest != null) {
			putQueryParameter("VAMLRequest" , new Gson().toJson(vAMLRequest));
		}	
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putQueryParameter("SessionId", sessionId);
		}
	}

	public static class StreamExtension {

		@SerializedName("IsStream")
		private Boolean isStream;

		@SerializedName("Index")
		private Integer index;

		@SerializedName("Position")
		private String position;

		public Boolean getIsStream() {
			return this.isStream;
		}

		public void setIsStream(Boolean isStream) {
			this.isStream = isStream;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public String getPosition() {
			return this.position;
		}

		public void setPosition(String position) {
			this.position = position;
		}
	}

	public static class VAMLRequest {

		@SerializedName("Code")
		private String code;

		@SerializedName("Vaml")
		private String vaml;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getVaml() {
			return this.vaml;
		}

		public void setVaml(String vaml) {
			this.vaml = vaml;
		}
	}

	@Override
	public Class<SendMessageResponse> getResponseClass() {
		return SendMessageResponse.class;
	}

}
