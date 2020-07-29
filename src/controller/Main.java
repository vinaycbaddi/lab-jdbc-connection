package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
	ConnectionManager cm=new ConnectionManager();
	cm.getConnection();
		
	}
}
