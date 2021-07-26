exports.msg="Hello World";
exports.calArea=function(r){
	return 3.14*r*r;
}
exports.isPrime=function(r){
	var count;
	var res;
	for(i=2;i<r;i++)
	{
		if(r%i==0)
		{
			count++;
			break;
		}
		else
		{
			count =0;
		}
	}
	if(count == 0)
	{
		res = "IS A PRIME"
	}else
	{
		res = "NOT PRIME"
	}
	return res;
}

exports.calFact=function(r){
	var res=1;
	for(i=1;i<=r;i++)
	{
		res *=i;
	}
	return res;
}

exports.isPerfect=function (r) {
    return n > 0 && Math.sqrt(n) % 1 === 0;
};