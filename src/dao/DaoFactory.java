package dao;

import dao.DaoUser;

public class DaoFactory {

	public static DaoUser newUser(){
        return new DaoUser();
    }
}
