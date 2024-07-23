package review.abs.camera;

import review.abs.detector.Detectable;
import review.abs.reporter.Reportable;

public class SpeedCam extends Camera implements Reportable, Detectable {

    @Override
    public void showMaininFeafure() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void setDetector(Detectable detector){};

    public void setReporter(Reportable reporter){};

    @Override
    public void detect() {
        setDetector(this);
    }

    @Override
    public void report() {

    }
}
