var h = require('http');
var f = require('fs');

h.createServer(function(req,res){
	if(req.url == '/favicon.ico')
		return;
	f.readFile('count.txt',function(err,data){
		var cnt = parseInt(data);
		cnt++;
		f.writeFile('count.txt',String(cnt),function(err){
			if(!err)
				console.log("count updated");
		});
		res.writeHead(200,{'Content-Type':'text/html'});
		res.write("<h3>Request count : "+cnt+"</h3>");
		res.end();	
	});

}).listen(9000);

console.log("node server running on 9000")