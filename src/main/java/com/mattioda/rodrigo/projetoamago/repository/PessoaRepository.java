package com.mattioda.rodrigo.projetoamago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mattioda.rodrigo.projetoamago.model.Pessoa;

@Repository
@Transactional
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

	@Transactional(readOnly=true)
	Pessoa findDistinctBynomeUsuarioEquals(String nomeUsuario);

	@Transactional(readOnly=true)
	Pessoa findBynomeUsuarioAndSenha(String nomeUsuario, String senha);
	
}
