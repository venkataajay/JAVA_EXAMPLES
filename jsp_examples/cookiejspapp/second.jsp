<%
Cookie[] cks=request.getCookies();
out.println("hai"+cks[0].getValue()+"your password is"+cks[1].getValue());
%>