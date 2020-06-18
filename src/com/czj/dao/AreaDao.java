package com.czj.dao;

import com.czj.entity.Area;
import com.czj.entity.User;
import com.czj.utils.DbUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AreaDao {
    private JdbcTemplate template=new JdbcTemplate(DbUtils.getDataSource());

        //查询出所有的省
        public List<Area> list() {
            String sql = "select * from area where type=1";
            return template.query(sql,new BeanPropertyRowMapper<>(Area.class));
        }

        //根据pid查询出所有的市
        public List<Area> listCity(Integer id) {
            String sql = "select * from area where p_id=?";
            return template.query(sql,new BeanPropertyRowMapper<>(Area.class),id);
        }


}
