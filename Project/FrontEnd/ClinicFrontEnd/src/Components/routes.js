import React from 'react';
import {Switch, Route } from 'react-router-dom'; 

import Home from './pages/Home';
import Registration from './pages/Registration';
import Login from './pages/Login';
import DoctorRegistration from './pages/DoctorRegistration';
import Admin from './dashboard/Admin';
import Doctor from './dashboard/Doctor';
import Patient from './dashboard/Patient';
import ContactUs from './pages/ContactUs';
import ForgetPassword from './pages/ForgetPassword';
import AboutUs from './pages/AboutUs';
import ApplyLeave from './Doctor/ApplyLeave';
import Dr_Profile from './Doctor/Dr_Profile';
import PatientProfile from './Patient/PatientProfile';
import PatientHistory from './Doctor/PatientHistory';
import BookAppointment from './Patient/BookAppointment';
import ViewDoctors from './Patient/ViewDoctors';
import DisplayDoctors from './Admin/DisplayDoctors';
import DisplayPatient from './Admin/DisplayPatient';
import ApproveLeave from './Admin/ApproveLeave';
import ViewAppointments from './Doctor/ViewAppointments';



const Routes = () => {
    return (
      <Switch>
          <Route exact path="/" component={Home} />;
          <Route exact path="/registration" component={Registration} />;
          <Route exact path="/login" component={Login} />;
          <Route exact path="/dr_registration" component={DoctorRegistration}/>
          <Route exact path="/contactus" component={ContactUs}/>
          <Route exact path="/aboutus" component={AboutUs}/>
          <Route exact path="/forget_password" component={ForgetPassword}/>

          <Route exact path="/admin" component={Admin}/>
          <Route exact path="/doctor" component={Doctor}/>
          <Route exact path="/patient" component={Patient}/>


          <Route exact path="/applyleave" component={ApplyLeave}/>
          <Route exact path="/dr_profile" component={Dr_Profile}/>


          <Route exact path="/patientprofile" component={PatientProfile}/>
          <Route exact path="/patienthistory" component={PatientHistory}/>
          <Route exact path="/bookappointment" component={BookAppointment}/>

          <Route exact path="/viewdoctors" component={ViewDoctors}/>
          
          <Route exact path="/displaydoctors" component={DisplayDoctors}/>
          <Route exact path="/displaypatient" component={DisplayPatient}/>
          <Route exact path="/approveleave" component={ApproveLeave}/>
          <Route exact path="/viewappointments" component={ViewAppointments}/>

          
      </Switch>
    );
  };
  
  export default Routes;