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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceGatewayResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceGatewayResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceGatewayResponseUnmarshaller {

	public static QueryEdgeInstanceGatewayResponse unmarshall(QueryEdgeInstanceGatewayResponse queryEdgeInstanceGatewayResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceGatewayResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceGatewayResponse.RequestId"));
		queryEdgeInstanceGatewayResponse.setCode(_ctx.stringValue("QueryEdgeInstanceGatewayResponse.Code"));
		queryEdgeInstanceGatewayResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceGatewayResponse.ErrorMessage"));
		queryEdgeInstanceGatewayResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceGatewayResponse.Success"));

		List<Gateway> gatewayList = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceGatewayResponse.GatewayList.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setProductKey(_ctx.stringValue("QueryEdgeInstanceGatewayResponse.GatewayList["+ i +"].ProductKey"));
			gateway.setEdgeVersion(_ctx.stringValue("QueryEdgeInstanceGatewayResponse.GatewayList["+ i +"].EdgeVersion"));
			gateway.setDeviceName(_ctx.stringValue("QueryEdgeInstanceGatewayResponse.GatewayList["+ i +"].DeviceName"));
			gateway.setIotId(_ctx.stringValue("QueryEdgeInstanceGatewayResponse.GatewayList["+ i +"].IotId"));

			gatewayList.add(gateway);
		}
		queryEdgeInstanceGatewayResponse.setGatewayList(gatewayList);
	 
	 	return queryEdgeInstanceGatewayResponse;
	}
}