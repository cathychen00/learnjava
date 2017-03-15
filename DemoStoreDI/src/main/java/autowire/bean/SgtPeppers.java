package autowire.bean;
import org.springframework.stereotype.Component;
@Component
public class SgtPeppers implements CD {
    public void play() {
        System.out.println("SgtPeppers play...");
    }
}
