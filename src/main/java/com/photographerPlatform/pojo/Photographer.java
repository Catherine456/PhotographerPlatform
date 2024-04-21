package com.photographerPlatform.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // set get
@Builder
@AllArgsConstructor   // 全参构造函数
@NoArgsConstructor  // 无参构造函数
public class Photographer {
    /**
     * 自增的id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}
