<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="header.jsp"%>
    </head>
    <%

        try {
            String user = (String) session.getAttribute("usuario");
            
        } catch (NullPointerException e) {
            session.setAttribute("usuario", "");
            
        }
    %>
    <body class="login">
        <div>
            <a class="hiddenanchor" id="signup"></a>
            <a class="hiddenanchor" id="signin"></a>

            <div class="login_wrapper">
                <div class="animate form login_form">
                    <section class="login_content">
                        <form action="./Logar" method="post">
                            <h1>Login do SISTEMA</h1>
                            <div>
                                <input type="text" name="user" id="user" class="form-control" placeholder="Usuário" required="" />
                            </div>
                            <div>
                                <input type="password" name="senha" id="senha" class="form-control" placeholder="Senha" required="" />
                            </div>
                            <div>
                                <input type="submit" value="Logar"> 
                                <!--
                                <a class="btn btn-default submit" href="sistema.jsp">Log in</a>
                                <a class="reset_pass" href="#">Esqueceu a senha?</a>
                                -->
                            </div>

                            <div class="clearfix"></div>

                            <div class="separator">
                                <p class="change_link">Novo no site?
                                    <a href="#signup" class="to_register"> Criar uma nova conta </a>
                                </p>

                                <div class="clearfix"></div>
                                <br />

                                <div>
                                    <h1><i class="fa fa-paw"></i> Sistema JSP!</h1>
                                    <p>Sistema JSP! Criado por grupo...</p>
                                </div>


                            </div>
                        </form>
                        <%session.setAttribute("user", "Daniel");%>
                    </section>
                </div>

                <div id="register" class="animate form registration_form">
                    <section class="login_content">
                        <form>
                            <h1>Create Account</h1>
                            <div>
                                <input type="text" class="form-control" placeholder="Username" required="" />
                            </div>
                            <div>
                                <input type="email" class="form-control" placeholder="Email" required="" />
                            </div>
                            <div>
                                <input type="password" class="form-control" placeholder="Password" required="" />
                            </div>
                            <div>
                                <a class="btn btn-default submit" href="index.html">Submit</a>
                            </div>

                            <div class="clearfix"></div>

                            <div class="separator">
                                <p class="change_link">Already a member ?
                                    <a href="#signin" class="to_register"> Log in </a>
                                </p>

                                <div class="clearfix"></div>
                                <br />

                                <div>
                                    <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                                    <p>Â©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>
            </div>
        </div>
    </body>
</html>
