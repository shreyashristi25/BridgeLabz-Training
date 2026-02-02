package com.functionalinterfaces.dataexportfeature;

public interface ReportExporter {

	void exportToCSV(String data) ;
	void exportToPDF(String data) ;
	
	default void exportToJSON(String data) {
		System.out.println("JSON export not supported by this exporter.") ;
	}
}
