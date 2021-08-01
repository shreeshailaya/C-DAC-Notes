import logo from './ass3.jpg'
var url = "https://freepngimg.com/download/google/66907-images-logo-google-free-download-png-hd.png";
var curr_date = new Date;

function WelcomeAndLogo()
{
     return (
          <div>
               <img src={url} style={{float:'left',height:"35px", width:"120px", margin:"10px"}} />
               <center><h1>Welcome to My React App </h1></center>
               <hr/><hr/>
             
               <div style={{float:'right'}}>
                   <h3> {curr_date.getDate()}/{curr_date.getMonth()}/{curr_date.getUTCFullYear()} </h3>
                   <h3> {curr_date.getUTCHours()}:{curr_date.getUTCMinutes()}</h3>
               </div>
               <br/><br/>

               
          </div>
     )
}
export default WelcomeAndLogo;