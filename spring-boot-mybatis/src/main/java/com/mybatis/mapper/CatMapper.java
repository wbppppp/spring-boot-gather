package com.mybatis.mapper;

import com.mybatis.pojo.Cat;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
public interface CatMapper {

    @Select("select * from cat where name=#{name}")
    public List<Cat> likeName(String name);

    @Insert("insert into cat(name,age) values(#{name},#{age})")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    public void save(Cat cat);

}
