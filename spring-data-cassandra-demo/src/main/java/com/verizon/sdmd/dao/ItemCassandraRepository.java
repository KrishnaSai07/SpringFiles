package com.verizon.sdmd.dao;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.verizon.sdmd.model.Item;

@Repository
public interface ItemCassandraRepository extends CassandraRepository<Item, Integer>  {

}
