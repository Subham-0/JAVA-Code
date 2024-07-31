abstract class Car {
    public abstract void autodrive();

    public abstract void Camera();

    public void playmusic() {
        System.out.println("it  can play music");
    }

}

abstract class Audi extends Car {
    public void Camera() {
        System.out.println("it can record video of driving");

    }
}

class UpdatedAudi extends Audi {
    public void autodrive() {
        System.out.println("it can drive autometically");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car m1 = new UpdatedAudi();
        m1.Camera();
        m1.autodrive();
        m1.playmusic();

    };
}
