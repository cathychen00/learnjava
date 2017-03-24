package com.cathy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by 陈敬 on 2017/3/24.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "file not found")
public class NotFoundException extends RuntimeException {
}
