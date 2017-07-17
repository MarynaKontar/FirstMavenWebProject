<%@page isErrorPage="true" %>  <!-- это означает, что теперь мы можем выводить при  ошибке не только <h2>,
но и саму причину ошибки  exception.getMessage()  (в данном случае "A name should be entered"
(throw new ServletException("A name should be entered")))-->
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
    <!--link - устанавливает связь с внешним документом вроде файла; href - путь к файлу, на который делается ссылка (URL)-->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="metro-bootstrap-master/css/metro-bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h2>An error has occurred.</h2>
<%= exception.getMessage()%>
</body>
</html>
