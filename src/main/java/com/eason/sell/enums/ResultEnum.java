package com.eason.sell.enums;

import lombok.Getter;

/**
 * @author CookiesEason
 * 2018/1/2 14:08
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"库存不正确"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
