package com.imooc.listener;
/**
 * 全局对象监听器
 * @author lcs
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyFirstListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context destroyed... ...");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context initialized... ...");

	}

}
