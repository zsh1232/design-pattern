package factory.simpleFactory;

/**
 * @Author shihai.zhang
 * @Time 2018/2/11
 * @Desc
 */
public class CircleShape implements Shape {

    public CircleShape() {
        System.out.println(  "CircleShape: created");
    }

    @Override
    public void draw() {
        System.out.println("draw: CircleShape");
    }
}
