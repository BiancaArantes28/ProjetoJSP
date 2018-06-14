
<%@page import="model.bean.MetaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- page content -->
<div class="right_col" role="main">
    <div class="message-sucess">${messagem}</div>
    <div class="">

        <div class="clearfix"></div>

        


        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>Metas</h2>
                        <ul class="nav navbar-right panel_toolbox">
                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                            </li>
                            <li><a href="formaddmeta.jsp"><i class="fa fa-plus" aria-hidden="true"></i></a></li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <br>
                        <table id="data-table" class="display" style="width:100%">
                            <thead>
                                <tr>
                                    <th>Tipo</th>
                                    <th>Objetivo</th>
                                    <th>Ação</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${listaMetas}" var="meta">
                                <tr>
                                    <td>${meta.tipometa}</td>
                                    <td>${meta.objetivo}</td>
                                    <td><a href='Meta?funcao=editar&id=${meta.id}'>Editar</a> | <a href='Meta?funcao=excluir&id=${meta.id}'>Excluir</a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
        </div>


    </div>
</div>
<!-- /page content -->