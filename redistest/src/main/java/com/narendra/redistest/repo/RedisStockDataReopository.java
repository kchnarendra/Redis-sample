package com.narendra.redistest.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.narendra.redistest.model.SpecificStocksContainer;;
/**
 * 
 * @author narendrac
 *
 */
@Repository
public interface RedisStockDataReopository extends CrudRepository<SpecificStocksContainer, String>   {

}
