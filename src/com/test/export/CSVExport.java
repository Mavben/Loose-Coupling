package com.test.export;

import java.io.File;
import java.util.List;

/**
 * 싱글톤 패턴 :
 *  객체지향 패턴 중 하나, 어떤 클래스가 오직 하나의 인스턴스만을 갖도록 보장하는 것
 *  객체의 생성과 소멸에 대한 오버헤드를 줄일 수 있다.
 */

public class CSVExport implements ExportMetadata{
	
	final String exportType = "CSV";
    // 정적 변수(instance)로 유일한 인스턴스 저장하는 변수 선언
	private static CSVExport instance = null;

    // 생성자(constructor) 호출
    // private -> 외부에서 직접 호출할 수 없다.
    private CSVExport() {
    }

    // 정적 메서드 getInstance 선언
    // 자체 클래스의 같은 인스턴스 반환
    public static CSVExport getInstance() {
        
        if (instance == null) {
            instance = new CSVExport();
        }
        return instance;
    }
	
	@Override
	public String getExportType() {
		return this.exportType;
	}
	
	@Override
	public File export(List<Object> metadata) {
		System.out.println("CSV Exporting data...");
        // Export Metadata
        File outputCSV = null;
        return outputCSV;
	}
}
