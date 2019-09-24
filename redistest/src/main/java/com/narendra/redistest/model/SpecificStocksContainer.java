package com.narendra.redistest.model;
/**
 * @author narendrac
 */
import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("SpecificStocksContainer")
public class SpecificStocksContainer implements Serializable {

	/**
	 * @author narendrac
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private ArrayList<StockData> stockData = new ArrayList<StockData>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<StockData> getStockData() {
		return stockData;
	}

	public void setStockData(ArrayList<StockData> stockData) {
		this.stockData = stockData;
	}
}
