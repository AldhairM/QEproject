package SimileTools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadExcel {

	static List<String> data = new LinkedList<String>();

	public static void main(String[] args) {

	}

	@SuppressWarnings("deprecation")
	public List<String> loadData(String path) {
		try {
			FileInputStream excelFile = new FileInputStream(new File(path));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator iterator = datatypeSheet.iterator();

			while (iterator.hasNext()) {
				Row currentRow = (Row) iterator.next();
				Iterator cellIterator = currentRow.iterator();

				while (cellIterator.hasNext()) {
					Cell currentCell = (Cell) cellIterator.next();
					if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                    	double data0= currentCell.getNumericCellValue();
                        data.add(""+data0);
                    }else if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
                    	String data0= currentCell.getStringCellValue();
                        data.add(data0);
                    }
				}
			}
		} catch (FileNotFoundException var8) {
			var8.printStackTrace();
		} catch (IOException var9) {
			var9.printStackTrace();
		}
		return this.data;
	}
}


