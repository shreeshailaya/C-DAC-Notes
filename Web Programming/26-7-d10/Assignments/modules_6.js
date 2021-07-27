var h = require('http');
var u = require('url');
var f = require('fs');

h.createServer(function(req,res){
	var url_parts = u.parse(req.url,true);
        var fname = url_parts.pathname;
	var time = new Date();
        var str = "Request received for "+fname+" at "+time+"\n";
        f.appendFile('log.txt',str,function(err){
		if(!err)
			console.log("logged the request");
	});
	res.writeHead(200,{'Content-Type':'text/html'});
	res.write("Hello, Your request is logged ");
	res.end();

}).listen(9000);

console.log("server started at 9000");