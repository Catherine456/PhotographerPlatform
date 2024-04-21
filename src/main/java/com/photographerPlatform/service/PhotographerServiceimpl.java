package com.photographerPlatform.service;

import com.photographerPlatform.mapper.PhotographerMapper;
import com.photographerPlatform.pojo.Photographer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service   // 交给spring管理
public class PhotographerServiceimpl implements  PhotographerService {
    @Autowired
    private PhotographerMapper photographerMapper;

    @Override
    public int registerPho(Photographer pho) {
        int row = photographerMapper.registerPho(pho);
        return row;
    }
}
