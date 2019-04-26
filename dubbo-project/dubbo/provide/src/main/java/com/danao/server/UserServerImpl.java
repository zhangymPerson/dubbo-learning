package com.danao.server;

import com.danao.bean.User;

/**
 * @author zhang
 * @version 1.0
 * @classname UserServer
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/18
 * @since 1.0
 */
//todo dubbo服务注解 与配置文件的内容呼应 注解的是实现类 可以 添加 版本号
//@Service(version = "1.0.1")
public class UserServerImpl implements UserServer {
	@Override
	public User getUser() {
		User user = new User(1,"test",23,"test");
		return user;
	}

	@Override
	public String getName() {
		return "Test Name";
	}
}
