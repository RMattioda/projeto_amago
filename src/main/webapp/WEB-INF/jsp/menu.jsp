<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/register.css" type="text/css" />
	<!-- Sidebar -->
	<div id="sidebar">
		<div class="inner">

			<!-- Menu -->
			<nav id="menu">
				<header class="major">
					<h2>Menu</h2>
				</header>
				<c:if test="${not empty loggedInUser}">
						Bem-vindo ${loggedInUser.nome} !
						<a href="logout">logout</a>
				</c:if>
				<ul>
					<li><a href="index">Página inicial</a></li>
					<li><a href="generic">Generic</a></li>
					<li><a href="elements">Elements</a></li>
					<li><span class="opener">Inspirações</span>
						<ul>
							<li><a href="#">Nome</a></li>
							<li><a href="#">Nome</a></li>
							<li><a href="#">Nome</a></li>
							<li><a href="#">Nome</a></li>
						</ul></li>

					<c:if test="${empty loggedInUser}">
						<li><span class="opener">Faça o Login/Registre-se</span>
							<ul>
								<div id="login-card">${loginError}
									<h1>Log-in</h1>
									<br>
									<form action="/index" method="post">
										<input type="text" name="nomeUsuario" placeholder="Usuário ou E-mail">
										<input type="password" name="senha" placeholder="Senha">
										<input type="submit" name="login" class="login login-submit"
											value="login">
									</form>
									<div class="login-help">
										<a href="register">Registrar-se</a> &#149; <a href="#">Esqueceu a
											Senha?</a>
									</div>
						
								</div>

							</ul></li>
					</c:if>
				</ul>
			</nav>

			<!-- Section -->
			<section>
				<header class="major">
					<h2>Entre em contato!</h2>
				</header>
				<p>Olá, meu nome é Rodrigo Mattioda, curso analise e
					desenvolvimento de sistemas, sou o desenvolvedor Java e fundador
					deste site juntamente com a proprietária Júlia Gambirazzio.</p>
				<ul class="contact">
					<li class="fa-envelope-o">rodrigo-mattioda@hotmail.com</li>
					<li class="fa-phone">(054)99702-2014</li>
					<li class="fa-home">Caxias do Sul, Brasil</li>
				</ul>
				<header class="major">
					<h2>Entre em contato!</h2>
				</header>
				<p>Sed varius enim lorem ullamcorper dolore aliquam aenean
					ornare velit lacus, ac varius enim lorem ullamcorper dolore. Proin
					sed aliquam facilisis ante interdum. Sed nulla amet lorem feugiat
					tempus aliquam.</p>
				<ul class="contact">
					<li class="fa-envelope-o">rodrigo-mattioda@hotmail.com</li>
					<li class="fa-phone">(54)99691-8916</li>
					<li class="fa-home">Caxias do Sul, Brasil</li>
				</ul>
			</section>

			<!-- Footer -->
			<footer id="footer">
				<p class="copyright">
					&copy; Untitled. All rights reserved. Demo Images: <a
						href="https://unsplash.com">Unsplash</a>. Design: <a
						href="https://html5up.net">HTML5 UP</a>.
				</p>
			</footer>

		</div>
	</div>


	<!-- Scripts -->

	<script src="js/jquery.min.js"></script>

	<script src="js/browser.min.js"></script>

	<script src="js/breakpoints.min.js"></script>

	<script src="js/util.js"></script>

	<script src="js/main.js"></script>

	<script src="js/login.js"></script>

