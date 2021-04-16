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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.CreateStructSyncOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStructSyncOrderResponseUnmarshaller {

	public static CreateStructSyncOrderResponse unmarshall(CreateStructSyncOrderResponse createStructSyncOrderResponse, UnmarshallerContext _ctx) {
		
		createStructSyncOrderResponse.setRequestId(_ctx.stringValue("CreateStructSyncOrderResponse.RequestId"));
		createStructSyncOrderResponse.setErrorCode(_ctx.stringValue("CreateStructSyncOrderResponse.ErrorCode"));
		createStructSyncOrderResponse.setErrorMessage(_ctx.stringValue("CreateStructSyncOrderResponse.ErrorMessage"));
		createStructSyncOrderResponse.setSuccess(_ctx.booleanValue("CreateStructSyncOrderResponse.Success"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateStructSyncOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateStructSyncOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createStructSyncOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createStructSyncOrderResponse;
	}
}