
<%
    try {
        
        String user = (String) session.getAttribute("usuario");
        if (user.equals("")) {
            response.sendRedirect("login.jsp");
        }
    } catch (NullPointerException e) {
        response.sendRedirect("login.jsp");
    }

%>
<%@page import="model.bean.MetaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
		<script>
			google.charts.load('current', {'packages':['corechart']});
			function desenharPizza(){
				var tabela = new google.visualization.DataTable();
				tabela.addColumn('string','categorias');
				tabela.addColumn('number', 'valores');
				tabela.addRows([
					['Não concluída',1],
					['Concluída',1],
					['Em andamento',4]
				]);	
	
				var grafico = new google.visualization.PieChart(document.getElementById('graficoPizza'));
				grafico.draw(tabela);	
			}
			
			google.charts.setOnLoadCallback(desenharPizza);					
		</script>

	</head>
	<body>
        <center><h1>Relatórios de Metas</h1></center>
      
            <table id="data-table" class="display" style="width:100%">
                            <thead>
                                <tr>
                                    <th>Tipo</th>
                                    <th>Objetivo</th>
                                    <th>Status</th>
                                    <th>Ação</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${listaMetas}" var="meta">
                                <tr>
                                    <td>${meta.tipometa}</td>
                                    <td>${meta.objetivo}</td>
                                    <td>${meta.status}</td>
                                    <td><a href='Meta?funcao=editar&id=${meta.id}'>Editar</a> | <a href='Meta?funcao=excluir&id=${meta.id}'>Excluir</a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
        <hr>
		<div id="graficoPizza"></div>
	</body>
</html>



