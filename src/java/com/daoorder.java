
package com;
import com.ConnectionUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.*;
import com.daoorder.*;

public class daoorder {
    
    
static Connection con;
   public static List<userbeanorder> getAllRecords()
{
	List<userbeanorder> list=new ArrayList<userbeanorder>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from uorder");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			userbeanorder u=new userbeanorder();
			
			u.setFood_item(rs.getString("food_item"));
			u.setQuantity(rs.getString("quantity"));
			u.setPrice(rs.getString("price"));
                        u.setOrderdate_time(rs.getString("orderdate_time"));
			 u.setCust_name(rs.getString("cust_name"));
                          u.setContact_no(rs.getString("contact_no"));
                           u.setEmail_address(rs.getString("email_address"));
                            u.setDelivery_address(rs.getString("delivery_address"));
                              u.setTotal_price(rs.getString("total_price"));
                               
			list.add(u);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}
}

