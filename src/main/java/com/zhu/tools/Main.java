package com.zhu.tools;

import java.util.Timer;

/**
 * @author zhukai
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		Timer timer = new Timer();;
		RestProcess rest = new RestProcess();
		rest.setVisible(true);
		ClickListener listener = new ClickListener();
		rest.addMouseListener(listener);
		RestTimerTask task = new RestTimerTask(rest);
		int time =3600*1000;
		timer.schedule(task, 0, time);
	}
}
