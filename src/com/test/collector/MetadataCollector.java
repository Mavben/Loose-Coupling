//rep

// 메타데이터 수집기 클래스

package com.test.collector;

import com.test.export.ExportMetadata;
import com.test.fetch.FetchMetadata;

public interface MetadataCollector {
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata);
	public void collectMetadata();
	public void print();
}
