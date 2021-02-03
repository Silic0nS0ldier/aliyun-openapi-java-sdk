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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_appmonitor.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLaunchTimeTrendWithCarrierRequest extends RpcAcsRequest<QueryLaunchTimeTrendWithCarrierResponse> {
	   

	private String appVersionStrategy;

	private Long startTime;

	private String launchType;

	private String statType;

	private Integer intervalMinutes;

	private String uniqueAppId;

	private Long endTime;

	private List<String> appVersions;

	private List<String> carriers;
	public QueryLaunchTimeTrendWithCarrierRequest() {
		super("emas-appmonitor", "2019-06-11", "QueryLaunchTimeTrendWithCarrier");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppVersionStrategy() {
		return this.appVersionStrategy;
	}

	public void setAppVersionStrategy(String appVersionStrategy) {
		this.appVersionStrategy = appVersionStrategy;
		if(appVersionStrategy != null){
			putBodyParameter("AppVersionStrategy", appVersionStrategy);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public String getLaunchType() {
		return this.launchType;
	}

	public void setLaunchType(String launchType) {
		this.launchType = launchType;
		if(launchType != null){
			putBodyParameter("LaunchType", launchType);
		}
	}

	public String getStatType() {
		return this.statType;
	}

	public void setStatType(String statType) {
		this.statType = statType;
		if(statType != null){
			putBodyParameter("StatType", statType);
		}
	}

	public Integer getIntervalMinutes() {
		return this.intervalMinutes;
	}

	public void setIntervalMinutes(Integer intervalMinutes) {
		this.intervalMinutes = intervalMinutes;
		if(intervalMinutes != null){
			putBodyParameter("IntervalMinutes", intervalMinutes.toString());
		}
	}

	public String getUniqueAppId() {
		return this.uniqueAppId;
	}

	public void setUniqueAppId(String uniqueAppId) {
		this.uniqueAppId = uniqueAppId;
		if(uniqueAppId != null){
			putBodyParameter("UniqueAppId", uniqueAppId);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public List<String> getAppVersions() {
		return this.appVersions;
	}

	public void setAppVersions(List<String> appVersions) {
		this.appVersions = appVersions;	
		if (appVersions != null) {
			for (int i = 0; i < appVersions.size(); i++) {
				putBodyParameter("AppVersion." + (i + 1) , appVersions.get(i));
			}
		}	
	}

	public List<String> getCarriers() {
		return this.carriers;
	}

	public void setCarriers(List<String> carriers) {
		this.carriers = carriers;	
		if (carriers != null) {
			for (int i = 0; i < carriers.size(); i++) {
				putBodyParameter("Carrier." + (i + 1) , carriers.get(i));
			}
		}	
	}

	@Override
	public Class<QueryLaunchTimeTrendWithCarrierResponse> getResponseClass() {
		return QueryLaunchTimeTrendWithCarrierResponse.class;
	}

}