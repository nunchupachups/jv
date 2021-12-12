<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>NHAN VIEN</title>
<style type="text/css">
.child{
	max-height: 380px;  
    overflow: auto;
    overflow: -moz-scrollbars-none;
    -ms-overflow-style: none;
}
.child::-webkit-scrollbar { 
	  width: 0 !important;
	  display: none; 
}
</style>
</head>
<body style="background-color: rgb(240,240,240);" >
	<div style=" width: 1100px;margin:auto;margin-top: 30px;">
		<form action="nhanvien" method="post">
			<input type="text" name="key" value='${key1}' placeholder="Nhập họ tên hoặc địa chỉ " size="40" style="background-image:linear-gradient(90deg ,rgba(222, 222, 222, 0.5) 20%,rgba(135, 60, 120, 0.5)) , url('./anh/bg.png') ;border:none;border-radius:40px;  height: 40px; padding-left: 15px;color:white;">
			<input type="submit" value="Tìm kiếm" style="background-color:rgb(114, 122, 167);border:none;border-radius:40px;  height: 40px;color:white;">
		</form>
	</div>
	<div style=" width: 1100px;height: 400px;margin:auto;margin-top: 30px; background-image:linear-gradient(90deg ,rgba(71, 144, 240, 0.5) 20%,rgba(135, 60, 197, 0.5)) , url('./anh/bg.png'); border-radius: 50px;">
		<br><br><br>
		<div class="child" style="height: 320px;">
		<c:choose>
			<c:when test="${ds.isEmpty() }">
				<h3 style="color: rgb(50, 50, 50) ;width: 380px; margin: auto; margin-top: 100px;" ><b>Không tìm thấy kết quả phù hợp </b></h3>
			</c:when>
			<c:otherwise>
				<table class="table table-bordered" style="margin: auto; width: 1000px; color: white; ">
				<thead style="background-color:rgba(114, 122, 167, 0.5);width: 1000px; top: 123px;position: fixed;border-top: 1px solid #ddd;">
					<th width="200px">Mã Nhân Viên</th>
					<th width="300px">Tên Nhân Viên</th>
					<th width="300px">Địa Chỉ</th>
					<th width="200px">Hệ số lương</th>
				</thead>
				<tbody>
					<c:forEach items="${ds }" var="nv">
						<tr>
							<td width="200px">${nv.getManv() }</td>
							<td width="300px">${nv.getHoTen() }</td>
							<td width="300px">${nv.getDiaChi() }</td>
							<td width="200px">${nv.getHSL() }</td>
						</tr>
					</c:forEach>
				</tbody>
				</table>
			</c:otherwise>
		</c:choose>
		</div>
	</div>
	
</body>
</html>