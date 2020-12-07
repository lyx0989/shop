package com.goktech.olala.client.controller.index;

import com.goktech.olala.core.req.ReqGoodKeywords;
import com.goktech.olala.core.service.IGoodIndex;
import com.goktech.olala.server.pojo.goods.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Classname IndexGoodsController
 * @Description TODO
 * @Date 2020/12/6 8:29 下午
 * @Created by mac
 */
@RestController
@RequestMapping("/goodsIndexApi")
public class IndexGoodsController {
    @Autowired
    IGoodIndex iGoodIndex;
    @RequestMapping("/queryGoodsByParam.do")
    public ModelAndView queryGoodsByParam(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        String keywords = request.getParameter("keywords");
        ReqGoodKeywords goodKeywords=new ReqGoodKeywords();
        goodKeywords.setGoodsName(keywords);
        List<Goods> goods = iGoodIndex.selectByKeywords(goodKeywords);
        mav.addObject("goodsList",goods);
        mav.setViewName("home/search");
        return mav;
    }
}
