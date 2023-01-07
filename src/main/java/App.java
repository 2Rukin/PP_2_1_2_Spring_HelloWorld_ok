import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = applicationContext.getBean("catBean",Cat.class);
        Cat cat2 = applicationContext.getBean("catBean",Cat.class);

        System.out.println(bean.getMessage());

        System.out.println("Сравнение HelloWorld по ссылке:"+ (bean==bean2) +"\n" +"Сравнение Cat по ссылке :" + (cat==cat2));
    }
}