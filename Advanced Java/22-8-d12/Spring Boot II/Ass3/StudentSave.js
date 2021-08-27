import React from "react";

export class StudentSave extends React.Component{
    constructor(props)
    {
        super(props);
        this.state={
            name: "",
            area: "",
            city:"",
            pincode:"",
            bdate:"",
            st: {},
            success:false
        }
    }


    handleChange=(e) =>{
        let nm = e.target.name;
        let val = e.target.value;
        this.setState({[nm]: val});
    }

    submitReq=(e)=>{
        e.preventDefault();
        //console.log(this.state);
        const reqData = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                name: this.state.name,
                area: this.state.area,
                city: this.state.city,
                pincode: this.state.pincode,
                bdate: this.state.bdate
            })
        };

        fetch("http://localhost:8080/save",reqData)
        .then(resp => resp.json())
        .then(data => this.setState({st: data, success: true}));

    }

    render(){
        return(
            <div>
                <h2> Student Entry </h2>
                <form onSubmit={this.submitReq}>
                    Enter name : <input type="text" name="name" 
                    onChange={this.handleChange}/> <br/>
                    Enter area : <input type="text" name="area" 
                    onChange={this.handleChange}/> <br/>
                    Enter city : <input type="text" name="city" 
                    onChange={this.handleChange}/> <br/>
                    Enter pincode : <input type="text" name="pincode" 
                    onChange={this.handleChange}/> <br/>
                    Select bdate : <input type="date" name="bdate" 
                    onChange={this.handleChange}/> <br/>
                    <input type="submit" value="Submit" />
                </form>
                <br/>
                <p style={{display: this.state.success?'block':'none'}}> Student with id as {this.state.st.sid} is saved successfully</p>
            </div>
        )
    }

}