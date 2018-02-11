package factory;

import factory.simpleFactory.Shape;
import factory.simpleFactory.ShapeFactory;

/**
 * @Author shihai.zhang
 * @Time 2018/2/11
 * @Desc
 */
public class SimpleClient {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("rect");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("triangle");
        shape3.draw();
    }
}
