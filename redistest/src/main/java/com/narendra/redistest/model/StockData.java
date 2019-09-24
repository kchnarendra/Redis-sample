package com.narendra.redistest.model;
/**
 * 
 * @author narendrac
 *
 */
public class StockData {

	private String name;
	private double open;
	private double high;
	private double low;
	private double close;
	private int volume;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "StockData [name=" + name + ", open=" + open + ", high=" + high + ", low=" + low + ", close=" + close
				+ ", volume=" + volume + "]";
	}
}
