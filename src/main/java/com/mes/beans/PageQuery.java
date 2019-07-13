package com.mes.beans;

import javax.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PageQuery {

    @Getter
    @Setter
    @Min(value = 1, message = "��ǰҳ�벻�Ϸ�")
    private int pageNo = 1;

    @Getter
    @Setter
    @Min(value = 1, message = "ÿҳչʾ�������Ϸ�")
    private int pageSize = 10;

    @Setter
    private int offset;

    public int getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
