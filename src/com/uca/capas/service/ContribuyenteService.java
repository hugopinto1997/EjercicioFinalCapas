package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.dto.*;

@Service
public interface ContribuyenteService {
	public List<Contribuyente> findAll() throws DataAccessException;
	public Contribuyente findOne(Integer id) throws DataAccessException;
	public int insert(ContribuyenteDTO c) throws DataAccessException;

}
