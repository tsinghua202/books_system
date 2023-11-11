package com.domebook.contorller.util;

import com.domebook.domain.Book;
import lombok.Data;

import java.util.List;

@Data
public class R {

    private boolean flag;
    private Object data;

    public R() {
    }

    public R(Object data) {
        this.data = data;
    }

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
