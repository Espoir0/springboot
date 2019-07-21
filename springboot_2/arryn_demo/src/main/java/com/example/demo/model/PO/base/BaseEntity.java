package com.example.demo.model.PO.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private int modified_user_id;
    private Date modified_time;
    private int creation_user_id;
    private Date creation_time;
}
