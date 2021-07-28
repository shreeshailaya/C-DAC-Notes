var http = require('http');
var fs = require('fs');
var url = require('url');
var mysql = require('mysql');

var con = mysql.createConnection({  
  host: "localhost",  
  user: "root",  
  password: "",
  database: "emprest"  
}); 

con.connect(function(err){
	if(!err)
	    console.log("Connected");	
});

http.createServer(function(req,res){
      var url_parts = url.parse(req.url,true);
      var pathname = url_parts.pathname;
      if(pathname == '/getempid')
      {
	   fs.readFile("empidform.html",function(err,data){
		if(!err)
	   	{
                    console.log("processed");
		    res.writeHead(200,{'Content-Type':'text/html'});
		    res.write(data.toString());
		    res.end();		
		}

	   });
      }
      else if(pathname == '/getempinfo')
      {
	   var empid = url_parts.query.empid;
	   console.log(empid);
	   con.query("select * from emp",function(err,result){
		if(!err)
		{
			result.forEach(function(v){
				if(v.empid == empid)
				{
					res.write("<p> Name : "+v.ename+"</p>");
					res.write("<p> Salary : "+v.salary+"</p>");
					res.write("<p> Designation : "+v.designation+"</p>");
					res.end();
				}
			});
		}
	   });
      }	 	
}).listen(9000);

console.log("node(ajax) server running on 9000");
