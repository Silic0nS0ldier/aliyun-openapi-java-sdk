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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse.Service;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse.Service.Commodity;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse.Service.ServiceInfo;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServicesResponse.Service.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicesResponseUnmarshaller {

	public static ListServicesResponse unmarshall(ListServicesResponse listServicesResponse, UnmarshallerContext _ctx) {
		
		listServicesResponse.setRequestId(_ctx.stringValue("ListServicesResponse.RequestId"));
		listServicesResponse.setNextToken(_ctx.stringValue("ListServicesResponse.NextToken"));
		listServicesResponse.setTotalCount(_ctx.integerValue("ListServicesResponse.TotalCount"));
		listServicesResponse.setMaxResults(_ctx.integerValue("ListServicesResponse.MaxResults"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListServicesResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setStatus(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Status"));
			service.setDefaultVersion(_ctx.booleanValue("ListServicesResponse.Services["+ i +"].DefaultVersion"));
			service.setPublishTime(_ctx.stringValue("ListServicesResponse.Services["+ i +"].PublishTime"));
			service.setVersion(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Version"));
			service.setDeployType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].DeployType"));
			service.setServiceId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceId"));
			service.setSupplierUrl(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SupplierUrl"));
			service.setServiceType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceType"));
			service.setSupplierName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SupplierName"));
			service.setCommodityCode(_ctx.stringValue("ListServicesResponse.Services["+ i +"].CommodityCode"));
			service.setCreateTime(_ctx.stringValue("ListServicesResponse.Services["+ i +"].CreateTime"));
			service.setUpdateTime(_ctx.stringValue("ListServicesResponse.Services["+ i +"].UpdateTime"));
			service.setShareType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ShareType"));
			service.setApprovalType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ApprovalType"));
			service.setVersionName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].VersionName"));
			service.setArtifactId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ArtifactId"));
			service.setArtifactVersion(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ArtifactVersion"));
			service.setSourceImage(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SourceImage"));
			service.setRelationType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].RelationType"));
			service.setTrialType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].TrialType"));
			service.setTenantType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].TenantType"));
			service.setResourceGroupId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ResourceGroupId"));
			service.setSourceServiceId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SourceServiceId"));
			service.setSourceServiceVersion(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SourceServiceVersion"));
			service.setSourceSupplierName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].SourceSupplierName"));
			service.setResellServiceId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ResellServiceId"));
			service.setLatestResellSourceServiceVersion(_ctx.stringValue("ListServicesResponse.Services["+ i +"].LatestResellSourceServiceVersion"));
			service.setResellApplyStatus(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ResellApplyStatus"));
			service.setVirtualInternetService(_ctx.stringValue("ListServicesResponse.Services["+ i +"].VirtualInternetService"));
			service.setCategories(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Categories"));
			service.setServiceDiscoverable(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceDiscoverable"));
			service.setHasDraft(_ctx.booleanValue("ListServicesResponse.Services["+ i +"].HasDraft"));
			service.setHasBeta(_ctx.booleanValue("ListServicesResponse.Services["+ i +"].HasBeta"));
			service.setBuildInfo(_ctx.stringValue("ListServicesResponse.Services["+ i +"].BuildInfo"));

			Commodity commodity = new Commodity();
			commodity.setCommodityCode(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Commodity.CommodityCode"));
			commodity.setType(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Commodity.Type"));
			commodity.setSaasBoostMetadata(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Commodity.SaasBoostMetadata"));
			service.setCommodity(commodity);

			List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListServicesResponse.Services["+ i +"].ServiceInfos.Length"); j++) {
				ServiceInfo serviceInfo = new ServiceInfo();
				serviceInfo.setLocale(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Locale"));
				serviceInfo.setImage(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Image"));
				serviceInfo.setName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].Name"));
				serviceInfo.setShortDescription(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceInfos["+ j +"].ShortDescription"));

				serviceInfos.add(serviceInfo);
			}
			service.setServiceInfos(serviceInfos);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListServicesResponse.Services["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			service.setTags(tags);

			services.add(service);
		}
		listServicesResponse.setServices(services);
	 
	 	return listServicesResponse;
	}
}