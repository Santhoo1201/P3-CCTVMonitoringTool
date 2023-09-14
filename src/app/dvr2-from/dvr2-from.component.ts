import { Component, OnInit } from '@angular/core';
import { Dvr1serviceService } from '../dvr1service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Dvr1Detail } from '../dvr1-detail';
import { Dvr } from '../dvr';

@Component({
  selector: 'app-dvr2-from',
  templateUrl: './dvr2-from.component.html',
  styleUrls: ['./dvr2-from.component.css']
})
export class Dvr2FromComponent implements OnInit {

  dvr1details=new Dvr1Detail(0,"","",0,"","","")
 dvr: Dvr[] = [];
 
  // for select

  playStatus:any;
  liveDate: Date=new Date();

  liveStatus:any;
  selectOptions=[
    { vl:"Working"},
    { vl:"Not Working"}
   ]

  playStatusArray: Array<any> = [];
  liveStatusArray: Array<any> = [];
  saveNewDetails: any;

  mainDataArray:Array<any>=[]

  constructor(private dvr1serviceService:Dvr1serviceService,private router:Router,private activatedRoute:ActivatedRoute){}

 ngOnInit(): void {
  this.getAllDvr1Details();
 }
  private getAllDvr1Details(){
    
  
    // this.id=this.activatedRoute.snapshot.params["id"];
    this.dvr1serviceService.getAllDvr2DetailsService().subscribe( data =>{
      this.dvr=data;
      console.log("received response");
      // alert("added successfully")
      // this.goToLaptopDetailList();
    });
  }

  // goToLaptopDetailList(){
  //   this.router.navigate(['/LaptopdetailsList']);
  // }

     
  
  saveAllData(data:any){
  //   const saveNewDetails=[{
  //     date:this.liveDate,
  //    liveStatus:this.liveStatus,
  //    playBackStatus:this.playStatus,
  //    cameras:this.dvr1details.cameras,
  //    roomName:this.dvr1details.roomName,
  //    floorNo:this.dvr1details.floorNo
 
 
  //  }]
    this.dvr1serviceService.saveAllDvr2Details(data).subscribe(data=>{
      alert("successfully saved")
    })

  }
  onSubmit(){


    for (let index = 0; index < this.dvr.length; index++) {

      // for (let i = 0; i < this.liveStatusArray.length; i++) {
       
        this.mainDataArray[index]={
          date:this.liveDate,
          cameras:this.dvr[index].cameraName,
          roomName: this.dvr[index].location,
          floorNo: this.dvr[index].floorNumber,
          liveStatus:this.liveStatusArray[index],
          playBackStatus:this.playStatusArray[index]
        // }
      }


      
    
      // this.mainDataArray.push(saveNewDetails)
     
      
    } this.saveAllData(this.mainDataArray);

    this.mainDataArray=[]

  }
  live(data: any, id: any) {
    // console.log(data,id);
    if ( data.length === 0 ) {
     
      this.liveStatusArray[id] = "Working";
    } else if (data.value=="Not Working") {
      data.value = "Not Working"
      this.liveStatusArray[id] = data.value;
    }
    else if (data.value=="Working"){
      this.liveStatusArray[id] = data.value;
    }
    console.log(this.liveStatusArray);


    //  this.liveStatusArray

  }

  play(data: any, id: any) {


    // console.log(typeof data.target);


    // this.playStatusArray[id]=data.target.value;
    if (data.target.value.length===0) {
      data.target.value = "Working"
      // console.log(data.target.value);
      
      this.playStatusArray[id] = "Working";
    } else if (data.target.value=="Not Working") {
      data.target.value = "Not Working"
      this.playStatusArray[id] = data.target.value;
    }
    else if (data.target.value=="Working"){
      this.playStatusArray[id] = data.target.value;
    }

    console.log(this.playStatusArray);

  }
}
