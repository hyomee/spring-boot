package co.kr.abacus.spring.filterInterception.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Order(0)
@Component
public class SomeFilter extends OncePerRequestFilter{
	
	Logger logger = LoggerFactory.getLogger(SomeFilter.class);
	
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		logger.info("***** org.springframework.web.filter.OncePerRequestFilter *****");
		chain.doFilter(request, response);		
	}
	
	@Override
	public void destroy() {
		 logger.info("===== org.springframework.web.filter.OncePerRequestFilter filter destory =====");
	}

}
