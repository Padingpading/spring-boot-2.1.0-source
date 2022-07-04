package sample.tomcat.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author libin
 * @description
 * @date 2022/7/4
 */
@Configuration
@ConditionalOnClass(ReportOperation.class)
@EnableConfigurationProperties(ReportProperties.class)
public class ReportAutoConfiguration {
	@Bean
	public ReportOperation reportOperation(ReportProperties reportProperties){
		ReportOperation reportOperation = new ReportOperation(reportProperties.getMsg());
		return  reportOperation;
	}
}