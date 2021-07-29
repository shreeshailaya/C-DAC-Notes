var f = require('fs');
var h = require('http');
var u = require('url');
var mysql = require('mysql');


var con = mysql.createConnection({

	host: "localhost",
	user: "admin",
	password: "password",
	database: "10june"
});


con.connect(function(err)
{
	if(!err)
		console.log("Connected");
	else
		console.log(err);
});



h.createServer(function(req,res){
    var urlp = u.parse(req.url,true);
    var pathname = urlp.pathname
    if(pathname == '/showHtml')
    {
	
	f.readFile('ass2.html',function(err,data){
		if(!err)
		{
			res.writeHead(200,{'Content-Type':'text/html'});
			res.write(data.toString());
			res.end();
		}
	})	
 }//
    else if(pathname == '/showGreet')
    {
	var custid = urlp.query.custid;
	var query = "select * from Customer where custid = "+ custid;
	console.log(query);
	con.query(query,function(err,result){
		console.log("1");
		if(!err)
		{
			var greet="GOOD NIGHT";
			var date_ob = new Date();
			console.log("CurrentTIME  : "+date_ob.getHours());
			var currTime = date_ob.getHours();
			if(currTime >6 && currTime < 12)
			{
				greet = "GOOD MORNING";
			}else if(currTime>12 && currTime < 20)
			{
				greet = "GOOD EVENING"
			}
			//var tempfor= "[{"custid":+v.custid+ "v.Cname":+v.Cname+}]"
			var str='{';
			res.writeHead(200,{'Content-Type':'text/html'});
			console.log(result.length);
			result.forEach(function(v){

			str += '"Cname": "'+ v.Cname +'",';
			str += '"greetMsg": "'+	greet + '"';
			//res.write("<p> Name : "+v.Caddress+"</p>");
				
			});
			
			str += '}';
			console.log(str);
			res.write(str);
			res.end();	
		}else
		{
			console.log(err);
		}
	});
	
    }
}).listen(9000);