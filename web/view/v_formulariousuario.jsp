<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
                <div class="x_title">
                    <h2>Editar dados cadastrais</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form action="Usuario" method="post">
                        <input type="hidden" name="id" value="${user.id}">
                        <input type="hidden" name="funcao" value="alterar">
                        <input type="hidden" name="usuario" value="${user.usuario}">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <label>Nome</label>
                            </div>
                            <div class="col-md-6 col-xs-6">
                                <input type="text" name="nome" placeholder="Nome" class="form-control" value="${user.nome}">
                            </div>
                        </div>
                            <div class="row">
                                <div class="col-md-6 col-xs-6">
                                    <label>Peso</label>
                                </div>
                                <div class="col-md-6 col-xs-6">
                                    <input type="number" name="peso" placeholder="60" class="form-control" value="${user.peso}">
                                </div>
                            </div>
                        <div class="row">
                            <div class="col-md-12 col-xs-12">
                                <input type="submit" value="Salvar" class="btn btn-primary">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
    
</div>
<!-- /page content -->