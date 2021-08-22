package study.pattern.batchhelloworld.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class MyOwnImplementationItemReader implements ItemReader<String> {
	
	
	private int index=0;

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
	
		System.out.println("In reader reading the data");
		if(index==0) {
			++index;
			return "Hello world";
		} else
			return null;
	}
}
