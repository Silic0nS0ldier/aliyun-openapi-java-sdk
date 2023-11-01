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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.Resource;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.Resource.CapacityUnit;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.Resource.Cpu;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.Resource.DiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.Resource.LogDiskSize;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.Resource.Memory;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceResponse.Instance.TenantCreatable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("DescribeInstanceResponse.Instance.InstanceName"));
		instance.setInstanceClass(_ctx.stringValue("DescribeInstanceResponse.Instance.InstanceClass"));
		instance.setSeries(_ctx.stringValue("DescribeInstanceResponse.Instance.Series"));
		instance.setPayType(_ctx.stringValue("DescribeInstanceResponse.Instance.PayType"));
		instance.setCreateTime(_ctx.stringValue("DescribeInstanceResponse.Instance.CreateTime"));
		instance.setExpireTime(_ctx.stringValue("DescribeInstanceResponse.Instance.ExpireTime"));
		instance.setVersion(_ctx.stringValue("DescribeInstanceResponse.Instance.Version"));
		instance.setDeployType(_ctx.stringValue("DescribeInstanceResponse.Instance.DeployType"));
		instance.setDeployMode(_ctx.stringValue("DescribeInstanceResponse.Instance.DeployMode"));
		instance.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Instance.DiskType"));
		instance.setMaintainTime(_ctx.stringValue("DescribeInstanceResponse.Instance.MaintainTime"));
		instance.setDataMergeTime(_ctx.stringValue("DescribeInstanceResponse.Instance.DataMergeTime"));
		instance.setAutoRenewal(_ctx.booleanValue("DescribeInstanceResponse.Instance.AutoRenewal"));
		instance.setIsTrustEcs(_ctx.booleanValue("DescribeInstanceResponse.Instance.IsTrustEcs"));
		instance.setStatus(_ctx.stringValue("DescribeInstanceResponse.Instance.Status"));
		instance.setAutoUpgradeObVersion(_ctx.booleanValue("DescribeInstanceResponse.Instance.AutoUpgradeObVersion"));
		instance.setObRpmVersion(_ctx.stringValue("DescribeInstanceResponse.Instance.ObRpmVersion"));
		instance.setIsLatestObVersion(_ctx.booleanValue("DescribeInstanceResponse.Instance.IsLatestObVersion"));
		instance.setEnableUpgradeLogDisk(_ctx.booleanValue("DescribeInstanceResponse.Instance.EnableUpgradeLogDisk"));
		instance.setInstanceRole(_ctx.stringValue("DescribeInstanceResponse.Instance.InstanceRole"));
		instance.setNodeNum(_ctx.stringValue("DescribeInstanceResponse.Instance.NodeNum"));
		instance.setReplicaMode(_ctx.stringValue("DescribeInstanceResponse.Instance.ReplicaMode"));
		instance.setIsolationOptimization(_ctx.booleanValue("DescribeInstanceResponse.Instance.IsolationOptimization"));
		instance.setEnableIsolationOptimization(_ctx.booleanValue("DescribeInstanceResponse.Instance.EnableIsolationOptimization"));
		instance.setInTempCapacityStatus(_ctx.booleanValue("DescribeInstanceResponse.Instance.InTempCapacityStatus"));
		instance.setDataDiskAutoScale(_ctx.booleanValue("DescribeInstanceResponse.Instance.DataDiskAutoScale"));
		instance.setEnableProxyService(_ctx.booleanValue("DescribeInstanceResponse.Instance.EnableProxyService"));
		instance.setProxyServiceStatus(_ctx.stringValue("DescribeInstanceResponse.Instance.ProxyServiceStatus"));
		instance.setProxyClusterId(_ctx.stringValue("DescribeInstanceResponse.Instance.ProxyClusterId"));
		instance.setCpuArchitecture(_ctx.stringValue("DescribeInstanceResponse.Instance.CpuArchitecture"));

		List<String> availableZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Instance.AvailableZones.Length"); i++) {
			availableZones.add(_ctx.stringValue("DescribeInstanceResponse.Instance.AvailableZones["+ i +"]"));
		}
		instance.setAvailableZones(availableZones);

		List<String> zones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Instance.Zones.Length"); i++) {
			zones.add(_ctx.stringValue("DescribeInstanceResponse.Instance.Zones["+ i +"]"));
		}
		instance.setZones(zones);

		Resource resource = new Resource();
		resource.setUnitCount(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.UnitCount"));

		Cpu cpu = new Cpu();
		cpu.setTotalCpu(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Cpu.TotalCpu"));
		cpu.setUsedCpu(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Cpu.UsedCpu"));
		cpu.setUnitCpu(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Cpu.UnitCpu"));
		cpu.setOriginalTotalCpu(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Cpu.OriginalTotalCpu"));
		resource.setCpu(cpu);

		Memory memory = new Memory();
		memory.setTotalMemory(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Memory.TotalMemory"));
		memory.setUsedMemory(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Memory.UsedMemory"));
		memory.setUnitMemory(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Memory.UnitMemory"));
		memory.setOriginalTotalMemory(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.Memory.OriginalTotalMemory"));
		resource.setMemory(memory);

		DiskSize diskSize = new DiskSize();
		diskSize.setTotalDiskSize(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.DiskSize.TotalDiskSize"));
		diskSize.setUsedDiskSize(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.DiskSize.UsedDiskSize"));
		diskSize.setUnitDiskSize(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.DiskSize.UnitDiskSize"));
		diskSize.setDataUsedSize(_ctx.doubleValue("DescribeInstanceResponse.Instance.Resource.DiskSize.DataUsedSize"));
		diskSize.setMaxDiskUsedPercent(_ctx.doubleValue("DescribeInstanceResponse.Instance.Resource.DiskSize.MaxDiskUsedPercent"));
		diskSize.setOriginalTotalDiskSize(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.DiskSize.OriginalTotalDiskSize"));
		diskSize.setMaxDiskSize(_ctx.doubleValue("DescribeInstanceResponse.Instance.Resource.DiskSize.MaxDiskSize"));

		List<String> maxDiskUsedObServer = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Instance.Resource.DiskSize.MaxDiskUsedObServer.Length"); i++) {
			maxDiskUsedObServer.add(_ctx.stringValue("DescribeInstanceResponse.Instance.Resource.DiskSize.MaxDiskUsedObServer["+ i +"]"));
		}
		diskSize.setMaxDiskUsedObServer(maxDiskUsedObServer);
		resource.setDiskSize(diskSize);

		LogDiskSize logDiskSize = new LogDiskSize();
		logDiskSize.setTotalDiskSize(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.LogDiskSize.TotalDiskSize"));
		logDiskSize.setUnitDiskSize(_ctx.longValue("DescribeInstanceResponse.Instance.Resource.LogDiskSize.UnitDiskSize"));
		logDiskSize.setLogAssignedSize(_ctx.stringValue("DescribeInstanceResponse.Instance.Resource.LogDiskSize.LogAssignedSize"));
		logDiskSize.setMaxLogAssignedPercent(_ctx.stringValue("DescribeInstanceResponse.Instance.Resource.LogDiskSize.MaxLogAssignedPercent"));

		List<String> maxLogAssignedObServer = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Instance.Resource.LogDiskSize.MaxLogAssignedObServer.Length"); i++) {
			maxLogAssignedObServer.add(_ctx.stringValue("DescribeInstanceResponse.Instance.Resource.LogDiskSize.MaxLogAssignedObServer["+ i +"]"));
		}
		logDiskSize.setMaxLogAssignedObServer(maxLogAssignedObServer);
		resource.setLogDiskSize(logDiskSize);

		CapacityUnit capacityUnit = new CapacityUnit();
		capacityUnit.setMaxCapacityUnit(_ctx.integerValue("DescribeInstanceResponse.Instance.Resource.CapacityUnit.MaxCapacityUnit"));
		capacityUnit.setMinCapacityUnit(_ctx.integerValue("DescribeInstanceResponse.Instance.Resource.CapacityUnit.MinCapacityUnit"));
		capacityUnit.setUsedCapacityUnit(_ctx.stringValue("DescribeInstanceResponse.Instance.Resource.CapacityUnit.UsedCapacityUnit"));
		resource.setCapacityUnit(capacityUnit);
		instance.setResource(resource);

		TenantCreatable tenantCreatable = new TenantCreatable();
		tenantCreatable.setEnableCreateTenant(_ctx.booleanValue("DescribeInstanceResponse.Instance.TenantCreatable.EnableCreateTenant"));
		tenantCreatable.setDisableCreateTenantReason(_ctx.stringValue("DescribeInstanceResponse.Instance.TenantCreatable.DisableCreateTenantReason"));
		instance.setTenantCreatable(tenantCreatable);

		DataDiskAutoScaleConfig dataDiskAutoScaleConfig = new DataDiskAutoScaleConfig();
		dataDiskAutoScaleConfig.setAutoScale(_ctx.booleanValue("DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig.AutoScale"));
		dataDiskAutoScaleConfig.setUpperbound(_ctx.longValue("DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig.Upperbound"));
		dataDiskAutoScaleConfig.setUpperThreshold(_ctx.longValue("DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig.UpperThreshold"));
		dataDiskAutoScaleConfig.setUpperMergeThreshold(_ctx.longValue("DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig.UpperMergeThreshold"));
		dataDiskAutoScaleConfig.setMaxDiskSize(_ctx.longValue("DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig.MaxDiskSize"));
		dataDiskAutoScaleConfig.setScaleStepInNormal(_ctx.longValue("DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig.ScaleStepInNormal"));
		dataDiskAutoScaleConfig.setScaleStepInMerge(_ctx.longValue("DescribeInstanceResponse.Instance.DataDiskAutoScaleConfig.ScaleStepInMerge"));
		instance.setDataDiskAutoScaleConfig(dataDiskAutoScaleConfig);
		describeInstanceResponse.setInstance(instance);
	 
	 	return describeInstanceResponse;
	}
}