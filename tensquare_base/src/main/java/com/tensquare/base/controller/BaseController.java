package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Fixyou on 2018/12/27.
 */
@RestController
@CrossOrigin
@RequestMapping("/lablel")
public class BaseController {

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
     return new Result(true, StatusCode.OK,"查询成功");

    }

    @RequestMapping(value="/{labelId}",method = RequestMethod.GET)
    public Result findById(@PathVariable("lableId") String labelId){
        return  new Result(true,StatusCode.OK,"查询成功");

    }
    @RequestMapping(value="/save",method = RequestMethod.PUT)
    public Result save (@RequestBody Label label){
        return new Result(true,StatusCode.OK,"添加成功");
    }
    @RequestMapping(value="/{lableId}",method = RequestMethod.PUT)
    public Result save (@PathVariable("lableId") String labelId,@RequestBody Label label){
        return new Result(true,StatusCode.OK,"修改成功");
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public Result deleteById (@RequestBody Label label){
        return new Result(true,StatusCode.OK,"删除成功");
    }

}
