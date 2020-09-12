package com.xindaojia.backend.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReqParams extends LinkedHashMap<String,Object> {
	
	//页数
	private int page;
	//个数
	private int size;
	
	public ReqParams(Map<String,Object> params) {
		
		this.page=Integer.parseInt(params.get("page").toString());
		this.size=Integer.parseInt(params.get("size").toString());
		this.put("start", (page-1)*size);
		this.put("page", page);
		this.put("limit", size);
		
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	@Override
    public String toString() {
        return "ReqParam{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
