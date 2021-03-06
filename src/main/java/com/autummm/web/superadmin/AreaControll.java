package com.autummm.web.superadmin;

import com.autummm.entity.Area;
import com.autummm.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/superadmin")
public class AreaControll {

    @Autowired
    private AreaService areaService;
    @RequestMapping(value = "/listArea",method = RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> listArea(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<Area> areaList = new ArrayList<Area>();
        try{
            areaList=areaService.getAreaList();
            modelMap.put("rows",areaList);
            modelMap.put("total",areaList.size());
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("error",e.toString());
        }

        return modelMap;
    }
}
