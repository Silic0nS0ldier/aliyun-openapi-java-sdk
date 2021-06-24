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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsUpdateFlowControlLimitApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsUpdateFlowControlLimitApiResponseUnmarshaller {

	public static OpsUpdateFlowControlLimitApiResponse unmarshall(OpsUpdateFlowControlLimitApiResponse opsUpdateFlowControlLimitApiResponse, UnmarshallerContext _ctx) {
		
		opsUpdateFlowControlLimitApiResponse.setRequestId(_ctx.stringValue("OpsUpdateFlowControlLimitApiResponse.RequestId"));

		List<String> ncIps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsUpdateFlowControlLimitApiResponse.NcIps.Length"); i++) {
			ncIps.add(_ctx.stringValue("OpsUpdateFlowControlLimitApiResponse.NcIps["+ i +"]"));
		}
		opsUpdateFlowControlLimitApiResponse.setNcIps(ncIps);
	 
	 	return opsUpdateFlowControlLimitApiResponse;
	}
}