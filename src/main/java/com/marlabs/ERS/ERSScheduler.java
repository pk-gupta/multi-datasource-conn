package com.marlabs.ERS;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ERSScheduler {
	@Autowired
    private SchedulerRepository schedulerRepo;
	@Autowired
    private SchedulerService schedulerService;
	@Autowired
	private MailConfig mailConfig;
	private static final Logger LOG = LoggerFactory.getLogger(ERSScheduler.class); 
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
    
    @Scheduled(cron = "${scheduling.job.cron}")
	public void scheduler() {		
		try{
			LOG.info("In ERSScheduler method : The time is now {}", dateFormat.format(new Date()));
			schedulerService.updateDepartments();
			schedulerService.updateProjects();
			schedulerService.updateEmployees();
			schedulerService.updateEmployeeProjects();
			LOG.info("Out ERSScheduler method : The time is now {}", dateFormat.format(new Date()));
			String body = "ERS Scheduler successfully updated on : " + dateFormat.format(new Date());
			mailConfig.send(body);
		}catch(Exception e){
			LOG.error("Exception in ERSScheduler() method ------- ",e);
			String body = "Exception in saveEmployeeProject() method" + e;
			try {
				mailConfig.send(body);
			} catch (MessagingException me) {
				LOG.error("Exception in ERSScheduler() method ------- ",me);
			}
		}
		
    }
}
