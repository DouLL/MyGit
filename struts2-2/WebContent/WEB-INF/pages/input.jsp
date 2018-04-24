<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		padding: 0;
		margin: 0;
	}
</style>
</head>
<body>
	<div>
		<form action="product-save.action" method="post">
			
			ProductName:<input type="text" name="productName" />
			<br><br>
			ProductDesc:<input type="text" name="productDesc" />
			<br><br>
			ProductPrice:<input type="text" name="productPrice" />
			<br><br>
			<input type="submit" value="submit"/>
		</form>
	</div>
</body>
</html>