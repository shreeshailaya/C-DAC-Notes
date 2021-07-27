var http = require('http');
var mysql = require('mysql');  

var con = mysql.createConnection({
    host: "localhost",
    user: "admin",
    password: "password",
    database: "knowitdb"		
});

con.connect(function(err){
     if(err)
	console.log(err.toString());
     else
	console.log("Connected");		
});

http.createServer(function(req,res){
     if(req.url == '/emps')
     {
	 
	 con.query("select * from knowitdb.EMP",function(err,result){
		if(!err)
		{
			res.writeHead(200,{'Content-Type':'text/html'});
			res.write("<table border=1>");
			res.write("<th>EMPNO</th>");
			res.write("<th>EmpName</th>");
			result.forEach(function(v){
				res.write("<tr>");
				res.write("<td>"+v.EMPNO+"</td>");
				res.write("<td>"+v.ENAME+"</td>");
			
				res.write("</tr>");
			});
			res.end();
		}		
	});
     }
}).listen(9000);

console.log("Node web server running on 9000")

//ALTER USER 'admin'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
//select * from knowitdb.EMP;
