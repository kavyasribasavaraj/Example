package com.src.service;

//import org.springframework.stereotype.Component;

//import java.sql.Connection;


public interface DBOperations {
	//public void setbean( DBConnection dbconnection);
	public void createtable() throws ClassNotFoundException;
	public void insertvalues(  ) throws ClassNotFoundException;
	public void selectvalues() throws ClassNotFoundException;
	
}
