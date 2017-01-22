package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import manager.*;
import entities.User;

public class DaoUser {

	
	public void addUser(String login, String checksum, String p2, String p3, 
			String p4, String p5, String p6) throws NamingException, ClassNotFoundException{
		try{
			Connection cn1 = null; 
			Connection cn2 = null;
			Connection cn3 = null;
			Connection cn4 = null;
			Connection cn5 = null;
			Connection cn6 = null;
			try{
			cn1 = Connector.CreateConnection();
			cn2 = Connector2.CreateConnection();
			cn3 = Connector3.CreateConnection();
			cn4 = Connector4.CreateConnection();
			cn5 = Connector5.CreateConnection();
			cn6 = Connector6.CreateConnection();
			PreparedStatement ps1 = null;
			PreparedStatement ps2 = null;
			PreparedStatement ps3 = null;
			PreparedStatement ps4 = null;
			PreparedStatement ps5 = null;
			PreparedStatement ps6 = null;
			try{
				ps1=cn1.prepareStatement("INSERT INTO user (login, password) "
                        + "VALUES (?,?);");
				ps1.setString(1, login);
				ps1.setString(2, checksum);
				ps1.executeUpdate();
				}
			finally{
				if(ps1!=null)
					ps1.close();
			}
			try{
				ps2=cn2.prepareStatement("INSERT INTO user (login, password) "
                        + "VALUES (?,?);");
				ps2.setString(1, login);
				ps2.setString(2, p2);
				ps2.executeUpdate();
				}
			finally{
				if(ps2!=null)
					ps2.close();
			}
			try{
				ps3=cn3.prepareStatement("INSERT INTO user (login, password) "
                        + "VALUES (?,?);");
				ps3.setString(1, login);
				ps3.setString(2, p3);
				ps3.executeUpdate();
				}
			finally{
				if(ps3!=null)
					ps3.close();
			}
			try{
				ps4=cn4.prepareStatement("INSERT INTO user (login, password) "
                        + "VALUES (?,?);");
				ps4.setString(1, login);
				ps4.setString(2, p4);
				ps4.executeUpdate();
				}
			finally{
				if(ps4!=null)
					ps4.close();
			}
			try{
				ps5=cn5.prepareStatement("INSERT INTO user (login, password) "
                        + "VALUES (?,?);");
				ps5.setString(1, login);
				ps5.setString(2, p5);
				ps5.executeUpdate();
				}
			finally{
				if(ps5!=null)
					ps5.close();
			}
			try{
				ps6=cn6.prepareStatement("INSERT INTO user (login, password) "
                        + "VALUES (?,?);");
				ps6.setString(1, login);
				ps6.setString(2, p6);
				ps6.executeUpdate();
				}
			finally{
				if(ps6!=null)
					ps6.close();
			}
			}
			finally{
				if(cn1!=null)
					cn1.close();
				if(cn2!=null)
					cn2.close();
				if(cn3!=null)
					cn3.close();
				if(cn4!=null)
					cn4.close();
				if(cn5!=null)
					cn5.close();
				if(cn6!=null)
					cn6.close();
			}
		}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	public boolean find(String login) throws ClassNotFoundException, NamingException {
		try{
			Connection cn1 = null; 
			try{
			cn1 = Connector.CreateConnection();
			PreparedStatement ps1 = null;
			try{
				ps1=cn1.prepareStatement("SELECT * FROM user WHERE login = ?");
				ps1.setString(1, login);
				ResultSet rs1 = null;
                try {
                    rs1 = ps1.executeQuery();
                    return rs1.next();
                } finally {
                    if (rs1 != null)
                        rs1.close();
                } 
				}
			finally{
				if(ps1!=null)
					ps1.close();
			}
			}
			finally{
				if(cn1!=null)
					cn1.close();
			}
		}
		catch(SQLException s){
			s.printStackTrace();
			return false;
		}
		
	}
	public String[] getPart(String login) throws ClassNotFoundException, NamingException {
		String[] parts = new String[5];
		try{
			Connection cn2 = null;
			Connection cn3 = null;
			Connection cn4 = null;
			Connection cn5 = null;
			Connection cn6 = null;
			try{
			cn2 = Connector2.CreateConnection();
			cn3 = Connector3.CreateConnection();
			cn4 = Connector4.CreateConnection();
			cn5 = Connector5.CreateConnection();
			cn6 = Connector6.CreateConnection();
			PreparedStatement ps1 = null;
			PreparedStatement ps2 = null;
			PreparedStatement ps3 = null;
			PreparedStatement ps4 = null;
			PreparedStatement ps5 = null;
			PreparedStatement ps6 = null;
			try{
				ps2=cn2.prepareStatement("SELECT password FROM user WHERE login=?");
				ps2.setString(1, login);
				ResultSet rs2 = null;
                try {
                    rs2 = ps2.executeQuery();
                    
                    while(rs2.next()){
                    		parts[0] = rs2.getString("password");
                    }    
                   
                } finally {
                    if (rs2!= null) {
                        rs2.close();
                    }
                }
				}
			finally{
				if(ps2!=null)
					ps2.close();
			}
			try{
				ps3=cn3.prepareStatement("SELECT password FROM user WHERE login=?");
				ps3.setString(1, login);
				ResultSet rs3 = null;
                try {
                    rs3 = ps3.executeQuery();
                    
                    while(rs3.next()){
                    		parts[1] = rs3.getString("password");
                    }    
                   
                } finally {
                    if (rs3!= null) {
                        rs3.close();
                    }
                }
			}
			finally{
				if(ps3!=null)
					ps3.close();
			}
			try{
				ps4=cn4.prepareStatement("SELECT password FROM user WHERE login=?");
				ps4.setString(1, login);
				ResultSet rs4 = null;
                try {
                    rs4 = ps4.executeQuery();
                    
                    while(rs4.next()){
                    		parts[2] = rs4.getString("password");
                    }    
                   
                } finally {
                    if (rs4!= null) {
                        rs4.close();
                    }
                }
			}
			finally{
				if(ps4!=null)
					ps4.close();
			}
			try{
				ps5=cn5.prepareStatement("SELECT password FROM user WHERE login=?");
				ps5.setString(1, login);
				ResultSet rs5 = null;
                try {
                    rs5 = ps5.executeQuery();
                    
                    while(rs5.next()){
                    		parts[3] = rs5.getString("password");
                    }    
                   
                } finally {
                    if (rs5!= null) {
                        rs5.close();
                    }
                }
			}
			finally{
				if(ps5!=null)
					ps5.close();
			}
			try{
				ps6=cn6.prepareStatement("SELECT password FROM user WHERE login=?");
				ps6.setString(1, login);
				ResultSet rs6 = null;
                try {
                    rs6 = ps6.executeQuery();
                    
                    while(rs6.next()){
                    		parts[4] = rs6.getString("password");
                    }    
                   
                } finally {
                    if (rs6!= null) {
                        rs6.close();
                    }
                }
			}
			finally{
				if(ps5!=null)
					ps5.close();
			}
			}
			finally{
				if(cn2!=null)
					cn2.close();
				if(cn3!=null)
					cn3.close();
				if(cn4!=null)
					cn4.close();
				if(cn5!=null)
					cn5.close();
				if(cn6!=null)
					cn5.close();
			}
		}
			catch(SQLException e){
				e.printStackTrace();
			}
		return parts;
}
}
