package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
	public static void main(String[] args) {
		// 인터페이스
		// 단일상속 (extends)
		
		NormalReporter normalReporter = new NormalReporter();
		normalReporter.report();
		
		VideoReporter videoReporter = new VideoReporter();
		videoReporter.report();
		
		System.out.println("-------------------------------");
		
		Detectable fireDetectable = new FireDetector();
		fireDetectable.detect();
		
		Detectable advanceDetectable = new AdvancedFireDetector();
		advanceDetectable.detect();
		
		System.out.println("-------------------------------");
		
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.setDetector(advanceDetectable);
		factoryCam.setReporter(videoReporter);
		
		factoryCam.detect();
		factoryCam.report();
		
		
	}

}
