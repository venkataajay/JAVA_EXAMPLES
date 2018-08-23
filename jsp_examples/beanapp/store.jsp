<jsp:useBean id="stu" class="info.inetsolv.Student" scope="session"/>
<jsp:setProperty name="stu" property="rollno" param="rno"/>
<jsp:setProperty name="stu" property="name" param="name"/>
<jsp:setProperty name="stu" property="marks" param="marks"/>
<jsp:setProperty name="stu" property="result" param="result"/>
all the values are stored in the javaBean to see the values <a href=display.jsp> Clickhere</a>