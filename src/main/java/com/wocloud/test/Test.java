package com.wocloud.test;

import java.util.HashMap;
import java.util.Map;

import com.wocloud.common.json.JsonPluginsUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("router_id","172.66.6.91");
		map.put("virtualrouter_id", "ec044874-73c4-49ad-9512-38d7d73772cc");
		System.out.println(JsonPluginsUtil.mapToJson(map));
	}

}
