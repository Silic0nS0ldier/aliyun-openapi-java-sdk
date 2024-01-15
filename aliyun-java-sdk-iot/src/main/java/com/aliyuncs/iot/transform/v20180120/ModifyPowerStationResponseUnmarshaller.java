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

import com.aliyuncs.iot.model.v20180120.ModifyPowerStationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPowerStationResponseUnmarshaller {

	public static ModifyPowerStationResponse unmarshall(ModifyPowerStationResponse modifyPowerStationResponse, UnmarshallerContext _ctx) {
		
		modifyPowerStationResponse.setRequestId(_ctx.stringValue("ModifyPowerStationResponse.RequestId"));
		modifyPowerStationResponse.setSuccess(_ctx.booleanValue("ModifyPowerStationResponse.Success"));
		modifyPowerStationResponse.setCode(_ctx.stringValue("ModifyPowerStationResponse.Code"));
		modifyPowerStationResponse.setErrorMessage(_ctx.stringValue("ModifyPowerStationResponse.ErrorMessage"));
		modifyPowerStationResponse.setData(_ctx.stringValue("ModifyPowerStationResponse.Data"));
	 
	 	return modifyPowerStationResponse;
	}
}