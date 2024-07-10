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

package com.aliyuncs.mseap.transform.v20210118;

import com.aliyuncs.mseap.model.v20210118.SetRedisValueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetRedisValueResponseUnmarshaller {

	public static SetRedisValueResponse unmarshall(SetRedisValueResponse setRedisValueResponse, UnmarshallerContext _ctx) {
		
		setRedisValueResponse.setRequestId(_ctx.stringValue("SetRedisValueResponse.RequestId"));
		setRedisValueResponse.setAllowRetry(_ctx.booleanValue("SetRedisValueResponse.AllowRetry"));
		setRedisValueResponse.setErrorMsg(_ctx.stringValue("SetRedisValueResponse.ErrorMsg"));
		setRedisValueResponse.setHttpStatusCode(_ctx.integerValue("SetRedisValueResponse.HttpStatusCode"));
		setRedisValueResponse.setDynamicCode(_ctx.stringValue("SetRedisValueResponse.DynamicCode"));
		setRedisValueResponse.setErrorCode(_ctx.stringValue("SetRedisValueResponse.ErrorCode"));
		setRedisValueResponse.setDynamicMessage(_ctx.stringValue("SetRedisValueResponse.DynamicMessage"));
		setRedisValueResponse.setModule(_ctx.booleanValue("SetRedisValueResponse.Module"));
		setRedisValueResponse.setSuccess(_ctx.booleanValue("SetRedisValueResponse.Success"));
		setRedisValueResponse.setAppName(_ctx.stringValue("SetRedisValueResponse.AppName"));
	 
	 	return setRedisValueResponse;
	}
}