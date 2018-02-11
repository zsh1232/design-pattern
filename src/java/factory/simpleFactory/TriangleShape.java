package factory.simpleFactory;

/**
 * @Author shihai.zhang
 * @Time 2018/2/11
 * @Desc
 */
public class TriangleShape implements Shape{
    public TriangleShape() {
        System.out.println(  "TriangleShape: created");
    }

    @Override
    public void draw() {
        System.out.println(  "draw: TriangleShape");
    }
}
