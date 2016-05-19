package com.wocloud.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wocloud.common.basebean.CustomerToken;
import com.wocloud.common.basebean.ResultInfo;
import com.wocloud.subserver.api.InterfaceModProdPrty;
import com.wocloud.subserver.api.InterfacePublicNetwork;
import com.wocloud.subserver.api.InterfaceTrade;

public class testSubscribServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-user-consumer.xml" });  
        context.start();  
        //InterfacePublicNetwork pn = (InterfacePublicNetwork)context.getBean("publicNetwork");
        //InterfaceVolume volume = (InterfaceVolume) context.getBean("volume");
        InterfaceModProdPrty mpp = (InterfaceModProdPrty) context.getBean("modProdPrty");
        ResultInfo ret = new ResultInfo();
        
        CustomerToken token = new CustomerToken();
        /*token.setCustomerId(18);
        token.setAccountId(10016);
        token.setLoginName("ninghao");*/
        token.setCustomerId(67090524);
        token.setAccountId(549048);
        token.setLoginName("test777");
        //*********************************************************公网带宽测试***************************************
        //查询公网带宽
        //ret = pn.describeEipServices(token, "huhehaote");
        //查询公网带宽可挂载的虚拟机
        //ret = pn.describeRelatedVm(token, "running", "huhehaote");
        //查询公网带宽可挂载的路由器
        //ret = pn.describeRelatedRouter(token, "running", "huhehaote");
        //查询公网带宽相关挂载资源
        //ret = pn.queryIpResource(token, 1);
        //查询空余IP
        //ret = pn.queryFreeIp("huhehaote");
        //解绑路由和公网关系
        //ret = pn.attachRouter(token, "69759920,69759952");
        //创建公网带宽
        /*ResultInfo retInfo = new ResultInfo();
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonAry = new JSONArray();
        jsonObj.put("instanceName", "PublicNetwork_1112_1");
        jsonObj.put("BAND_WIDTH", "1");
        jsonObj.put("productId", 5001);
        jsonObj.put("resourcePool","huhehaote");
        jsonAry.add(jsonObj);
        retInfo = pn.createEip(token, jsonAry.toString(), 1, 1);
        if(retInfo.getCode()==0){
        	InterfaceTrade trade = (InterfaceTrade)context.getBean("busiTrade");
            ret = trade.submit(retInfo.getTradeId());
            System.out.println("返回结果:"+ret.getRetObj());
            System.out.println("返回标识:"+ret.getCode());
            System.out.println("返回信息:"+ret.getInfo());
        }else{
        	System.out.println("返回结果:"+retInfo.getRetObj());
            System.out.println("返回标识:"+retInfo.getCode());
            System.out.println("返回信息:"+retInfo.getInfo());
        }*/
        //路由器绑定公网
        /*JSONObject obj = new JSONObject();
        obj.put("id", "72788611");
        obj.put("hostIds", "72022530");
        ret = pn.attachRouter(token, obj.toString());
        System.out.println("返回结果:"+ret.getRetObj());
        System.out.println("返回标识:"+ret.getCode());
        System.out.println("返回信息:"+ret.getInfo());*/
        //路由器解绑公网
        /*JSONObject obj = new JSONObject();
        obj.put("id", "71578201");
        obj.put("hostIds", "71532224");
        ret = pn.detach(token, obj.toString());
        System.out.println("返回结果:"+ret.getRetObj());
        System.out.println("返回标识:"+ret.getCode());
        System.out.println("返回信息:"+ret.getInfo());*/
        //公网带宽修改名称
        //ret = pn.modifyNetworkName(token, "modiftNewName", "71316201");
        //删除公网带宽
        /*ret = pn.deletePublicNetwork(token, "71534201");
        System.out.println("返回结果:"+ret.getRetObj());
        System.out.println("返回标识:"+ret.getCode());
        System.out.println("返回信息:"+ret.getInfo());*/
        /*InterfaceTrade trade = (InterfaceTrade)context.getBean("busiTrade");
        ret = trade.submit("1510200072332201");*/
        
        //*******************************************************************弹性块测试*****************************
        
        //创建弹性款
       /* ResultInfo retInfo = new ResultInfo();
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonAry = new JSONArray();
        jsonObj.put("instanceName", "volume_1027_2");
        jsonObj.put("storageSize", "10");
        jsonObj.put("productId", 1001);
        jsonObj.put("resourcePool","huhehaote");
        jsonAry.add(jsonObj);
        retInfo = volume.createEbsVolumes(token, jsonAry.toString(), 1, 1);
        if(retInfo.getCode()==0){
        	InterfaceTrade trade = (InterfaceTrade)context.getBean("busiTrade");
            ret = trade.submit(retInfo.getTradeId());
            System.out.println("返回结果:"+ret.getRetObj());
            System.out.println("返回标识:"+ret.getCode());
            System.out.println("返回信息:"+ret.getInfo());
        }else{
        	System.out.println("返回结果:"+retInfo.getRetObj());
            System.out.println("返回标识:"+retInfo.getCode());
            System.out.println("返回信息:"+retInfo.getInfo());
        }*/
        
        //删除弹性块
        /*ret = volume.deleteEbsVolumes(token, "71602206");
        System.out.println("返回结果:"+ret.getRetObj());
        System.out.println("返回标识:"+ret.getCode());
        System.out.println("返回信息:"+ret.getInfo());*/
        //主机挂载弹性块
        /*ret = volume.attachEbsVolumes(token, 71666211, "72112575");
        System.out.println("返回结果:"+ret.getRetObj());
        System.out.println("返回标识:"+ret.getCode());
        System.out.println("返回信息:"+ret.getInfo());*/
        //主机解挂弹性块
        /*ret = volume.detachEbsVolumes(token, 71666211, "72112575");
        System.out.println("返回结果:"+ret.getRetObj());
        System.out.println("返回标识:"+ret.getCode());
        System.out.println("返回信息:"+ret.getInfo());*/
        
        //********************************************************公网带宽变更测试***********************************************
        
        JSONObject jsonObj = new JSONObject();
        
        JSONObject muPrtyObj = new JSONObject();
        
        muPrtyObj.put("bandwidth", 4);
        
        jsonObj.put("target", "bandwidth");
        jsonObj.put("subsId", "72788611");
        jsonObj.put("muprty", muPrtyObj);
        ResultInfo retInfo = mpp.modProdPrty(token, jsonObj.toString());
        if(retInfo.getCode()==0){
        	InterfaceTrade trade = (InterfaceTrade)context.getBean("busiTrade");
            ret = trade.submit(retInfo.getTradeId());
            System.out.println("返回结果:"+ret.getRetObj());
            System.out.println("返回标识:"+ret.getCode());
            System.out.println("返回信息:"+ret.getInfo());
        }else{
        	System.out.println("返回结果:"+retInfo.getRetObj());
            System.out.println("返回标识:"+retInfo.getCode());
            System.out.println("返回信息:"+retInfo.getInfo());
        }
        
	}

}
