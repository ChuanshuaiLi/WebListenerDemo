package com.imooc.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	@Override
	//增加属性
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext#attAdded#name:" + scae.getName() + "#value:"	+ scae.getValue());

	}

	@Override
	//移除属性
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext#attRemoved#name:" + scae.getName() + "#value:"	+ scae.getValue());

	}

	@Override
	//替换属性
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext#attReplaced#name:" + scae.getName() + "#value:"	+ scae.getValue());

	}

}
