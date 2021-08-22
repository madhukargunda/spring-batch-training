package study.pattern.batchhelloworld.processor;

import org.springframework.batch.item.ItemProcessor;

import study.pattern.batchhelloworld.model.Employe;

public class MyOwnImplementationItemProcessor implements ItemProcessor<String, Employe> {

	@Override
	public Employe process(String employeName) throws Exception {
		
		System.out.println("The Processor processing the data ");
		
		Employe employe = new Employe();
		employe.setName(employeName);
	
		return employe;
	}

}
