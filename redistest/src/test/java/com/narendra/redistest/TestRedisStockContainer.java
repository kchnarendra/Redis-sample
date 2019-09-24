package com.narendra.redistest;
/**
 * @author narendrac
 */
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.narendra.redistest.model.SpecificStocksContainer;
import com.narendra.redistest.model.StockData;
import com.narendra.redistest.repo.RedisStockDataReopository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisStockContainer {

	@Autowired
	RedisStockDataReopository redisStockDataReopository;
	
	@Test
	public void testm() {
		
		StockData stockData1 = new StockData();
		stockData1.setName("justdial");
		stockData1.setOpen(10.12);
		
		StockData stockData2 = new StockData();
		stockData2.setName("justdial");
		stockData2.setOpen(10.12);
		
		ArrayList<StockData> al = new ArrayList<StockData>();
		al.add(stockData1);
		al.add(stockData2);
		
		SpecificStocksContainer indivisualStockDataHolder = new SpecificStocksContainer();
		indivisualStockDataHolder.setId("jd");
		indivisualStockDataHolder.setStockData(al);
		
		redisStockDataReopository.save(indivisualStockDataHolder);
		
		SpecificStocksContainer indivisualStockDataHolder2 = redisStockDataReopository.findById("jd").get();
		ArrayList<StockData> stcks = indivisualStockDataHolder2.getStockData();
		
		stcks.forEach((item)->{
			System.out.println(item);
		});
		
	}
}
