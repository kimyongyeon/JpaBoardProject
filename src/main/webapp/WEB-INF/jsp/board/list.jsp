<!-- 한글깨짐 방지를 위해 아래 두 조건은 항상 셋트임. -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- directive.jsp 는 각 페이지 마다 넣어줘야 함. -->
<%@ include file="/WEB-INF/jsp/common/directive.jsp"%>
<table>
    <tr>
        <td>번호</td>
        <td>제목</td>
        <td>조회수</td>
    </tr>
    <c:forEach var="row" items="${list}">
    <tr>
        <td><c:out value="${row}"/></td>
        <td><c:out value="${row}"/></td>
        <td><c:out value="${row}"/></td>
    </tr>
    </c:forEach>

</table>