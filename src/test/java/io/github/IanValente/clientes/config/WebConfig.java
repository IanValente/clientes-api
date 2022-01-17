package io.github.IanValente.clientes.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
 
import java.util.Arrays;
import java.util.List;

@Configuration
public class WebConfig {

	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilterFilterRegistrationBean() {
		List<String> all = Arrays.asList("*");
		
		CorsConfiguration corsconfiguration = new CorsConfiguration();
		corsconfiguration.setAllowedOriginPatterns(all);
		corsconfiguration.setAllowedHeaders(all);
		corsconfiguration.setAllowedMethods(all);
		corsconfiguration.setAllowCredentials(false);

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsconfiguration);
		
		CorsFilter corsFilter = new CorsFilter(source);
		FilterRegistrationBean<CorsFilter> filter = new FilterRegistrationBean<>(corsFilter);
		filter.setOrder(Ordered.HIGHEST_PRECEDENCE);
		
		return filter;

	}

}
