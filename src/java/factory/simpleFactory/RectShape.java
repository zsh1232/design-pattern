package factory.simpleFactory;

/**
 * @Author shihai.zhang
 * @Time 2018/2/11
 * @Desc
 */
public class RectShape implements Shape {
    public RectShape() {
        System.out.println(  "factory.simpleFactory.RectShape: created");
    }

    @Override
    public void draw() {
        System.out.println(  "draw: factory.simpleFactory.RectShape");
    }
}
