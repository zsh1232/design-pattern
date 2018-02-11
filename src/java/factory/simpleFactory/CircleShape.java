package factory.simpleFactory;

/**
 * @Author shihai.zhang
 * @Time 2018/2/11
 * @Desc
 */
public class CircleShape implements Shape {

    public CircleShape() {
        System.out.println(  "factory.simpleFactory.CircleShape: created");
    }

    @Override
    public void draw() {
        System.out.println("draw: factory.simpleFactory.CircleShape");
    }
}
