//console.log('https://data.covid19india.org/v4/min/timeseries.min.json')
var global_data = ''
fetch('https://data.covid19india.org/v4/min/data.min.json')
  .then(response => response.json())
  .then(data =>
{
    //console.log(data)
    var k = '<tbody>';
    var index = 0;
    for(var state in data){
        //console.log(state[0])
        //console.log(data[state]['total']['deceased'])
         k+= '<tr>';
         k+= '<td>'+ state + '</td>';
         k+= '<td>'+ data[state]['total']['confirmed'] + '</td>';
         k+= '<td>'+ data[state]['total']['deceased'] + '</td>';
         k+= '<td>'+ data[state]['total']['recovered'] + '</td>';
         k+= '</tr>';
         //document.getElementById("state").innerHTML = htmlState;

     }
     k+='</tbody>';
     document.getElementById('tableData').innerHTML = k;
}
);

function search_btn()
{
    var x = document.getElementById('myText').value


    fetch('https://data.covid19india.org/v4/min/data.min.json')
    .then(response => response.json())
    .then(data =>
        {
            wrongIP_alarm = 0
            var k = '<tbody>';
            for(var state in data){
                if(x.toUpperCase() === state)
                {
                    alert('TRUE');
                    wrongIP_alarm = 0
                    alert('These are conformed cases  '+data[state]['total']['confirmed'])
                    break;

                }
                else
                {
                    wrongIP_alarm = 1
                }

            }
            if (wrongIP_alarm == 1){
                alert('wrong input')
            }

        
        }
    );

    
    
}


