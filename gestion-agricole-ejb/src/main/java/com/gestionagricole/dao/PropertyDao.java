package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.Property;

@Local
public interface PropertyDao
{
        public Property createProperty(Property property) throws Exception;

        public boolean deleteProperty(Property property);

        public Property updateProperty(Property property);
}