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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.SearchUserApplicationsResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.SearchUserApplicationsResponse.UserApplication;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchUserApplicationsResponseUnmarshaller {

	public static SearchUserApplicationsResponse unmarshall(SearchUserApplicationsResponse searchUserApplicationsResponse, UnmarshallerContext _ctx) {
		
		searchUserApplicationsResponse.setRequestId(_ctx.stringValue("SearchUserApplicationsResponse.RequestId"));
		searchUserApplicationsResponse.setMessage(_ctx.stringValue("SearchUserApplicationsResponse.Message"));
		searchUserApplicationsResponse.setHttpStatusCode(_ctx.integerValue("SearchUserApplicationsResponse.HttpStatusCode"));
		searchUserApplicationsResponse.setSuccess(_ctx.booleanValue("SearchUserApplicationsResponse.Success"));
		searchUserApplicationsResponse.setCode(_ctx.stringValue("SearchUserApplicationsResponse.Code"));

		List<UserApplication> content = new ArrayList<UserApplication>();
		for (int i = 0; i < _ctx.lengthValue("SearchUserApplicationsResponse.Content.Length"); i++) {
			UserApplication userApplication = new UserApplication();
			userApplication.setAppName(_ctx.stringValue("SearchUserApplicationsResponse.Content["+ i +"].AppName"));
			userApplication.setAppType(_ctx.integerValue("SearchUserApplicationsResponse.Content["+ i +"].AppType"));
			userApplication.setAppId(_ctx.stringValue("SearchUserApplicationsResponse.Content["+ i +"].AppId"));

			content.add(userApplication);
		}
		searchUserApplicationsResponse.setContent(content);
	 
	 	return searchUserApplicationsResponse;
	}
}