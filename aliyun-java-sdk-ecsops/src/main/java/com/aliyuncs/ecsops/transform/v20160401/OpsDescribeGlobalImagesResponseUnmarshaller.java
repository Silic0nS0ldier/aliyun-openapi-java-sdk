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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGlobalImagesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGlobalImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeGlobalImagesResponseUnmarshaller {

	public static OpsDescribeGlobalImagesResponse unmarshall(OpsDescribeGlobalImagesResponse opsDescribeGlobalImagesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeGlobalImagesResponse.setRequestId(_ctx.stringValue("OpsDescribeGlobalImagesResponse.RequestId"));
		opsDescribeGlobalImagesResponse.setTotalCount(_ctx.integerValue("OpsDescribeGlobalImagesResponse.TotalCount"));
		opsDescribeGlobalImagesResponse.setPageSize(_ctx.integerValue("OpsDescribeGlobalImagesResponse.PageSize"));
		opsDescribeGlobalImagesResponse.setPageNumber(_ctx.integerValue("OpsDescribeGlobalImagesResponse.PageNumber"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeGlobalImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setCreationTime(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].CreationTime"));
			image.setStatus(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].Status"));
			image.setDbId(_ctx.longValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].DbId"));
			image.setOsName(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].OsName"));
			image.setAliUid(_ctx.longValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].AliUid"));
			image.setVirtBaseImageId(_ctx.longValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].VirtBaseImageId"));
			image.setRegionId(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].RegionId"));
			image.setImageSize(_ctx.integerValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].ImageSize"));
			image.setDescription(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].Description"));
			image.setVersion(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].Version"));
			image.setOsType(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].OsType"));
			image.setImageName(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].ImageName"));
			image.setPlatform(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].Platform"));
			image.setImageCategory(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].ImageCategory"));
			image.setImageId(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].ImageId"));
			image.setModifyTime(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].ModifyTime"));
			image.setProductCode(_ctx.stringValue("OpsDescribeGlobalImagesResponse.Images["+ i +"].ProductCode"));

			images.add(image);
		}
		opsDescribeGlobalImagesResponse.setImages(images);
	 
	 	return opsDescribeGlobalImagesResponse;
	}
}