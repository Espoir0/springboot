package com.example.demo.model.PO;

import com.example.demo.model.PO.base.BaseEntity;
import lombok.Data;

@Data
public class Datastores extends BaseEntity {
    private String name;
    private int id;
    private int account_id;
    private int app_id;
    private String description;
    private String type;
    private int database_id;
    private String table_name;
    private String schema_conf_json;
    private int reserved_day;
    private String store_conf_json;
    private int status;
    private int is_deleted;
}
