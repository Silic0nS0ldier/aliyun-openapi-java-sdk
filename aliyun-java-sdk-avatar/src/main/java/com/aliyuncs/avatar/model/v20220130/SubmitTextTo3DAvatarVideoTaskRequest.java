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
public class SubmitTextTo3DAvatarVideoTaskRequest extends RpcAcsRequest<SubmitTextTo3DAvatarVideoTaskResponse> {
	   

	@SerializedName("app")
	private App app;

	@SerializedName("audioInfo")
	private AudioInfo audioInfo;

	@SerializedName("avatarInfo")
	private AvatarInfo avatarInfo;

	private String title;

	private String extParams;

	@SerializedName("videoInfo")
	private VideoInfo videoInfo;

	private String callbackParams;

	private Long tenantId;

	private Boolean callback;

	private String text;
	public SubmitTextTo3DAvatarVideoTaskRequest() {
		super("avatar", "2022-01-30", "SubmitTextTo3DAvatarVideoTask");
		setMethod(MethodType.POST);
	}

	public App getApp() {
		return this.app;
	}

	public void setApp(App app) {
		this.app = app;	
		if (app != null) {
			putQueryParameter("App" , new Gson().toJson(app));
		}	
	}

	public AudioInfo getAudioInfo() {
		return this.audioInfo;
	}

	public void setAudioInfo(AudioInfo audioInfo) {
		this.audioInfo = audioInfo;	
		if (audioInfo != null) {
			putQueryParameter("AudioInfo" , new Gson().toJson(audioInfo));
		}	
	}

	public AvatarInfo getAvatarInfo() {
		return this.avatarInfo;
	}

	public void setAvatarInfo(AvatarInfo avatarInfo) {
		this.avatarInfo = avatarInfo;	
		if (avatarInfo != null) {
			putQueryParameter("AvatarInfo" , new Gson().toJson(avatarInfo));
		}	
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public String getExtParams() {
		return this.extParams;
	}

	public void setExtParams(String extParams) {
		this.extParams = extParams;
		if(extParams != null){
			putQueryParameter("ExtParams", extParams);
		}
	}

	public VideoInfo getVideoInfo() {
		return this.videoInfo;
	}

	public void setVideoInfo(VideoInfo videoInfo) {
		this.videoInfo = videoInfo;	
		if (videoInfo != null) {
			putQueryParameter("VideoInfo" , new Gson().toJson(videoInfo));
		}	
	}

	public String getCallbackParams() {
		return this.callbackParams;
	}

	public void setCallbackParams(String callbackParams) {
		this.callbackParams = callbackParams;
		if(callbackParams != null){
			putQueryParameter("CallbackParams", callbackParams);
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

	public Boolean getCallback() {
		return this.callback;
	}

	public void setCallback(Boolean callback) {
		this.callback = callback;
		if(callback != null){
			putQueryParameter("Callback", callback.toString());
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putQueryParameter("Text", text);
		}
	}

	public static class App {

		@SerializedName("AppId")
		private String appId;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}
	}

	public static class AudioInfo {

		@SerializedName("Voice")
		private String voice;

		@SerializedName("Volume")
		private Integer volume;

		@SerializedName("SpeechRate")
		private Integer speechRate;

		@SerializedName("PitchRate")
		private Integer pitchRate;

		@SerializedName("SampleRate")
		private Integer sampleRate;

		public String getVoice() {
			return this.voice;
		}

		public void setVoice(String voice) {
			this.voice = voice;
		}

		public Integer getVolume() {
			return this.volume;
		}

		public void setVolume(Integer volume) {
			this.volume = volume;
		}

		public Integer getSpeechRate() {
			return this.speechRate;
		}

		public void setSpeechRate(Integer speechRate) {
			this.speechRate = speechRate;
		}

		public Integer getPitchRate() {
			return this.pitchRate;
		}

		public void setPitchRate(Integer pitchRate) {
			this.pitchRate = pitchRate;
		}

		public Integer getSampleRate() {
			return this.sampleRate;
		}

		public void setSampleRate(Integer sampleRate) {
			this.sampleRate = sampleRate;
		}
	}

	public static class AvatarInfo {

		@SerializedName("Code")
		private String code;

		@SerializedName("Locate")
		private Integer locate;

		@SerializedName("Angle")
		private Integer angle;

		@SerializedName("IndustryCode")
		private String industryCode;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Integer getLocate() {
			return this.locate;
		}

		public void setLocate(Integer locate) {
			this.locate = locate;
		}

		public Integer getAngle() {
			return this.angle;
		}

		public void setAngle(Integer angle) {
			this.angle = angle;
		}

		public String getIndustryCode() {
			return this.industryCode;
		}

		public void setIndustryCode(String industryCode) {
			this.industryCode = industryCode;
		}
	}

	public static class VideoInfo {

		@SerializedName("IsAlpha")
		private Boolean isAlpha;

		@SerializedName("BackgroundImageUrl")
		private String backgroundImageUrl;

		@SerializedName("IsSubtitles")
		private Boolean isSubtitles;

		@SerializedName("SubtitleEmbedded")
		private Boolean subtitleEmbedded;

		@SerializedName("SubtitleStyle")
		private SubtitleStyle subtitleStyle;

		@SerializedName("Resolution")
		private Integer resolution;

		@SerializedName("AlphaFormat")
		private Integer alphaFormat;

		public Boolean getIsAlpha() {
			return this.isAlpha;
		}

		public void setIsAlpha(Boolean isAlpha) {
			this.isAlpha = isAlpha;
		}

		public String getBackgroundImageUrl() {
			return this.backgroundImageUrl;
		}

		public void setBackgroundImageUrl(String backgroundImageUrl) {
			this.backgroundImageUrl = backgroundImageUrl;
		}

		public Boolean getIsSubtitles() {
			return this.isSubtitles;
		}

		public void setIsSubtitles(Boolean isSubtitles) {
			this.isSubtitles = isSubtitles;
		}

		public Boolean getSubtitleEmbedded() {
			return this.subtitleEmbedded;
		}

		public void setSubtitleEmbedded(Boolean subtitleEmbedded) {
			this.subtitleEmbedded = subtitleEmbedded;
		}

		public SubtitleStyle getSubtitleStyle() {
			return this.subtitleStyle;
		}

		public void setSubtitleStyle(SubtitleStyle subtitleStyle) {
			this.subtitleStyle = subtitleStyle;
		}

		public Integer getResolution() {
			return this.resolution;
		}

		public void setResolution(Integer resolution) {
			this.resolution = resolution;
		}

		public Integer getAlphaFormat() {
			return this.alphaFormat;
		}

		public void setAlphaFormat(Integer alphaFormat) {
			this.alphaFormat = alphaFormat;
		}

		public static class SubtitleStyle {

			@SerializedName("Color")
			private String color;

			@SerializedName("Size")
			private Integer size;

			@SerializedName("Name")
			private String name;

			@SerializedName("Y")
			private Integer y;

			@SerializedName("OutlineColor")
			private String outlineColor;

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getY() {
				return this.y;
			}

			public void setY(Integer y) {
				this.y = y;
			}

			public String getOutlineColor() {
				return this.outlineColor;
			}

			public void setOutlineColor(String outlineColor) {
				this.outlineColor = outlineColor;
			}
		}
	}

	@Override
	public Class<SubmitTextTo3DAvatarVideoTaskResponse> getResponseClass() {
		return SubmitTextTo3DAvatarVideoTaskResponse.class;
	}

}
