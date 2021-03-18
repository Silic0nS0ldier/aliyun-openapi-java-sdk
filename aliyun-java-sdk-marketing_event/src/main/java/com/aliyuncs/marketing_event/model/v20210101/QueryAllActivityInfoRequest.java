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

package com.aliyuncs.marketing_event.model.v20210101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryAllActivityInfoRequest extends RpcAcsRequest<QueryAllActivityInfoResponse> {
	   

	private String activityId;
	public QueryAllActivityInfoRequest() {
		super("marketing_event", "2021-01-01", "QueryAllActivityInfo");
		setMethod(MethodType.GET);
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
		if(activityId != null){
			putQueryParameter("ActivityId", activityId);
		}
	}

	@Override
	public Class<QueryAllActivityInfoResponse> getResponseClass() {
		return QueryAllActivityInfoResponse.class;
	}

}
