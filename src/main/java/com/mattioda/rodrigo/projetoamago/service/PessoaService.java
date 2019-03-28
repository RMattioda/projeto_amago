package com.mattioda.rodrigo.projetoamago.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mattioda.rodrigo.projetoamago.DTO.PessoaDTO;
import com.mattioda.rodrigo.projetoamago.model.Pessoa;
import com.mattioda.rodrigo.projetoamago.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Transactional
	public Pessoa insert(Pessoa pessoaObj) {
		pessoaObj.setId(null);
		pessoaObj=pessoaRepository.save(pessoaObj);
		return pessoaObj;
	}
	
	public Pessoa findPessoa(String nomeUsuario, String senha) {
		return pessoaRepository.findBynomeUsuarioAndSenha(nomeUsuario, senha);
	}
	
	public Pessoa findPessoa(String nomeUsuario){
		return pessoaRepository.findDistinctBynomeUsuarioEquals(nomeUsuario);
	}
	
	public Pessoa loginPessoa(String nomeUsuario, String senha) {
		Pessoa pessoa = this.pessoaRepository.findDistinctBynomeUsuarioEquals(nomeUsuario);
		if(pessoa!= null && pessoa.getSenha().equals(senha)) {
			return pessoa;
		}
		return null;
	}
	public Pessoa fromDTO(PessoaDTO objDto) {
		Pessoa pessoa = new Pessoa(null, objDto.getNome(),objDto.getSobrenome(), objDto.getNomeUsuario(),
				 objDto.getEmail(),objDto.getSenha());

		return pessoa;
	}
	

}
