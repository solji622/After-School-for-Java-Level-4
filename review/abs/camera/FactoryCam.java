package review.abs.camera;

import review.abs.detector.Detectable;
import review.abs.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable{
    public Detectable detectable;
    public Reportable reportable;


    @Override
    public void showMaininFeafure() {
        System.out.println("화재 감지");
    }

    public void setDetector(Detectable detector){
        this.detectable = detector;
    }
    @Override
    public void detect() {
        detectable.detect();
    }

    public void setReporter(Reportable reporter){
        this.reportable = reporter;
    }
    @Override
    public void report() {
        reportable.report();
    }

}