package com.boa.kyc.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KYCFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest =(HttpServletRequest)request;
		HttpServletResponse httpResponse =(HttpServletResponse)response;
				System.out.println("Remote hostis: "+request.getRemoteAddr());
				if (request.getRemoteHost().equals("192.168.1.28"))
				throw new RuntimeException("Not Authenticated");
				chain.doFilter(httpRequest,httpResponse);
	}

}
