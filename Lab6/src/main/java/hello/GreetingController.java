package hello;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private static final String templateAge = "Hey, you're only %d !";
    private static final String templateTrue = "it's %s";
    private static final String templateEx = "Yea %d... I doubt it. ";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
            CountService countService;
    @RequestMapping("/bye")
// pkt 1.
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, countService.count(name)));
    }
    @RequestMapping(path="/age", method = GET)
// pkt 3. Przykład: http://localhost:8080/age?age=23
    public Greeting greetingAge(@RequestParam(value = "age", defaultValue = "\0") String wiek) {
       int liczba=countService.age(wiek);
       if(liczba>0&&liczba<130) return new Greeting(counter.incrementAndGet(),String.format(templateAge, liczba));
       else return new Greeting(counter.incrementAndGet(),String.format(templateEx,liczba));
    }
    //pkt 4. Przykład: http://localhost:8080/pkt4?name=Ola&age=21
    @RequestMapping(path="/pkt4", method = GET)
    public Greeting2 greeting2Parametry(@RequestParam(value = "name", defaultValue = "\0") String name,@RequestParam(value = "age", defaultValue = "\0") String age) {
        int liczba=countService.age(age);
        if(liczba>0&&liczba<130)return new Greeting2(counter.incrementAndGet(),String.format(template, countService.show(name)),String.format(templateAge,liczba));
        else return new Greeting2(counter.incrementAndGet(),String.format(template, countService.show(name)),String.format(templateEx,liczba));
    }
    @RequestMapping(path="/woMan", method = GET)
// pkt 5. Przykład  : http://localhost:8080/woMan?name=Ola
    public Greeting greetingWoman(@RequestParam(value = "name", defaultValue = "\0") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, countService.woMan(name)));
    }
    @RequestMapping(path="/seria", method = GET)
// pkt 6. Przykład (ścieżka poprawna) : http://localhost:8080/seria?seria=efg
public Greeting greetingSeria(@RequestParam(value = "seria", defaultValue = "\0") String seria) {
    return new Greeting(counter.incrementAndGet(),String.format(templateTrue, countService.ciag(seria)));
}
}
























