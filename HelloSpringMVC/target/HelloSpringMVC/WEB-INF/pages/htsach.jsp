<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>Department List</title>
  </head>
  <body>
      <div align="center">
          <h1>sach List</h1>
          <table border="1">
              <tr>
              	<th>STT</th>
                <th>Mã sách</th>
                <th>Tên sách</th>
                <th>Tác giả</th>
                <th>Số lượng</th>
                <th>Giá</th>
                <th>Ảnh</th>
                <th>Mã loại</th>
                <th>Ngày nhập</th>
                <th>Số tập</th>
              </tr>
              <c:forEach var="s" items="${sach}" varStatus="status">
              <tr>
                  <td>${status.index + 1}</td>
                  <td>${s.getMasach()}</td>
                  <td>${s.getTensach()}</td>
                  <td>${s.getTacgia()}</td> 
                  <td>${s.getSoluong()}</td>
                  <td>${s.getGia()}</td>
                  <td>${s.getAnh()}</td>
                  <td>${s.getMaloai()}</td>
                  <td>${s.getNgayNhap()}</td>
                  <td>${s.getSotap()}</td>                      
              </tr>
              </c:forEach>                
          </table>
      </div>
  </body>
</html>