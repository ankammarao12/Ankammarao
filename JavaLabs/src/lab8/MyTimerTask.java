package lab8;

import java.util.Date;

public class MyTimerTask implements Runnable {

	public void run() {
		System.out.println("Timer task started at:" + new Date());
		completeTask();
		System.out.println("Timer task finished at:" + new Date());
	}

	private void completeTask() {
		try {
			                        // assuming it takes 10 secs to complete the task
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {

		MyTimerTask timerTask = new MyTimerTask();
		Thread t1 = new Thread(timerTask);

		t1.start();

	}

}
