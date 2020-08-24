package com.xindaojia.backend.utils;

import java.util.List;

public class RespParams {
	//当前页数
	private int page;
	//本页数据个数
	private int size;
	//总共页数
	private int totalPage;
	//总共数据个数
	private int totalCount;
	//列表数据
	private List<?> list;
	
	
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
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
	
}
