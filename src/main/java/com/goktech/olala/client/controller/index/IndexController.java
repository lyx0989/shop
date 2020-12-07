package com.goktech.olala.client.controller.index;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.core.resp.RespCategoryVo;
import com.goktech.olala.core.service.IActivitService;
import com.goktech.olala.core.service.IAdversService;
import com.goktech.olala.core.service.IArticleService;
import com.goktech.olala.core.service.IGoodCategory;
import com.goktech.olala.core.service.impl.ActivitServiceImpl;
import com.goktech.olala.server.pojo.goods.Activit;
import com.goktech.olala.server.pojo.goods.Advers;
import com.goktech.olala.server.pojo.goods.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname IndexController
 * @Description TODO
 * @Date 2020/12/1 10:26 下午
 * @Created by mac
 */
@RestController
public class  IndexController {
    @Autowired
    IArticleService articleService;
    @Autowired
    IAdversService adversService;
    @Autowired
    IActivitService activitService;
    @Autowired 
    IGoodCategory iGoodCategory;
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("redirect:/index/init.do");
        return mav;
    }

    @RequestMapping("/index/init.do")
    public ModelAndView toIndex(){
        ModelAndView mav=new ModelAndView();
//      商城头条
        List<Article> articles = articleService.selectAll();
        mav.addObject("articleVoList",articles);

//      轮播图
        List<Advers> advers = adversService.selectAll();
        mav.addObject("ctmAdvers",advers);
        mav.setViewName("home/index");
//      各类活动
        List<Activit> activits = activitService.selectAll();
        mav.addObject("indexActivities",activits);
//      侧边导航一级导航
        List<RespCategoryVo> respCategoryVos = iGoodCategory.betreeList();
        //      实力商家
        for (RespCategoryVo first:respCategoryVos){
            List<RespBrandVo> brands = iGoodCategory.selectBrand();
            if(brands!=null){
                first.setBrandList(brands);
            }
        }
        mav.addObject("categoryList",respCategoryVos);
        return mav;
    }
}
