package com.functionalinterfaces.dataexportfeature;

public class CSVExporter implements ReportExporter{

	@Override
	public void exportToCSV(String data)  {
		System.out.println("Exporting to CSV : " +data) ;
	}
	
	@Override
    public void exportToPDF(String data) {
        System.out.println("Exporting to PDF: " + data);
    }

	
}
