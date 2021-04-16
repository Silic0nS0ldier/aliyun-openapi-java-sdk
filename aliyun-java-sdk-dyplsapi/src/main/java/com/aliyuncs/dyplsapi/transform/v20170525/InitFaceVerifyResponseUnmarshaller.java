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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.InitFaceVerifyResponse;
import com.aliyuncs.dyplsapi.model.v20170525.InitFaceVerifyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitFaceVerifyResponseUnmarshaller {

	public static InitFaceVerifyResponse unmarshall(InitFaceVerifyResponse initFaceVerifyResponse, UnmarshallerContext _ctx) {
		
		initFaceVerifyResponse.setRequestId(_ctx.stringValue("InitFaceVerifyResponse.RequestId"));
		initFaceVerifyResponse.setCode(_ctx.stringValue("InitFaceVerifyResponse.Code"));
		initFaceVerifyResponse.setMessage(_ctx.stringValue("InitFaceVerifyResponse.Message"));

		Data data = new Data();
		data.setCertifyId(_ctx.stringValue("InitFaceVerifyResponse.Data.CertifyId"));
		initFaceVerifyResponse.setData(data);
	 
	 	return initFaceVerifyResponse;
	}
}