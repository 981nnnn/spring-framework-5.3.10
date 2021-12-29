package com.zhouyu;

import com.zhouyu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();

		/**
		 * AppConfig中配置了两个，orderService 加了Component注解。所以容器中有三个orderService
		 * com.zhouyu.service.OrderService@77afea7d
		 * com.zhouyu.service.OrderService@161cd475
		 * com.zhouyu.service.OrderService@532760d8
		 */
		System.out.println(applicationContext.getBean("orderService"));
		System.out.println(applicationContext.getBean("orderService1"));
		System.out.println(applicationContext.getBean("orderService2"));

	}
}
