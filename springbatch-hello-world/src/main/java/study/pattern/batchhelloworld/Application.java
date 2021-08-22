package study.pattern.batchhelloworld;

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

public class Application {

	public static void main(String[] args) {
		System.out.println("Running the Spring Batch Hello World Program");
		
		//Step1 : Created the Application Context Container by reading the context file
		 ApplicationContext context = new ClassPathXmlApplicationContext("hello-world-context.xml");
		
		 
		 //Step2 :Get the JobLauncher and Job objects from the context
		 JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		 Job job = (Job) context.getBean("helloworld");
		 
		 
		 //Step3: Run the Job using JobLauncher Object
		 		
			 try {
				JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
				System.out.println("Batch Status : "+jobExecution.getStatus() + "   Exit status "+jobExecution.getExitStatus());
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
