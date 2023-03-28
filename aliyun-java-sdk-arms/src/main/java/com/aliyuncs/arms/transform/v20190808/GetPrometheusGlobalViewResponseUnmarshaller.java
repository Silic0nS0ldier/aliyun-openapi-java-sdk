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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.GetPrometheusGlobalViewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrometheusGlobalViewResponseUnmarshaller {

	public static GetPrometheusGlobalViewResponse unmarshall(GetPrometheusGlobalViewResponse getPrometheusGlobalViewResponse, UnmarshallerContext _ctx) {
		
		getPrometheusGlobalViewResponse.setRequestId(_ctx.stringValue("GetPrometheusGlobalViewResponse.RequestId"));
		getPrometheusGlobalViewResponse.setData(_ctx.stringValue("GetPrometheusGlobalViewResponse.Data"));
		getPrometheusGlobalViewResponse.setCode(_ctx.integerValue("GetPrometheusGlobalViewResponse.Code"));
		getPrometheusGlobalViewResponse.setMessage(_ctx.stringValue("GetPrometheusGlobalViewResponse.Message"));
	 
	 	return getPrometheusGlobalViewResponse;
	}
}