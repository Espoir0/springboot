package com.example.demo.dao;

import com.example.demo.model.PO.MagicCube;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Insert("insert into magicCube (magicCubeName,price,createTime,updateTime,createUserId,updateUserId,deleteFlag) "+
            "values(#{magicCubeName},#{price},#{createTime},#{updateTime},#{createUserId},#{updateUserId},#{deleteFlag})")

    void addMagicCube(MagicCube mc );

    @Select("select * from magicCube where magicCubeName=#{magicCubeName}")
    MagicCube getUserByMagicCubeName(String magicCubeName);

    @Update("update magicCube set price=#{price} where magicCubeName=#{magicCubeName}")
    void updateMagicCube(MagicCube mc );

    @Delete("delete from magicCube where magicCubeName=#{magicCubeName}")
    void delMagicCube(String magicCubeName);
}
