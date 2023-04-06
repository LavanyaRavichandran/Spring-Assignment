package com.ob.assignment4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//import org.springframework.stereotype.Component;

public class Collect {
	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer,String> map;
	private Properties property;//key value pair where key and value should be string
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	

}
