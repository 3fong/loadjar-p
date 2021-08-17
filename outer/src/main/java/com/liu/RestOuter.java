package com.liu;

import com.liu.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
        String result = "";
        if (CollectionUtils.isEmpty(songs)){
            return "songs is null";
        }
        for (Song song : songs) {
            result += song.sing() +"/r/n";
            System.out.println("song: "+song.sing());
        }
        return result;
    }
}
