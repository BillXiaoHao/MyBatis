package com.ww.domain;

import lombok.Data;

/**
 * Created by Administrator on 2017/4/11.
 */
@Data
public class BaseDo {
    private String state;//是否可用状态

    private String createBy;//创建人

    private String createDate;//创建日期

    private String updateBy;//更新人

    private String updateDate;//更新时间
}
