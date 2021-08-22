package study.pattern.training.dataprocessing.callbacks;

import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

import org.springframework.batch.item.file.FlatFileFooterCallback;

public class AddFootertoOutputFile implements FlatFileFooterCallback {

	@Override
	public void writeFooter(Writer writer) throws IOException {
	  
		writer.write("--------------------------------------------------------------------------------------\n");
		writer.write(" Writing Completed \n");
		writer.write("--------------------------------------------------------------------------------------\n");
	

	}

}
