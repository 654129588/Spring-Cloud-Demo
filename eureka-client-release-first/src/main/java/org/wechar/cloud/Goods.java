package org.wechar.cloud;

/***
 * @author CHENWEICONG
 * @create 2018-10-22 17:33
 * @desc chenweicong
 */
public class Goods {
    private Integer id;
    private String name;
    private Integer count;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
