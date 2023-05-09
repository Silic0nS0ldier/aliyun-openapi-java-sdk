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

import com.aliyuncs.iot.model.v20180120.BindLicenseProductResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindLicenseProductResponseUnmarshaller {

	public static BindLicenseProductResponse unmarshall(BindLicenseProductResponse bindLicenseProductResponse, UnmarshallerContext _ctx) {
		
		bindLicenseProductResponse.setRequestId(_ctx.stringValue("BindLicenseProductResponse.RequestId"));
		bindLicenseProductResponse.setCode(_ctx.stringValue("BindLicenseProductResponse.Code"));
		bindLicenseProductResponse.setData(_ctx.booleanValue("BindLicenseProductResponse.Data"));
		bindLicenseProductResponse.setErrorMessage(_ctx.stringValue("BindLicenseProductResponse.ErrorMessage"));
		bindLicenseProductResponse.setSuccess(_ctx.booleanValue("BindLicenseProductResponse.Success"));
	 
	 	return bindLicenseProductResponse;
	}
}