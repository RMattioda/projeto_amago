package com.mattioda.rodrigo.projetoamago.controler;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mattioda.rodrigo.projetoamago.DTO.PessoaDTO;
import com.mattioda.rodrigo.projetoamago.model.Pessoa;
import com.mattioda.rodrigo.projetoamago.service.PessoaService;

@Controller
public class UserController {
	

	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(method=RequestMethod.POST, path="/register")
	public String register(@Valid PessoaDTO pessoaObjDto,
			BindingResult result, Model model, HttpSession session) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		if(result.hasErrors()) {
			model.addAttribute("hasErrors", result);
			return "/register";
		}
		Pessoa pessoa= pessoaService.fromDTO(pessoaObjDto);
		pessoa.setSenha(passwordEncoder.encode(pessoa.getSenha()));
		pessoa=pessoaService.insert(pessoa);
		return "redirect:index";
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/index")
	public String index(@RequestParam String nomeUsuario,
			@RequestParam String senha,
			HttpSession session, Model model
		 ) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		Pessoa pessoa = pessoaService.findPessoa(nomeUsuario);
		
		if(pessoa==null) {
			model.addAttribute("loginError", "Nome de usuário ou senha incorretos");
			return "index";
		}		
		if(!passwordEncoder.matches(senha, pessoa.getSenha())) {
			model.addAttribute("loginError", "Nome de usuário ou senha incorretos");
			return "index";
		}
		
		session.setAttribute("loggedInUser", pessoa);
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loggedInUser");
		return "index";
	}

}
