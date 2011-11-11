<%@ page import="libre.Item" %>



<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="item.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${itemInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="item.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${itemInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'category', 'error')} required">
	<label for="category">
		<g:message code="item.category.label" default="Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="category" name="category.id" from="${libre.Category.list()}" optionKey="id" required="" value="${itemInstance?.category?.id}" class="many-to-one"/>
</div>

