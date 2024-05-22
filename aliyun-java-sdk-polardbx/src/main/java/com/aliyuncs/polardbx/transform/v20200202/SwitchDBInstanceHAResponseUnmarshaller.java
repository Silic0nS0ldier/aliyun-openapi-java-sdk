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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.SwitchDBInstanceHAResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchDBInstanceHAResponseUnmarshaller {

	public static SwitchDBInstanceHAResponse unmarshall(SwitchDBInstanceHAResponse switchDBInstanceHAResponse, UnmarshallerContext _ctx) {
		
		switchDBInstanceHAResponse.setRequestId(_ctx.stringValue("SwitchDBInstanceHAResponse.RequestId"));
		switchDBInstanceHAResponse.setMessage(_ctx.stringValue("SwitchDBInstanceHAResponse.Message"));
		switchDBInstanceHAResponse.setSuccess(_ctx.booleanValue("SwitchDBInstanceHAResponse.Success"));
	 
	 	return switchDBInstanceHAResponse;
	}
}