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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSharePromotionSpeechModelRequest extends RpcAcsRequest<CreateSharePromotionSpeechModelResponse> {
	   

	private String voice;

	private String sharePromotionActivityId;

	private String audioFormat;

	private String iotInstanceId;

	private String text;

	private String speechModelType;

	private String shareTaskCode;

	private Integer volume;

	private String bizCode;

	private Integer speechRate;
	public CreateSharePromotionSpeechModelRequest() {
		super("Iot", "2018-01-20", "CreateSharePromotionSpeechModel", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVoice() {
		return this.voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
		if(voice != null){
			putBodyParameter("Voice", voice);
		}
	}

	public String getSharePromotionActivityId() {
		return this.sharePromotionActivityId;
	}

	public void setSharePromotionActivityId(String sharePromotionActivityId) {
		this.sharePromotionActivityId = sharePromotionActivityId;
		if(sharePromotionActivityId != null){
			putBodyParameter("SharePromotionActivityId", sharePromotionActivityId);
		}
	}

	public String getAudioFormat() {
		return this.audioFormat;
	}

	public void setAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
		if(audioFormat != null){
			putBodyParameter("AudioFormat", audioFormat);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	public String getSpeechModelType() {
		return this.speechModelType;
	}

	public void setSpeechModelType(String speechModelType) {
		this.speechModelType = speechModelType;
		if(speechModelType != null){
			putBodyParameter("SpeechModelType", speechModelType);
		}
	}

	public String getShareTaskCode() {
		return this.shareTaskCode;
	}

	public void setShareTaskCode(String shareTaskCode) {
		this.shareTaskCode = shareTaskCode;
		if(shareTaskCode != null){
			putBodyParameter("ShareTaskCode", shareTaskCode);
		}
	}

	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
		if(volume != null){
			putBodyParameter("Volume", volume.toString());
		}
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
		if(bizCode != null){
			putBodyParameter("BizCode", bizCode);
		}
	}

	public Integer getSpeechRate() {
		return this.speechRate;
	}

	public void setSpeechRate(Integer speechRate) {
		this.speechRate = speechRate;
		if(speechRate != null){
			putBodyParameter("SpeechRate", speechRate.toString());
		}
	}

	@Override
	public Class<CreateSharePromotionSpeechModelResponse> getResponseClass() {
		return CreateSharePromotionSpeechModelResponse.class;
	}

}
