package com.imooc.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	@Override
	//��������
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext#attAdded#name:" + scae.getName() + "#value:"	+ scae.getValue());

	}

	@Override
	//�Ƴ�����
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext#attRemoved#name:" + scae.getName() + "#value:"	+ scae.getValue());

	}

	@Override
	//�滻����
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext#attReplaced#name:" + scae.getName() + "#value:"	+ scae.getValue());

	}

}
