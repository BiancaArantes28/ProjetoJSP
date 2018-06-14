<%
    String usuario = (String)session.getAttribute("usuario");
    String peso = (String)session.getAttribute("id");
%>
<%@page import="model.bean.MetaBean"%>
<%@page import="model.bean.UsuarioBean"%>
<%@page import="java.util.List"%>
<%@page import="model.dao.MetaDao"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- page content -->
<div class="right_col" role="main">
    <div class="">

        <div class="clearfix"></div>
        <div class="message-sucess">${messagem}</div>
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>Dados</h2>
                        <ul class="nav navbar-right panel_toolbox">
                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                            </li>
                            <li>
                                <a href="Usuario?funcao=editar&id=${user.id}" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                            </li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        Nome:${user.nome}
                       <br>
                        Peso:${user.peso}


                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /page content -->