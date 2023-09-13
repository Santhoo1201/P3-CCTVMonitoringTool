import { Component, OnInit } from '@angular/core';
import { Dvr1Detail } from '../dvr1-detail';
import { Dvr } from '../dvr';
import { Dvr1serviceService } from '../dvr1service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-dvr3-from',
  templateUrl: './dvr3-from.component.html',
  styleUrls: ['./dvr3-from.component.css']
})
export class Dvr3FromComponent implements OnInit {

  dvr1details=new Dvr1Detail(0,"","",0,"","","")
  dvr: Dvr[] = [];
  
   // for select
 
   playStatus:any;
   liveDate:any;
   liveStatus:any;
 
   playStatusArray=[]
   saveNewDetails:any;
 
   constructor(private dvr1serviceService:Dvr1serviceService,private router:Router,private activatedRoute:ActivatedRoute){}
 
  ngOnInit(): void {
   this.getAllDvr3Details();
  }
   private getAllDvr3Details(){
     
   
     // this.id=this.activatedRoute.snapshot.params["id"];
     this.dvr1serviceService.getAllDvr3DetailsService().subscribe( data =>{
       this.dvr=data;
       console.log("received response");
       // alert("added successfully")
       // this.goToLaptopDetailList();
     });
   }
 
   // goToLaptopDetailList(){
   //   this.router.navigate(['/LaptopdetailsList']);
   // }
 
      
   
   saveAllData(){
     const saveNewDetails=[{
       date:this.liveDate,
      liveStatus:this.liveStatus,
      playBackStatus:this.playStatus,
      cameras:this.dvr1details.cameras,
      roomName:this.dvr1details.roomName,
      floorNo:this.dvr1details.floorNo
  
  
    }]
     this.dvr1serviceService.saveAllDvr1Details(this.saveNewDetails).subscribe(data=>{
       console.log(data);
       this.dvr1details=data;
     })
 
   }
   onSubmit(){
     console.log(this.dvr1details)
     this.saveAllData();
   }

}
