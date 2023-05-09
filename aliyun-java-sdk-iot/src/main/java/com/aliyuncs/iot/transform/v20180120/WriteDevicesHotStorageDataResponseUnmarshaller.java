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

import com.aliyuncs.iot.model.v20180120.WriteDevicesHotStorageDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class WriteDevicesHotStorageDataResponseUnmarshaller {

	public static WriteDevicesHotStorageDataResponse unmarshall(WriteDevicesHotStorageDataResponse writeDevicesHotStorageDataResponse, UnmarshallerContext _ctx) {
		
		writeDevicesHotStorageDataResponse.setRequestId(_ctx.stringValue("WriteDevicesHotStorageDataResponse.RequestId"));
		writeDevicesHotStorageDataResponse.setCode(_ctx.stringValue("WriteDevicesHotStorageDataResponse.Code"));
		writeDevicesHotStorageDataResponse.setErrorMessage(_ctx.stringValue("WriteDevicesHotStorageDataResponse.ErrorMessage"));
		writeDevicesHotStorageDataResponse.setSuccess(_ctx.booleanValue("WriteDevicesHotStorageDataResponse.Success"));
	 
	 	return writeDevicesHotStorageDataResponse;
	}
}