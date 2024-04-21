package com.photographerPlatform.mapper;

import com.photographerPlatform.pojo.Photographer;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotographerMapper {
//    boolean login(Photographer pho);
    int registerPho(Photographer pho);
}
