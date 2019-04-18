package com.danao;

import org.apache.zookeeper.server.ServerConfig;
import org.apache.zookeeper.server.ZooKeeperServerMain;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.util.ErrorHandler;
import org.springframework.util.SocketUtils;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.UUID;

/**
 * @author zhang
 * @version 1.0
 * @classname EmbeddedZooKeeper
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/18
 * @since 1.0
 */
//这个类是和zookeeper交互的，也是必须有
public class EmbeddedZooKeeper implements SmartLifecycle {

	Logger logger = LoggerFactory.getLogger(EmbeddedZooKeeper.class);
	@Override
	public boolean isAutoStartup() {
		return false;
	}

	@Override
	public void stop(Runnable runnable) {

	}

	@Override
	public void start() {
		System.out.println("回调测试");
		logger.debug("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public int getPhase() {
		return 0;
	}
}
