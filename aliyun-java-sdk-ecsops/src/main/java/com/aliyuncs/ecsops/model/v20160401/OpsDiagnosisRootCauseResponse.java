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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDiagnosisRootCauseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDiagnosisRootCauseResponse extends AcsResponse {

	private String status;

	private String taskId;

	private String requestId;

	private List<RootCause> rootCauses;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RootCause> getRootCauses() {
		return this.rootCauses;
	}

	public void setRootCauses(List<RootCause> rootCauses) {
		this.rootCauses = rootCauses;
	}

	public static class RootCause {

		private String srcExceptionName;

		private String dimension;

		private String rootCauseDesc;

		private String additionalInfo;

		private String relatedDetectId;

		private String featureName;

		private String targetId;

		private String exceptionTime;

		private String reason;

		private List<DerivationPath> derivationPaths;

		private List<FeatureData> featureDatas;

		private List<String> supportTeams;

		public String getSrcExceptionName() {
			return this.srcExceptionName;
		}

		public void setSrcExceptionName(String srcExceptionName) {
			this.srcExceptionName = srcExceptionName;
		}

		public String getDimension() {
			return this.dimension;
		}

		public void setDimension(String dimension) {
			this.dimension = dimension;
		}

		public String getRootCauseDesc() {
			return this.rootCauseDesc;
		}

		public void setRootCauseDesc(String rootCauseDesc) {
			this.rootCauseDesc = rootCauseDesc;
		}

		public String getAdditionalInfo() {
			return this.additionalInfo;
		}

		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}

		public String getRelatedDetectId() {
			return this.relatedDetectId;
		}

		public void setRelatedDetectId(String relatedDetectId) {
			this.relatedDetectId = relatedDetectId;
		}

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getExceptionTime() {
			return this.exceptionTime;
		}

		public void setExceptionTime(String exceptionTime) {
			this.exceptionTime = exceptionTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public List<DerivationPath> getDerivationPaths() {
			return this.derivationPaths;
		}

		public void setDerivationPaths(List<DerivationPath> derivationPaths) {
			this.derivationPaths = derivationPaths;
		}

		public List<FeatureData> getFeatureDatas() {
			return this.featureDatas;
		}

		public void setFeatureDatas(List<FeatureData> featureDatas) {
			this.featureDatas = featureDatas;
		}

		public List<String> getSupportTeams() {
			return this.supportTeams;
		}

		public void setSupportTeams(List<String> supportTeams) {
			this.supportTeams = supportTeams;
		}

		public static class DerivationPath {

			private Float coverage;

			private Float confidence;

			private List<DerivationEdgeModel> derivationEdgeModels;

			public Float getCoverage() {
				return this.coverage;
			}

			public void setCoverage(Float coverage) {
				this.coverage = coverage;
			}

			public Float getConfidence() {
				return this.confidence;
			}

			public void setConfidence(Float confidence) {
				this.confidence = confidence;
			}

			public List<DerivationEdgeModel> getDerivationEdgeModels() {
				return this.derivationEdgeModels;
			}

			public void setDerivationEdgeModels(List<DerivationEdgeModel> derivationEdgeModels) {
				this.derivationEdgeModels = derivationEdgeModels;
			}

			public static class DerivationEdgeModel {

				private Float logicalCorrelation;

				private String srcFeatureName;

				private Float correlationByHuman;

				private String dstFeatureName;

				public Float getLogicalCorrelation() {
					return this.logicalCorrelation;
				}

				public void setLogicalCorrelation(Float logicalCorrelation) {
					this.logicalCorrelation = logicalCorrelation;
				}

				public String getSrcFeatureName() {
					return this.srcFeatureName;
				}

				public void setSrcFeatureName(String srcFeatureName) {
					this.srcFeatureName = srcFeatureName;
				}

				public Float getCorrelationByHuman() {
					return this.correlationByHuman;
				}

				public void setCorrelationByHuman(Float correlationByHuman) {
					this.correlationByHuman = correlationByHuman;
				}

				public String getDstFeatureName() {
					return this.dstFeatureName;
				}

				public void setDstFeatureName(String dstFeatureName) {
					this.dstFeatureName = dstFeatureName;
				}
			}
		}

		public static class FeatureData {

			private Long lastMatchedTimestamp;

			private String extension;

			private Long firstMatchedTimestamp;

			private String featureName;

			private Integer matchedTimes;

			private String sourceData;

			public Long getLastMatchedTimestamp() {
				return this.lastMatchedTimestamp;
			}

			public void setLastMatchedTimestamp(Long lastMatchedTimestamp) {
				this.lastMatchedTimestamp = lastMatchedTimestamp;
			}

			public String getExtension() {
				return this.extension;
			}

			public void setExtension(String extension) {
				this.extension = extension;
			}

			public Long getFirstMatchedTimestamp() {
				return this.firstMatchedTimestamp;
			}

			public void setFirstMatchedTimestamp(Long firstMatchedTimestamp) {
				this.firstMatchedTimestamp = firstMatchedTimestamp;
			}

			public String getFeatureName() {
				return this.featureName;
			}

			public void setFeatureName(String featureName) {
				this.featureName = featureName;
			}

			public Integer getMatchedTimes() {
				return this.matchedTimes;
			}

			public void setMatchedTimes(Integer matchedTimes) {
				this.matchedTimes = matchedTimes;
			}

			public String getSourceData() {
				return this.sourceData;
			}

			public void setSourceData(String sourceData) {
				this.sourceData = sourceData;
			}
		}
	}

	@Override
	public OpsDiagnosisRootCauseResponse getInstance(UnmarshallerContext context) {
		return	OpsDiagnosisRootCauseResponseUnmarshaller.unmarshall(this, context);
	}
}
