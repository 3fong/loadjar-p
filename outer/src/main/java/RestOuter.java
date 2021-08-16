import com.liu.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liulei
 * @Description
 * @create 2021/8/16 21:39
 */
@RestController
public class RestOuter {
    @Autowired
    private List<Song> songs;

    @GetMapping("song")
    public String outer() {
        return songs.toString();
    }
}
