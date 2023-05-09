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

import com.aliyuncs.iot.model.v20180120.ListOTATaskByJobResponse;
import com.aliyuncs.iot.model.v20180120.ListOTATaskByJobResponse.SimpleOTATaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTATaskByJobResponseUnmarshaller {

	public static ListOTATaskByJobResponse unmarshall(ListOTATaskByJobResponse listOTATaskByJobResponse, UnmarshallerContext _ctx) {
		
		listOTATaskByJobResponse.setRequestId(_ctx.stringValue("ListOTATaskByJobResponse.RequestId"));
		listOTATaskByJobResponse.setCurrentPage(_ctx.integerValue("ListOTATaskByJobResponse.CurrentPage"));
		listOTATaskByJobResponse.setErrorMessage(_ctx.stringValue("ListOTATaskByJobResponse.ErrorMessage"));
		listOTATaskByJobResponse.setSuccess(_ctx.booleanValue("ListOTATaskByJobResponse.Success"));
		listOTATaskByJobResponse.setCode(_ctx.stringValue("ListOTATaskByJobResponse.Code"));
		listOTATaskByJobResponse.setPageSize(_ctx.integerValue("ListOTATaskByJobResponse.PageSize"));
		listOTATaskByJobResponse.setPageCount(_ctx.integerValue("ListOTATaskByJobResponse.PageCount"));
		listOTATaskByJobResponse.setTotal(_ctx.integerValue("ListOTATaskByJobResponse.Total"));

		List<SimpleOTATaskInfo> data = new ArrayList<SimpleOTATaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListOTATaskByJobResponse.Data.Length"); i++) {
			SimpleOTATaskInfo simpleOTATaskInfo = new SimpleOTATaskInfo();
			simpleOTATaskInfo.setTimeout(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].Timeout"));
			simpleOTATaskInfo.setProductName(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].ProductName"));
			simpleOTATaskInfo.setProgress(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].Progress"));
			simpleOTATaskInfo.setDeviceName(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].DeviceName"));
			simpleOTATaskInfo.setUtcCreate(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].UtcCreate"));
			simpleOTATaskInfo.setProductKey(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].ProductKey"));
			simpleOTATaskInfo.setTaskStatus(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].TaskStatus"));
			simpleOTATaskInfo.setUtcModified(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].UtcModified"));
			simpleOTATaskInfo.setJobId(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].JobId"));
			simpleOTATaskInfo.setSrcVersion(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].SrcVersion"));
			simpleOTATaskInfo.setTaskDesc(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].TaskDesc"));
			simpleOTATaskInfo.setTaskId(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].TaskId"));
			simpleOTATaskInfo.setDestVersion(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].DestVersion"));
			simpleOTATaskInfo.setFirmwareId(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].FirmwareId"));
			simpleOTATaskInfo.setIotId(_ctx.stringValue("ListOTATaskByJobResponse.Data["+ i +"].IotId"));

			data.add(simpleOTATaskInfo);
		}
		listOTATaskByJobResponse.setData(data);
	 
	 	return listOTATaskByJobResponse;
	}
}