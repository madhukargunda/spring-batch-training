package study.pattern.batchjobrepository;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBatchDatabaseJobRepository {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"student-data-processing-dbrepository-context.xml");
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job studnetDataProessing = (Job) context.getBean("student-data-processing");

		// Step3: Run the Job using JobLauncher Object

		try {
			JobExecution jobExecution = jobLauncher.run(studnetDataProessing, new JobParameters());
			System.out.println(
					"Batch Status : " + jobExecution.getStatus() + "   Exit status " + jobExecution.getExitStatus());
		} catch (JobExecutionAlreadyRunningException e) {
			e.printStackTrace();
		} catch (JobRestartException e) {
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			e.printStackTrace();
		}
		
		System.out.println("Job Execution Completed successfully");
	}
}
