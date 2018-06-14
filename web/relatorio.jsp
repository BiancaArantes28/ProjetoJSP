

<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="header.jsp"%>   
        <style>
            body{
                background-color: #FFF;
            }
        </style>
    </head>
    <body class="nav-md">
        <div class="container body">
            <div class="main_container">
                
                <input type='hidden' name='funcao' value=''>
                <%@include file="view/v_relatorio.jsp"%>
            </div>
        </div>
    </body>
</html>
