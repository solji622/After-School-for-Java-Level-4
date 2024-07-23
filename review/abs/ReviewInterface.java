package review.abs;

import review.abs.camera.FactoryCam;
import review.abs.detector.AdvancedFireDetector;
import review.abs.reporter.NormalReporter;
import review.abs.reporter.VideoReporter;

public class ReviewInterface {
    public static void main(String[] args) {
        NormalReporter normalReporter = new NormalReporter();
        VideoReporter videoReporter = new VideoReporter();

        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
