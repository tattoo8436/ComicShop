
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
         <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
        <div class=" text-center">
		<img src="image/TTTC.png" width="auto" height="auto" /><br> <br>
		<h2>
			<strong>Đặt hàng thành công.</strong>
                        <p>Đơn hàng của quý khách đã được ghi lại.</p>
		</h2>
	</div>
        <div align="center">
            <a href="home" class="btn btn-primary"><b>Tiếp tục mua sắm</b></a>
	</div>
    </body>
</html>
