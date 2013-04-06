package com.gestionagricole.factory;

import com.gestionagricole.dto.UserAccountInfo;
import com.gestionagricole.entity.UserAccount;

public class UserAccountFactory {
	
	  /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static UserAccountInfo createDto(UserAccount userAccount)
   {
           UserAccountInfo userAccountInfo = new UserAccountInfo();

           if (userAccount==null)
              return userAccountInfo;

           if (userAccount.getId()!=null)
                   userAccountInfo.setUid(getUid(userAccount));

           userAccountInfo.setFirstName(userAccount.getFirstName());
           userAccountInfo.setLastName(userAccount.getLastName());

           return userAccountInfo;
   }

   private static String getUid(UserAccount userAccount) {
	   StringBuilder builder = new StringBuilder();
	   builder.append(userAccount.getId());
	   return builder.toString();
   }

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static UserAccount createEntity(UserAccountInfo userAccountInfo)
   {
           UserAccount userAccount = new UserAccount();
           return updateEntity(userAccount, userAccountInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static UserAccount updateEntity(UserAccount userAccount, UserAccountInfo userAccountInfo)
   {

           userAccount.setFirstName(userAccountInfo.getFirstName());
           userAccount.setLastName(userAccountInfo.getLastName());

           return userAccount;
   }


}