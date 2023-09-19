import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { LoginHrDetailsServiceService } from '../login-hr-details-service.service';
import { AdminDetails } from '../admin-details';
@Component({
  selector: 'app-login-hr-details',
  templateUrl: './login-hr-details.component.html',
  styleUrls: ['./login-hr-details.component.css']
})
export class LoginHrDetailsComponent implements OnInit {


  ngOnInit() {
    
  }
adminDetails=new AdminDetails(0,"","","","","");
msg="";
hrId:any;
constructor(private _service:LoginHrDetailsServiceService,private _router:Router){}
loginUser(){

  console.log(this.adminDetails);
  
  if(((this.adminDetails.adminName != "" ||null|| undefined)||(this.adminDetails.adminPassword != ""||null || undefined) && (this.adminDetails.sfmId != "" || null|| undefined ) && (this.adminDetails.id !=  null|| undefined ))){

    this._service.loginUserFromRemote(this.adminDetails).subscribe(
      data=>{ 
        this.adminDetails=data;
        this.hrId=this.adminDetails.id;
        console.log("response recieved");
        // alert("login successfully execute");
      this._router.navigate(['/HomePage',this.hrId]);
    },
        (error)=>{
        // console.log("something went wrong");
        this.msg="invalid email or password";
        alert(this.msg);
    }
    )
  }
  else {
    alert("Enter valid credentials")
  }
 

}


toForgotPasswordPage(){
  this._router.navigate(['/forgot-password']);
}
}
