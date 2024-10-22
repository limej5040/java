package chap_12.clean;

public class CleanRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("-- 직원 청소 시작 (Runnable) --");
		for (int i = 0; i < 10; i+=2) {
			System.out.println("(직원)" + i +"번방 청소 중");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("-- 직원 청소 끝 (Runnable) --");
	}		
}
