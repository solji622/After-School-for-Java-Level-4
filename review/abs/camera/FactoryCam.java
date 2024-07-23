package review.abs.camera;

import review.abs.detector.Detectable;
import review.abs.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable{

    @Override
    public void showMaininFeafure() {
        System.out.println("화재 감지");
    }

    public void setDetector(Detectable detector){
        detector = new FactoryCam();
        detector.detect();
    }
    @Override
    public void detect() {

    }

    public void setReporter(Reportable reporter){
        reporter = new FactoryCam();
        reporter.report();
    }
    @Override
    public void report() {

    }
}
