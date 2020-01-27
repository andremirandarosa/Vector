package com.example.backend2.model.repository;

import com.example.backend2.model.entity.Conta;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional(value = Transactional.TxType.REQUIRES_NEW)
public interface ContaRepository extends CrudRepository<Conta, Long>{}
