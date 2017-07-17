

<!DOCTYPE html>
<html>
<head>
    <title>My App</title>
    <!--link - устанавливает связь с внешним документом вроде файла; href - путь к файлу, на который делается ссылка (URL)-->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="metro-bootstrap-master/css/metro-bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@include file="_header.jsp"%>

<section class="main container-fluid">
    <div class="container">
        <h1>Home</h1>

        <div class="row-fluid">
            <div class="col-md-3">Sidebar</div>
            <div class="col-md-9">
                <tabset>
                    <tab heading="Search">
                        <div>
                            <form action="home" method="post">
                                <p>
                                    Name: <input type="text" name="name">
                                </p>
                                <p>
                                    <input type="submit" value="Enter name">
                                </p>
                            </form>
                        </div>
                    </tab>
                    <tab heading="Next">
                        Yet more Static content
                    </tab>
                </tabset>
            </div>
        </div>
    </div>
</section>
<script src="bootstrap/js/bootstrap.js"></script>

</body>
</html>




<!--
<h2>Hello Worlddddd!</h2>

<form action="/pluralsight" method="post">
<p>Name:
<input type="text" name="name"/>
</p>
<p>
<input type="submit" value="Enter name" />
</p>
</form>






