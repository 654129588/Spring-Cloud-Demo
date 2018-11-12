package org.wechar.cloud;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/***
 * @author CHENWEICONG
 * @create 2018-10-22 17:32
 * @desc chenweicong
 */
@RestController
public class GoodsController {

    public static boolean status = true;

    @RequestMapping(value = "/getGoods/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Goods getGoods(@PathVariable Integer id, HttpServletRequest request){
        Goods goods = new Goods();
        goods.setId(id);
        goods.setName("RTX 2080TI");
        goods.setCount(0);
        goods.setMessage(request.getRequestURL().toString());
        return goods;
    }

    @RequestMapping(value = "/setStatus/{status}",method = RequestMethod.GET)
    public void setStatus(@PathVariable Boolean status, HttpServletRequest request){
        this.status = status;
    }
}
