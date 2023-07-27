package com.test.lc;

import com.test.collector.CSVMetadataCollector;
import com.test.collector.MetadataCollector;
import com.test.collector.PDFMetadataCollector;
import com.test.export.CSVExport;
import com.test.export.ExportMetadata;
import com.test.export.PDFExport;
import com.test.fetch.FetchMetadata;
import com.test.fetch.JSONFetch;
import com.test.fetch.XMLFetch;

public class Program {
	
	public static void setMetadataCollector(MetadataCollector mdcollector,
			FetchMetadata fetchMetadata, 
			ExportMetadata exportMetadata) {
		mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
	}
	
	public static void collectMetadata(MetadataCollector mdcollector) {
		mdcollector.collectMetadata();
	}

	public static void print(MetadataCollector mdcollector) {
		mdcollector.print();
	}

	public static void main(String[] args) {
		FetchMetadata fetchMetadata1 = JSONFetch.getInstance();
		ExportMetadata exportMetadata1 = PDFExport.getInstance();
		
		MetadataCollector mdcollector1 = new PDFMetadataCollector();
		setMetadataCollector(mdcollector1, fetchMetadata1, exportMetadata1);
		collectMetadata(mdcollector1);
		print(mdcollector1);
		
		
		FetchMetadata fetchMetadata2 = XMLFetch.getInstance();
		ExportMetadata exportMetadata2 = CSVExport.getInstance();
		
		MetadataCollector mdcollector2 = new CSVMetadataCollector();
		setMetadataCollector(mdcollector2, fetchMetadata2, exportMetadata2);
		collectMetadata(mdcollector2);
		print(mdcollector2);
	}
}
