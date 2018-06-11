
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
                <div class="x_title">
                    <h2>Editar meta</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
         
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form action="Meta" method="post">
                        <input type="hidden" name="funcao" value="alterar">
                        <input type="hidden" name="id" value="${meta.id}">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <label>Tipo de meta</label>
                            </div>
                            <div class="col-md-6 col-xs-6">
                                <select name="tipo_meta" class="form-control">
                                    <option value="">(Selecione a meta)</option>
                                    <option value="emagrecer">Emagrecer</option>
                                    <option value="emagrecer">Engordar</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <label>Perder/ganhar</label>
                            </div>
                            <div class="col-md-6 col-xs-6">
                                <input type="number" name="peso_meta" class="form-control" placeholder="Quantos KG você quer perder ou ganhar?" value="${meta.objetivo}">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-xs-12">
                                <input type="submit" value="Enviar" class="btn btn-primary">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
    
</div>
<!-- /page content -->