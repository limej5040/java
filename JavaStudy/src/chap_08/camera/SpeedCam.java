package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable{
	private Detectable detector;
	private Reportable reporter;
	
	
	
	public Detectable getDetector() {
		return detector;
	}

	public void setDetector(Detectable detector) {
		this.detector = detector;
	}

	public Reportable getReporter() {
		return reporter;
	}

	public void setReporter(Reportable reporter) {
		this.reporter = reporter;
	}
	
	

	@Override
	public void showMainFeature() {
		System.out.println("속도 측정, 번호 인식");
		
	}

	@Override
	public void report() {
		reporter.report();
		
	}

	@Override
	public void detect() {
		detector.detect();
		
	}
}
