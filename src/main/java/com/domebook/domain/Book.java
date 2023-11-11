package com.domebook.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Book {

    private Integer id;
    private String name;
    private String type;
    private String description;

}
