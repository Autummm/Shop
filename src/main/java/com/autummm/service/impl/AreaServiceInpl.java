package com.autummm.service.impl;

import com.autummm.dao.AreaDao;
import com.autummm.entity.Area;
import com.autummm.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceInpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
