import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import NavbarAdmin from '../Admin/NavbarAdmin';
import Cookies from 'universal-cookie';


class DisplayDoctors extends React.Component{

    constructor(props)
    {
        super(props)
        this.state={
            doctors:[]
        }
    }



    componentDidMount()
  {
    const cookies = new Cookies();
    var api_get = "http://localhost:8080/auth/v1/get_doctors_info"
    fetch(api_get)
    .then(resp=>resp.text())
    .then(data=> {

     const json = JSON.parse(data);
   
    for(var i=0;i<json.length;i++)
    {
        
            var fn = json[i][0].fname;
            var ln = json[i][0].lname;
            var contact=json[i][0].contact_no;
            var address=json[i][0].address;

            var qua = json[i][1].qualification;
            var spe = json[i][1].specialization;
            var time = json[i][1].time_slot;
            var fees = json[i][1].fees;
            var exp  = json[i][1].experience;

            //var final = "Name:-"+fn+" Last Name:-"+ln+" Qualification:-"+qua+" Specilization:-"+spe+" Time"+time+" Fees:-"+fees+" Experience:-"+exp;
            //var final = "\n<b>Name</b>"+fn+"\n"+exp+"\n";

            var final = '<center><div class="card text-white bg-dark mb-3" style="max-width: 50rem;"><div class="card-header" style="color:blueviolet"><b>'+spe+'</b></div><div class="card-body"><h5 class="card-title">Dr. '+fn+" "+ln+'</h5><p class="card-text">  '+qua+' with '+exp+' years of Experience'+'</p><p class="card-text">Consultation Fees : ₹'+fees+'/-</p><p class="card-text">Time Slot :'+time+'</p><p class="card-text">Contact No :'+contact+'</p><p class="card-text">Address :'+address+'</p> </div></div></center>'
            //var final = ' <ul class="list-group list-group-flush"> <li class="list-group-item">Cras justo odio</li><li class="list-group-item">Dapibus ac facilisis in</li><li class="list-group-item">Vestibulum at eros</li> </ul>'
            this.setState({
                doctors: this.state.doctors.concat(final)
              })
            
        
    }

   }
  );
    

}



    render(){
        return (
            
            <div>
                <NavbarAdmin/>
               <h1>View doctors</h1>
               
                    {
                        this.state.doctors.map(
                            obj=>{
                                return(
                                    
                                    <div dangerouslySetInnerHTML={{ __html:obj }} /> 
                                    
                                )
                            }
                        )
                    }
                
            
            </div>
        )
    }
}
export default withRouter(DisplayDoctors);