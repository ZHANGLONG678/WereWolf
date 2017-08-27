package com.github.binarywang.demo.wechat.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by cs on 2017/8/10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindSeatInfo {
    private String date;
    private Integer roomId;
    private Integer phase;
}
