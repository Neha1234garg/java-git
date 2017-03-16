package com.neha.dao;
import com.neha.bin.*;
import com.neha.bin.copy.*;
import java.sql.SQLException;

public interface MarketplaceDao {

public boolean ifalreadyexist(Create mypojo) throws SQLException;
    public void MarketplaceDaoInsert(Create mypojo) throws SQLException;
    public void MarketplaceDaoDelete(Create1 mypojo) throws SQLException;
    public boolean ifalreadyexist1(Create1 mypojo) throws SQLException;
}
