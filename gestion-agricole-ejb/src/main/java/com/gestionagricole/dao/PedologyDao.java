package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.Pedology;

@Local
public interface PedologyDao
{
        public Pedology createPedology(Pedology pedology) throws Exception;

        public boolean deletePedology(Pedology pedology);

        public Pedology updatePedology(Pedology pedology);
}