package com.gestionagricole.factory;

import com.gestionagricole.dto.AuditInfo;
import com.gestionagricole.entity.Audit;

public class AuditFactory {

	 /**
    *
    * Create a Dto from an Entity
    * @param an Entity
    * @return a Dto
    */

   public static AuditInfo createDto(Audit audit)
   {
           AuditInfo auditInfo = new AuditInfo();

           if (audit==null)
              return auditInfo;

           if (audit.getId()!=null)
                   auditInfo.setUid(getUid(audit));

           auditInfo.setComponent(audit.getComponent());
           auditInfo.setComponentId(audit.getComponentId());
           auditInfo.setUpdateDate(audit.getUpdateDate());
           auditInfo.setUpdateType(audit.getUpdateType());

           return auditInfo;
   }

   private static String getUid(Audit audit) 
   {
	   	StringBuilder builder = new StringBuilder();
		builder.append(audit.getId());
		return builder.toString();
	}

/**
    *
    * Create a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Audit createEntity(AuditInfo auditInfo)
   {
           Audit audit = new Audit();
           return updateEntity(audit, auditInfo);
   }


   /**
    *
    * Update a Entity from a Dto
    * @param a Dto
    * @return an Entity
    */

   public static Audit updateEntity(Audit audit, AuditInfo auditInfo)
   {
           audit.setComponent(auditInfo.getComponent());
           audit.setComponentId(auditInfo.getComponentId());
           audit.setUpdateDate(auditInfo.getUpdateDate());
           audit.setUpdateType(auditInfo.getUpdateType());
           return audit;
   }

}