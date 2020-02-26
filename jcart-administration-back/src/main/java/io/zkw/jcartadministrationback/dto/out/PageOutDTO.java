package io.zkw.jcartadministrationback.dto.out;

import java.util.List;

public class PageOutDTO<T> {

    private Integer total;
    private Integer pageSize;
    private Integer pageName;
    private List<T> list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageName() {
        return pageName;
    }

    public void setPageName(Integer pageName) {
        this.pageName = pageName;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}