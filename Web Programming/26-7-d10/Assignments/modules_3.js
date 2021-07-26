var h = require('http');
var url = require('url');
var server = h.createServer(function(req,res){
var url_parts = url.parse(req.url,true);
var name = url_parts.query.name;
console.log(url_parts.query.name);
res.write("Welcome "+name);
res.end();

});

server.listen(9000);
console.log("SERVER STARTED at 9000");

// http://localhost:9000/?name=shree