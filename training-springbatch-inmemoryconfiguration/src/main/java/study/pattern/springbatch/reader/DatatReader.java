package study.pattern.springbatch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import study.pattern.springbatch.dto.DataDto;


public class DatatReader implements ItemReader<DataDto> {

	@Override
	public DataDto read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("DataReader class");
		return new DataDto();
	}
}
