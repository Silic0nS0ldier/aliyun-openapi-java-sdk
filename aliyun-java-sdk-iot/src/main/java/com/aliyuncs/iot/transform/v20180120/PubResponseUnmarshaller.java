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

import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PubResponseUnmarshaller {

	public static PubResponse unmarshall(PubResponse pubResponse, UnmarshallerContext _ctx) {
		
		pubResponse.setRequestId(_ctx.stringValue("PubResponse.RequestId"));
		pubResponse.setCode(_ctx.stringValue("PubResponse.Code"));
		pubResponse.setMessageId(_ctx.stringValue("PubResponse.MessageId"));
		pubResponse.setErrorMessage(_ctx.stringValue("PubResponse.ErrorMessage"));
		pubResponse.setSuccess(_ctx.booleanValue("PubResponse.Success"));
	 
	 	return pubResponse;
	}
}