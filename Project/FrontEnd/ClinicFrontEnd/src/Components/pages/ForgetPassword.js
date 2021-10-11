import React, { useContext } from 'react';
//import './Login.css';
import Header from './homePageComponents/Header';
import { withRouter, Redirect } from 'react-router-dom';
import Cookies from 'universal-cookie';
import otpGenerator from 'otp-generator';
//http://136.243.145.204/sendSMS?username=Mech2it&message=Your%20OTP%20for%20Online%20Clinic%20is%20224042%20valid%20for%2010%20min,%20thank%20you%20for%20using%20gateway%20sms.vitkar.tech(SHREVI)%20-%20%3CShreeshailya%20Vitkar%3E&sendername=SHREVI&smstype=PROMO&numbers=8483036123&apikey=01255428-72b3-4535-a284-70efbf746fb7

class ForgetPassword extends React.Component {
  /**
   * @param props
   */
  constructor(props) {
    super(props);
    this.state =
        {
          email : "",
          mobile : "",
          loginerr : "",
          otp : "",
          opt_status : "",
          nohide : false,
          mobile_digit_err : "",
          sms_api : "",
          mobile_found : "",
          password : ""

        }
  }

  /**
   * Set cookies
   */
  componentDidMount() {
    const cookies = new Cookies();
    const otp = otpGenerator.generate(6, { upperCase : false, specialChars : false });
    const ddotp = otp;
    // alert(otp)
    cookies.set('otp', otp, { path : '/' });

  }

  /**
   * Set state of email
   * @param event
   */
  email = (event) => {
    this.setState({ email : event.target.value });
  }

  /**
   * Set state of nohide, mobile
   * @param event
   */
  mobile = (event) => {

    if (event.target.value.length < 10) {
      this.setState({ mobile_digit_err : "Enter valid 10 digit number" })

    } else if (event.target.value.length == 10) {

      this.setState({ nohide : true })
      this.setState({ mobile : event.target.value });
      var no = event.target.value;
      var smsapi = "http://136.243.145.204/sendSMS?username=Mech2it&message=Your%20OTP%20for%20Online%20Clinic%20is%20224042%20valid%20for%2010%20min,%20thank%20you%20for%20using%20gateway%20sms.vitkar.tech(SHREVI)%20-%20%3CShreeshailya%20Vitkar%3E&sendername=SHREVI&smstype=PROMO&numbers=" + { no } + "&apikey=01255428-72b3-4535-a284-70efbf746fb7";
      var forget_api = "http://localhost:8080/auth/v1/forget_password?contact_no=" + event.target.value;
      //alert(forget_api);

      this.mobileHandle(event.target.value);


    }

  };

  /**
   * Fetch data and set state of password and nohide
   * @param api
   */
  mobileHandle(api) {
    alert(api)

    fetch("http://localhost:8080/auth/v1/forget_password?contact_no=" + api)
        .then(resp => resp.text())
        .then(data => {
          if (data.length != 0) {
            alert(data)
            const json = JSON.parse(data)
            const cookies = new Cookies()
            //alert("json"+json.contact_no)
            const no = json.contact_no;
            this.setState({ password : json.password })
            fetch("http://136.243.145.204/sendSMS?username=Mech2it&message=Your%20OTP%20for%20Online%20Clinic%20is%20" + cookies.get('otp') + "%20valid%20for%2010%20min,%20thank%20you%20for%20using%20gateway%20sms.vitkar.tech(SHREVI)%20-%20%3CShreeshailya%20Vitkar%3E&sendername=SHREVI&smstype=PROMO&numbers=" + no + "&apikey=01255428-72b3-4535-a284-70efbf746fb7")
                .then(resp => resp.text())
                .then(data => {
                  alert(data);
                });
          } else {
            this.setState({ nohide : false })
            alert("mobile Number not matched in DB renter");
          }
        });
  }

  /**
   * Fetch data and set state of otp status
   * @param e
   */
  checkOtp = (e) => {
    const cookies = new Cookies()
    if (e.target.value == cookies.get('otp')) {
      fetch("http://136.243.145.204/sendSMS?username=Mech2it&message=your%20password%20is%20" + this.state.password + "%20thanks%20for%20using%20our%20clinic%20management%20system%20SHREVI-%3CSHREVI%3E&sendername=SHREVI&smstype=PROMO&numbers=8483036123&apikey=01255428-72b3-4535-a284-70efbf746fb7")
          .then(resp => resp.text())
          .then(data => {

          });


      this.setState({ opt_status : "OTP verified password is sent to your mobile" })


    } else {
      this.setState({ opt_status : "Wrong OTP" })
      //alert(this.state.otp)
    }
  }


  /**
   * Set state of otp, nohide and loginerr
   * Submit function
   * @param e
   */
  submitData = (e) => {

    var otpGenerator = require('otp-generator');
    const otp = otpGenerator.generate(6, { upperCase : false, specialChars : false });
    this.setState({ otp : this.state.otp });

    //alert(otp)


    fetch("")
        .then(resp => resp.text())
        .then(data => {
          if (data.length != 0) {
            //alert(data)

            this.setState({ nohide : true })


          } else {
            this.setState({ loginerr : "wrong ID/mobile" });
            alert(this.state.loginerr);
          }
        });


  };


  render() {
    return (
        <div>
          <Header/>
          <section className="h-100 bg-dark">
            <div className="container py-5 h-100">
              <div className="row d-flex justify-content-center align-items-center h-100">
                <div className="col">
                  <div className="card card-registration my-4">
                    <div className="row g-0">
                      <div className="col-xl-6 d-none d-xl-block">
                        <img
                            src="https://mdbootstrap.com/img/Photos/new-templates/bootstrap-registration/img4.jpg"
                            alt="Sample photo"
                            className="img-fluid"
                            style={ { "border-top-left-radius" : ".25rem", "border-bottom-left-radius" : ".25rem" } }
                        />
                      </div>

                      <div className="col-xl-6">
                        <br/><br/><br/><br/><br/><br/><br/><br/>
                        <form className="row g-3 needs-validation" noValidate>

                          <div className="card-body p-md-5 text-black">
                            <h3 className="mb-5 text-uppercase">Forget Password</h3>

                            <div className="form-outline mb-4">
                              <input type="email" id="form3Example97" className="form-control form-control-lg"
                                     value={ this.state.email } onChange={ (event) => this.email(event) } required/>
                              <label className="form-label" htmlFor="form3Example97">Email ID</label>
                            </div>
                            <div className="form-outline mb-4">
                              <input type="number" id="form3Example97" className="form-control form-control-lg"
                                     onChange={ (event) => this.mobile(event) } required/>
                              <label className="form-label" htmlFor="form3Example97">Mobile No</label>
                            </div>


                            {/*
                <div className="d-flex justify-content-end pt-3">
                  <button type="submit" className="btn btn-warning btn-lg ms-2" onClick={this.submitData}>Forget Password</button>
                </div>
                <br/>
                */ }
                            { this.state.nohide && <div>

                              <div className="form-outline mb-4">
                                <input type="text" id="form3Example97" className="form-control form-control-lg"
                                       value={ this.state.checkOtp } onChange={ (event) => this.checkOtp(event) }
                                       required/>
                                <label className="form-label" htmlFor="form3Example97">Enter OTP send on your mobile</label>
                              </div>
                            </div> }

                            { this.state.opt_status }

                          </div>
                        </form>
                        <p className="text-danger">{ this.state.loginerr }</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </div>
    );
  }
}

export default withRouter(ForgetPassword);