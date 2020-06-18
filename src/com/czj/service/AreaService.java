package com.czj.service;

import com.czj.dao.AreaDao;
import com.czj.entity.Area;
import com.czj.entity.User;

import java.util.List;

public class AreaService {
    private AreaDao areaDao=new AreaDao();

    //查询省
    public List<Area> list() {
        return areaDao.list();
    }

    //查询市
    public List<Area> listCity(Integer id) {
        return areaDao.listCity(id);
    }
}
