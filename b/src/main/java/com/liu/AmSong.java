package com.liu;

import com.liu.Song;
import org.springframework.stereotype.Service;

/**
 * @author liulei
 * @Description
 * @create 2021/8/16 21:37
 */
@Service
public class AmSong implements Song {
    @Override
    public String sing() {
        return "american";
    }
}
