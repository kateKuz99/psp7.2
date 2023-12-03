<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Sorting Result</title>
</head>
<body>
<h2>Sorting Result</h2>
<%
  int[] sortedNumbers = (int[]) request.getAttribute("sortedNumbers");
  for (int number : sortedNumbers) {
    out.println(number + " ");
  }
%>
</body>