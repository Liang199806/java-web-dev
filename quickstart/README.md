#  quickstart起步模块
## 1.简单的登录
- login.html登录页面，输入用户名和密码
![Snipaste_2019-09-21_15-29-21.png](http://ww1.sinaimg.cn/large/007YPaiwgy1g7eln8pnv1j30g404b747.jpg)
- LoginServlet拦截/login.do请求，取得参数，判定是否和指定值相等，相等就将用户名存入session，然后重定向到index.jsp主页
- 主页通过jsp表达式<%= %>，用session内置对象取出用户名显示 
![Snipaste_2019-09-21_15-29-21.png](http://ww1.sinaimg.cn/large/007YPaiwgy1g7elopgsypj30xn060jri.jpg)