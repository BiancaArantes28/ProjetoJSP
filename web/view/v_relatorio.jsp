
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
					['Educa��o',2000],
					['Transporte',500],
					['Lazer',230],
					['Sa�de',50],
					['Cart�o de cr�dito',900],
					['Alimenta��o',260]
				]);	
	
				var grafico = new google.visualization.PieChart(document.getElementById('graficoPizza'));
				grafico.draw(tabela);	
			}
			
			google.charts.setOnLoadCallback(desenharPizza);					
		</script>

	</head>
	<body>
		<div id="graficoPizza"></div>
	</body>
</html>



