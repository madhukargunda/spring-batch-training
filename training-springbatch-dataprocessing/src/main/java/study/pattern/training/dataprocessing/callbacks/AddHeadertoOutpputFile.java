package study.pattern.training.dataprocessing.callbacks;

import java.io.IOException;
import java.io.Writer;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

public class AddHeadertoOutpputFile implements FlatFileHeaderCallback {

	@Override
	public void writeHeader(Writer writer) throws IOException {
		writer.write("rollnumber,name,score,grade,results \n");
		writer.write("--------------------------------------------------------------------------------------\n");
		writer.write(" [Writer your Header here] \n" );
		writer.write("--------------------------------------------------------------------------------------\n");	}
}
