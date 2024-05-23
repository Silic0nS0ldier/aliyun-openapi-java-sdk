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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.DisableSchemaPropertyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableSchemaPropertyResponseUnmarshaller {

	public static DisableSchemaPropertyResponse unmarshall(DisableSchemaPropertyResponse disableSchemaPropertyResponse, UnmarshallerContext _ctx) {
		
		disableSchemaPropertyResponse.setRequestId(_ctx.stringValue("DisableSchemaPropertyResponse.RequestId"));
		disableSchemaPropertyResponse.setHttpStatusCode(_ctx.integerValue("DisableSchemaPropertyResponse.HttpStatusCode"));
		disableSchemaPropertyResponse.setCode(_ctx.stringValue("DisableSchemaPropertyResponse.Code"));
		disableSchemaPropertyResponse.setMessage(_ctx.stringValue("DisableSchemaPropertyResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DisableSchemaPropertyResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("DisableSchemaPropertyResponse.Params["+ i +"]"));
		}
		disableSchemaPropertyResponse.setParams(params);
	 
	 	return disableSchemaPropertyResponse;
	}
}