<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
<div class="container-fluid">
    <div class="row bg-secondary py-2 px-xl-5">
        <div class="col-lg-6 d-none d-lg-block">
            <div class="d-inline-flex align-items-center">
                <c:if test="${sessionScope.acc.isAdmin == 1}">
                    <a class="text-light" href="managerproduct">Quản lý sản phẩm</a>
                    <span class="text-muted px-2">|</span>
                </c:if>
                <c:if test="${sessionScope.acc != null}">
                    <a class="text-light" href="">Xin chào ${sessionScope.acc.user}</a>
                    <span class="text-muted px-2">|</span>
                    <a class="text-light" href="logout">Đăng xuất</a>
                </c:if>
                <c:if test="${sessionScope.acc == null}">
                    <span class="text-muted px-2">|</span>
                    <a class="text-light" href="Login.jsp">Đăng nhập</a>
                </c:if>
            </div>
        </div>
    </div>
</div>
<div class="row align-items-center py-3 px-xl-5">
    <div class="col-lg-3 d-none d-lg-block">
        <a href="" class="text-decoration-none">
            <h3 class="m-0 display-5 font-weight-semi-bold">
                <a class="text-primary font-weight-bold border px-3 mr-1" href="home">Shop truyện tranh</a>
                </div>
                <div class="col-lg-6 col-6 text-left">
                    <form action="search" method="post">
                        <div class="input-group">
                            <input name="txt" value="${txts}" type="text" class="form-control" placeholder="Tìm truyện">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-secondary btn-number">
                                    <i class="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
                </div>
                </div>
                <!--end of menu-->