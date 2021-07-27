var h = require('http');
var u = require('url');
var f = require('fs');

h.createServer(function(req,res){
	var urlp = u.parse(req.url,true); 
	var pathname = urlp.pathname;
	if(pathname == '/unm')
	{
		f.readFile('unmform.html',function(err,data){
			if(!err)
			{
				res.writeHead(200,{'Content-Type':'text/html'});
				res.write(data.toString());
				res.end();
			}
		});
	}
        else if(pathname == '/greet')
	{
		console.log("in greet request");
		//whatever entered by user in text field
		var nm = urlp.query.unm;
		res.writeHead(200,{'Content-Type':'text/html'});
		res.write("<h1> Welcome "+nm+"</h1>");
		res.end();
	}

}).listen(9000);

console.log("server started at 9000");