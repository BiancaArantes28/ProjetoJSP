<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="header.jsp"%>    
    </head>
    <body class="nav-md">
        <div class="container body">
            <div class="main_container">
                <input type='hidden' name='funcao' value=''>
                <%@include file="sidebar.jsp"%>
                <%@include file="topmenu.jsp"%>
                <%@include file="view/v_cliente.jsp"%>
                <%@include file="footer.jsp"%>
                <%@include file="script.jsp"%>
            </div>
        </div>
    </body>
</html>
