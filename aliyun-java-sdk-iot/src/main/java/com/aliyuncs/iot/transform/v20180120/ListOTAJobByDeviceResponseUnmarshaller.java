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

import com.aliyuncs.iot.model.v20180120.ListOTAJobByDeviceResponse;
import com.aliyuncs.iot.model.v20180120.ListOTAJobByDeviceResponse.SimpleOTAJobInfo;
import com.aliyuncs.iot.model.v20180120.ListOTAJobByDeviceResponse.SimpleOTAJobInfo.OtaTagDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTAJobByDeviceResponseUnmarshaller {

	public static ListOTAJobByDeviceResponse unmarshall(ListOTAJobByDeviceResponse listOTAJobByDeviceResponse, UnmarshallerContext _ctx) {
		
		listOTAJobByDeviceResponse.setRequestId(_ctx.stringValue("ListOTAJobByDeviceResponse.RequestId"));
		listOTAJobByDeviceResponse.setCurrentPage(_ctx.integerValue("ListOTAJobByDeviceResponse.CurrentPage"));
		listOTAJobByDeviceResponse.setErrorMessage(_ctx.stringValue("ListOTAJobByDeviceResponse.ErrorMessage"));
		listOTAJobByDeviceResponse.setSuccess(_ctx.booleanValue("ListOTAJobByDeviceResponse.Success"));
		listOTAJobByDeviceResponse.setCode(_ctx.stringValue("ListOTAJobByDeviceResponse.Code"));
		listOTAJobByDeviceResponse.setPageSize(_ctx.integerValue("ListOTAJobByDeviceResponse.PageSize"));
		listOTAJobByDeviceResponse.setPageCount(_ctx.integerValue("ListOTAJobByDeviceResponse.PageCount"));
		listOTAJobByDeviceResponse.setTotal(_ctx.integerValue("ListOTAJobByDeviceResponse.Total"));

		List<SimpleOTAJobInfo> data = new ArrayList<SimpleOTAJobInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListOTAJobByDeviceResponse.Data.Length"); i++) {
			SimpleOTAJobInfo simpleOTAJobInfo = new SimpleOTAJobInfo();
			simpleOTAJobInfo.setProductKey(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].ProductKey"));
			simpleOTAJobInfo.setJobStatus(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].JobStatus"));
			simpleOTAJobInfo.setUtcStartTime(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcStartTime"));
			simpleOTAJobInfo.setUtcModified(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcModified"));
			simpleOTAJobInfo.setJobId(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].JobId"));
			simpleOTAJobInfo.setUtcCreate(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcCreate"));
			simpleOTAJobInfo.setSelectionType(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].SelectionType"));
			simpleOTAJobInfo.setJobType(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].JobType"));
			simpleOTAJobInfo.setTargetSelection(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].TargetSelection"));
			simpleOTAJobInfo.setUtcEndTime(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].UtcEndTime"));
			simpleOTAJobInfo.setFirmwareId(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].FirmwareId"));

			List<OtaTagDTO> tags = new ArrayList<OtaTagDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListOTAJobByDeviceResponse.Data["+ i +"].Tags.Length"); j++) {
				OtaTagDTO otaTagDTO = new OtaTagDTO();
				otaTagDTO.setKey(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].Tags["+ j +"].Key"));
				otaTagDTO.setValue(_ctx.stringValue("ListOTAJobByDeviceResponse.Data["+ i +"].Tags["+ j +"].Value"));

				tags.add(otaTagDTO);
			}
			simpleOTAJobInfo.setTags(tags);

			data.add(simpleOTAJobInfo);
		}
		listOTAJobByDeviceResponse.setData(data);
	 
	 	return listOTAJobByDeviceResponse;
	}
}