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

import com.aliyuncs.iot.model.v20180120.CreateSchedulePeriodResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSchedulePeriodResponseUnmarshaller {

	public static CreateSchedulePeriodResponse unmarshall(CreateSchedulePeriodResponse createSchedulePeriodResponse, UnmarshallerContext _ctx) {
		
		createSchedulePeriodResponse.setRequestId(_ctx.stringValue("CreateSchedulePeriodResponse.RequestId"));
		createSchedulePeriodResponse.setCode(_ctx.stringValue("CreateSchedulePeriodResponse.Code"));
		createSchedulePeriodResponse.setData(_ctx.stringValue("CreateSchedulePeriodResponse.Data"));
		createSchedulePeriodResponse.setErrorMessage(_ctx.stringValue("CreateSchedulePeriodResponse.ErrorMessage"));
		createSchedulePeriodResponse.setSuccess(_ctx.booleanValue("CreateSchedulePeriodResponse.Success"));
	 
	 	return createSchedulePeriodResponse;
	}
}