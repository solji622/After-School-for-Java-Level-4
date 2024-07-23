package review.abs;

import review.abs.camera.FactoryCam;
import review.abs.detector.AdvancedFireDetector;
import review.abs.detector.FireDetector;
import review.abs.reporter.NormalReporter;
import review.abs.reporter.VideoReporter;

public class ReviewInterface {
    public static void main(String[] args) {
        NormalReporter normalReporter = new NormalReporter();
        VideoReporter videoReporter = new VideoReporter();

        normalReporter.report();
        videoReporter.report();

        FireDetector fireDetector = new FireDetector();
        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();

        System.out.println("----------------------");
        fireDetector.detect();
        advancedFireDetector.detect();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        System.out.println("----------------------");
        factoryCam.detect();
        factoryCam.report();

    }
}