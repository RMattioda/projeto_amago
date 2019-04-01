<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Âmago</title>
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="css/register.css" type="text/css" />

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
</head>
<body>


	<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
			<h4 class="card-title mt-3 text-center">Crie sua conta</h4>
			<p class="divider-text">
				<span class="bg-light"></span>
			</p>
			<form:form modelAttribute="userForm" action="/register" method="POST">
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-user"></i>
						</span>
					</div>
					<input name="nome" class="form-control" placeholder="Nome"
						type="text">
					<input name="sobrenome" class="form-control" placeholder="Sobrenome"
					type="text">
				</div>			
				<div class="form-group input-group">
						<span class="input-group-text"> <i class="fa fa-user"></i>
						</span>
					<input name="nomeUsuario" class="form-control" placeholder="Nome de úsuario"
					type="text">
				</div>
				
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-envelope"></i>
						</span>
					</div>
					<input name="email" class="form-control" placeholder="E-mail"
						type="email">
				</div>
				
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-phone"></i>
						</span>
					</div>
					<input name="telefones" class="form-control" placeholder="Número de telefone"
						type="text">
				</div>
				
				<!-- form-group end.// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input name="senha" class="form-control" placeholder="Senha"
						type="password">
				</div>
				
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input name="repetirSenha" class="form-control" placeholder="Repetir senha"
						type="password">
				</div>
				
				<!-- form-group// -->
				<div class="form-group">
					<button type="submit" name="criarConta" value="criarConta" class="btn btn-primary btn-block">
						Criar conta</button>
				</div>

				<form:errors path="nome" />
				<form:errors path="sobrenome" />
				<form:errors path="nomeUsuario" />
				<form:errors path="email" />
				<form:errors path="telefone" />
				<form:errors path="senha" />
				
			</form:form>
			
		</article>
	</div>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/jquery.min.js"></script>
</body>
</html>