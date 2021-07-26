var h = require('http');
var url = require('url');
var fs = require('fs');
var server = h.createServer(function(req,res){
var url_parts = url.parse(req.url,true);
var path = url_parts.pathname.substring(1);
console.log(path);
fs.readFile(path,function(err,data){
	if(!err)
	{
		res.write(data);
		res.end();
	}else
	{
		res.write("FILE NOT FOUND")
		res.end();
	}
});

});

server.listen(9000);
console.log("SERVER STARTED at 9000");

