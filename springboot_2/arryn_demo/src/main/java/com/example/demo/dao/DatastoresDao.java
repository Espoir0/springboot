package com.example.demo.dao;

import com.example.demo.model.PO.Datastores;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DatastoresDao {
    @Insert("insert into biz_data_store(name,account_id,app_id,description,type,database_id,table_name," +
            "schema_conf_json,status,is_deleted,modified_user_id,modified_time,creation_user_id,creation_time)"+

            " values(#{name},#{account_id},#{app_id},#{description},#{type},#{database_id},#{table_name}," +
            "#{schema_conf_json},#{status},#{is_deleted},#{status},#{modified_user_id},#{modified_time}," +
            "#{creation_user_id},#{creation_time}")
    void addUser(Datastores user);

    @Delete("delete from biz_data_store where id=#{id}")
    void deleteUser(int id);

    @Update("update biz_data_store set (name,account_id,app_id,description,type,database_id,table_name," +
            " schema_conf_json,status,is_deleted,modified_user_id,modified_time,creation_user_id,creation_time)"+
            "values(#{name},#{account_id},#{app_id},#{description},#{type},#{database_id},#{table_name}, "+
            "#{schema_conf_json},#{status},#{is_deleted},#{status},#{modified_user_id},#{modified_time}," +
            "#{creation_user_id},#{creation_time}")
    void updateUser(Datastores data);

    @Select("select * from biz_data_store where id=#{id}")
    Datastores selectUser(int id);

}
