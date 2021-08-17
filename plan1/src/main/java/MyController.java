import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liulei
 * @Description
 * @create 2021/8/16 21:23
 */
@RestController
public class MyController {
//    @Autowired
//    private

    @GetMapping("/a")
    public String say(){
        return null;
    }
}
