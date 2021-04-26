<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.task.list.label.title" path="title" width="20%"/>
	<acme:list-column code="anonymous.shout.list.label.description" path="description" width="20%"/>
	<acme:list-column code="anonymous.shout.list.label.start" path="start" width="60%"/>
	<acme:list-column code="anonymous.shout.list.label.end" path="end" width="20%"/>
	<acme:list-column code="anonymous.shout.list.label.workload" path="workload" width="20%"/>
</acme:list>