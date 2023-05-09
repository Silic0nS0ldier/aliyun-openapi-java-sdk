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

import com.aliyuncs.iot.model.v20180120.BatchCheckVehicleDeviceResponse;
import com.aliyuncs.iot.model.v20180120.BatchCheckVehicleDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.BatchCheckVehicleDeviceResponse.Data.InvalidDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCheckVehicleDeviceResponseUnmarshaller {

	public static BatchCheckVehicleDeviceResponse unmarshall(BatchCheckVehicleDeviceResponse batchCheckVehicleDeviceResponse, UnmarshallerContext _ctx) {
		
		batchCheckVehicleDeviceResponse.setRequestId(_ctx.stringValue("BatchCheckVehicleDeviceResponse.RequestId"));
		batchCheckVehicleDeviceResponse.setCode(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Code"));
		batchCheckVehicleDeviceResponse.setErrorMessage(_ctx.stringValue("BatchCheckVehicleDeviceResponse.ErrorMessage"));
		batchCheckVehicleDeviceResponse.setSuccess(_ctx.booleanValue("BatchCheckVehicleDeviceResponse.Success"));

		Data data = new Data();

		List<String> invalidManufacturerList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidManufacturerList.Length"); i++) {
			invalidManufacturerList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidManufacturerList["+ i +"]"));
		}
		data.setInvalidManufacturerList(invalidManufacturerList);

		List<String> repeatedDeviceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.RepeatedDeviceIdList.Length"); i++) {
			repeatedDeviceIdList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.RepeatedDeviceIdList["+ i +"]"));
		}
		data.setRepeatedDeviceIdList(repeatedDeviceIdList);

		List<String> repeatedDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.RepeatedDeviceNameList.Length"); i++) {
			repeatedDeviceNameList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.RepeatedDeviceNameList["+ i +"]"));
		}
		data.setRepeatedDeviceNameList(repeatedDeviceNameList);

		List<String> invalidDeviceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceIdList.Length"); i++) {
			invalidDeviceIdList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceIdList["+ i +"]"));
		}
		data.setInvalidDeviceIdList(invalidDeviceIdList);

		List<String> invalidDeviceModelList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceModelList.Length"); i++) {
			invalidDeviceModelList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceModelList["+ i +"]"));
		}
		data.setInvalidDeviceModelList(invalidDeviceModelList);

		List<String> invalidDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceNameList.Length"); i++) {
			invalidDeviceNameList.add(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDeviceNameList["+ i +"]"));
		}
		data.setInvalidDeviceNameList(invalidDeviceNameList);

		List<InvalidDetailListItem> invalidDetailList = new ArrayList<InvalidDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckVehicleDeviceResponse.Data.InvalidDetailList.Length"); i++) {
			InvalidDetailListItem invalidDetailListItem = new InvalidDetailListItem();
			invalidDetailListItem.setErrorMsg(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].ErrorMsg"));
			invalidDetailListItem.setDeviceModel(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].DeviceModel"));
			invalidDetailListItem.setDeviceName(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].DeviceName"));
			invalidDetailListItem.setDeviceId(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].DeviceId"));
			invalidDetailListItem.setManufacturer(_ctx.stringValue("BatchCheckVehicleDeviceResponse.Data.InvalidDetailList["+ i +"].Manufacturer"));

			invalidDetailList.add(invalidDetailListItem);
		}
		data.setInvalidDetailList(invalidDetailList);
		batchCheckVehicleDeviceResponse.setData(data);
	 
	 	return batchCheckVehicleDeviceResponse;
	}
}