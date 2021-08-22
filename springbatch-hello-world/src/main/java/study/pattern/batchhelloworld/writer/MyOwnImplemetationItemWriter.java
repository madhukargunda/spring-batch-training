package study.pattern.batchhelloworld.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import study.pattern.batchhelloworld.model.Employe;

public class MyOwnImplemetationItemWriter implements ItemWriter<Employe> {

	@Override
	public void write(List<? extends Employe> items) throws Exception {
		System.out.println("Writer writing the data");
	}

}
