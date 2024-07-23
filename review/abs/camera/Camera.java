package review.abs.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVided() {
        System.out.println("동영상을 녹화합니다");
    }

    public abstract void showMaininFeafure(); // -> 하위 클래스에서
}
