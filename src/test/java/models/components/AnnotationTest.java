package models.components;

import java.lang.reflect.Constructor;

public class AnnotationTest {
    public<T> void getComponentSelector(Class<T> componentClass){
        Class<?>[] params=new Class[]{};
        try {
            Constructor<?> constructor=componentClass.getConstructor(params);
            String cssSelector=componentClass.getAnnotation(ComponentCssSelector.class).value();
            System.out.println("sccSelector: "+cssSelector);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new AnnotationTest().getComponentSelector(HeaderComponent.class);
    }
}
