package com.liulang.struts2.helloWord;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterDispatcher
 */
public class FilterDispatcher implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//���ӿ�ǿתΪ�ӽӿ�
		HttpServletRequest req = (HttpServletRequest) request;
		request.setCharacterEncoding("utf-8");
		//��ȡ����·��
		String servletPath = req.getServletPath();
		String path = null;
		
		if("/product-input.action".equals(servletPath)) {
			path = "/WEB-INF/pages/input.jsp";
		}
		
		if("/product-save.action".equals(servletPath)) {
			//1����ȡ�������
			String productName = request.getParameter("productName")==null?"":request.getParameter("productName");
			String productDesc = request.getParameter("productDesc")==null?"":request.getParameter("productDesc");
			String productPrice = request.getParameter("productPrice")==null?"":request.getParameter("productPrice");
			//2�������������װΪ��������
			Product product = new Product(null, productName, productDesc, Double.parseDouble(productPrice));
			//3��ִ�б������
			System.out.println("save product:" + product);
			product.setProductId(666);
			request.setAttribute("product", product);
			path = "/WEB-INF/pages/details.jsp";
		}
		
		if(path != null) {
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
