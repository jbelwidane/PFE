package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.Audit;


@Local
public interface AuditDao
{
        public Audit createAudit(Audit audit) throws Exception;

        public boolean deleteAudit(Audit audit);

        public Audit updateAudit(Audit audit);
}
