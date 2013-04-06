package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.UserAccount;

@Local
public interface UserAccountDao
{
        public UserAccount createUserAccount(UserAccount userAccount) throws Exception;

        public boolean deleteUserAccount(UserAccount userAccount);

        public UserAccount updateUserAccount(UserAccount userAccount);
}

