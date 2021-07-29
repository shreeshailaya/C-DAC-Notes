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
	//name of the file is changed for ajax using jquery
	f.readFile('ass1.html',function(err,data){
		if(!err)
		{
			res.writeHead(200,{'Content-Type':'text/html'});
			res.write(data.toString());
			res.end();
		}
	})	
 }//
     else if(pathname == '/showTable')
    {
	var address = urlp.query.Caddress;
	var query = "select * from Customer where Caddress = "+ '"'+address+'"';
	console.log(query);
	con.query(query,function(err,result){
		console.log("1");
		if(!err)
		{
			//var tempfor= "[{"custid":+v.custid+ "v.Cname":+v.Cname+}]"
			var str='[';
			res.writeHead(200,{'Content-Type':'text/html'});
			console.log(result.length);
			result.forEach(function(v){
			str += '{';
			str += '"custid":'+ v.custid +',';
			str += '"Cname": "'+ v.Cname +'",';
			str += '"Caddress": "'+ v.Caddress+'"'; 
			str += '},';

			//res.write("<p> Name : "+v.Caddress+"</p>");
				
			});
			str = str.substring(0,str.length-1);
			str += ']';
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