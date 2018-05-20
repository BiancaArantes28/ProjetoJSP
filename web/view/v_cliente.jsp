<!-- page content -->
<div class="right_col" role="main">
    <div class="">

        <div class="clearfix"></div>

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
                         out.print(session.getAttribute("user"));  
                       %>
                       <br>
                        Peso:
                        <%
                         out.print(62);  
                       %>


                    </div>
                </div>
            </div>
        </div>


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
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Tipo de meta</th>
                                    <th>Objetivo</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="display-1">
                                    <td>Emagrer</td>
                                    <td>Perder 10kg</td>
                                    <td><a href="formeditmeta.jsp"><i class="fa fa-pencil-square-o"></i></a><i class="fa fa-trash excluir-meta" data-meta="1" aria-hidden="true"></i></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
        </div>


    </div>
</div>
<!-- /page content -->