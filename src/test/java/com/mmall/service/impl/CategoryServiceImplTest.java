package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.service.ICategoryService;
import com.mmall.test.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author MaWenXiang
 * @date 2017/12/10
 */
public class CategoryServiceImplTest extends TestBase {


    @Autowired
    private ICategoryService iCategoryService;


    @Test
    public void selectCategoryAndChildrenById() throws Exception {
        ServerResponse<List<Integer>> response = iCategoryService.selectCategoryAndChildrenById(100002);
        for (int i : response.getData()) {
            System.out.println(i);
        }
    }

}