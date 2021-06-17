package com.rjgc.exceptions;

import lombok.Data;

/**
 * @author zhaoyunjie
 * @date 2021-04-09 10:39
 */
@Data
public class ExceptionsEnum {
    private final int resCode;
    private final String resMsg;

    ExceptionsEnum(int resCode, String resMsg) {
        this.resCode = resCode;
        this.resMsg = resMsg;
    }
}
