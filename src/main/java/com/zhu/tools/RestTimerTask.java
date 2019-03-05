package com.zhu.tools;

import java.util.TimerTask;

/**
 * @author zhukai
 * 
 */
public class RestTimerTask  extends TimerTask{
	private RestProcess instance; 
	
	/**
	 * 
	 */
	public RestTimerTask(RestProcess instance ) {
		this.instance = instance;
	}
	@Override
	public void run() {
		instance.setVisible(true);
	}

}
