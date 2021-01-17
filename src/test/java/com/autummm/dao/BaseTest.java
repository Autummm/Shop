package com.autummm.dao;

import com.autummm.entity.Area;
import com.autummm.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList=areaService.getAreaList();
        assertEquals("西苑",areaList.get(0).getAreaName());
    }
}
