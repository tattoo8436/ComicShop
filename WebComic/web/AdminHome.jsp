
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1 class="display-4"><strong>Trang quản trị</strong></h1>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 pt-3" >
                    <div class="card" style="background-color:white;">
                        <div class="card-body">
                            <h4 class="card-title">Hoá đơn</h4>
                            <p class="card-text">Xem tất cả hoá đơn tại đây.</p>
                            <a href="managerbill" class="card-link btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-3 pt-3" >
                    <div class="card" style="background-color:white;">
                        <div class="card-body">
                            <h4 class="card-title">Sản phẩm</h4>
                            <p class="card-text">Quản lý tất cả sản phẩm tại đây.</p>
                            <a href="managerproduct" class="card-link btn btn-primary">Chi tiết</a>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
