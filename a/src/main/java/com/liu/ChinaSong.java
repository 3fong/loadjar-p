package com.liu;

import org.springframework.stereotype.Service;

/**
 * @author liulei
 * @Description
 * @create 2021/8/16 21:37
 */
@Service
public class ChinaSong implements Song {
    @Override
    public String sing() {
        return "china";
    }
}
