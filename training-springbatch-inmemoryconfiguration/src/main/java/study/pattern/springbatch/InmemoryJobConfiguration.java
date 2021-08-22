package study.pattern.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InmemoryJobConfiguration {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml",	"config/appcontext.xml");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("studentReportJob");

		try {

			JobParametersBuilder jobBuilder = new JobParametersBuilder();
			jobBuilder.addString("fileName", "employee_Report");
			jobBuilder.addString("fileDate", "StudentReport");
			JobParameters jobParameters = jobBuilder.toJobParameters();
			JobExecution execution = jobLauncher.run(job, jobParameters);
			System.out.println("Completion Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
			context.close();
		}

		System.out.println("Done");

	}

}
