
<%@page import="model.bean.MetaBean"%>
<%@page import="java.util.List"%>
<%@page import="model.dao.MetaDao"%>
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
                                <a href="formeditusuario.jsp" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                            </li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        Nome:
                       <%
                         out.print(session.getAttribute("usuario"));  
                       %>
                       <br>
                        Peso:
                        <%
                         out.print(session.getAttribute("peso"));  
                       %>


                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /page content -->