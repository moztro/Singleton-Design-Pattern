/**
 * 
 */
package com.moztrodev.tuto.designpatterns.singleton;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author DANIEL
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection myConnection = DataSource.getInstance().getConnection();
		
		try {
			myConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
