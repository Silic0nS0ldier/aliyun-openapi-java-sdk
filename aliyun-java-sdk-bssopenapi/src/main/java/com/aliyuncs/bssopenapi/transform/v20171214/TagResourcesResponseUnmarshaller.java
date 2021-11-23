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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.TagResourcesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TagResourcesResponseUnmarshaller {

	public static TagResourcesResponse unmarshall(TagResourcesResponse tagResourcesResponse, UnmarshallerContext _ctx) {
		
		tagResourcesResponse.setRequestId(_ctx.stringValue("TagResourcesResponse.RequestId"));
		tagResourcesResponse.setCode(_ctx.stringValue("TagResourcesResponse.Code"));
		tagResourcesResponse.setMessage(_ctx.stringValue("TagResourcesResponse.Message"));
		tagResourcesResponse.setData(_ctx.booleanValue("TagResourcesResponse.Data"));
		tagResourcesResponse.setSuccess(_ctx.booleanValue("TagResourcesResponse.Success"));
	 
	 	return tagResourcesResponse;
	}
}