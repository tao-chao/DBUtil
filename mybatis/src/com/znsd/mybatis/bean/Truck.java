package com.znsd.mybatis.bean;

/**
 *    卡车实体类，封装卡车相关的字段
 */
public class Truck extends Vehicle {
    private int boxSize;
    public int getBoxSize() {
        return boxSize;
    }
    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }
	/*@Override
	public String toString() {
		return "Truck [boxSize=" + boxSize + "]";
	}*/
    
}
