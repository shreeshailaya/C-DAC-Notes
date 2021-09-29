import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import Header from './homePageComponents/Header';
import './css/aboutus.css';
class AboutUs extends React.Component{
    render()
    {
        return(
            <div>
            <Header />
      <section class=" bg-dark">
        
          <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col">
            <div class="card card-registration my-4">
      <div class="col-xl">
  
      <section class="text-center about">
      <h1>About Us</h1>
      <section class="bg-White c-quality-healthcare-wrapper coverbanner">
  <div class="row center-block">
    <div class="col-xs-12 col-sm-12 clear-hboth text-center">
      <div>
          <img class=" vector" alt="Practo&#x27;s Promise"
          title="Practo&#x27;s Promise" src= "https://www.practo.com/providers/static/images/pages/company/about/quality-healthcaremadesimple.svg"/>
      </div>
    </div>
  </div>
</section>
<br/>
      <div class="container">
        <div class="row">
          <div class="col-xl-12 about-item wow lightSpeedIn" data-wow-offset="200" >
            
            <span class="fa fa-group"></span>
            <br/>
            <h2>Our Vision</h2>
            <p class="lead">Enable healthcare businesses to provide superior healthcare delivery and patient care with technology – globally</p>
          </div>
         
          <div class="col-xl-12 about-item wow lightSpeedIn " data-wow-offset="200">
          <div class="row center-block">
  </div>
<div class="clearfix"></div>
            <span class="fa fa-info" ></span>
            <br/>
            <h2>Our Mission </h2>
            <p class="lead">Online Clinic Management System is on a mission to make quality healthcare affordable and accessible for over a billion+ Indians. We believe in empowering our users with the most accurate, comprehensive, and curated information and care, enabling them to make better healthcare decisions.</p>
            <div class="row">
            <div class="col-xl-12 about-item wow lightSpeedIn" data-wow-offset="200" >
            </div>
    </div>
    
          </div>
        </div>
      </div>
    </section>
    <div>
                    
            </div>
    

                  <p></p>
                </div>
              </div>
            
          </div>
        
      </div>
    </section>
      </div>
        )
    }
}
export default withRouter(AboutUs);