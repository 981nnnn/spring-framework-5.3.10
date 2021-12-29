package com.zhouyu.service;


import org.springframework.stereotype.Component;

/**
 * @author 周瑜
 */
@Component
public class UserService {

	public void test() {

		System.out.println("test");
	}

	private  OrderService orderService;

	public UserService(OrderService orderService){
		this.orderService = orderService;
		System.out.println(this.orderService);
		System.out.println("2");
		/**
		 * 先根据类型去找，如果找到一个，直接拿来用。如果找到多个，则根据名字查找，名字匹配就拿来用。如果找不到，就报错。
		 *
		 *
		 * 先根据OrderService 类型在容器中获取，找到了三个OrderService对象。 分别是orderService ，orderService2，orderService3
		 * 然后根据名字匹配，不会重复
		 * 如果根据名字 orderService123查询，找不到orderService的bean。如果此时容器只有一个OrderService对象，就会根据类型查找到一个bean，不会报错。
		 *
		 * com.zhouyu.service.OrderService@7b3300e5  1
		 * 2
		 * test
		 * com.zhouyu.service.OrderService@7b3300e5   1
		 * com.zhouyu.service.OrderService@5679c6c6
		 * com.zhouyu.service.OrderService@27ddd392
		 */
	}


}
