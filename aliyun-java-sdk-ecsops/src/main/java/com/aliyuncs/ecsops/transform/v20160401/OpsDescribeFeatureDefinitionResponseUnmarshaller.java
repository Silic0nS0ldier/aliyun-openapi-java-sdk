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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeatureDefinitionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeatureDefinitionResponse.FeatureDefinition;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFeatureDefinitionResponseUnmarshaller {

	public static OpsDescribeFeatureDefinitionResponse unmarshall(OpsDescribeFeatureDefinitionResponse opsDescribeFeatureDefinitionResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFeatureDefinitionResponse.setRequestId(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.RequestId"));
		opsDescribeFeatureDefinitionResponse.setTotalCount(_ctx.integerValue("OpsDescribeFeatureDefinitionResponse.TotalCount"));
		opsDescribeFeatureDefinitionResponse.setPageSize(_ctx.integerValue("OpsDescribeFeatureDefinitionResponse.PageSize"));
		opsDescribeFeatureDefinitionResponse.setPage(_ctx.integerValue("OpsDescribeFeatureDefinitionResponse.Page"));
		opsDescribeFeatureDefinitionResponse.setCount(_ctx.integerValue("OpsDescribeFeatureDefinitionResponse.Count"));

		List<FeatureDefinition> featureDefinitions = new ArrayList<FeatureDefinition>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions.Length"); i++) {
			FeatureDefinition featureDefinition = new FeatureDefinition();
			featureDefinition.setDetailDocId(_ctx.longValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].DetailDocId"));
			featureDefinition.setValidTimeRange(_ctx.longValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].ValidTimeRange"));
			featureDefinition.setCreateUserName(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].CreateUserName"));
			featureDefinition.setFeatureType(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].FeatureType"));
			featureDefinition.setGmtModified(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].GmtModified"));
			featureDefinition.setSupportTeams(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].SupportTeams"));
			featureDefinition.setExecRule(_ctx.booleanValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].ExecRule"));
			featureDefinition.setSeverityLevel(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].SeverityLevel"));
			featureDefinition.setFeatureName(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].FeatureName"));
			featureDefinition.setGmtCreate(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].GmtCreate"));
			featureDefinition.setFeatureTargetType(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].FeatureTargetType"));
			featureDefinition.setDeleted(_ctx.booleanValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].Deleted"));
			featureDefinition.setLastModifiedUserName(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].LastModifiedUserName"));
			featureDefinition.setExtractionId(_ctx.longValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].ExtractionId"));
			featureDefinition.setReason(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].Reason"));
			featureDefinition.setShortDesc(_ctx.stringValue("OpsDescribeFeatureDefinitionResponse.FeatureDefinitions["+ i +"].ShortDesc"));

			featureDefinitions.add(featureDefinition);
		}
		opsDescribeFeatureDefinitionResponse.setFeatureDefinitions(featureDefinitions);
	 
	 	return opsDescribeFeatureDefinitionResponse;
	}
}