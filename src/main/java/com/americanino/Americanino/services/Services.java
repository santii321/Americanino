package com.americanino.Americanino.services;

import com.americanino.Americanino.models.ModelClient;

import java.util.List;

public interface Services<E> {


    public List<E> buscarTodos() throws Exception;

    public E guardarClient(E entidad) throws Exception;
}
