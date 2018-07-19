package com.xihuanyuye;

import java.util.Date;

import org.apache.commons.lang3.time.FastDateFormat;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling // 该注解必须要加
public class ScheduleJobs_fixedRate {

	public final static long SECOND = 1 * 1000;
	FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

	@Scheduled(cron = "0/4 * * * * ?")
	public void cronJob() {
		System.out.println("[CronJob Execute]" + fdf.format(new Date()));
	}
}
