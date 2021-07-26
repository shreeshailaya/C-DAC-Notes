var h = require('http');

var server = h.createServer(function(req,res){
res.writeHead(200,{'Content-Type':'text/html'});
res.write("Hello From server");
res.end();

});

server.listen(9000);
console.log("SERVER STARTED at 9000");

