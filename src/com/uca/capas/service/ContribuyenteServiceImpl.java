package com.uca.capas.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.domain.Importancia;
import com.uca.capas.dto.ContribuyenteDTO;
import com.uca.capas.repositories.ContribuyenteRepository;
import com.uca.capas.repositories.ImportanciaRepository;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService {
	
	@Autowired
	ContribuyenteRepository cr;
	
	@Autowired
	ImportanciaRepository ir;
	
	@Autowired
	private EntityManager em;
	
	@Override
	public List<Contribuyente> findAll() throws DataAccessException{
		return cr.findAll();
	}
	
	@Override
	public Contribuyente findOne(Integer id) throws DataAccessException{
		return cr.findOne(id);
	}
	
	@Override
	@Transactional
	public int insert(ContribuyenteDTO c) throws DataAccessException{
		Calendar cal = Calendar.getInstance();
		Contribuyente cn = new Contribuyente();
		cn.setfIngreso(new java.sql.Date(cal.getTimeInMillis()));
		Importancia i = ir.findOne(c.getImportancia());
		cn.setImportancia(i);
		cn.setsNit(c.getsNit());
		cn.setsNombre(c.getsNombre());
		cn.setsApellido(c.getsApellido());
		em.persist(cn);
		em.flush();
		return 1;
	}
}
