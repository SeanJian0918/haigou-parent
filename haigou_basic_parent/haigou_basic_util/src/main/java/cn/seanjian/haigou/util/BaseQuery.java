package cn.seanjian.haigou.util;

/**
 * @Auther: Sean Jian
 * @Description: cn.seanjian.haigou.util
 * @Date: 2019/3/30 13:04
 */
public class BaseQuery {
    private Integer page = 1;
    private Integer rows = 10;
    private String keyword;

    public Integer getStart() {
        return (page - 1)*rows;
    }
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
