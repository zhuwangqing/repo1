package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

    public String findAll(){
        System.out.println("这是测试================");
        return NONE;
    }
}
