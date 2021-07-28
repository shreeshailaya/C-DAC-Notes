var fs = require('fs');
var url = require('url');
var http = require('http');

var mysql = require('mysql');
var con = mysql.createConnection({
	host:"localhost",
	user:"root",
	password:"12345",
	database:"knowit"

});
var server = http.createServer(function(req,res){
	var url_parts = url.parse(req.url,true);
	var requesturl = url_parts.pathname;
	console.log(requesturl);
	res.writeHead(200,{'Content-Type':'text/html'});

	if (requesturl == '/home') {		
		fs.readFile('RegistrationDetails.html',function(err,data){
			if (!err) {
				console.log(data.toString());
				res.write(data.toString());
				res.end();
			}
			else
				console.log(err);
		});		
	}
	if(requesturl == '/getuser'){
		var userId = url_parts.query.uid;
		console.log(userId);
		con.connect(function(err){
			console.log(err);
			if(!err){
				console.log("Connection Established");
				console.log("Select * From users where u_id='" + userId + "'");
			   con.query("Select * From users where u_id='"+userId+"'",function(err,result){
				if(!err){
				    res.writeHead(200,{'Content-Type':'text/html'});
				    res.write("<center><h1>Using Third Party Node Module Mysql</h1><br><br><br>");	      
				    console.log(result.toString());
				    if(result.toString() == ""){					
					res.write("<h3 style='color:red'> User Not Found </h3>");	
				    } 		
				    result.forEach(function(record){
					res.write("<h3 style='color:green'> Welcome To Web Programming </h3>");
				    });	
		
				    res.write("</center>");	
				    res.end();
				}else {
				    res.write("<h3 style='color:red'> User Not Found </h3>");	
				    res.end();					
				}
			   }); 	
			}
		});
	}		
});
server.listen(9000);
console.log("Application is running on port no 9000");
console.log("Started reading data from File....");

