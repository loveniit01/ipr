package com.ipr.utils;

import com.ipr.form.MyDownloadFile;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.PrintWriter;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriteCsvToResponse {

	private static final Logger LOGGER = LoggerFactory.getLogger(WriteCsvToResponse.class);

	public static void writeData_M(PrintWriter writer, List<MyDownloadFile> downloadData) {

		try {

			ColumnPositionMappingStrategy mapStrategy = new ColumnPositionMappingStrategy();

			mapStrategy.setType(MyDownloadFile.class);
			mapStrategy.generateHeader();

			String[] columns = new String[] { "ID", "Link", "Domain Name","Project ID", "Project Name", "Project Type","Channel Name", "Account Name", "Project URL", "Note1", "Note2", "Note3", "User Name",
					"Upload Date","White List","Grey List" };
			mapStrategy.setColumnMapping(columns);

			StatefulBeanToCsv btcsv = new StatefulBeanToCsvBuilder(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.withMappingStrategy(mapStrategy).withSeparator(',').build();

			btcsv.write(downloadData);

		} catch (CsvException ex) {

			LOGGER.error("Error mapping Bean to CSV", ex);
		}
	}

	public static void writeData_S(PrintWriter writer, MyDownloadFile downloadData) {

		try {

			ColumnPositionMappingStrategy mapStrategy = new ColumnPositionMappingStrategy();

			mapStrategy.setType(MyDownloadFile.class);

			String[] columns = new String[] { "ID", "Link", "Domain Name", "Project Name", "Project Type",
					"Channel Name", "Account Name", "Project URL", "Note1", "Note2", "Note3", "User Name",
					"Upload Date" };
			mapStrategy.setColumnMapping(columns);

			StatefulBeanToCsv btcsv = new StatefulBeanToCsvBuilder(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.withMappingStrategy(mapStrategy).withSeparator(',').build();

			btcsv.write(downloadData);

		} catch (CsvException ex) {

			LOGGER.error("Error mapping Bean to CSV", ex);
		}
	}
}
