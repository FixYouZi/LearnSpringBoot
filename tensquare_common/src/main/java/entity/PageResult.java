package entity;

import java.util.List;

/**
 * Created by Fixyou on 2018/12/26.
 */
public class PageResult<T>{
    private long total;
    private List<T> rows;
    public PageResult(Long total,List<T> rows){
        super();
        this.total=total;
        this.rows=rows;
    }
    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
