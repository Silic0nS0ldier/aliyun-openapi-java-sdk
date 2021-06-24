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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSnapshotsResponseUnmarshaller {

	public static OpsDescribeSnapshotsResponse unmarshall(OpsDescribeSnapshotsResponse opsDescribeSnapshotsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSnapshotsResponse.setRequestId(_ctx.stringValue("OpsDescribeSnapshotsResponse.RequestId"));
		opsDescribeSnapshotsResponse.setTotalCount(_ctx.integerValue("OpsDescribeSnapshotsResponse.TotalCount"));
		opsDescribeSnapshotsResponse.setPageSize(_ctx.integerValue("OpsDescribeSnapshotsResponse.PageSize"));
		opsDescribeSnapshotsResponse.setPageNumber(_ctx.integerValue("OpsDescribeSnapshotsResponse.PageNumber"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setProgress(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].Progress"));
			snapshot.setInstantAccess(_ctx.booleanValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].InstantAccess"));
			snapshot.setSourceDiskSize(_ctx.integerValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskSize"));
			snapshot.setRetentionDays(_ctx.integerValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].RetentionDays"));
			snapshot.setSourceDiskType(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskType"));
			snapshot.setBid(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].Bid"));
			snapshot.setRegionId(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].RegionId"));
			snapshot.setEncrypted(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].Encrypted"));
			snapshot.setSourceDiskId(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].SourceDiskId"));
			snapshot.setSnapshotType(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotType"));
			snapshot.setEcsSnapshotStatus(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].EcsSnapshotStatus"));
			snapshot.setSnapshotName(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setResourceOwnerId(_ctx.longValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].ResourceOwnerId"));
			snapshot.setModifiedTime(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].ModifiedTime"));
			snapshot.setDescription(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].Description"));
			snapshot.setSnapshotId(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setIaRetentionDays(_ctx.integerValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].IaRetentionDays"));
			snapshot.setImageId(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].ImageId"));
			snapshot.setCreatedTime(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].CreatedTime"));
			snapshot.setHouyiSnapshotId(_ctx.stringValue("OpsDescribeSnapshotsResponse.Snapshots["+ i +"].HouyiSnapshotId"));

			snapshots.add(snapshot);
		}
		opsDescribeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return opsDescribeSnapshotsResponse;
	}
}