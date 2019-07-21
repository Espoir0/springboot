package com.example.demo.model.PO.base;

import lombok.Data;
import java.util.Date;


@Data
public class BaseEntity {
        private int id;
        private String  createTime;
        private int createUserId;
        private String updateTime;
        private  int updateUserId;
        private int deleteFlag;
        private int aa;
}



