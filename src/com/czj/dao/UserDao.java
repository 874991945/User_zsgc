package com.czj.dao;

import com.czj.entity.User;
import com.czj.utils.DbUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    private JdbcTemplate template=new JdbcTemplate(DbUtils.getDataSource());

        public List<User> list() {
            String sql = "select id,dept_id,account,password,age,case when sex=1 then '男' when sex=0 then '女'else '其它' end sex,\n" +
                    "ifnull(sal,0) sal,birth from user";
            return template.query(sql,new BeanPropertyRowMapper<>(User.class));
        }

        public void addUser(User user){
            String sql="insert into user(id,dept_id,account,password,age,sex,sal,birth) values(?,?,?,?,?,?,?,?)";
            template.update(sql,
                    user.getId(),user.getDept_id(),
                    user.getAccount(),user.getPassword(),
                    user.getAge(),user.getSex(),
                    user.getSal(),user.getBirth());
        }

        public User getUserById(Integer id){

            String sql="select * from user where id=?";
            return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
        }


        public void updateUser(User user){
            String sql="update user set account=?,password=?,age=?,sex=?,sal=?,birth=? where id=?";
            template.update(sql,
                    user.getAccount(),user.getPassword(),
                    user.getAge(),user.getSex(),
                    user.getSal(),user.getBirth(),
                    user.getId());
        }

        public void deleteById(Integer id){
            String sql="delete from user where id=?";
            template.update(sql,id);
        }
}
